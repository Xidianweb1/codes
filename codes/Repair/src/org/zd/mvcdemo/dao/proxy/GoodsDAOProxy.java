package org.zd.mvcdemo.dao.proxy ;
import java.util.List;

import org.zd.mvcdemo.dao.IGoodsDAO;
import org.zd.mvcdemo.dao.impl.GoodsDAOImpl;
import org.zd.mvcdemo.dbc.DatabaseConnection;
import org.zd.mvcdemo.vo.Goods;

import sun.security.krb5.internal.UDPClient;
public class GoodsDAOProxy implements IGoodsDAO {
	private DatabaseConnection dbc = null ;
	private IGoodsDAO dao = null ;
	public GoodsDAOProxy(){
		try{
			this.dbc = new DatabaseConnection() ;
		}catch(Exception e){
			e.printStackTrace() ;
		}
		this.dao = new GoodsDAOImpl(dbc.getConnection()) ;
	}
	
	public boolean doCreate(Goods goods) throws Exception{
		boolean flag = false ;
		try{
			if(this.dao.findId(goods.getGid())== null){
				flag = this.dao.doCreate(goods) ;
			}
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public boolean update(Goods goods)throws Exception 
	{
		boolean flag = false ;
		try{
			flag = this.dao.update(goods) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public boolean updatestate(int agid,int arep)throws Exception 
	{
		boolean flag = false ;
		try{
			flag = this.dao.updatestate(agid,arep) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public boolean delete(int gid)throws Exception 
	{
		boolean flag = false ;
		try{
			flag = this.dao.delete(gid) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public List<Goods> findAll() throws Exception{
		List<Goods> all = null ;
		try{
			all = this.dao.findAll() ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Goods> findById(int gid) throws Exception{
		List<Goods> all = null ;
		try{
			all = this.dao.findById(gid) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Goods> findByGcltid(int gcltid) throws Exception{
		List<Goods> all = null ;
		try{
			all = this.dao.findByGcltid(gcltid) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Goods> findByGcltname(String gcltname) throws Exception{
		List<Goods> all = null ;
		try{
			all = this.dao.findByGcltname(gcltname) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Goods> findByGstate(String gstate) throws Exception 
	{
		List<Goods> all = null ;
		try{
			all = this.dao.findByGstate(gstate) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Goods> findByGrep(int grep) throws Exception 
	{
		List<Goods> all = null ;
		try{
			all = this.dao.findByGrep(grep) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Goods> findCltidAGstate(int gcltid,String gstate ) throws Exception 
	{
		List<Goods> all = null ;
		try{
			all = this.dao.findCltidAGstate(gcltid,gstate) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public Goods findId(int gid) throws Exception
	{
		Goods goods = null ;
		try{
			goods = this.dao.findId(gid) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return goods ;
	}
} 