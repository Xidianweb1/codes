package org.zd.mvcdemo.dao.impl ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.zd.mvcdemo.dao.IUsertypeDAO;
import org.zd.mvcdemo.vo.Usertype;
public class UsertypeDAOImpl implements IUsertypeDAO {
	private Connection conn = null ;
	private PreparedStatement pstmt = null ;
	public UsertypeDAOImpl(Connection conn){
		this.conn = conn ;
	}
	public boolean doCreate(Usertype usertype) throws Exception{
		boolean flag = false ;
		String sql = "INSERT INTO usertype(rem,rempass,remname,remphone,remadd,remid,remtime)VALUES(?,?,?,?,?,?,?)" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,usertype.getRem()) ;
		this.pstmt.setString(2,usertype.getRempass()) ;
		this.pstmt.setString(3,usertype.getRemname()) ;
		this.pstmt.setInt(4,usertype.getRemphone()) ;
		this.pstmt.setString(5,usertype.getRemadd()) ;
		this.pstmt.setInt(6,usertype.getRemid()) ;
		this.pstmt.setString(7,usertype.getRemtime()) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
	}
	public boolean update(Usertype usertype)throws Exception
	{
		boolean flag = false ;
		String sql = "UPDATE usertype SET rempass=?,remname=?,remphone=?,remadd=?,remid=?,remtime=? WHERE rem=?";
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,usertype.getRempass()) ;
		this.pstmt.setString(2,usertype.getRemname()) ;
		this.pstmt.setInt(3,usertype.getRemphone()) ;
		this.pstmt.setString(4,usertype.getRemadd()) ;
		this.pstmt.setInt(5,usertype.getRemid()) ;
		this.pstmt.setString(6,usertype.getRemtime()) ;
		this.pstmt.setInt(7,usertype.getRem()) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
	}
	public boolean delete(int rem)throws Exception 
	{
		boolean flag = false ;
		String sql = "DELETE FROM usertype WHERE rem=?"  ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,rem) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
 
	}
	public List<Usertype> findAll() throws Exception{
		List<Usertype> all = new ArrayList<Usertype>() ;
		Usertype usertype = null ;
		String sql = "SELECT rem,remname,remphone,remadd,remid,remtime FROM usertype" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		
		while(rs.next()){
			usertype = new Usertype() ;
			usertype.setRem(rs.getInt(1)) ;
//			usertype.setRempass(rs.getString(2)) ;
			usertype.setRemname(rs.getString(2)) ;
			usertype.setRemphone(rs.getInt(3)) ;
			usertype.setRemadd(rs.getString(4)) ;
			usertype.setRemid(rs.getInt(5)) ;
			usertype.setRemtime(rs.getString(6)) ;
			all.add(usertype) ;
		}
		this.pstmt.close() ;
		return all ;
	}
	public List<Usertype> findById(int rem) throws Exception{
		List<Usertype> all = new ArrayList<Usertype>() ;
		String sql = "SELECT rem,rempass,remname,remphone,remadd,remid,remtime FROM usertype WHERE rem=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,rem) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Usertype usertype = null ;
		while(rs.next()){
			usertype = new Usertype() ;
			usertype.setRem(rs.getInt(1)) ;
			usertype.setRempass(rs.getString(2)) ;
			usertype.setRemname(rs.getString(3)) ;
			usertype.setRemphone(rs.getInt(4)) ;
			usertype.setRemadd(rs.getString(5)) ;
			usertype.setRemid(rs.getInt(6)) ;
			usertype.setRemtime(rs.getString(7)) ;
			all.add(usertype);
		}
		this.pstmt.close() ;
		return all ;
	}
	
	public List<Usertype> findByRemname(String remname) throws Exception
	{
		List<Usertype> all = new ArrayList<Usertype>() ;
		
		String sql = "SELECT rem,remname,remphone,remadd,remid,remtime FROM usertype WHERE remname=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,remname) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Usertype usertype = null ;
		while(rs.next()){
			usertype = new Usertype() ;
			usertype.setRem(rs.getInt(1)) ;
//			usertype.setRempass(rs.getString(2)) ;
			usertype.setRemname(rs.getString(2)) ;
			usertype.setRemphone(rs.getInt(3)) ;
			usertype.setRemadd(rs.getString(4)) ;
			usertype.setRemid(rs.getInt(5)) ;
			usertype.setRemtime(rs.getString(6)) ;
			all.add(usertype);
		}
		this.pstmt.close() ;
		return all ;		
	}
	
	public List<Usertype> findByRemtime(String remtime) throws Exception 
	{
		List<Usertype> all = new ArrayList<Usertype>() ;
		
		String sql = "SELECT rem,remname,remphone,remadd,remid,remtime FROM usertype WHERE remtime=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,remtime) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Usertype usertype = null ;
		while(rs.next()){
			usertype = new Usertype() ;
			usertype.setRem(rs.getInt(1)) ;
//			usertype.setRempass(rs.getString(2)) ;
			usertype.setRemname(rs.getString(2)) ;
			usertype.setRemphone(rs.getInt(3)) ;
			usertype.setRemadd(rs.getString(4)) ;
			usertype.setRemid(rs.getInt(5)) ;
			usertype.setRemtime(rs.getString(6)) ;
			all.add(usertype);
		}
		this.pstmt.close() ;
		return all ;
	}
	
	public boolean findLogin(Usertype usertype) throws Exception{
		boolean flag = false ;
		String sql = "SELECT rem,remname,remphone,remadd,remid,remtime FROM usertype WHERE rem=? AND rempass=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,usertype.getRem()) ;
		this.pstmt.setString(2,usertype.getRempass()) ;
		
		ResultSet rs = this.pstmt.executeQuery() ;
		if(rs.next()){
		// 取出一个用户的真实姓名
			usertype.setRem(rs.getInt(1)) ;
			usertype.setRemname(rs.getString(2)) ;
			usertype.setRemphone(rs.getInt(3));
			usertype.setRemadd(rs.getString(4));
			usertype.setRemid(rs.getInt(5));
			usertype.setRemtime(rs.getString(6));
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;

	}
	public Usertype findId(int rem) throws Exception{
		Usertype usertype = null ;
		String sql = "SELECT rem,rempass,remname,remphone,remadd,remid,remtime FROM usertype WHERE rem=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,rem) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		if(rs.next()){
			usertype = new Usertype() ;
			usertype.setRem(rs.getInt(1)) ;
			usertype.setRempass(rs.getString(2)) ;
			usertype.setRemname(rs.getString(3)) ;
			usertype.setRemphone(rs.getInt(4)) ;
			usertype.setRemadd(rs.getString(5)) ;
			usertype.setRemid(rs.getInt(6)) ;
			usertype.setRemtime(rs.getString(7)) ;
		}
		this.pstmt.close() ;
		return usertype ;
	}
}