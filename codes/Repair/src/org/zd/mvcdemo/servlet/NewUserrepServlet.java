package org.zd.mvcdemo.servlet ;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zd.mvcdemo.factory.DAOFactory;
import org.zd.mvcdemo.vo.Userrep;
public class NewUserrepServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String urep = req.getParameter("urep") ;
		String ureppass = req.getParameter("ureppass") ;
		String urepname = req.getParameter("urepname") ;
		String urepphone = req.getParameter("urepphone") ;
		String urepadd = req.getParameter("urepadd") ;
		String urepid = req.getParameter("urepid") ;
		String ureptime = req.getParameter("ureptime") ;
		String urepstate = req.getParameter("urepstate") ;
		
		if( urep=="" || ureppass=="" || urepname=="" || urepphone=="" || urepadd=="" 
			|| urepid=="" || ureptime=="")
        {
			req.setAttribute("aa","请完善信息") ;
			req.getRequestDispatcher("urepnew.jsp").forward(req,resp) ;
		}else
		{
        	Userrep userrep=new Userrep();
        	userrep.setRep(Integer.parseInt(urep));
        	userrep.setReppass(ureppass);
        	userrep.setRepname(urepname);
        	userrep.setRepphone(Integer.parseInt(urepphone));
        	userrep.setRepadd(urepadd);
        	userrep.setRepid(Integer.parseInt(urepid));
        	userrep.setReptime(ureptime);
        	userrep.setRepstate(urepstate);
							
		    try{
		    	if(DAOFactory.getIUserrepDAOInstance().doCreate(userrep))
			    {
					req.setAttribute("aa","提交成功") ;
					req.getRequestDispatcher("urepnew.jsp").forward(req,resp) ;
			    }
			    else
			    {
					req.setAttribute("aa","提交失败1") ;
					req.getRequestDispatcher("urepnew.jsp").forward(req,resp) ;
			    }
				
		    }catch(Exception e){
			e.printStackTrace() ;
				req.setAttribute("aa","提交失败异常") ;
				req.getRequestDispatcher("urepnew.jsp").forward(req,resp) ;
		    }	
        }
   }
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}