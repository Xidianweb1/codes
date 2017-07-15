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
public class FindUsercltServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		String way = req.getParameter("searchclt") ;
		String userway = req.getParameter("way") ;
		List<Userclt> all = new ArrayList<Userclt>() ;	
		
		if("0".equals(way))
		{			
			try{
				all=DAOFactory.getIUsercltDAOInstance().findAll();
				req.setAttribute("userclt",all) ;
				req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}
					
		}									
		if("1".equals(way))
		{	
			if("".equals(userway))
			{	req.setAttribute("text","�ͻ���Ų���Ϊ��") ;
				req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
			}
			else{
				try{
				int id=Integer.parseInt(userway);
				all=DAOFactory.getIUsercltDAOInstance().findById(id);
				req.setAttribute("userclt",all) ;
				req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
			
				}catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","ά�޹���ʦ����Ϊ�ջ�����") ;
					req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
				}
			}
		}
		 if("2".equals(way))
		{
			 if("".equals(userway))
				{	req.setAttribute("text","�ͻ���������Ϊ��") ;
					req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
				}
				else
				{	System.out.println(userway);
					try{
						all=DAOFactory.getIUsercltDAOInstance().findByCltname(userway);
						
						req.setAttribute("userclt",all) ;
						req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
					}catch(Exception e){
							e.printStackTrace() ;
							
					}
				}
		}
		 if("3".equals(way))
		{
			 if("".equals(userway))
				{	req.setAttribute("text","�����Ʒʱ�䲻��Ϊ��") ;
					req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
				}
				else
				{	
					System.out.println(userway);
					try{
						all=DAOFactory.getIUsercltDAOInstance().findByCltbuytime(userway);
						req.setAttribute("userclt",all) ;
						req.getRequestDispatcher("ucltsearch.jsp").forward(req,resp) ;
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