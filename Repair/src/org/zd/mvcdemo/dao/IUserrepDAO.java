package org.zd.mvcdemo.dao ;
import java.util.List;

import org.zd.mvcdemo.vo.Userrep;
public interface IUserrepDAO {
	// 现在完成的是登陆验证，那么登陆操作只有两种返回结果
	public boolean doCreate(Userrep userrep) throws Exception ;
	public boolean update(Userrep userrep)throws Exception ;
	public boolean updatestate(int arep)throws Exception ; //修改arep的状态为工作中
	public boolean delete(int rep)throws Exception ;
	public List<Userrep> findAll() throws Exception ;
	public List<Userrep> findById(int rep) throws Exception ;      //根据维修工程师编号查询
	public List<Userrep> findByRepname(String repname) throws Exception ; //根据维修工程师姓名查找
	public List<Userrep> findByReptime(String reptime) throws Exception ; //根据维修工程师入职时间查找
	public List<Userrep> findByRepstate(String repstate) throws Exception ;//根据维修工程师工作状态
	public boolean findLogin(Userrep userrep) throws Exception;
	public Userrep findId(int rep) throws Exception;
} 