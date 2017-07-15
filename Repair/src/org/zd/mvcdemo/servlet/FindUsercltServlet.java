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
import org.zd.mvcdemo.vo.Userclt;
public class FindUsercltServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		String way = req.getParameter("searchclt") ;
		String userway = req.getParameter("way") ;
		List<Userclt> all = new ArrayList<Userclt>() ;	
		
		if("0".equals(way))
		{			
			try{
				all=DAOFactory.getIUsercltDAOInstance().findAll();
				req.setAttribute("userclt",all) ;
				req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}
					
		}									
		if("1".equals(way))
		{	
			if("".equals(userway))
			{	req.setAttribute("text","客户编号不能为空") ;
				req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
			}
			else{
				try{
				int id=Integer.parseInt(userway);
				all=DAOFactory.getIUsercltDAOInstance().findById(id);
				req.setAttribute("userclt",all) ;
				req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
			
				}catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","维修工程师不能为空或数字") ;
					req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
				}
			}
		}
		 if("2".equals(way))
		{
			 if("".equals(userway))
				{	req.setAttribute("text","客户姓名不能为空") ;
					req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
				}
				else
				{	System.out.println(userway);
					try{
						all=DAOFactory.getIUsercltDAOInstance().findByCltname(userway);
						
						req.setAttribute("userclt",all) ;
						req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
					}catch(Exception e){
							e.printStackTrace() ;
							
					}
				}
		}
		 if("3".equals(way))
		{
			 if("".equals(userway))
				{	req.setAttribute("text","购买产品时间不能为空") ;
					req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
				}
				else
				{	
					System.out.println(userway);
					try{
						all=DAOFactory.getIUsercltDAOInstance().findByCltbuytime(userway);
						req.setAttribute("userclt",all) ;
						req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
					}catch(Exception e){
							e.printStackTrace() ;
					}
				}	
		}
		 
			
	}
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}