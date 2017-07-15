package org.zd.mvcdemo.dao ;
import java.util.List;

import org.zd.mvcdemo.vo.Userclt;
public interface IUsercltDAO {
	// 现在完成的是登陆验证，那么登陆操作只有两种返回结果
	public boolean doCreate(Userclt userclt) throws Exception ;
	public boolean update(Userclt userclt)throws Exception ;
	public boolean delete(int cltid)throws Exception ;
	public List<Userclt> findAll() throws Exception ;
	public List<Userclt> findById(int cltid) throws Exception ;      //根据客户编号查询
	public List<Userclt> findByCltname(String cltname) throws Exception ; //根据客户师姓名查找
	public List<Userclt> findByCltbuytime(String cltbuytime) throws Exception ; //根据客户购买时间查找
	public boolean findLogin(Userclt userclt) throws Exception;
	public Userclt findId(int cltid) throws Exception;
} 