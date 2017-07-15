package org.zd.mvcdemo.servlet ;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zd.mvcdemo.factory.DAOFactory;
import org.zd.mvcdemo.vo.Userclt;
public class UpdateMyUsercltServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String cltid = req.getParameter("cltid") ;
		String cltpass = req.getParameter("cltpass") ;
        String cltname = req.getParameter("cltname") ;
        String cltphone = req.getParameter("cltphone") ;
        String cltadd = req.getParameter("cltadd") ;
        String cltbuytime = req.getParameter("cltbuytime") ;
                                     	
		Userclt userclt=new Userclt();
				
		try{
			userclt.setCltid(Integer.parseInt(cltid));
			userclt.setCltpass(cltpass);
			userclt.setCltname(cltname);
			userclt.setCltphone(Integer.parseInt(cltphone));
			userclt.setCltadd(cltadd);
			userclt.setCltbuytime(cltbuytime);
			if(DAOFactory.getIUsercltDAOInstance().update(userclt))
			{
				req.setAttribute("text","修改成功") ;
				
				req.getRequestDispatcher("MyUsercltServlet").forward(req,resp) ;
				
			}else{
					req.setAttribute("text","修改失败") ;
					req.getRequestDispatcher("cltupdate.jsp").forward(req,resp) ;
			}			
			}catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","修改失败1") ;
					req.getRequestDispatcher("cltupdate.jsp").forward(req,resp) ;
		     }
	}	
			
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}