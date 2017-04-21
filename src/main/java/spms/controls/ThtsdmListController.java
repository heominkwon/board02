package spms.controls;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value="/thtsdm/add.do", method=RequestMethod.GET)
	public String addForm(){
		return "/thtsdm/ThtsdmForm.jsp";
	}
	
	@RequestMapping(value="/thtsdm/add.do", method=RequestMethod.POST)
	public String add(Map<String, Object> model) throws Exception{
		
		System.out.println("허허허허");
		System.out.println("keyset="+ model.keySet());
		
		  //MAP의 KEY값을 이용하여 VALUE값 가져오기
		    for (String models : model.keySet()){
		        System.out.println("key:"+models+",value:"+ model.get(models));
		    }


		  
		thtsdmDao.insert(model);
		return "redirect:list.do";
	}
	

	
				
}
