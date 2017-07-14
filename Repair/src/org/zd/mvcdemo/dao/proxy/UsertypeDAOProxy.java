package org.zd.mvcdemo.dao.proxy ;
import java.util.List;

import org.zd.mvcdemo.dao.IUsertypeDAO;
import org.zd.mvcdemo.dao.impl.UsertypeDAOImpl;
import org.zd.mvcdemo.dbc.DatabaseConnection;
import org.zd.mvcdemo.vo.Usertype;

import sun.security.krb5.internal.UDPClient;
public class UsertypeDAOProxy implements IUsertypeDAO {
	private DatabaseConnection dbc = null ;
	private IUsertypeDAO dao = null ;
	public UsertypeDAOProxy(){
		try{
			this.dbc = new DatabaseConnection() ;
		}catch(Exception e){
			e.printStackTrace() ;
		}
		this.dao = new UsertypeDAOImpl(dbc.getConnection()) ;
	}
	
	public boolean doCreate(Usertype usertype) throws Exception{
		boolean flag = false ;
		try{
			if(this.dao.findId(usertype.getRem())== null){
				flag = this.dao.doCreate(usertype) ;
			}
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public boolean update(Usertype usertype)throws Exception 
	{
		boolean flag = false ;
		try{
			flag = this.dao.update(usertype) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public boolean delete(int rem)throws Exception 
	{
		boolean flag = false ;
		try{
			flag = this.dao.delete(rem) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public List<Usertype> findAll() throws Exception{
		List<Usertype> all = null ;
		try{
			all = this.dao.findAll() ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Usertype> findById(int rem) throws Exception{
		List<Usertype> all = null ;
		try{
			all = this.dao.findById(rem) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Usertype> findByRemname(String remname) throws Exception{
		List<Usertype> all = null ;
		try{
			all = this.dao.findByRemname(remname) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Usertype> findByRemtime(String remtime) throws Exception 
	{
		List<Usertype> all = null ;
		try{
			all = this.dao.findByRemtime(remtime) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public boolean findLogin(Usertype usertype) throws Exception{
		boolean flag = false ;
		try{
			flag = this.dao.findLogin(usertype) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public Usertype findId(int rem) throws Exception
	{
		Usertype usertype = null ;
		try{
			usertype = this.dao.findId(rem) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return usertype ;
	}
} 