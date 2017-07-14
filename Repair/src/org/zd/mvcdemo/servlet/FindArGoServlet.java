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
public class FindArGoServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		List<Goods> all = new ArrayList<Goods>() ;	
		
			try{
					String goodsway = "´ý´¦Àí";
			    	all=DAOFactory.getIGoodsDAOInstance().findByGstate(goodsway);
			     	req.setAttribute("goods",all) ;
			    	req.getRequestDispatcher("uarrgo.jsp").forward(req,resp) ;
			
			}catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","ÎÞ") ;
					req.getRequestDispatcher("uarrgo.jsp").forward(req,resp) ;
				}
		
			
	}
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		System.out.print("23424");
		this.doPost(req,resp) ;
	}


}