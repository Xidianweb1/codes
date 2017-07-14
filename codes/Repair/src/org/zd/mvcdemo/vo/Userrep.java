package org.zd.mvcdemo.vo ;
public class Userrep {
	private int rep ;
	private String reppass ;
	private String repname ;
	private int repphone ;
	private String repadd ;
	private int repid ; 
	private String reptime;
	private String repstate;

    public void setRep(int rep){
		this.rep = rep ;
	}
	public void setReppass(String reppass){
		this.reppass = reppass ;
	}
	public void setRepname(String repname){
		this.repname = repname ;
	}
	public void setRepphone(int repphone){
		this.repphone = repphone ;
	}
	public void setRepadd(String repadd){
		this.repadd = repadd ;
	}
	public void setRepid(int repid){
		this.repid = repid ;
	}
	public void setReptime(String reptime){
		this.reptime = reptime ;
	}
	public void setRepstate(String repstate){
		this.repstate = repstate ;
	}

	
    public int getRep(){
		return this.rep ;
	}
	public String getReppass(){
		return this.reppass ;
	}
	public String getRepname(){
		return this.repname ;
	}
	public int getRepphone(){
		return this.repphone ;
	}
	public String getRepadd(){
		return this.repadd ;
	}
	public int getRepid(){
		return this.repid ;
	}
	public String getReptime(){
		return this.reptime ;
	}
	public String getRepstate(){
		return this.repstate ;
	}
}