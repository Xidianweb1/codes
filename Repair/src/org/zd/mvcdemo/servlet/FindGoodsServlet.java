package org.zd.mvcdemo.servlet ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zd.mvcdemo.factory.DAOFactory;
import org.zd.mvcdemo.vo.Goods;
public class FindGoodsServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		String way = req.getParameter("searchgoods") ;
		String cltid = req.getParameter("cltid") ;
		int id=Integer.parseInt(cltid);
		List<Goods> all = new ArrayList<Goods>() ;	
		
		if("0".equals(way))
		{			
			try{
				all=DAOFactory.getIGoodsDAOInstance().findByGcltid(id);
				req.setAttribute("goods",all) ;
				req.getRequestDispatcher("cltgoodssearch.jsp").forward(req,resp) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}
					
		}									
		if("1".equals(way))
		{
			try{
					String goodsway = "待处理";
			    	all=DAOFactory.getIGoodsDAOInstance().findCltidAGstate(id,goodsway);
			     	req.setAttribute("goods",all) ;
			    	req.getRequestDispatcher("cltgoodssearch.jsp").forward(req,resp) ;
			
			}catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","无") ;
					req.getRequestDispatcher("cltgoodssearch.jsp").forward(req,resp) ;
				}
			
		}
		 if("2".equals(way))
		{
			
					String goodsway = "处理中";
					try{
						all=DAOFactory.getIGoodsDAOInstance().findCltidAGstate(id,goodsway);
						
						req.setAttribute("goods",all) ;
						req.getRequestDispatcher("cltgoodssearch.jsp").forward(req,resp) ;
					}catch(Exception e){
							e.printStackTrace() ;
							req.setAttribute("text","无") ;
							req.getRequestDispatcher("cltgoodssearch.jsp").forward(req,resp) ;
					}
				
		}
		 if("3".equals(way))
		{
			
					String goodsway = "已处理";
					try{
						all=DAOFactory.getIGoodsDAOInstance().findCltidAGstate(id,goodsway);
						req.setAttribute("goods",all) ;
						req.getRequestDispatcher("cltgoodssearch.jsp").forward(req,resp) ;
					}catch(Exception e){
							e.printStackTrace() ;
					}
					
		}
		 
			
	}
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		System.out.print("23424");
		this.doPost(req,resp) ;
	}


}