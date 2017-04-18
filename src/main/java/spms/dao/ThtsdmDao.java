package spms.dao;

import java.util.HashMap;
import java.util.List;

import spms.vo.Thtsdm;

public interface ThtsdmDao {
	List<Thtsdm> selectList(HashMap<String,Object> paramMap) throws Exception;
	int insert(Thtsdm thtsdm) throws Exception;
	Thtsdm selectOne(int no) throws Exception;
	int update(Thtsdm thtsdm) throws Exception;
	int delete(int no) throws Exception;

}
