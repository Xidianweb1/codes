package org.zd.mvcdemo.dao.impl ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.zd.mvcdemo.dao.IArrangeDAO;
import org.zd.mvcdemo.vo.Arrange;

public class ArrangeDAOImpl implements IArrangeDAO {
	private Connection conn = null ;
	private PreparedStatement pstmt = null ;
	public ArrangeDAOImpl(Connection conn){
		this.conn = conn ;
	}
	public boolean doCreate(Arrange arrange) throws Exception{
		boolean flag = false ;
		String sql = "INSERT INTO arrange(aid,agid,acltid,aresp,atime,arep)VALUES(?,?,?,?,?,?)" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,arrange.getAid()) ;
		this.pstmt.setInt(2,arrange.getAgid()) ;
		this.pstmt.setInt(3,arrange.getAcltid()) ;
		this.pstmt.setString(4,arrange.getAresp()) ;
		this.pstmt.setString(5,arrange.getAtime()) ;
		this.pstmt.setInt(6,arrange.getArep()) ;
		
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
	}
	public boolean update(Arrange arrange)throws Exception
	{
		boolean flag = false ;
		String sql = "UPDATE arrange SET aid=?,agid=?,acltid=?,aresp=?,atime=?,arep=? WHERE aid=?";
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,arrange.getAid()) ;
		this.pstmt.setInt(2,arrange.getAgid()) ;
		this.pstmt.setInt(3,arrange.getAcltid()) ;
		this.pstmt.setString(4,arrange.getAresp()) ;
		this.pstmt.setString(5,arrange.getAtime()) ;
		this.pstmt.setInt(6,arrange.getArep()) ;
		this.pstmt.setInt(7,arrange.getAid()) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
	}
	public boolean delete(int aid)throws Exception 
	{
		boolean flag = false ;
		String sql = "DELETE FROM arrange WHERE aid=?"  ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,aid) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
 
	}
	public List<Arrange> findAll() throws Exception{
		List<Arrange> all = new ArrayList<Arrange>() ;
		Arrange arrange = null ;
		String sql = "SELECT aid,agid,acltid,aresp,atime,arep FROM arrange" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		
		while(rs.next()){
			arrange = new Arrange() ;
			arrange.setAid(rs.getInt(1)) ;
			arrange.setAgid(rs.getInt(2)) ;
			arrange.setAcltid(rs.getInt(3)) ;
			arrange.setAresp(rs.getString(4)) ;
			arrange.setAtime(rs.getString(5)) ;
			arrange.setArep(rs.getInt(6)) ;
			all.add(arrange) ;
		}
		this.pstmt.close() ;
		return all ;
	}
	public List<Arrange> findById(int aid) throws Exception{
		List<Arrange> all = new ArrayList<Arrange>() ;
		String sql = "SELECT aid,agid,acltid,aresp,atime,arep FROM arrange WHERE aid=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,aid) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Arrange arrange = null ;
		while(rs.next()){
			arrange = new Arrange() ;
			arrange.setAid(rs.getInt(1)) ;
			arrange.setAgid(rs.getInt(2)) ;
			arrange.setAcltid(rs.getInt(3)) ;
			arrange.setAresp(rs.getString(4)) ;
			arrange.setAtime(rs.getString(5)) ;
			arrange.setArep(rs.getInt(6)) ;
			all.add(arrange) ;
		}
		this.pstmt.close() ;
		return all ;
	}
	public List<Arrange> findByAgid(int agid) throws Exception
	{
        List<Arrange> all = new ArrayList<Arrange>() ;
		
		String sql = "SELECT aid,agid,acltid,aresp,atime,arep FROM arrange WHERE agid=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,agid) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Arrange arrange = null ;
		while(rs.next()){
			arrange = new Arrange() ;
			arrange.setAid(rs.getInt(1)) ;
			arrange.setAgid(rs.getInt(2)) ;
			arrange.setAcltid(rs.getInt(3)) ;
			arrange.setAresp(rs.getString(4)) ;
			arrange.setAtime(rs.getString(5)) ;
			arrange.setArep(rs.getInt(6)) ;
			all.add(arrange) ;
		}
		this.pstmt.close() ;
		return all ;		
	}
	
	public List<Arrange> findByAcltid(int acltid) throws Exception
	{
		List<Arrange> all = new ArrayList<Arrange>() ;
		
		String sql = "SELECT aid,agid,acltid,aresp,atime,arep FROM arrange WHERE acltid=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,acltid) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Arrange arrange = null ;
		while(rs.next()){
			arrange = new Arrange() ;
			arrange.setAid(rs.getInt(1)) ;
			arrange.setAgid(rs.getInt(2)) ;
			arrange.setAcltid(rs.getInt(3)) ;
			arrange.setAresp(rs.getString(4)) ;
			arrange.setAtime(rs.getString(5)) ;
			arrange.setArep(rs.getInt(6)) ;
			all.add(arrange) ;
		}
		this.pstmt.close() ;
		return all ;		
	}
	
	public List<Arrange> findByAresp(String aresp) throws Exception 
	{
		List<Arrange> all = new ArrayList<Arrange>() ;		
		String sql = "SELECT aid,agid,acltid,aresp,atime,arep FROM arrange WHERE aresp=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,aresp) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Arrange arrange = null ;
		while(rs.next()){
			arrange = new Arrange() ;
			arrange.setAid(rs.getInt(1)) ;
			arrange.setAgid(rs.getInt(2)) ;
			arrange.setAcltid(rs.getInt(3)) ;
			arrange.setAresp(rs.getString(4)) ;
			arrange.setAtime(rs.getString(5)) ;
			arrange.setArep(rs.getInt(6)) ;
			all.add(arrange) ;
		}
		this.pstmt.close() ;
		return all ;
	}
		
	public List<Arrange> findByAtime(String atime) throws Exception 
	{
       List<Arrange> all = new ArrayList<Arrange>() ;
		
		String sql = "SELECT aid,agid,acltid,aresp,atime,arep FROM arrange WHERE atime=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,atime) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Arrange arrange = null ;
		while(rs.next()){
			arrange = new Arrange() ;
			arrange.setAid(rs.getInt(1)) ;
			arrange.setAgid(rs.getInt(2)) ;
			arrange.setAcltid(rs.getInt(3)) ;
			arrange.setAresp(rs.getString(4)) ;
			arrange.setAtime(rs.getString(5)) ;
			arrange.setArep(rs.getInt(6)) ;
			all.add(arrange) ;
		}
		this.pstmt.close() ;
		return all ;
	}
	
	public List<Arrange> findByArep(int arep) throws Exception
	{
        List<Arrange> all = new ArrayList<Arrange>() ;
		
		String sql = "SELECT aid,agid,acltid,aresp,atime,arep FROM arrange WHERE arep=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,arep) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Arrange arrange = null ;
		while(rs.next()){
			arrange = new Arrange() ;
			arrange.setAid(rs.getInt(1)) ;
			arrange.setAgid(rs.getInt(2)) ;
			arrange.setAcltid(rs.getInt(3)) ;
			arrange.setAresp(rs.getString(4)) ;
			arrange.setAtime(rs.getString(5)) ;
			arrange.setArep(rs.getInt(6)) ;
			all.add(arrange) ;
		}
		this.pstmt.close() ;
		return all ;
	}
	
	public Arrange findId(int aid) throws Exception{
		Arrange arrange = null ;
		String sql = "SELECT aid,agid,acltid,aresp,atime,arep FROM arrange WHERE aid=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,aid) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		if(rs.next()){
			arrange = new Arrange() ;
			arrange.setAid(rs.getInt(1)) ;
			arrange.setAgid(rs.getInt(2)) ;
			arrange.setAcltid(rs.getInt(3)) ;
			arrange.setAresp(rs.getString(4)) ;
			arrange.setAtime(rs.getString(5)) ;
			arrange.setArep(rs.getInt(6)) ;
		}
		this.pstmt.close() ;
		return arrange ;
	}
}