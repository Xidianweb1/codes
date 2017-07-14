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
import org.zd.mvcdemo.vo.Userrep;
public class FindArrRepServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String rep = req.getParameter("arep") ;
        String repname = req.getParameter("repname") ;
        String repphone = req.getParameter("repphone") ;
        String repadd = req.getParameter("repadd") ;
        String repid = req.getParameter("repid") ;
        String reptime = req.getParameter("reptime") ;
        String repstate = req.getParameter("repstate") ;
        
        
        
        int id=Integer.parseInt(rep);
        
        List<Userrep> all = new ArrayList<Userrep>() ;
			try{
				
				
				req.setAttribute("arep",rep) ;
				req.setAttribute("repname",repname) ;
				req.setAttribute("repphone",repphone) ;
				req.setAttribute("repadd",repadd) ;
				req.setAttribute("repid",repid) ;
				req.setAttribute("reptime",reptime) ;
				req.setAttribute("repstate",repstate) ;
			}catch(Exception e){
				e.printStackTrace() ;
			}	
		
			try{
				all=DAOFactory.getIUserrepDAOInstance().findById(id);
				req.setAttribute("userrep",all) ;
				req.getRequestDispatcher("uarrrepsea.jsp").forward(req,resp) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}
	
	}	
			
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}