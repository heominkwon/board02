package spms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ThtsdmDao {
	List<Map<String, Object>> selectList(HashMap<String,Object> paramMap) throws Exception;
	int insert(Map<String, Object> paramMap) throws Exception;
	//Thtsdm selectOne(int no) throws Exception;
	//int update(Thtsdm thtsdm) throws Exception;
	//int delete(int no) throws Exception;

}
