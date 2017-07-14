package org.zd.mvcdemo.servlet ;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zd.mvcdemo.factory.DAOFactory;
import org.zd.mvcdemo.vo.Usertype;
public class NewUsertypeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String urem = req.getParameter("urem") ;
		String upassword = req.getParameter("upassword") ;
		String upass = req.getParameter("upass") ;
		String uremname = req.getParameter("uremname") ;
		String uremphone = req.getParameter("uremphone") ;
		String uremadd = req.getParameter("uremadd") ;
		String uremid = req.getParameter("uremid") ;
		String uremtime = req.getParameter("uremtime") ;
		
		if( urem=="" || upassword=="" || upass=="" || uremname=="" || uremphone=="" || uremadd=="" 
			|| uremid=="" || uremtime=="")
        {
			req.setAttribute("aa","请完善信息") ;
			req.getRequestDispatcher("uremnew.jsp").forward(req,resp) ;
		}else 
			if(upassword.equals(upass)){
        	Usertype usertype=new Usertype();
		    usertype.setRem(Integer.parseInt(urem));
		    usertype.setRempass(upass);
		    usertype.setRemname(uremname);
		    usertype.setRemphone(Integer.parseInt(uremphone));
		    usertype.setRemadd(uremadd);
	    	usertype.setRemid(Integer.parseInt(uremid));
	     	usertype.setRemtime(uremtime);
							
		    try{
		    	if(DAOFactory.getIUsertypeDAOInstance().doCreate(usertype))
			    {
					req.setAttribute("aa","提交成功") ;
					req.getRequestDispatcher("uremnew.jsp").forward(req,resp) ;
			    }
			    else
			    {
					req.setAttribute("aa","提交失败1") ;
					req.getRequestDispatcher("uremnew.jsp").forward(req,resp) ;
			    }
				
		    }catch(Exception e){
			e.printStackTrace() ;
				req.setAttribute("aa","提交失败异常") ;
				req.getRequestDispatcher("uremnew.jsp").forward(req,resp) ;
		    }	
        }
			else{
				req.setAttribute("aa","两次密码不一致") ;
				req.getRequestDispatcher("uremnew.jsp").forward(req,resp) ;
			}
   }
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}