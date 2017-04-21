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
<li><label for="title">생성일자</label> 
  <input id="makeDate" 
  type='text' name='makeDate' placeholder="예)2013-01-01"></li>
  <li><label for="gnrCode">장르코드</label> 
  <input id="gnrCode" 
  type='text' name='gnrCode' placeholder="예)11"></li>
  <li><label for="storeCode">점포코드</label> 
  <input id="storeCode" 
  type='text' name='storeCode' placeholder="예)1234"></li>
  <li><label for="setCode">세트상품코드</label> 
  <input id="setCode" 
  type='text' name='setCode' placeholder="예)11"></li>
  <li><label for="seq">순번</label> 
  <input id="seq" 
  type='text' name='seq' placeholder="예)11"></li>
  <li><label for="makeFlag">생성구분</label> 
  <input id="makeFlag" 
  type='text' name='makeFlag' placeholder="예)1"></li>
  <li><label for="qty">수량</label> 
  <input id="qty" 
  type='text' name='qty' placeholder="예)111"></li>
    <li><label for="entDate">등록일</label> 
  <input id="entDate" 
  type='text' name='entDate' placeholder="예)2013-01-01"></li> 
       <li><label for="endEmpno">등록자</label> 
  <input id="endEmpno" 
  type='text' name='endEmpno'></li> 
       <li><label for="modDate">변경일</label> 
  <input id="modDate" 
  type='text' name='modDate' placeholder="예)2013-01-01"></li> 
<li><label for="modEmpno">변경자</label> 
  <input id="modEmpno" 
  type='text' name='modEmpno'></li> 
</ul>
<input type='submit' value='추가'>
<input type='reset' value='취소'>
</form>
<jsp:include page="/Tail.jsp"/>
</body>
</html>
