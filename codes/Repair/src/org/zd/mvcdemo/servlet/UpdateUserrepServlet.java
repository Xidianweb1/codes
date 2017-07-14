package org.zd.mvcdemo.servlet ;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zd.mvcdemo.factory.DAOFactory;
import org.zd.mvcdemo.vo.Userrep;
public class UpdateUserrepServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String rep = req.getParameter("rep") ;
        String repname = req.getParameter("repname") ;
        String repphone = req.getParameter("repphone") ;
        String repadd = req.getParameter("repadd") ;
        String repid = req.getParameter("repid") ;
        String reptime = req.getParameter("reptime") ;
        String repstate = req.getParameter("repstate") ;
        String update = req.getParameter("way");
         
        if(update==null)
		{
			try{
				
				
				req.setAttribute("rep",rep) ;
				req.setAttribute("repname",repname) ;
				req.setAttribute("repphone",repphone) ;
				req.setAttribute("repadd",repadd) ;
				req.setAttribute("repid",repid) ;	
				req.setAttribute("reptime",reptime) ;	
				req.setAttribute("repstate",repstate) ;
				req.getRequestDispatcher("urepuad.jsp").forward(req,resp) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}	
		
		}
        else{
        	if("submit".equals(update))
		    {
        		Userrep userrep=new Userrep();
			    try{
			    	userrep.setRep(Integer.parseInt(rep));
		        	userrep.setRepname(repname);
			        userrep.setRepphone(Integer.parseInt(repphone));
		        	userrep.setRepid(Integer.parseInt(repid));
		         	userrep.setRepadd(repadd);
		        	userrep.setReptime(reptime);
		         	userrep.setRepstate(repstate);
		        	if(DAOFactory.getIUserrepDAOInstance().update(userrep))
		        	{
		        		req.setAttribute("text","ÐÞ¸Ä³É¹¦") ;
				        req.getRequestDispatcher("urepuad.jsp").forward(req,resp) ;
			    	}else{
			    		req.setAttribute("text","ÐÞ¸ÄÊ§°Ü") ;
			    		req.getRequestDispatcher("urepuad.jsp").forward(req,resp) ;
			        }			
		      }catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","ÐÞ¸ÄÊ§°Ü1") ;
					req.getRequestDispatcher("urepuad.jsp").forward(req,resp) ;
		      }
		}
        if("delete".equals(update))
		{
			try{
				
				int id=Integer.parseInt(rep);
				if(DAOFactory.getIUserrepDAOInstance().delete(id))
				{
					req.setAttribute("text","É¾³ý³É¹¦") ;
					req.getRequestDispatcher("urepuad.jsp").forward(req,resp)  ;
				}
		
			}catch(Exception e){
				e.printStackTrace() ;
				req.setAttribute("text","É¾³ýÊ§°Ü") ;
				req.getRequestDispatcher("urepuad.jsp").forward(req,resp) ;
			}
		  }
        }
	
	}	
			
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}