package org.zd.mvcdemo.dao.proxy ;
import java.util.List;

import org.zd.mvcdemo.dao.IArrangeDAO;
import org.zd.mvcdemo.dao.impl.ArrangeDAOImpl;
import org.zd.mvcdemo.dbc.DatabaseConnection;
import org.zd.mvcdemo.vo.Arrange;

import sun.security.krb5.internal.UDPClient;
public class ArrangeDAOProxy implements IArrangeDAO {
	private DatabaseConnection dbc = null ;
	private IArrangeDAO dao = null ;
	public ArrangeDAOProxy(){
		try{
			this.dbc = new DatabaseConnection() ;
		}catch(Exception e){
			e.printStackTrace() ;
		}
		this.dao = new ArrangeDAOImpl(dbc.getConnection()) ;
	}
	
	public boolean doCreate(Arrange arrange) throws Exception{
		boolean flag = false ;
		try{
			if(this.dao.findId(arrange.getAid())== null){
				flag = this.dao.doCreate(arrange) ;
			}
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public boolean update(Arrange arrange)throws Exception 
	{
		boolean flag = false ;
		try{
			flag = this.dao.update(arrange) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public boolean delete(int aid)throws Exception 
	{
		boolean flag = false ;
		try{
			flag = this.dao.delete(aid) ;
			
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return flag ;
	}
	public List<Arrange> findAll() throws Exception{
		List<Arrange> all = null ;
		try{
			all = this.dao.findAll() ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Arrange> findById(int aid) throws Exception{
		List<Arrange> all = null ;
		try{
			all = this.dao.findById(aid) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Arrange> findByAgid(int agid) throws Exception{
		List<Arrange> all = null ;
		try{
			all = this.dao.findByAgid(agid) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Arrange> findByAcltid(int acltid) throws Exception{
		List<Arrange> all = null ;
		try{
			all = this.dao.findByAcltid(acltid) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Arrange> findByAresp(String aresp) throws Exception{
		List<Arrange> all = null ;
		try{
			all = this.dao.findByAresp(aresp) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Arrange> findByAtime(String atime) throws Exception 
	{
		List<Arrange> all = null ;
		try{
			all = this.dao.findByAtime(atime) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public List<Arrange> findByArep(int arep) throws Exception 
	{
		List<Arrange> all = null ;
		try{
			all = this.dao.findByArep(arep) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return all ;
	}
	public Arrange findId(int aid) throws Exception
	{
		Arrange arrange = null ;
		try{
			arrange = this.dao.findId(aid) ;
		}catch(Exception e){
			throw e ;
		}finally{
			this.dbc.close() ;
		}
		return arrange ;
	}
} 