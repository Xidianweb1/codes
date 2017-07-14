package org.zd.mvcdemo.servlet ;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zd.mvcdemo.factory.DAOFactory;
import org.zd.mvcdemo.vo.Goods;
public class NewMyGoodsServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String gid = req.getParameter("gid") ;
		String cltid = req.getParameter("cltid") ;
		String cltname = req.getParameter("cltname") ;
        String cltphone = req.getParameter("cltphone") ;
        String gdescrip = req.getParameter("gdescrip") ;
        String gtime = req.getParameter("gtime") ;
        String gstate = req.getParameter("gstate") ;
        String grtime = req.getParameter("grtime") ;                             	
		Goods goods=new Goods();
				
		try{
			goods.setGid(Integer.parseInt(gid));
			goods.setGcltid(Integer.parseInt(cltid));
			goods.setGcltname(cltname);
			goods.setGcltphone(Integer.parseInt(cltphone));
			goods.setGdescrip(gdescrip);		
			goods.setGtime(gtime);
			goods.setGstate(gstate);
			goods.setGrtime(grtime);
			if(DAOFactory.getIGoodsDAOInstance().doCreate(goods))
			{
				req.setAttribute("text","添加成功") ;
				
				req.getRequestDispatcher("MyNewGoodsServlet").forward(req,resp) ;
				
			}else{
					req.setAttribute("text","添加失败") ;
					req.getRequestDispatcher("cltupdate.jsp").forward(req,resp) ;
			}			
			}catch(Exception e){
					e.printStackTrace() ;
					req.setAttribute("text","添加失败1") ;
					req.getRequestDispatcher("cltupdate.jsp").forward(req,resp) ;
		     }
	}	
			
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req,resp) ;
	}


}