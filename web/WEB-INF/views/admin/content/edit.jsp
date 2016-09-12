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
    <title>编辑内容</title>
</head>
<body>

<section class="content">

    <form id="form" action="/serviceOrder/save?id=${serviceOrder.id}" method="post" class="form-horizontal">
        <div class="box box-solid">
            <div class="btn-group">
                <button type="button" class="btn btn-default" onclick="history.back()">返回</button>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <button type="submit" class="btn btn-info">提交</button>
            </div>
        </div>

        <div class="box box-solid">
            <div class="box-header with-border">订单基本信息</div>
            <div class="box-body">
                <div class="row">
                    <div>

                        <div class="form-group col-sm-6">
                            <label for="orderNumber" class="col-sm-3 control-label">订单编号：</label>
                            <div class="col-sm-9">
                                <input rows="5" class="form-control" value="${serviceOrder.orderNumber}"
                                       data-rule="remote(/validate/unique?entity=${serviceOrder.getClass().name}&id=${serviceOrder.id}&property=orderNumber)" id="orderNumber" name="orderNumber"/>

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
