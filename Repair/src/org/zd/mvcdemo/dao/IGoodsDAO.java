package org.zd.mvcdemo.dao ;
import java.util.List;

import org.zd.mvcdemo.vo.Goods;
public interface IGoodsDAO {
	// 现在完成的是登陆验证，那么登陆操作只有两种返回结果
	public boolean doCreate(Goods goods) throws Exception ;
	public boolean update(Goods goods)throws Exception ;
	public boolean updatestate(int agid,int arep)throws Exception ; //将状态修改为处理中和修改维修人编号
	public boolean delete(int gid)throws Exception ;
	public List<Goods> findAll() throws Exception ;
	public List<Goods> findById(int gid) throws Exception ;      //根据故障编号查询
	public List<Goods> findByGcltid(int gcltid) throws Exception ;   //根据客户ID查询
	public List<Goods> findByGcltname(String gcltname) throws Exception ; //根据客户姓名查找
	public List<Goods> findByGstate(String gstate) throws Exception ; //根据处理状态查找
	public List<Goods> findByGrep(int grep) throws Exception ; //根据负责维修工人查找
	public List<Goods> findCltidAGstate(int gcltid,String gstate ) throws Exception ;
	public Goods findId(int gid) throws Exception;
} 