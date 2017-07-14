package org.zd.mvcdemo.dao ;
import java.util.List;

import org.zd.mvcdemo.vo.Arrange;
public interface IArrangeDAO {
	public boolean doCreate(Arrange arrange) throws Exception ;
	public boolean update(Arrange arrange)throws Exception ;
	public boolean delete(int aid)throws Exception ;
	public List<Arrange> findAll() throws Exception ;
	public List<Arrange> findById(int aid) throws Exception ;      //���ݹ��ϱ�Ų�ѯ
	public List<Arrange> findByAgid(int agid) throws Exception ;   //���ݿͻ�ID��ѯ
	public List<Arrange> findByAcltid(int acltid) throws Exception ;
	public List<Arrange> findByArep(int arepid) throws Exception ;
	public List<Arrange> findByAresp(String aresp) throws Exception ; //���ݴ���״̬����
	 //���ݸ���ά�޹��˲���
	public List<Arrange> findByAtime(String atime ) throws Exception ;
	public Arrange findId(int aid) throws Exception;
} 