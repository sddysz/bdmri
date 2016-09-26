<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhaoq
  Date: 2016/3/16
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<div class="flexslider">
    <ul class="slides">
        <c:forEach items="${banners}" var="item">
        <li>
            <a href="${item.url}"><img
                    src="${item.path}" draggable="false"></a></li>
        </c:forEach>
    </ul>


</div>
<div class="container">

    <ul class="i_content i_content01">
       <c:forEach items="${newsUp}" var="item">
        <li>
            <i style="background: url(${item.path})" onclick="javascript:void(0);"></i>
            <a href="${item.url}">${item.title}</a>
            <div>
                <p>${item.text}</p>
            </div>
        </li>
        </c:forEach>
    </ul>
    <a href="http://www.creawor.com/content.aspx?cateId=56&amp;id=172" class="center_banner"><img
            src="/resource/image/center_banner01.jpg"></a>
    <ul class="i_content i_content01">
        <c:forEach items="${newsDown}" var="item">
            <li>
                <i style="background: url(${item.path})" onclick="javascript:void(0);"></i>
                <a href="${item.url}">${item.title}</a>
                <div>
                    <p>${item.text}</p>
                </div>
            </li>
        </c:forEach>
    </ul>
</div>
<script>
    $(function () {
        $('.flexslider').flexslider({
            directionNav: true,
            pauseOnAction: true
        });
    });
</script>

</body>

</html>
