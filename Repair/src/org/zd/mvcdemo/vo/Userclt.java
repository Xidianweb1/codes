package org.zd.mvcdemo.vo ;
public class Userclt {
	private int cltid ;
	private String cltpass ;
	private String cltname ;
	private int cltphone ;
	private String cltbuytime ;
	private String cltadd ; 


    public void setCltid(int cltid){
		this.cltid = cltid ;
	}
	public void setCltpass(String cltpass){
		this.cltpass = cltpass ;
	}
	public void setCltname(String cltname){
		this.cltname = cltname ;
	}
	public void setCltphone(int cltphone){
		this.cltphone = cltphone ;
	}
	public void setCltadd(String cltadd){
		this.cltadd = cltadd ;
	}
	public void setCltbuytime(String cltbuytime){
		this.cltbuytime = cltbuytime ;
	}
	
	
	
    public int getCltid(){
		return this.cltid ;
	}
	public String getCltpass(){
		return this.cltpass ;
	}
	public String getCltname(){
		return this.cltname ;
	}
	public int getCltphone(){
		return this.cltphone ;
	}
	public String getCltadd(){
		return this.cltadd ;
	}
	public String getCltbuytime(){
		return this.cltbuytime ;
	}
	
}