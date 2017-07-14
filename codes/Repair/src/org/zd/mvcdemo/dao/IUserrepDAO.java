package org.zd.mvcdemo.dao ;
import java.util.List;

import org.zd.mvcdemo.vo.Userrep;
public interface IUserrepDAO {
	// ������ɵ��ǵ�½��֤����ô��½����ֻ�����ַ��ؽ��
	public boolean doCreate(Userrep userrep) throws Exception ;
	public boolean update(Userrep userrep)throws Exception ;
	public boolean updatestate(int arep)throws Exception ; //�޸�arep��״̬Ϊ������
	public boolean delete(int rep)throws Exception ;
	public List<Userrep> findAll() throws Exception ;
	public List<Userrep> findById(int rep) throws Exception ;      //����ά�޹���ʦ��Ų�ѯ
	public List<Userrep> findByRepname(String repname) throws Exception ; //����ά�޹���ʦ��������
	public List<Userrep> findByReptime(String reptime) throws Exception ; //����ά�޹���ʦ��ְʱ�����
	public List<Userrep> findByRepstate(String repstate) throws Exception ;//����ά�޹���ʦ����״̬
	public boolean findLogin(Userrep userrep) throws Exception;
	public Userrep findId(int rep) throws Exception;
} 