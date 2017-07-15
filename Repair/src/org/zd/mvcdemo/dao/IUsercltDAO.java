package org.zd.mvcdemo.dao ;
import java.util.List;

import org.zd.mvcdemo.vo.Userclt;
public interface IUsercltDAO {
	// ������ɵ��ǵ�½��֤����ô��½����ֻ�����ַ��ؽ��
	public boolean doCreate(Userclt userclt) throws Exception ;
	public boolean update(Userclt userclt)throws Exception ;
	public boolean delete(int cltid)throws Exception ;
	public List<Userclt> findAll() throws Exception ;
	public List<Userclt> findById(int cltid) throws Exception ;      //���ݿͻ���Ų�ѯ
	public List<Userclt> findByCltname(String cltname) throws Exception ; //���ݿͻ�ʦ��������
	public List<Userclt> findByCltbuytime(String cltbuytime) throws Exception ; //���ݿͻ�����ʱ�����
	public boolean findLogin(Userclt userclt) throws Exception;
	public Userclt findId(int cltid) throws Exception;
} 