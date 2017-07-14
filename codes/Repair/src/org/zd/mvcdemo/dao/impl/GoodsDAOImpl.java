package org.zd.mvcdemo.dao.impl ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.zd.mvcdemo.dao.IGoodsDAO;
import org.zd.mvcdemo.vo.Goods;

public class GoodsDAOImpl implements IGoodsDAO {
	private Connection conn = null ;
	private PreparedStatement pstmt = null ;
	public GoodsDAOImpl(Connection conn){
		this.conn = conn ;
	}
	public boolean doCreate(Goods goods) throws Exception{
		boolean flag = false ;
		String sql = "INSERT INTO goods(gid,gcltid,gcltname,gcltphone,gdescrip,gtime,gstate,grtime,greason,grep,gdotime)VALUES(?,?,?,?,?,?,?,?,?,?,?)" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,goods.getGid()) ;
		this.pstmt.setInt(2,goods.getGcltid()) ;
		this.pstmt.setString(3,goods.getGcltname()) ;
		this.pstmt.setInt(4,goods.getGcltphone()) ;
		this.pstmt.setString(5,goods.getGdescrip()) ;
		this.pstmt.setString(6,goods.getGtime()) ;
		this.pstmt.setString(7,goods.getGstate()) ;
		this.pstmt.setString(8,goods.getGrtime()) ;
		this.pstmt.setString(9,goods.getGreason()) ;
		this.pstmt.setInt(10,goods.getGrep()) ;
		this.pstmt.setString(11,goods.getGdotime()) ;
		
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
	}
	public boolean update(Goods goods)throws Exception
	{
		boolean flag = false ;
		String sql = "UPDATE goods SET gcltid=?,gcltname=?,gcltphone=?,gdescrip=?,gtime=?,gstate=?,grtime=?,greason=?,grep=?,gdotime=? WHERE gid=?";
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,goods.getGcltid()) ;
		this.pstmt.setString(2,goods.getGcltname()) ;
		this.pstmt.setInt(3,goods.getGcltphone()) ;
		this.pstmt.setString(4,goods.getGdescrip()) ;
		this.pstmt.setString(5,goods.getGtime()) ;
		this.pstmt.setString(6,goods.getGstate()) ;
		this.pstmt.setString(7,goods.getGrtime()) ;
		this.pstmt.setString(8,goods.getGreason()) ;
		this.pstmt.setInt(9,goods.getGrep()) ;
		this.pstmt.setString(10,goods.getGdotime()) ;
		this.pstmt.setInt(11,goods.getGid()) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
	}
	public boolean updatestate(int agid,int arep)throws Exception
	{
		boolean flag = false ;
		String ss = "´¦ÀíÖÐ" ;
		String sql = "UPDATE goods SET gstate=?,grep=? WHERE gid=?";
		this.pstmt = this.conn.prepareStatement(sql) ;		
		this.pstmt.setString(1,ss) ;
		this.pstmt.setInt(2,arep) ;
		this.pstmt.setInt(3,agid) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
	}
	public boolean delete(int gid)throws Exception 
	{
		boolean flag = false ;
		String sql = "DELETE FROM goods WHERE gid=?"  ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,gid) ;
		if(this.pstmt.executeUpdate() > 0){
			flag = true ;
		}
		this.pstmt.close() ;
		return flag ;
 
	}
	public List<Goods> findAll() throws Exception{
		List<Goods> all = new ArrayList<Goods>() ;
		Goods goods = null ;
		String sql = "SELECT gid,gcltid,gcltname,gcltphone,gdescrip,gtime,gstate,grtime,greason,grep,gdotime FROM goods" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		
		while(rs.next()){
			goods = new Goods() ;
			goods.setGid(rs.getInt(1)) ;
			goods.setGcltid(rs.getInt(2)) ;
			goods.setGcltname(rs.getString(3)) ;
			goods.setGcltphone(rs.getInt(4)) ;
			goods.setGdescrip(rs.getString(5)) ;
			goods.setGtime(rs.getString(6)) ;
			goods.setGstate(rs.getString(7)) ;
			goods.setGrtime(rs.getString(8)) ;
			goods.setGreason(rs.getString(9)) ;
			goods.setGrep(rs.getInt(10)) ;
			goods.setGdotime(rs.getString(11)) ;
			all.add(goods) ;
		}
		this.pstmt.close() ;
		return all ;
	}
	public List<Goods> findById(int gid) throws Exception{
		List<Goods> all = new ArrayList<Goods>() ;
		String sql = "SELECT gid,gcltid,gcltname,gcltphone,gdescrip,gtime,gstate,grtime,greason,grep,gdotime FROM goods WHERE gid=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,gid) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Goods goods = null ;
		while(rs.next()){
			goods = new Goods() ;
			goods.setGid(rs.getInt(1)) ;
			goods.setGcltid(rs.getInt(2)) ;
			goods.setGcltname(rs.getString(3)) ;
			goods.setGcltphone(rs.getInt(4)) ;
			goods.setGdescrip(rs.getString(5)) ;
			goods.setGtime(rs.getString(6)) ;
			goods.setGstate(rs.getString(7)) ;
			goods.setGrtime(rs.getString(8)) ;
			goods.setGreason(rs.getString(9)) ;
			goods.setGrep(rs.getInt(10)) ;
			goods.setGdotime(rs.getString(11)) ;
			all.add(goods) ;
		}
		this.pstmt.close() ;
		return all ;
	}
	public List<Goods> findByGcltid(int gcltid) throws Exception
	{
        List<Goods> all = new ArrayList<Goods>() ;
		
		String sql = "SELECT gid,gcltid,gcltname,gcltphone,gdescrip,gtime,gstate,grtime,greason,grep,gdotime FROM goods WHERE gcltid=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,gcltid) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Goods goods = null ;
		while(rs.next()){
			goods = new Goods() ;
			goods.setGid(rs.getInt(1)) ;
			goods.setGcltid(rs.getInt(2)) ;
			goods.setGcltname(rs.getString(3)) ;
			goods.setGcltphone(rs.getInt(4)) ;
			goods.setGdescrip(rs.getString(5)) ;
			goods.setGtime(rs.getString(6)) ;
			goods.setGstate(rs.getString(7)) ;
			goods.setGrtime(rs.getString(8)) ;
			goods.setGreason(rs.getString(9)) ;
			goods.setGrep(rs.getInt(10)) ;
			goods.setGdotime(rs.getString(11)) ;
			all.add(goods) ;
		}
		this.pstmt.close() ;
		return all ;		
	}
	
	public List<Goods> findByGcltname(String gcltname) throws Exception
	{
		List<Goods> all = new ArrayList<Goods>() ;
		
		String sql = "SELECT gid,gcltid,gcltname,gcltphone,gdescrip,gtime,gstate,grtime,greason,grep,gdotime FROM goods WHERE gcltname=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,gcltname) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Goods goods = null ;
		while(rs.next()){
			goods = new Goods() ;
			goods.setGid(rs.getInt(1)) ;
			goods.setGcltid(rs.getInt(2)) ;
			goods.setGcltname(rs.getString(3)) ;
			goods.setGcltphone(rs.getInt(4)) ;
			goods.setGdescrip(rs.getString(5)) ;
			goods.setGtime(rs.getString(6)) ;
			goods.setGstate(rs.getString(7)) ;
			goods.setGrtime(rs.getString(8)) ;
			goods.setGreason(rs.getString(9)) ;
			goods.setGrep(rs.getInt(10)) ;
			goods.setGdotime(rs.getString(11)) ;
			all.add(goods) ;
		}
		this.pstmt.close() ;
		return all ;		
	}
	
	public List<Goods> findByGstate(String gstate) throws Exception 
	{
		List<Goods> all = new ArrayList<Goods>() ;
		
		String sql = "SELECT gid,gcltid,gcltname,gcltphone,gdescrip,gtime,gstate,grtime,greason,grep,gdotime FROM goods WHERE gstate=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,gstate) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Goods goods = null ;
		while(rs.next()){
			goods = new Goods() ;
			goods.setGid(rs.getInt(1)) ;
			goods.setGcltid(rs.getInt(2)) ;
			goods.setGcltname(rs.getString(3)) ;
			goods.setGcltphone(rs.getInt(4)) ;
			goods.setGdescrip(rs.getString(5)) ;
			goods.setGtime(rs.getString(6)) ;
			goods.setGstate(rs.getString(7)) ;
			goods.setGrtime(rs.getString(8)) ;
			goods.setGreason(rs.getString(9)) ;
			goods.setGrep(rs.getInt(10)) ;
			goods.setGdotime(rs.getString(11)) ;
			all.add(goods) ;
		}
		this.pstmt.close() ;
		return all ;
	}
		
	public List<Goods> findCltidAGstate(int gcltid,String gstate ) throws Exception 
	{
       List<Goods> all = new ArrayList<Goods>() ;
		
		String sql = "SELECT gid,gcltid,gcltname,gcltphone,gdescrip,gtime,gstate,grtime,greason,grep,gdotime FROM goods WHERE gcltid=? AND gstate=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,gcltid) ;
		this.pstmt.setString(1,gstate) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Goods goods = null ;
		while(rs.next()){
			goods = new Goods() ;
			goods.setGid(rs.getInt(1)) ;
			goods.setGcltid(rs.getInt(2)) ;
			goods.setGcltname(rs.getString(3)) ;
			goods.setGcltphone(rs.getInt(4)) ;
			goods.setGdescrip(rs.getString(5)) ;
			goods.setGtime(rs.getString(6)) ;
			goods.setGstate(rs.getString(7)) ;
			goods.setGrtime(rs.getString(8)) ;
			goods.setGreason(rs.getString(9)) ;
			goods.setGrep(rs.getInt(10)) ;
			goods.setGdotime(rs.getString(11)) ;
			all.add(goods) ;
		}
		this.pstmt.close() ;
		return all ;
	}
	
	public List<Goods> findByGrep(int grep) throws Exception
	{
        List<Goods> all = new ArrayList<Goods>() ;
		
		String sql = "SELECT gid,gcltid,gcltname,gcltphone,gdescrip,gtime,gstate,grtime,greason,grep,gdotime FROM goods WHERE grep=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,grep) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		Goods goods = null ;
		while(rs.next()){
			goods = new Goods() ;
			goods.setGid(rs.getInt(1)) ;
			goods.setGcltid(rs.getInt(2)) ;
			goods.setGcltname(rs.getString(3)) ;
			goods.setGcltphone(rs.getInt(4)) ;
			goods.setGdescrip(rs.getString(5)) ;
			goods.setGtime(rs.getString(6)) ;
			goods.setGstate(rs.getString(7)) ;
			goods.setGrtime(rs.getString(8)) ;
			goods.setGreason(rs.getString(9)) ;
			goods.setGrep(rs.getInt(10)) ;
			goods.setGdotime(rs.getString(11)) ;
			all.add(goods) ;
		}
		this.pstmt.close() ;
		return all ;
	}
	
	public Goods findId(int gid) throws Exception{
		Goods goods = null ;
		String sql = "SELECT gid,gcltid,gcltname,gcltphone,gdescrip,gtime,gstate,grtime,greason,grep,gdotime FROM goods WHERE gid=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1,gid) ;
		ResultSet rs = this.pstmt.executeQuery() ;
		if(rs.next()){
			goods = new Goods() ;
			goods.setGid(rs.getInt(1)) ;
			goods.setGcltid(rs.getInt(2)) ;
			goods.setGcltname(rs.getString(3)) ;
			goods.setGcltphone(rs.getInt(4)) ;
			goods.setGdescrip(rs.getString(5)) ;
			goods.setGtime(rs.getString(6)) ;
			goods.setGstate(rs.getString(7)) ;
			goods.setGrtime(rs.getString(8)) ;
			goods.setGreason(rs.getString(9)) ;
			goods.setGrep(rs.getInt(10)) ;
			goods.setGdotime(rs.getString(11)) ;
		}
		this.pstmt.close() ;
		return goods ;
	}
}