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
    <title>内容列表</title>
</head>
<body>

<section class="content">

    <form id="form" action="" method="post" class="form-horizontal">


        <div class="box box-solid">

            <div class="box-body no-padding">

                <div class="table-responsive mailbox-messages">
                    <table class="table table-hover table-striped">
                        <tbody>
                        <tr>
                            <th><input type="checkbox" name="checkAll" id="checkSelect" value="全选"/></th>
                            <th>标题</th>
                            <th>所属菜单</th>
                            <th>类型</th>

                            <th>更新时间</th>
                            <th>是否发布</th>
                        </tr>
                        <c:forEach items="${contentList}" var="item">
                            <tr>
                                <td ><input type="checkbox" name="checkSelect" value="${item.id}" id="checkSelect_${item.id}"/></td>
                                <td><a href="/admin/content/edit?id=${item.id}" class="btnView" title="${item.title}">${item.title}</a>&nbsp;</td>
                                <td>${item.type.menu.displayName}</td>
                                <td>${item.type.displayName}&nbsp;</td>
                                <td>${item.updateTime}&nbsp;</td>
                                <td>&nbsp;</td>
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
