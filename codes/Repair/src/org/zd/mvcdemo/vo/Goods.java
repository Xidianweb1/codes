package org.zd.mvcdemo.vo ;
public class Goods {
	private int gid ;
	private int gcltid ;
	private String gcltname ;
	private int gcltphone ;
	private String gdescrip ;
	private String gtime ;
	private String gstate ;
	private String grtime ;
	private String greason ; 
	private int grep ;
	private String gdotime ;

    public void setGid(int gid){
		this.gid = gid ;
	}
    public void setGcltname(String gcltname){
		this.gcltname = gcltname ;
	}
	public void setGcltid(int gcltid){
		this.gcltid = gcltid ;
	}
	public void setGcltphone(int gcltphone){
		this.gcltphone = gcltphone ;
	}
	public void setGdescrip(String gdescrip){
		this.gdescrip = gdescrip ;
	}
	public void setGtime(String gtime){
		this.gtime = gtime ;
	}
	public void setGstate(String gstate){
		this.gstate = gstate ;
	}
	public void setGrtime(String grtime){
		this.grtime = grtime ;
	}
	public void setGreason(String greason){
		this.greason = greason ;
	}
	public void setGrep(int grep){
		this.grep = grep ;
	}
	public void setGdotime(String gdotime){
		this.gdotime = gdotime ;
	}
	
	
	
    public int getGid(){
		return this.gid ;
	}
    public int getGcltid(){
		return this.gcltid ;
	}
    public String getGcltname(){
    	return this.gcltname ; 
    }
    public int getGcltphone(){
		return this.gcltphone ;
	}
    
	public String getGdescrip(){
		return this.gdescrip ;
	}
	public String getGtime(){
		return this.gtime ;
	}
	public String getGstate(){
		return this.gstate ;
	}
	public String getGrtime(){
		return this.grtime ;
	}
	public String getGreason(){
		return this.greason ;
	}
	public int getGrep(){
		return this.grep ;
	}
	public String getGdotime(){
		return this.gdotime ;
	}
	
}