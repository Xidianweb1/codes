package org.zd.mvcdemo.vo ;
public class Arrange {
	private int aid ;
	private int agid ;
	private int acltid ;
	private int arep ;
	private String aresp ;
	private String atime ;

    public void setAid(int aid){
		this.aid = aid ;
	}
    public void setAgid(int agid){
		this.agid = agid ;
	}
	public void setAcltid(int acltid){
		this.acltid = acltid ;
	}
	public void setAresp(String aresp){
		this.aresp = aresp ;
	}
	public void setAtime(String atime){
		this.atime = atime ;
	}
	public void setArep(int arep){
		this.arep = arep ;
	}
	
	
	
    public int getAid(){
		return this.aid ;
	}
    public int getAgid(){
		return this.agid ;
	}
    public int getAcltid(){
		return this.acltid ;
	}
    public String getAresp(){
    	return this.aresp ; 
    }    
	public String getAtime(){
		return this.atime ;
	}
	public int getArep(){
		return this.arep ;
	}
	
}