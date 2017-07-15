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
public class MyUsercltServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String userid = req.getParameter("cltid") ;
		String userpass = req.getParameter("cltpass") ;
		List<Userclt> all = new ArrayList<Userclt>() ;

		try{
			int id=Integer.parseInt(userid);
			all=DAOFactory.getIUsercltDAOInstance().findById(id);
			req.setAttribute("userclt",all) ;
			req.getRequestDispatcher("cltupdate.jsp").forward(req,resp) ;
				
			
		
		}catch(Exception e){
				e.printStackTrace() ;
		}

	}
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}