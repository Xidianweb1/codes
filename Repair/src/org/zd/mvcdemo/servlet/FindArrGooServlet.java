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
public class FindArrGooServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String gid = req.getParameter("agid") ;
        String gcltid = req.getParameter("gcltid") ;
        String gcltname = req.getParameter("gclname") ;
        String gcltphone = req.getParameter("gcltphone") ;
        String gdescrip = req.getParameter("gdescrip") ;
        String gtime = req.getParameter("gtime") ;
        String gstate = req.getParameter("gstate") ;
        String grtime = req.getParameter("grtime") ;
        String greason = req.getParameter("greason") ;
        String grep = req.getParameter("grep") ;
        String gdotime = req.getParameter("gdotime") ;
        
        int id=Integer.parseInt(gid);
//        String update = req.getParameter("way");
        
        List<Goods> all = new ArrayList<Goods>() ;
			try{
				
				
				req.setAttribute("agid",gid) ;
				req.setAttribute("gcltid",gcltid) ;
				req.setAttribute("gcltname",gcltname) ;
				req.setAttribute("gcltphone",gcltphone) ;
				req.setAttribute("gdescrip",gdescrip) ;
				req.setAttribute("gtime",gtime) ;	
				req.setAttribute("gstate",gstate) ;	
				req.setAttribute("grtime",grtime) ;
				req.setAttribute("greason",greason) ;
				req.setAttribute("grep",grep) ;
				req.setAttribute("gdotime",gdotime) ;
			}catch(Exception e){
				e.printStackTrace() ;
			}	
		
			try{
				all=DAOFactory.getIGoodsDAOInstance().findById(id);
				req.setAttribute("goods",all) ;
				req.getRequestDispatcher("uarrgosea.jsp").forward(req,resp) ;
			
			}catch(Exception e){
				e.printStackTrace() ;
			}
	
	}	
			
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}