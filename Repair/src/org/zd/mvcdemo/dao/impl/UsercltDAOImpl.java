package org.zd.mvcdemo.dao.impl ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.zd.mvcdemo.dao.IUsercltDAO;
import org.zd.mvcdemo.vo.Userclt;

public class UsercltDAOImpl implements IUsercltDAO {
	private Connection conn = null ;
	private PreparedStatement pstmt = null ;
	public UsercltDAOImpl(Connection conn){
		this.conn = conn ;
	}
	public boolean doCreate(Userclt userclt) throws Exception{
		boolean flag = false ;
		String sql = "INSERT INTO userclt(cltid,cltpass,cltname,cltphone,cltbuytime,cltadd)VALUES(?,?,?,?,?,?)" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,userclt.getCltid()) ;
		this.pstmt.setString(2,userclt.getCltpass()) ;
		this.pstmt.setString(3,userclt.getCltname()) ;
		this.pstmt.setInt(4,userclt.getCltphone()) ;
		this.pstmt.setString(5,userclt.getCltbuytime()) ;
		this.pstmt.setString(6,userclt.getCltadd()) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
	}
	public boolean update(Userclt userclt)throws Exception
	{
		boolean flag = false ;
		String sql = "UPDATE userclt SET cltpass=?,cltname=?,cltphone=?,cltadd=?,cltbuytime=? WHERE cltid=?";
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,userclt.getCltpass()) ;
		this.pstmt.setString(2,userclt.getCltname()) ;
		this.pstmt.setInt(3,userclt.getCltphone()) ;
		this.pstmt.setString(4,userclt.getCltadd()) ;
		this.pstmt.setString(5,userclt.getCltbuytime()) ;
		this.pstmt.setInt(6,userclt.getCltid()) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
	}
	public boolean delete(int cltid)throws Exception 
	{
		boolean flag = false ;
		String sql = "DELETE FROM userclt WHERE cltid=?"  ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,cltid) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
 
	}
	public List<Userclt> findAll() throws Exception{
		List<Userclt> all = new ArrayList<Userclt>() ;
		Userclt userclt = null ;
		String sql = "SELECT cltid,cltpass,cltname,cltphone,cltbuytime,cltadd FROM userclt" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		
		while(rs.next()){
			userclt = new Userclt() ;
			userclt.setCltid(rs.getInt(1)) ;
			userclt.setCltpass(rs.getString(2)) ;
			userclt.setCltname(rs.getString(3)) ;
			userclt.setCltphone(rs.getInt(4)) ;
			userclt.setCltbuytime(rs.getString(5)) ;
			userclt.setCltadd(rs.getString(6)) ;
			all.add(userclt) ;
		}
		this.pstmt.close() ;
		return all ;
	}
	public List<Userclt> findById(int cltid) throws Exception{
		List<Userclt> all = new ArrayList<Userclt>() ;
		String sql = "SELECT cltid,cltpass,cltname,cltphone,cltbuytime,cltadd FROM userclt WHERE cltid=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,cltid) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Userclt userclt = null ;
		while(rs.next()){
			userclt = new Userclt() ;
			userclt.setCltid(rs.getInt(1)) ;
			userclt.setCltpass(rs.getString(2)) ;
			userclt.setCltname(rs.getString(3)) ;
			userclt.setCltphone(rs.getInt(4)) ;
			userclt.setCltbuytime(rs.getString(5)) ;
			userclt.setCltadd(rs.getString(6)) ;
			all.add(userclt);
		}
		this.pstmt.close() ;
		return all ;
	}
	
	public List<Userclt> findByCltname(String cltname) throws Exception
	{
		List<Userclt> all = new ArrayList<Userclt>() ;
		
		String sql = "SELECT cltid,cltname,cltphone,cltbuytime,cltadd FROM userclt WHERE cltname=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,cltname) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Userclt userclt = null ;
		while(rs.next()){
			userclt = new Userclt() ;
			userclt.setCltid(rs.getInt(1)) ;
			userclt.setCltname(rs.getString(2)) ;
			userclt.setCltphone(rs.getInt(3)) ;
			userclt.setCltbuytime(rs.getString(4)) ;
			userclt.setCltadd(rs.getString(5)) ;
			all.add(userclt);
		}
		this.pstmt.close() ;
		return all ;		
	}
	
	public List<Userclt> findByCltbuytime(String cltbuytime) throws Exception 
	{
		List<Userclt> all = new ArrayList<Userclt>() ;
		
		String sql = "SELECT cltid,cltname,cltphone,cltbuytime,cltadd FROM userclt WHERE cltbuytime=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,cltbuytime) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Userclt userclt = null ;
		while(rs.next()){
			userclt = new Userclt() ;
			userclt.setCltid(rs.getInt(1)) ;
			userclt.setCltname(rs.getString(2)) ;
			userclt.setCltphone(rs.getInt(3)) ;
			userclt.setCltbuytime(rs.getString(4)) ;
			userclt.setCltadd(rs.getString(5)) ;
			all.add(userclt);
		}
		this.pstmt.close() ;
		return all ;
	}
	
	
	public boolean findLogin(Userclt userclt) throws Exception{
		boolean flag = false ;
		String sql = "SELECT cltid,cltname,cltphone,cltbuytime,cltadd FROM userclt WHERE cltid=? AND cltpass=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,userclt.getCltid()) ;
		this.pstmt.setString(2,userclt.getCltpass()) ;
		
		ResultSet rs = this.pstmt.executeQuery() ;
		if(rs.next()){
		// 取出一个用户的真实姓名
			userclt.setCltid(rs.getInt(1)) ;
			userclt.setCltname(rs.getString(2)) ;
			userclt.setCltphone(rs.getInt(3)) ;
			userclt.setCltbuytime(rs.getString(4)) ;
			userclt.setCltadd(rs.getString(5)) ;
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;

	}
	public Userclt findId(int cltid) throws Exception{
		Userclt userclt = null ;
		String sql = "SELECT cltid,cltpass,cltname,cltphone,cltbuytime,cltadd FROM userclt WHERE cltid=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,cltid) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		if(rs.next()){
			userclt = new Userclt() ;
			userclt.setCltid(rs.getInt(1)) ;
			userclt.setCltpass(rs.getString(2)) ;
			userclt.setCltname(rs.getString(3)) ;
			userclt.setCltphone(rs.getInt(4)) ;
			userclt.setCltbuytime(rs.getString(5)) ;
			userclt.setCltadd(rs.getString(6)) ;
		}
		this.pstmt.close() ;
		return userclt ;
	}
}