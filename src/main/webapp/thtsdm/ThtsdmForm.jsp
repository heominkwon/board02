<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세트 등록</title>
<style>
ul { padding: 0; }
li { list-style:none; }

label {
  float: left;
  text-align: right;
  width: 100px;
}
</style>
</head>
<body>
<jsp:include page="/Header.jsp"/>
<h1>세트등록</h1>
<form action='add.do' method='post'>
<ul>
<li><label for="make_date">생성일자</label> 
  <input id="make_date" 
  type='text' name='make_date' placeholder="예)2013-01-01"></li>
  
  <li><label for="gnr_code">장르코드</label> 
  <input id="gnr_code" 
  type='text' name='gnr_code' placeholder="예)11"></li>
  
  <li><label for="store_code">점포코드</label> 
  <input id="store_code" 
  type='text' name='store_code' placeholder="예)1234"></li>
  <li><label for="set_code">세트상품코드</label> 
  <input id="set_code" 
  type='text' name='set_code' placeholder="예)11"></li>
  <li><label for="seq">순번</label> 
  <input id="seq" 
  type='text' name='seq' placeholder="예)11"></li>
  <li><label for="make_flag">생성구분</label> 
  <input id="make_flag" 
  type='text' name='make_flag' placeholder="예)1"></li>
  <li><label for="qty">수량</label> 
  <input id="qty" 
  type='text' name='qty' placeholder="예)111"></li>
    <li><label for="ent_date">등록일</label> 
  <input id="ent_date" 
  type='text' name='ent_date' placeholder="예)2013-01-01"></li> 
       <li><label for="ent_empno">등록자</label> 
  <input id="ent_empno" 
  type='text' name='ent_empno'></li> 
       <li><label for="mod_date">변경일</label> 
  <input id="mod_date" 
  type='text' name='mod_date' placeholder="예)2013-01-01"></li> 
<li><label for="mod_empno">변경자</label> 
  <input id="mod_empno" 
  type='text' name='mod_empno'></li> 
</ul>
<input type='submit' value='추가'>
<input type='reset' value='취소'>
</form>
<jsp:include page="/Tail.jsp"/>
</body>
</html>
