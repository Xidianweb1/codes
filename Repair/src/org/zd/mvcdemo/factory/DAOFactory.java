package org.zd.mvcdemo.factory ;
import org.zd.mvcdemo.dao.IUsertypeDAO;
import org.zd.mvcdemo.dao.proxy.UsertypeDAOProxy;

import org.zd.mvcdemo.dao.IUserrepDAO;
import org.zd.mvcdemo.dao.proxy.UserrepDAOProxy;

import org.zd.mvcdemo.dao.IUsercltDAO;
import org.zd.mvcdemo.dao.proxy.UsercltDAOProxy;

import org.zd.mvcdemo.dao.IGoodsDAO;
import org.zd.mvcdemo.dao.proxy.GoodsDAOProxy;

import org.zd.mvcdemo.dao.IArrangeDAO;
import org.zd.mvcdemo.dao.proxy.ArrangeDAOProxy;
public class DAOFactory {
	public static IUsertypeDAO getIUsertypeDAOInstance(){
		return new UsertypeDAOProxy() ;
	}
	public static IUserrepDAO getIUserrepDAOInstance(){
		return new UserrepDAOProxy() ;
	}
	public static IUsercltDAO getIUsercltDAOInstance(){
		return new UsercltDAOProxy() ;
	}
	public static IGoodsDAO getIGoodsDAOInstance(){
		return new GoodsDAOProxy() ;
	}
	public static IArrangeDAO getIArrangeDAOInstance(){
		return new ArrangeDAOProxy() ;
	}
}