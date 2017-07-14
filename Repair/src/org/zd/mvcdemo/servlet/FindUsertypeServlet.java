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
import org.zd.mvcdemo.vo.Usertype;
public class FindUsertypeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		String way = req.getParameter("searchrem") ;
		String userway = req.getParameter("way") ;
		List<Usertype> all = new ArrayList<Usertype>() ;	
		
		if("1".equals(way))
		{	
			if("".equals(userway))
			{	req.setAttribute("text","管理员编号不能为空") ;
				req.getRequestDispatcher("uremsearch.jsp").forward(req,resp) ;
			}
			else{
				try{
				int id=Integer.parseInt(userway);
				all=DAOFactory.getIUsertypeDAOInstance().findById(id);
				req.setAttribute("usertype",all) ;
				req.getRequestDispatcher("uremsearch.jsp").forward(req,resp) ;
			
				}catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","编号不能为空或数字") ;
					req.getRequestDispatcher("uremsearch.jsp").forward(req,resp) ;
				}
			}
		}
		 if("2".equals(way))
		{
			 if("".equals(userway))
				{	req.setAttribute("text","员工姓名不能为空") ;
					req.getRequestDispatcher("uremsearch.jsp").forward(req,resp) ;
				}
				else
				{	System.out.println(userway);
					try{
						all=DAOFactory.getIUsertypeDAOInstance().findByRemname(userway);
						
						req.setAttribute("usertype",all) ;
						req.getRequestDispatcher("uremsearch.jsp").forward(req,resp) ;
					}catch(Exception e){
							e.printStackTrace() ;
							
					}
				}
		}
		 if("3".equals(way))
		{
			 if("".equals(userway))
				{	req.setAttribute("text","入职时间不能为空") ;
					req.getRequestDispatcher("uremsearch.jsp").forward(req,resp) ;
				}
				else
				{	
					System.out.println(userway);
					try{
						all=DAOFactory.getIUsertypeDAOInstance().findByRemtime(userway);
						req.setAttribute("usertype",all) ;
						req.getRequestDispatcher("uremsearch.jsp").forward(req,resp) ;
					}catch(Exception e){
							e.printStackTrace() ;
					}
				}	
		}		 
		if("0".equals(way))
		{			
			try{
				all=DAOFactory.getIUsertypeDAOInstance().findAll();
				req.setAttribute("usertype",all) ;
				req.getRequestDispatcher("uremsearch.jsp").forward(req,resp) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}
					
		}										
	}
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}