<%--
  Created by IntelliJ IDEA.
  User: dongye
  Date: 2016/9/6
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>Title</title>
</head>
<body>
<div class="subnav container">
    <a href="index.aspx">首页</a>
    <span>&gt;</span>
    <span>产品和服务</span>
    <span>&gt;</span>
    <span>大数据+</span>
</div>

<div id="subnav2" class="subnav2 container">

    <div onclick="changeSelectSubNav2(56)" id="subnav2Div56" class="subnav2Selection">
        大数据+
    </div>

    <div onclick="changeSelectSubNav2(57)" id="subnav2Div57">
        电信行业产品
    </div>

    <div onclick="changeSelectSubNav2(58)" id="subnav2Div58">
        公共安全产品
    </div>

    <div onclick="changeSelectSubNav2(59)" id="subnav2Div59">
        金融证券产品
    </div>

    <div onclick="changeSelectSubNav2(60)" id="subnav2Div60">
        运营服务
    </div>

</div>
<div class="content container">
    <div class="leftbar">
        <ul>
            <li class="menu_selected"><a>大数据+</a><i class="icon_downarrow"></i></li>
            <h1 id="ContentList" class="hideleftbar">
                <c:forEach items="${contentList}" var="item">
                <li><a id="leftbarItem172" href="javascript:void(0);" onclick="showDetail(172)"
                       class="leftbarList <c:if test="${item.id eq content.id}" >hideleftbar_selected</c:if>">${item.type.displayName}</a></li>
                </c:forEach>

            </h1>
        </ul>
        <div class="menubg"></div>
    </div>
    <div id="divContent" class="rightbar"><h1>
        <span style="line-height:1.5;"><span style="line-height:1;"></span><span style="font-family:'Microsoft YaHei';">${content.title}</span></span>
    </h1>
     ${content.content}
    </div>
</div>
</body>
</html>
