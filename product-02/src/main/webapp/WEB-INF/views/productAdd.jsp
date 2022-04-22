<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<article>
<h2 align ="center">상품 등록하기</h2>
<form name="productAdd" id="productAdd" action="writeProcess" method="post">
<table class="AddTable">
<tr>
<td class= "thAdd">상품명</td>
<td class= "tdAdd"><input type="text" name="name" size="30" id="name" maxlength="15"/></td>
</tr>

<tr>
<td class= "thAdd">제조사</td>
<td class= "tdAdd"><input type="text" name="count" size="30" id="count" maxlength="20"/></td>
</tr>
<tr>
<td class= "thAdd">제조 일자</td>
<td class= "tdAdd"><input type="text" name="option1" size="30" id="option1" maxlength="30"/></td>
</tr>

<tr>
<td class= "thAdd" colspan ="2">제품사진</td>
</tr>

<tr>
<td class= "tdAdd" colspan ="2">
<input type="file" name="image" size="100" id="image" maxlength="70"/></td>
</tr>

<tr>
<td class= "thAdd">제품 설명</td>
<td class= "tdAdd"><input type="text" name="type" size="30" height="40" id="type" maxlength="100"/></td>
</tr>


<tr>
<td class= "thAdd">가격</td>
<td class= "tdAdd"><input type="text" name="price" size="30" id="price" maxlength="100"/>원</td>
</tr>

<tr>
<td class= "thAdd">사용방법</td>
<td class= "tdAdd"><input type="text" name="detail" size="30" id="detail" maxlength="1000"/></td>
</tr>

<tr>
<td class= "thAdd">작성자</td>
<td class= "tdAdd"><input type="text" name="writer" size="30" id="writer" maxlength="100"/></td>
</tr>
<tr>
<td class= "thAdd">작성자</td>
<td class= "tdAdd"><input type="text" name="delivery" size="30" id="delivery" maxlength="100"/></td>
</tr>
<tr>
<td class="thDetail">비밀번호</td>
<td class="tdDetail"><input type="text" name="pass" id="pass"></td>
</tr>

<tr>
<td colspan="2" align ="center" >
<input type="reset" value="다시쓰기"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="등록하기" />	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="목록보기" 
onclick="javascript:window.location.href='productList'"/></td>
</tr>
</table>
</form>
</article>