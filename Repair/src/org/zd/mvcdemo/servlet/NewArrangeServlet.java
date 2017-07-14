package org.zd.mvcdemo.servlet ;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zd.mvcdemo.factory.DAOFactory;
import org.zd.mvcdemo.vo.Arrange;
import org.zd.mvcdemo.vo.Userrep;
import org.zd.mvcdemo.vo.Goods;
public class NewArrangeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String aid = req.getParameter("aid") ;
		String agid = req.getParameter("agid") ;
        String acltid = req.getParameter("acltid") ;
        String arep = req.getParameter("arep") ;
        String aresp = req.getParameter("aresp") ;
        String atime = req.getParameter("atime") ;

                                     	
		Arrange arrange=new Arrange();
				
		try{
			arrange.setAid(Integer.parseInt(aid));
			arrange.setAgid(Integer.parseInt(agid));
			arrange.setAcltid(Integer.parseInt(acltid));
			arrange.setArep(Integer.parseInt(arep));
			arrange.setAresp(aresp);
			arrange.setAtime(atime);
			if(DAOFactory.getIArrangeDAOInstance().doCreate(arrange) 
					&& DAOFactory.getIUserrepDAOInstance().updatestate(Integer.parseInt(arep))
					&& DAOFactory.getIGoodsDAOInstance().updatestate(Integer.parseInt(agid),Integer.parseInt(arep)))
			{
				req.setAttribute("text","修改成功") ;
				
				req.getRequestDispatcher("FindArGoServlet").forward(req,resp) ;
				
			}else{
					req.setAttribute("text","修改失败") ;
					req.getRequestDispatcher("FindArGoServlet").forward(req,resp) ;
			}			
			}catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","修改失败1") ;
					req.getRequestDispatcher("FindArGoServlet").forward(req,resp) ;
		     }
	}	
			
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}