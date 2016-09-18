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
    <title></title>
</head>
<body>

<section class="content">

    <form id="form" action="/admin/contentType/save?id=${contentType.id}" method="post" class="form-horizontal">
        <div class="box box-solid">
            <div class="btn-group">
                <button type="button" class="btn btn-default" onclick="history.back()">返回</button>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <button type="submit" class="btn btn-info">提交</button>
            </div>
        </div>

        <div class="box box-solid">

            <div class="box-body">
                <div class="row">
                    <div>

                        <div class="form-group col-sm-12">

                            <label for="title" class="col-sm-1 control-label">标题：</label>
                            <div class="col-sm-10">
                                <input id="title" name="title" class="form-control" value="${contentType.displayName}">
                            </div>
                        </div>

                        <div class="form-group col-sm-6">
                            <label for="type" class="col-sm-2 control-label">所属菜单：</label>
                            <div class="col-sm-9">
                                <select id="type" name="type.id" class="form-control"">
                                    <c:forEach items="${menuList}" var="item">
                                        <option value="${item.id}">${item.displayName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="form-group col-sm-6">

                            <label for="orderId" class="col-sm-2 control-label">排序：</label>
                            <div class="col-sm-9">
                                <input id="orderId" name="orderId" type="number" class="form-control "
                                       value="${contentType.orderId}">
                            </div>
                        </div>


                    </div>
                </div>

            </div>
        </div>

    </form>
</section>
</body>
</html>
