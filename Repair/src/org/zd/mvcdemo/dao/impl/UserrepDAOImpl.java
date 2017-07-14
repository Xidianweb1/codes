package org.zd.mvcdemo.dao.impl ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.zd.mvcdemo.dao.IUserrepDAO;
import org.zd.mvcdemo.vo.Userrep;

public class UserrepDAOImpl implements IUserrepDAO {
	private Connection conn = null ;
	private PreparedStatement pstmt = null ;
	public UserrepDAOImpl(Connection conn){
		this.conn = conn ;
	}
	public boolean doCreate(Userrep userrep) throws Exception{
		boolean flag = false ;
		String sql = "INSERT INTO userrep(rep,reppass,repname,repphone,repadd,repid,reptime,repstate)VALUES(?,?,?,?,?,?,?,?)" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,userrep.getRep()) ;
		this.pstmt.setString(2,userrep.getReppass()) ;
		this.pstmt.setString(3,userrep.getRepname()) ;
		this.pstmt.setInt(4,userrep.getRepphone()) ;
		this.pstmt.setString(5,userrep.getRepadd()) ;
		this.pstmt.setInt(6,userrep.getRepid()) ;
		this.pstmt.setString(7,userrep.getReptime()) ;
		this.pstmt.setString(8,userrep.getRepstate()) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
	}
	public boolean update(Userrep userrep)throws Exception
	{
		boolean flag = false ;
		String sql = "UPDATE userrep SET repname=?,repphone=?,repadd=?,repid=?,reptime=?,repstate=? WHERE rep=?";
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,userrep.getRepname()) ;
		this.pstmt.setInt(2,userrep.getRepphone()) ;
		this.pstmt.setString(3,userrep.getRepadd()) ;
		this.pstmt.setInt(4,userrep.getRepid()) ;
		this.pstmt.setString(5,userrep.getReptime()) ;
		this.pstmt.setString(6,userrep.getRepstate()) ;
		this.pstmt.setInt(7,userrep.getRep()) ;
		
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
	}
	public boolean updatestate(int arep)throws Exception   //改为工作中
	{
		String ss = "工作中" ;
		boolean flag = false ;
		String sql = "UPDATE userrep SET repstate=? WHERE rep=?";
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,ss) ;
		this.pstmt.setInt(2,arep) ;
		
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
	}
	public boolean delete(int rep)throws Exception 
	{
		boolean flag = false ;
		String sql = "DELETE FROM userrep WHERE rep=?"  ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,rep) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
 
	}
	public List<Userrep> findAll() throws Exception{
		List<Userrep> all = new ArrayList<Userrep>() ;
		Userrep userrep = null ;
		String sql = "SELECT rep,repname,repphone,repadd,repid,reptime,repstate FROM userrep" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		
		while(rs.next()){
			userrep = new Userrep() ;
			userrep.setRep(rs.getInt(1)) ;
//			userrep.setRempass(rs.getString(2)) ;
			userrep.setRepname(rs.getString(2)) ;
			userrep.setRepphone(rs.getInt(3)) ;
			userrep.setRepadd(rs.getString(4)) ;
			userrep.setRepid(rs.getInt(5)) ;
			userrep.setReptime(rs.getString(6)) ;
			userrep.setRepstate(rs.getString(7)) ;
			all.add(userrep) ;
		}
		this.pstmt.close() ;
		return all ;
	}
	public List<Userrep> findById(int rep) throws Exception{
		List<Userrep> all = new ArrayList<Userrep>() ;
		String sql = "SELECT rep,reppass,repname,repphone,repadd,repid,reptime,repstate FROM userrep WHERE rep=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,rep) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Userrep userrep = null ;
		while(rs.next()){
			userrep = new Userrep() ;
			userrep.setRep(rs.getInt(1)) ;
			userrep.setReppass(rs.getString(2)) ;
			userrep.setRepname(rs.getString(3)) ;
			userrep.setRepphone(rs.getInt(4)) ;
			userrep.setRepadd(rs.getString(5)) ;
			userrep.setRepid(rs.getInt(6)) ;
			userrep.setReptime(rs.getString(7)) ;
			userrep.setRepstate(rs.getString(8)) ;
			all.add(userrep);
		}
		this.pstmt.close() ;
		return all ;
	}
	
	public List<Userrep> findByRepname(String repname) throws Exception
	{
		List<Userrep> all = new ArrayList<Userrep>() ;
		
		String sql = "SELECT rep,repname,repphone,repadd,repid,reptime,repstate FROM userrep WHERE repname=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,repname) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Userrep userrep = null ;
		while(rs.next()){
			userrep = new Userrep() ;
			userrep.setRep(rs.getInt(1)) ;
//			userrep.setReppass(rs.getString(2)) ;
			userrep.setRepname(rs.getString(2)) ;
			userrep.setRepphone(rs.getInt(3)) ;
			userrep.setRepadd(rs.getString(4)) ;
			userrep.setRepid(rs.getInt(5)) ;
			userrep.setReptime(rs.getString(6)) ;
			userrep.setRepstate(rs.getString(7)) ;
			all.add(userrep);
		}
		this.pstmt.close() ;
		return all ;		
	}
	
	public List<Userrep> findByReptime(String reptime) throws Exception 
	{
		List<Userrep> all = new ArrayList<Userrep>() ;
		
		String sql = "SELECT rep,repname,repphone,repadd,repid,reptime,repstate FROM userrep WHERE reptime=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,reptime) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Userrep userrep = null ;
		while(rs.next()){
			userrep = new Userrep() ;
			userrep.setRep(rs.getInt(1)) ;
//			userrep.setReppass(rs.getString(2)) ;
			userrep.setRepname(rs.getString(2)) ;
			userrep.setRepphone(rs.getInt(3)) ;
			userrep.setRepadd(rs.getString(4)) ;
			userrep.setRepid(rs.getInt(5)) ;
			userrep.setReptime(rs.getString(6)) ;
			userrep.setRepstate(rs.getString(7)) ;
			all.add(userrep);
		}
		this.pstmt.close() ;
		return all ;
	}
	
	public List<Userrep> findByRepstate(String repstate) throws Exception
	{
        List<Userrep> all = new ArrayList<Userrep>() ;
		
		String sql = "SELECT rep,repname,repphone,repadd,repid,reptime,repstate FROM userrep WHERE repstate=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,repstate) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Userrep userrep = null ;
		while(rs.next()){
			userrep = new Userrep() ;
			userrep.setRep(rs.getInt(1)) ;
//			userrep.setReppass(rs.getString(2)) ;
			userrep.setRepname(rs.getString(2)) ;
			userrep.setRepphone(rs.getInt(3)) ;
			userrep.setRepadd(rs.getString(4)) ;
			userrep.setRepid(rs.getInt(5)) ;
			userrep.setReptime(rs.getString(6)) ;
			userrep.setRepstate(rs.getString(7)) ;
			all.add(userrep);
		}
		this.pstmt.close() ;
		return all ;
	}
	
	public boolean findLogin(Userrep userrep) throws Exception{
		boolean flag = false ;
		String sql = "SELECT rep,repname,repphone,repadd,repid,reptime,repstate FROM userrep WHERE rep=? AND reppass=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,userrep.getRep()) ;
		this.pstmt.setString(2,userrep.getReppass()) ;
		
		ResultSet rs = this.pstmt.executeQuery() ;
		if(rs.next()){
		// 取出一个用户的真实姓名
			userrep.setRep(rs.getInt(1)) ;
			userrep.setRepname(rs.getString(2)) ;
			userrep.setRepphone(rs.getInt(3));
			userrep.setRepadd(rs.getString(4));
			userrep.setRepid(rs.getInt(5));
			userrep.setReptime(rs.getString(6));
			userrep.setRepstate(rs.getString(7));
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;

	}
	public Userrep findId(int rep) throws Exception{
		Userrep userrep = null ;
		String sql = "SELECT rep,reppass,repname,repphone,repadd,repid,reptime,repstate FROM userrep WHERE rep=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,rep) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		if(rs.next()){
			userrep = new Userrep() ;
			userrep.setRep(rs.getInt(1)) ;
			userrep.setReppass(rs.getString(2)) ;
			userrep.setRepname(rs.getString(3)) ;
			userrep.setRepphone(rs.getInt(4)) ;
			userrep.setRepadd(rs.getString(5)) ;
			userrep.setRepid(rs.getInt(6)) ;
			userrep.setReptime(rs.getString(7)) ;
			userrep.setRepstate(rs.getString(8)) ;
		}
		this.pstmt.close() ;
		return userrep ;
	}
}