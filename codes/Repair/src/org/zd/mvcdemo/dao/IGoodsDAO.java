package org.zd.mvcdemo.dao ;
import java.util.List;

import org.zd.mvcdemo.vo.Goods;
public interface IGoodsDAO {
	// ������ɵ��ǵ�½��֤����ô��½����ֻ�����ַ��ؽ��
	public boolean doCreate(Goods goods) throws Exception ;
	public boolean update(Goods goods)throws Exception ;
	public boolean updatestate(int agid,int arep)throws Exception ; //��״̬�޸�Ϊ�����к��޸�ά���˱��
	public boolean delete(int gid)throws Exception ;
	public List<Goods> findAll() throws Exception ;
	public List<Goods> findById(int gid) throws Exception ;      //���ݹ��ϱ�Ų�ѯ
	public List<Goods> findByGcltid(int gcltid) throws Exception ;   //���ݿͻ�ID��ѯ
	public List<Goods> findByGcltname(String gcltname) throws Exception ; //���ݿͻ���������
	public List<Goods> findByGstate(String gstate) throws Exception ; //���ݴ���״̬����
	public List<Goods> findByGrep(int grep) throws Exception ; //���ݸ���ά�޹��˲���
	public List<Goods> findCltidAGstate(int gcltid,String gstate ) throws Exception ;
	public Goods findId(int gid) throws Exception;
} 