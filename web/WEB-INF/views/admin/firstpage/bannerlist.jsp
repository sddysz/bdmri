<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<section class="content">

    <form id="form" action="" method="post" class="form-horizontal">
        <div class="box box-solid">
            <div class="box-body no-padding">
                <h2>Banner列表</h2>
            </div>
        </div>
        <div class="box box-solid">

            <div class="box-body">


                <!-- Check all button -->

                <div class="btn-group">


                    <a href="/admin/fistpage/banner/edit?id=0" class="btn btn-default btn-sm checkbox-toggle"><i
                            class="fa fa-plus"></i>新建</a>
                </div><!-- /.btn-group -->

            </div>
        </div>

        <div class="box box-solid">

            <div class="box-body no-padding">

                <div class="table-responsive mailbox-messages">
                    <table class="table table-hover table-striped">
                        <tbody>
                        <tr>
                            <th>名称</th>
                            <th>URL</th>
                            <th>图片</th>
                            <th>排序值</th>
                            <th>操作</th>
                        </tr>
                        <c:forEach items="${bannerList}" var="item">
                            <tr>
                                <td><a href="/admin/fistpage/banner/edit/?id=${item.id}" class="btnView" title="${item.title}">${item.title}</a>&nbsp;</td>
                                <td>${item.url}</td>
                                <td>${item.path}</td>
                                <td>${item.orderId}</td>
                                <td><a href="/admin/fistpage/banner/delete?id=${item.id}">删除</a> </td>
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
