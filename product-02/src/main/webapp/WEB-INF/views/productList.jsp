<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<article>
<table>
<tr>
<td>
<a href ="productAdd">상품등록</a>
</td>
</tr>

<c:if test="${ not empty productList }">
<c:forEach var="p" items="${ productList }" varStatus="status">		
	<div>
<ul>
	<li>
	<a href="productDetail?no=${ p.no }&pageNum=${currentPage}" ><img src="resources/image/${p.image}"></a>
		
			<div>${p.name}
				<ul>
					<li>${p.price}</li>
				</ul>
			</div>		
		
	</li>
</ul>
</div>
</c:forEach>
	<tr>
		<td colspan="5" class="listPage">

		 	<c:if test="${ startPage > pageGroup }"> 
				<a href="productList?pageNum=${ startPage - pageGroup }">
					[이전]</a>
			</c:if>	

			<c:forEach var="i" begin="${ startPage }" end="${ endPage }">
				<c:if test="${ i == currentPage }">
					[ ${ i } ]
				</c:if>			
				<c:if test="${ i != currentPage }">
					<a href="productList?pageNum=${ i }">[ ${ i } ]</a>
				</c:if>			
			</c:forEach>

			<c:if test="${ endPage < pageCount }">
				<a href="productList?pageNum=${ startPage + pageGroup }">
					[다음]</a>
			</c:if>		
		</td>
	</tr>
</c:if>
<c:if test="${ empty productList }">
	<tr>
		<td colspan="5" class="listTdSpan">게시 글이 존재하지 않습니다.</td>
	</tr>
</c:if>
</table>

</article>