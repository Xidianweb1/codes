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
public class FindArrCltServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String cltid = req.getParameter("acltid") ;
        String cltname = req.getParameter("cltname") ;
        String cltphone = req.getParameter("cltphone") ;
        String cltadd = req.getParameter("cltadd") ;
        String cltbuytime = req.getParameter("cltbuytime") ;
        
        int id=Integer.parseInt(cltid);
        
        List<Userclt> all = new ArrayList<Userclt>() ;
			try{
				
				
				req.setAttribute("acltid",cltid) ;
				req.setAttribute("cltname",cltname) ;
				req.setAttribute("cltphone",cltphone) ;
				req.setAttribute("cltadd",cltadd) ;
				req.setAttribute("cltbuytime",cltbuytime) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}	
		
			try{
				all=DAOFactory.getIUsercltDAOInstance().findById(id);
				req.setAttribute("userclt",all) ;
				req.getRequestDispatcher("uarrcltsea.jsp").forward(req,resp) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}
	
	}	
			
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}