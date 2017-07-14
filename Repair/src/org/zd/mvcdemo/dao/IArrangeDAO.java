package org.zd.mvcdemo.dao ;
import java.util.List;

import org.zd.mvcdemo.vo.Arrange;
public interface IArrangeDAO {
	public boolean doCreate(Arrange arrange) throws Exception ;
	public boolean update(Arrange arrange)throws Exception ;
	public boolean delete(int aid)throws Exception ;
	public List<Arrange> findAll() throws Exception ;
	public List<Arrange> findById(int aid) throws Exception ;      //根据故障编号查询
	public List<Arrange> findByAgid(int agid) throws Exception ;   //根据客户ID查询
	public List<Arrange> findByAcltid(int acltid) throws Exception ;
	public List<Arrange> findByArep(int arepid) throws Exception ;
	public List<Arrange> findByAresp(String aresp) throws Exception ; //根据处理状态查找
	 //根据负责维修工人查找
	public List<Arrange> findByAtime(String atime ) throws Exception ;
	public Arrange findId(int aid) throws Exception;
} 