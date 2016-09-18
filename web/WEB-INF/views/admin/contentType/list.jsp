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
    <title>内容类型列表</title>
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
                            <th>名称</th>
                            <th>所属菜单</th>
                        </tr>
                        <c:forEach items="${contentTypeList}" var="item">
                            <tr>
                                <td ><input type="checkbox" name="checkSelect" value="${item.id}" id="checkSelect_${item.id}"/></td>
                                <td><a href="/admin/contentType/edit?id=${item.id}" class="btnView" title="${item.displayName}">${item.displayName}</a>&nbsp;</td>
                                <td>${item.menu.displayName}</td>
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
