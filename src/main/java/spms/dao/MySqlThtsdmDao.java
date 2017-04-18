package spms.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spms.vo.Thtsdm;


//@Repository DAO와 같은 퍼시스턴스 역할을 수행하는 클래스에 붙인다.
@Repository
public class MySqlThtsdmDao implements ThtsdmDao {
	
	// SqlSessionFactory에게 SQL실행 객체을 요구하기 위해 먼저 선언
	SqlSessionFactory sqlSessionFactory;
	
	//빈의  set메서드에 @Autowired를 선언하면 빈 컨테이너가 셋터의 매개변수타입
	//과 일치하는 빈을 찾아 자동 설정해 줌 
	//SQL을 실행 할 때 사용할 도구를 만듬
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public List<Thtsdm> selectList(HashMap<String, Object> paramMap)
			throws Exception {
		//sqlSessionFactory로 sqlsession생성
		//DB연결정보를 가져옴
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try{
			//spms.dao.ThtsdmDao : SQL맵퍼의 네임스페이스이름
			//selectList : SQL문 ID
			return sqlSession.selectList("spms.dao.ThtsdmDao.selectList", paramMap);
		} finally {
			sqlSession.close();
		}
	}

	@Override
	public int insert(Thtsdm thtsdm) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Thtsdm selectOne(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Thtsdm thtsdm) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int no) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
