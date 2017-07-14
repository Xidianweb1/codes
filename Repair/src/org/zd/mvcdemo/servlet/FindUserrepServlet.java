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
public class FindUserrepServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		String way = req.getParameter("searchrep") ;
		String userway = req.getParameter("way") ;
		List<Userrep> all = new ArrayList<Userrep>() ;	
		
		if("0".equals(way))
		{			
			try{
				all=DAOFactory.getIUserrepDAOInstance().findAll();
				req.setAttribute("userrep",all) ;
				req.getRequestDispatcher("urepsearch.jsp").forward(req,resp) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}
					
		}									
		if("1".equals(way))
		{	
			if("".equals(userway))
			{	req.setAttribute("text","ά�޹���ʦ��Ų���Ϊ��") ;
				req.getRequestDispatcher("urepsearch.jsp").forward(req,resp) ;
			}
			else{
				try{
				int id=Integer.parseInt(userway);
				all=DAOFactory.getIUserrepDAOInstance().findById(id);
				req.setAttribute("userrep",all) ;
				req.getRequestDispatcher("urepsearch.jsp").forward(req,resp) ;
			
				}catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","ά�޹���ʦ����Ϊ�ջ�����") ;
					req.getRequestDispatcher("urepsearch.jsp").forward(req,resp) ;
				}
			}
		}
		 if("2".equals(way))
		{
			 if("".equals(userway))
				{	req.setAttribute("text","ά�޹���ʦ��������Ϊ��") ;
					req.getRequestDispatcher("urepsearch.jsp").forward(req,resp) ;
				}
				else
				{	System.out.println(userway);
					try{
						all=DAOFactory.getIUserrepDAOInstance().findByRepname(userway);
						
						req.setAttribute("userrep",all) ;
						req.getRequestDispatcher("urepsearch.jsp").forward(req,resp) ;
					}catch(Exception e){
							e.printStackTrace() ;
							
					}
				}
		}
		 if("3".equals(way))
		{
			 if("".equals(userway))
				{	req.setAttribute("text","��ְʱ�䲻��Ϊ��") ;
					req.getRequestDispatcher("urepsearch.jsp").forward(req,resp) ;
				}
				else
				{	
					System.out.println(userway);
					try{
						all=DAOFactory.getIUserrepDAOInstance().findByReptime(userway);
						req.setAttribute("userrep",all) ;
						req.getRequestDispatcher("urepsearch.jsp").forward(req,resp) ;
					}catch(Exception e){
							e.printStackTrace() ;
					}
				}	
		}
		 if("4".equals(way))
			{
				 if("".equals(userway))
					{	req.setAttribute("text","����״̬����Ϊ��") ;
						req.getRequestDispatcher("urepsearch.jsp").forward(req,resp) ;
					}
					else
					{	
						System.out.println(userway);
						try{
							all=DAOFactory.getIUserrepDAOInstance().findByRepstate(userway);
							req.setAttribute("userrep",all) ;
							req.getRequestDispatcher("urepsearch.jsp").forward(req,resp) ;
						}catch(Exception e){
								e.printStackTrace() ;
						}
					}	
			}		 
			
	}
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}