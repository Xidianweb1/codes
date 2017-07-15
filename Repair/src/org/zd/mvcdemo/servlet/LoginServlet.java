package org.zd.mvcdemo.servlet ;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zd.mvcdemo.factory.DAOFactory;
import org.zd.mvcdemo.vo.Usertype;
import org.zd.mvcdemo.vo.Userclt;
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String path = "main.jsp" ;
		String pathclt = "mainclt.jsp";
		String userid = req.getParameter("uid") ;
		String userpass = req.getParameter("userpass") ;
		String person = req.getParameter("RadioButtonList1");
		if("管理员".equals(person))
		{
		Usertype user = new Usertype() ;
		user.setRem(Integer.parseInt(userid)) ;
		user.setRempass(userpass) ;
		try{
			if(DAOFactory.getIUsertypeDAOInstance().findLogin(user)){
				HttpSession ses = req.getSession() ;
					ses.setAttribute("username",user.getRemname()) ;
					ses.setAttribute("rem",user.getRem()) ;
	
					req.getRequestDispatcher(path).forward(req,resp) ;
				
			} 
			else 
			{
				String info="登录失败,请重新登录";
				req.setAttribute("info",info) ;
				req.getRequestDispatcher("login.jsp").forward(req,resp) ;
			
			}
		}catch(Exception e){
				e.printStackTrace() ;
		}
		}else if("客户".equals(person))
		{
			Userclt user = new Userclt() ;
			user.setCltid(Integer.parseInt(userid)) ;
			user.setCltpass(userpass) ;
			try{
				if(DAOFactory.getIUsercltDAOInstance().findLogin(user)){
					HttpSession ses = req.getSession() ;
						ses.setAttribute("username",user.getCltname()) ;
						ses.setAttribute("cltid",user.getCltid()) ;
		
						req.getRequestDispatcher(pathclt).forward(req,resp) ;
					
				} 
				else 
				{
					String info="登录失败,请重新登录";
					req.setAttribute("info",info) ;
					req.getRequestDispatcher("login.jsp").forward(req,resp) ;
				
				}
			}catch(Exception e){
					e.printStackTrace() ;
			}
		}
		
		//req.setAttribute("info",info) ;
		//req.getRequestDispatcher("managerlogin.jsp").forward(req,resp) ;
	}
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}