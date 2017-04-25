package spms.controls;

import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spms.dao.ThtsdmDao;
import spms.vo.Thtsdm;

@Controller
public class ThtsdmAddController {
	final static Logger log = Logger.getLogger(ThtsdmAddController.class);
	
	ThtsdmDao thtsdmDao;
	
	@Autowired
	public ThtsdmAddController setThtsdmDao(ThtsdmDao thtsdmDao) {
		this.thtsdmDao = thtsdmDao;
		return this;
	}

	@RequestMapping(value="/thtsdm/add.do", method=RequestMethod.GET)
	public String addForm(){
		return "/thtsdm/ThtsdmForm.jsp";
	}
	
	@RequestMapping(value="/thtsdm/add.do", method=RequestMethod.POST)
	public String add(Thtsdm thtsdm) throws Exception{
		thtsdmDao.insert(thtsdm);
		return "redirect:list.do";
	}
	
	@InitBinder
	  public void initBinder(WebDataBinder binder) {
	  	log.debug("=> initBinder()");
	  	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	  	dateFormat.setLenient(false);
	  	binder.registerCustomEditor(
	  			java.util.Date.class, new CustomDateEditor(dateFormat, true));
	  }

}
