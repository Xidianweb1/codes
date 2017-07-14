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
import org.zd.mvcdemo.vo.Userrep;
public class NewArrServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String aid = req.getParameter("aid") ;
        String agid = req.getParameter("agid") ;
        String acltid = req.getParameter("acltid") ;
        String arep = req.getParameter("arep") ;
        String aresp = req.getParameter("aresp") ;
        String atime = req.getParameter("atime") ;

        List<Userrep> all = new ArrayList<Userrep>() ;
		try{
		    	String repway = "ø…∑÷≈‰";
	        	all=DAOFactory.getIUserrepDAOInstance().findByRepstate(repway);
	        	req.setAttribute("userrep",all) ;	
	        	
				req.setAttribute("aid",aid) ;
				req.setAttribute("agid",agid) ;
				req.setAttribute("acltid",acltid) ;
				req.setAttribute("arep",arep) ;
				req.setAttribute("aresp",aresp) ;	
				req.setAttribute("atime",atime) ;	
				req.getRequestDispatcher("uarr.jsp").forward(req,resp) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}	
		

	}	
			
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}