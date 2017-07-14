package org.zd.mvcdemo.dao ;
import java.util.List;

import org.zd.mvcdemo.vo.Usertype;
public interface IUsertypeDAO {
	// ������ɵ��ǵ�½��֤����ô��½����ֻ�����ַ��ؽ��
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