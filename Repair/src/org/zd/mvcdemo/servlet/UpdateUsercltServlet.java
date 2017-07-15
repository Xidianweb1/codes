package org.zd.mvcdemo.servlet ;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zd.mvcdemo.factory.DAOFactory;
import org.zd.mvcdemo.vo.Userclt;
public class UpdateUsercltServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String cltid = req.getParameter("cltid") ;
		String cltpass = req.getParameter("cltpass") ;
        String cltname = req.getParameter("cltname") ;
        String cltphone = req.getParameter("cltphone") ;
        String cltadd = req.getParameter("cltadd") ;
        String cltbuytime = req.getParameter("cltbuytime") ;
        String update = req.getParameter("way");
         
        if(update==null)
		{
			try{
				
				
				req.setAttribute("cltid",cltid) ;
				req.setAttribute("cltpass",cltpass) ;
				req.setAttribute("cltname",cltname) ;
				req.setAttribute("cltphone",cltphone) ;
				req.setAttribute("cltadd",cltadd) ;
				req.setAttribute("cltbuytime",cltbuytime) ;	
				req.getRequestDispatcher("ucltuad.jsp").forward(req,resp) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}	
		
		}
        else{
        	if("submit".equals(update))
		    {
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
		        		req.setAttribute("text","ÐÞ¸Ä³É¹¦") ;
				        req.getRequestDispatcher("ucltuad.jsp").forward(req,resp) ;
			    	}else{
			    		req.setAttribute("text","ÐÞ¸ÄÊ§°Ü") ;
			    		req.getRequestDispatcher("ucltuad.jsp").forward(req,resp) ;
			        }			
		      }catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","ÐÞ¸ÄÊ§°Ü1") ;
					req.getRequestDispatcher("ucltuad.jsp").forward(req,resp) ;
		      }
		}
        if("delete".equals(update))
		{
			try{
				
				int id=Integer.parseInt(cltid);
				if(DAOFactory.getIUsercltDAOInstance().delete(id))
				{
					req.setAttribute("text","É¾³ý³É¹¦") ;
					req.getRequestDispatcher("ucltuad.jsp").forward(req,resp)  ;
				}
		
			}catch(Exception e){
				e.printStackTrace() ;
				req.setAttribute("text","É¾³ýÊ§°Ü") ;
				req.getRequestDispatcher("ucltuad.jsp").forward(req,resp) ;
			}
		  }
        }
	
	}	
			
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}