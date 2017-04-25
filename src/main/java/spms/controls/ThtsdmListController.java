package spms.controls;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spms.dao.ThtsdmDao;

//@RequestParam의 활용
@Controller
public class ThtsdmListController {
	ThtsdmDao thtsdmDao;

	@Autowired
	public ThtsdmListController setThtsdmDao(ThtsdmDao thtsdmDao) {
		this.thtsdmDao = thtsdmDao;
		return this;
	}
	
	@RequestMapping("/thtsdm/list.do")
	public String execute( String orderCond,
		    Map<String, Object> model) throws Exception {
		HashMap<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("orderCond", orderCond);
	
		model.put("thtsdm", thtsdmDao.selectList(paramMap));
		model.put("orderCond", orderCond);
		return "/thtsdm/ThtsdmList.jsp";
		
	}
	
	
	

	
				
}
