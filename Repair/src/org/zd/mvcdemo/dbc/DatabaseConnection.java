package org.zd.mvcdemo.dbc ;
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
	private static final String DBDRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver" ;
 	private static final String DBURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Test;autoReconnect=true&useUnicode=true&characterEncoding=UTF-8" ;
	private static final String DBUSER = "sa" ;
	private static final String DBPASSWORD = "123456" ;
	private Connection conn = null ;
	public DatabaseConnection() throws Exception{
		try{
			Class.forName(DBDRIVER).newInstance() ;
			this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD) ;
		}catch(Exception e){
			throw e ;
		}
	}
	public Connection getConnection(){
		return this.conn ;
	}
	public void close() throws Exception{
		if(this.conn != null){
			try{
				this.conn.close() ;
			}catch(Exception e){
				throw e ;
			}
		}
	}
}