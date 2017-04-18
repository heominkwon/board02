package spms.vo;

import java.util.Date;

public class Thtsdm {
	
	  protected String make_date; //생성일자
	  protected String gnr_code; //장르코드
	  protected String store_code; //점포코드
	  protected String set_code; //세트상품코드
	  protected int seq; //순번
	  protected String make_flag; //생성구분
	  protected int qty; //수량
	  protected Date ent_date; //등록일
	  protected String ent_empno; //등록자
	  protected Date mod_date;//변경일
	  protected String mod_empno; //변경자
	  
	public String getMake_date() {
		return make_date;
	}
	public Thtsdm setMake_date(String make_date) {
		this.make_date = make_date;
		return this;
	}
	public String getGnr_code() {
		return gnr_code;
	}
	public Thtsdm setGnr_code(String gnr_code) {
		this.gnr_code = gnr_code;
		return this;
	}
	public String getStore_code() {
		return store_code;
	}
	public Thtsdm setStore_code(String store_code) {
		this.store_code = store_code;
		return this;
	}
	public String getSet_code() {
		return set_code;
	}
	public Thtsdm setSet_code(String set_code) {
		this.set_code = set_code;
		return this;
	}
	public int getSeq() {
		return seq;
	}
	public Thtsdm setSeq(int seq) {
		this.seq = seq;
		return this;
	}
	public String getMake_flag() {
		return make_flag;
	}
	public Thtsdm setMake_flag(String make_flag) {
		this.make_flag = make_flag;
		return this;
	}
	public int getQty() {
		return qty;
	}
	public Thtsdm setQty(int qty) {
		this.qty = qty;
		return this;
	}
	public Date getEnt_date() {
		return ent_date;
	}
	public Thtsdm setEnt_date(Date ent_date) {
		this.ent_date = ent_date;
		return this;
	}
	public String getEnt_empno() {
		return ent_empno;
	}
	public Thtsdm setEnt_empno(String ent_empno) {
		this.ent_empno = ent_empno;
		return this;
	}
	public Date getMod_date() {
		return mod_date;
	}
	public Thtsdm setMod_date(Date mod_date) {
		this.mod_date = mod_date;
		return this;
	}
	public String getMod_empno() {
		return mod_empno;
	}
	public Thtsdm setMod_empno(String mod_empno) {
		this.mod_empno = mod_empno;
		return this;
	}
	  
     

}
