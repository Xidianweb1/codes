package org.zd.mvcdemo.dao ;
import java.util.List;

import org.zd.mvcdemo.vo.Usertype;
public interface IUsertypeDAO {
	// 现在完成的是登陆验证，那么登陆操作只有两种返回结果
	public boolean doCreate(Usertype usertype) throws Exception ;
	public boolean update(Usertype usertype)throws Exception ;
	public boolean delete(int rem)throws Exception ;
	public List<Usertype> findAll() throws Exception ;
	public List<Usertype> findById(int rem) throws Exception ;
	public List<Usertype> findByRemname(String remname) throws Exception ;
	public List<Usertype> findByRemtime(String remtime) throws Exception ;
	public boolean findLogin(Usertype usertype) throws Exception;
	public Usertype findId(int rem) throws Exception;
} 