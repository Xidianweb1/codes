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
import org.zd.mvcdemo.vo.Arrange;
public class FindArrangeServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		String way = req.getParameter("searcharr") ;
		String arrway = req.getParameter("way") ;
		
		List<Arrange> all = new ArrayList<Arrange>() ;	
		
		if("0".equals(way))
		{			
			try{
				all=DAOFactory.getIArrangeDAOInstance().findAll();
				req.setAttribute("arrange",all) ;
				req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}
					
		}									
		if("1".equals(way))
		{
			int id=Integer.parseInt(arrway);
			try{
			    	all=DAOFactory.getIArrangeDAOInstance().findById(id);
			     	req.setAttribute("arrange",all) ;
			    	req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
			
			}catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","无") ;
					req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
				}
			
		}
		 if("2".equals(way))
		{
			 int id=Integer.parseInt(arrway);
					try{
						all=DAOFactory.getIArrangeDAOInstance().findByAgid(id);
						
						req.setAttribute("goods",all) ;
						req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
					}catch(Exception e){
							e.printStackTrace() ;
							req.setAttribute("text","无") ;
							req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
					}
				
		}
		 if("3".equals(way))
		{
			 int id=Integer.parseInt(arrway);
					try{
						all=DAOFactory.getIArrangeDAOInstance().findByAcltid(id);
						req.setAttribute("arrange",all) ;
						req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
					}catch(Exception e){
							e.printStackTrace() ;
							req.setAttribute("text","无") ;
							req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
					}
					
		}
		 if("4".equals(way))
			{
						try{
							all=DAOFactory.getIArrangeDAOInstance().findByAresp(arrway);
							req.setAttribute("arrange",all) ;
							req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
						}catch(Exception e){
								e.printStackTrace() ;
								req.setAttribute("text","无") ;
								req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
						}
						
			}
		 if("5".equals(way))
			{
			       int id=Integer.parseInt(arrway);
						try{
							all=DAOFactory.getIArrangeDAOInstance().findByArep(id);
							req.setAttribute("arrange",all) ;
							req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
						}catch(Exception e){
								e.printStackTrace() ;
								req.setAttribute("text","无") ;
								req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
						}
						
			}
		 if("6".equals(way))
			{
						try{
							all=DAOFactory.getIArrangeDAOInstance().findByAtime(arrway);
							req.setAttribute("arrange",all) ;
							req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
						}catch(Exception e){
								e.printStackTrace() ;
								req.setAttribute("text","无") ;
								req.getRequestDispatcher("uarrsearch.jsp").forward(req,resp) ;
						}
						
			}
		 
			
	}
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		System.out.print("23424");
		this.doPost(req,resp) ;
	}


}