<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"">
<title>세트등록현황</title>
</head>
<body>
<jsp:include page="/Header.jsp"/>
<h1>세트등록현황</h1>
<P><a href='add.do'>신규 세트 등록</a></P>
<table border="1">
<tr>
  <th><c:choose>
    <c:when test="${orderCond == 'MAKE_DATE_ASC'}">
      <a href="list.do?orderCond=MAKE_DATE_ASC">등록일↑</a>
    </c:when>
    <c:when test="${orderCond == 'MAKE_DATE_DESC'}">
      <a href="list.do?orderCond=MAKE_DATE_DESC">등록일↓</a>
    </c:when>
    <c:otherwise>
      <a href="list.do?orderCond=MAKE_DATE_DESC">등록일↓</a>
    </c:otherwise>
  </c:choose></th>
</tr>
<c:forEach var="thtsdm" items="${thtsdm}">
<tr> 
  <td>${thtsdm.makeDate}</td>
  <td>${thtsdm.gnrCode}</td>
  <td>${thtsdm.storeCode}</td>
  <td>${thtsdm.setCode}</td>
  <td>${thtsdm.seq}</td>
  <td>${thtsdm.qty}</td>
  <td>${thtsdm.entDate}</td>
  <td>${thtsdm.endEmpno}</td>
  <td>${thtsdm.modDate}</td>
  <td>${thtsdm.modEmpno}</td>
</tr>
</c:forEach>
</table>
<jsp:include page="/Tail.jsp"/>