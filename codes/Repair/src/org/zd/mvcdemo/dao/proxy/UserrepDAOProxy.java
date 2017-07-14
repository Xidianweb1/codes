package org.zd.mvcdemo.dao.proxy ;
import java.util.List;

import org.zd.mvcdemo.dao.IUserrepDAO;
import org.zd.mvcdemo.dao.impl.UserrepDAOImpl;
import org.zd.mvcdemo.dbc.DatabaseConnection;
import org.zd.mvcdemo.vo.Goods;
import org.zd.mvcdemo.vo.Userrep;

import sun.security.krb5.internal.UDPClient;
public class UserrepDAOProxy implements IUserrepDAO {
	private DatabaseConnection dbc = null ;
	private IUserrepDAO dao = null ;
	public UserrepDAOProxy(){
		try{
			this.dbc = new DatabaseConnection() ;
		}catch(Exception e){
			e.printStackTrace() ;
		}
		this.dao = new UserrepDAOImpl(dbc.getConnection()) ;
	}
	
	public boolean doCreate(Userrep userrep) throws Exception{
		boolean flag = false ;
		try{
			if(this.dao.findId(userrep.getRep())== null){
				flag = this.dao.doCreate(userrep) ;
			}
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public boolean update(Userrep userrep)throws Exception 
	{
		boolean flag = false ;
		try{
			flag = this.dao.update(userrep) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public boolean updatestate(int arep)throws Exception 
	{
		boolean flag = false ;
		try{
			flag = this.dao.updatestate(arep) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public boolean delete(int rep)throws Exception 
	{
		boolean flag = false ;
		try{
			flag = this.dao.delete(rep) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public List<Userrep> findAll() throws Exception{
		List<Userrep> all = null ;
		try{
			all = this.dao.findAll() ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Userrep> findById(int rep) throws Exception{
		List<Userrep> all = null ;
		try{
			all = this.dao.findById(rep) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Userrep> findByRepname(String repname) throws Exception{
		List<Userrep> all = null ;
		try{
			all = this.dao.findByRepname(repname) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Userrep> findByReptime(String reptime) throws Exception 
	{
		List<Userrep> all = null ;
		try{
			all = this.dao.findByReptime(reptime) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Userrep> findByRepstate(String repstate) throws Exception 
	{
		List<Userrep> all = null ;
		try{
			all = this.dao.findByRepstate(repstate) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public boolean findLogin(Userrep userrep) throws Exception{
		boolean flag = false ;
		try{
			flag = this.dao.findLogin(userrep) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public Userrep findId(int rep) throws Exception
	{
		Userrep userrep = null ;
		try{
			userrep = this.dao.findId(rep) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return userrep ;
	}
} 