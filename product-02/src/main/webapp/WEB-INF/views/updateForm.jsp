<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<form name="updateForm" id="updateForm" action="update" method="post">
		<input type="hidden" name="no" value="${product.no }" />
	<input type="hidden" name="pageNum" value="${ pageNum }" />
		<h1 align="center">${product.name }</h1>
		<table class="detailTable">
			<tr>
				<td class="thDetail">상품명</td>
				<td class="tdDetail"><input type="text" name="name" id="name"
					size="30" maxlength="15" value="${product.name }" /></td>
			</tr>

			<tr>
				<td class="thDetail">제품 설명</td>
				<td class="tdDetail"><input type="text" name="detail"
					id="detail" size="30" maxlength="1000" value="${product.detail }" /></td>
			</tr>

			<tr>
				<td class="thDetail">가격</td>
				<td class="tdDetail"><input type="text" name="price" id="price"
					size="30" maxlength="10" value="${product.price }" />원</td>
			</tr>

			<tr>
				<td class="thDetail">사용방법</td>
				<td class="tdDetail"><input type="text" name="productUse" id="productUse"
					size="30" maxlength="1000" value="${product.detail }" /></td>
			</tr>	
			<tr>
				<td class="thDetail">비밀번호</td>
				<td class="tdDetail"><input type="text" name="pass" id="pass"></td>
			</tr>
			<tr>
				<td class="updateButton" colspan="2" align="center"><input
					type="submit" value="수정하기" />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
					type="reset" value="다시쓰기" />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
					type="button" value="목록보기"
					onclick="javascript:window.location.href='productList?pageNum=${pageNum}'" /></td>
			</tr>
		</table>
	</form>
</article>