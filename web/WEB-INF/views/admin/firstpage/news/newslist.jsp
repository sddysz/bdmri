<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="d" tagdir="/WEB-INF/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dongye
  Date: 2016/9/12
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Banner列表</title>
</head>
<body>
<d:message message="${message}"></d:message>
<section class="content">

    <form id="form" action="" method="post" class="form-horizontal">
        <div class="box box-solid">
            <div class="box-body no-padding">
                <h2>新闻预览列表</h2>
            </div>
        </div>


        <div class="box box-solid">

            <div class="box-body no-padding">

                <div class="table-responsive mailbox-messages">
                    <table class="table table-hover table-striped">
                        <tbody>
                        <tr>
                            <th>位置</th>
                            <th>名称</th>
                            <th>URL</th>
                            <th>图片预览</th>
                            <th>操作</th>
                        </tr>
                        <c:forEach items="${newsList}" var="item" varStatus="status" >
                            <tr>
                                <td>${newsName[status.index]}</td>
                                <td>${item.title}</td>
                                <td>${item.url}</td>
                                <td><a href="${item.path}"><img id="imageView" src="${item.path}" alt="请上传图片" class="img-thumbnail" style=" max-height: 40px;max-width: 60px;"></a></td>

                                <td>
                                    <a href="/admin/firstpage/news/edit?id=${item.id}">编辑</a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table><!-- /.table -->
                </div><!-- /.mail-box-messages -->
            </div>
        </div>

    </form>
</section>
</body>
</html>
