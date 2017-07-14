package org.zd.mvcdemo.vo ;
public class Usertype {
	private int rem ;
	private String rempass ;
	private String remname ;
	private int remphone ;
	private String remadd ;
	private int remid ; 
	private String remtime;

    public void setRem(int rem){
		this.rem = rem ;
	}
	public void setRempass(String rempass){
		this.rempass = rempass ;
	}
	public void setRemname(String remname){
		this.remname = remname ;
	}
	public void setRemphone(int remphone){
		this.remphone = remphone ;
	}
	public void setRemadd(String remadd){
		this.remadd = remadd ;
	}
	public void setRemid(int remid){
		this.remid = remid ;
	}
	public void setRemtime(String remtime){
		this.remtime = remtime ;
	}

	
    public int getRem(){
		return this.rem ;
	}
	public String getRempass(){
		return this.rempass ;
	}
	public String getRemname(){
		return this.remname ;
	}
	public int getRemphone(){
		return this.remphone ;
	}
	public String getRemadd(){
		return this.remadd ;
	}
	public int getRemid(){
		return this.remid ;
	}
	public String getRemtime(){
		return this.remtime ;
	}
}