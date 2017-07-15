package org.zd.mvcdemo.dao.proxy ;
import java.util.List;

import org.zd.mvcdemo.dao.IUsercltDAO;
import org.zd.mvcdemo.dao.impl.UsercltDAOImpl;
import org.zd.mvcdemo.dbc.DatabaseConnection;
import org.zd.mvcdemo.vo.Userclt;

import sun.security.krb5.internal.UDPClient;
public class UsercltDAOProxy implements IUsercltDAO {
	private DatabaseConnection dbc = null ;
	private IUsercltDAO dao = null ;
	public UsercltDAOProxy(){
		try{
			this.dbc = new DatabaseConnection() ;
		}catch(Exception e){
			e.printStackTrace() ;
		}
		this.dao = new UsercltDAOImpl(dbc.getConnection()) ;
	}
	
	public boolean doCreate(Userclt userclt) throws Exception{
		boolean flag = false ;
		try{
			if(this.dao.findId(userclt.getCltid())== null){
				flag = this.dao.doCreate(userclt) ;
			}
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public boolean update(Userclt userclt)throws Exception 
	{
		boolean flag = false ;
		try{
			flag = this.dao.update(userclt) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public boolean delete(int cltid)throws Exception 
	{
		boolean flag = false ;
		try{
			flag = this.dao.delete(cltid) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public List<Userclt> findAll() throws Exception{
		List<Userclt> all = null ;
		try{
			all = this.dao.findAll() ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Userclt> findById(int cltid) throws Exception{
		List<Userclt> all = null ;
		try{
			all = this.dao.findById(cltid) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Userclt> findByCltname(String cltname) throws Exception{
		List<Userclt> all = null ;
		try{
			all = this.dao.findByCltname(cltname) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Userclt> findByCltbuytime(String cltbuytime) throws Exception 
	{
		List<Userclt> all = null ;
		try{
			all = this.dao.findByCltbuytime(cltbuytime) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	
	public boolean findLogin(Userclt userclt) throws Exception{
		boolean flag = false ;
		try{
			flag = this.dao.findLogin(userclt) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public Userclt findId(int cltid) throws Exception
	{
		Userclt userclt = null ;
		try{
			userclt = this.dao.findId(cltid) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return userclt ;
	}
} 