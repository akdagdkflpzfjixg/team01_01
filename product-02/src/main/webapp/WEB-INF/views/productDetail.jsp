<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<article>
<form name="checkForm" id="checkForm">
	<input type="hidden" name="no" id="no" value="${ product.no }"/>
	<input type="hidden" name="pass" id="rPass" />
	<input type="hidden" name="pageNum" value="${ pageNum }" />
</form>
<table class="contentTable">
	<tr>
		<td colspan="4" class="boardTitle">
			<h2>게시 글 상세보기</h2>
		</td>
	</tr>
	<tr>
		<td colspan="4">&nbsp;</td>
	</tr>
	<tr>
		<td class="contentTh">제&nbsp;&nbsp;&nbsp;&nbsp;목</td>
		<td class="contentTd" colspan="3">${ product.name }</td>		
	</tr>
	<tr>
		<td class="contentTh">글쓴이</td>
		<td class="contentTd">${ product.writer }</td>	
	</tr>
	<tr>		
		<td class="contentTh">비밀번호</td>
		<td class="contentTd"><input type="password" name="pass" id="pass"></td>
		
	</tr>	
	
	<tr>		
		<td class="readContent" colspan="4">
			<pre>${ product.detail }</pre>
		</td>
	</tr>	
	<tr>
		<td colspan="4">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="4" class="tdSpan">
			<input type="button" id="detailUpdate" value="수정하기"/>
			&nbsp;&nbsp;<input type="button" id="detailDelete" value="삭제하기" />			
			&nbsp;&nbsp;<input type="button" value="목록보기" onclick=
				"javascript:window.location.href='productList?pageNum=${pageNum}'"/>	
		</td>
	</tr>
</table>
</article>