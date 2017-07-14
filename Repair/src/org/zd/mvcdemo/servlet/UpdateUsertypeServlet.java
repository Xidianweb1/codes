package org.zd.mvcdemo.servlet ;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zd.mvcdemo.factory.DAOFactory;
import org.zd.mvcdemo.vo.Usertype;
public class UpdateUsertypeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String rem = req.getParameter("rem") ;
		String rempass = req.getParameter("rempass") ;
        String remname = req.getParameter("remname") ;
        String remphone = req.getParameter("remphone") ;
        String remadd = req.getParameter("remadd") ;
        String remid = req.getParameter("remid") ;
        String remtime = req.getParameter("remtime") ;

                                     	
		Usertype usertype=new Usertype();
				
		try{
			usertype.setRem(Integer.parseInt(rem));
			usertype.setRempass(rempass);
			usertype.setRemname(remname);
			usertype.setRemphone(Integer.parseInt(remphone));
			usertype.setRemid(Integer.parseInt(remid));
			usertype.setRemadd(remadd);
			usertype.setRemtime(remtime);
			if(DAOFactory.getIUsertypeDAOInstance().update(usertype))
			{
				req.setAttribute("text","修改成功") ;
				
				req.getRequestDispatcher("MyUsertypeServlet").forward(req,resp) ;
				
			}else{
					req.setAttribute("text","修改失败") ;
					req.getRequestDispatcher("uremupdate.jsp").forward(req,resp) ;
			}			
			}catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","修改失败1") ;
					req.getRequestDispatcher("uremupdate.jsp").forward(req,resp) ;
		     }
	}	
			
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}