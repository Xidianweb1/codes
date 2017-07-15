package org.zd.mvcdemo.servlet ;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zd.mvcdemo.factory.DAOFactory;
import org.zd.mvcdemo.vo.Userclt;
public class NewUsercltServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String ucltid = req.getParameter("ucltid") ;
		String ucltpass = req.getParameter("ucltpass") ;
		String ucltpasswo = req.getParameter("ucltpasswo") ;
		String ucltname = req.getParameter("ucltname") ;
		String ucltphone = req.getParameter("ucltphone") ;
		String ucltadd = req.getParameter("ucltadd") ;
		String ucltbuytime = req.getParameter("ucltbuytime") ;
		
		if( ucltid=="" || ucltpass=="" || ucltpasswo=="" || ucltname=="" || ucltphone=="" || ucltadd=="" 
			|| ucltbuytime=="" )
        {
			req.setAttribute("text","请完善信息") ;
			req.getRequestDispatcher("ucltnew.jsp").forward(req,resp) ;
		}else if(ucltpasswo.equals(ucltpass)){
			Userclt userclt=new Userclt();
        	userclt.setCltid(Integer.parseInt(ucltid));
        	userclt.setCltpass(ucltpass);
        	userclt.setCltname(ucltname);
        	userclt.setCltphone(Integer.parseInt(ucltphone));
        	userclt.setCltadd(ucltadd);
        	userclt.setCltbuytime(ucltbuytime);
							
		    try{
		    	if(DAOFactory.getIUsercltDAOInstance().doCreate(userclt))
			    {
					req.setAttribute("text","提交成功") ;
					req.getRequestDispatcher("ucltnew.jsp").forward(req,resp) ;
			    }
			    else
			    {
					req.setAttribute("text","提交失败1") ;
					req.getRequestDispatcher("ucltnew.jsp").forward(req,resp) ;
			    }
				
		    }catch(Exception e){
			e.printStackTrace() ;
				req.setAttribute("text","提交失败异常") ;
				req.getRequestDispatcher("ucltnew.jsp").forward(req,resp) ;
		    }	
		}else
		{
			req.setAttribute("text","两次密码不一致") ;
			req.getRequestDispatcher("ucltnew.jsp").forward(req,resp) ;
        }
   }
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}