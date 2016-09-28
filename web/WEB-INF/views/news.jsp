<%--
  Created by IntelliJ IDEA.
  User: dongye
  Date: 2016/9/28
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglibs.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="rightbar">
    <ul class="infonews01" id="NewsList">
        <a href="infonewsDetail.aspx?id=217"> <li><div>智慧城市建设行业现状分析 引领企业起飞</div><span>[2015-09-29]</span></li></a>
        <a href="infonewsDetail.aspx?id=246"><li><div>前狼后虎：运营商转型关口</div><span>[2015-09-29]</span></li></a>
        <a href="infonewsDetail.aspx?id=247"><li><div>用户量增长不及预期 虚拟运营商如何走更远</div><span>[2015-09-22]</span></li></a>
        <a href="infonewsDetail.aspx?id=248"><li><div>揭开政府大数据应用的面纱</div><span>[2015-09-22]</span></li></a>
        <a href="infonewsDetail.aspx?id=249"><li><div>虚拟运营商时代：网运分离渐成电信业趋势</div><span>[2015-09-15]</span></li></a>
        <a href="infonewsDetail.aspx?id=250"><li><div>T11全球移动大数据峰会研讨移动数据跨界</div><span>[2015-09-14]</span></li>  </a>
    </ul>
    <div style="text-align: center;">
        <ul class="pagenum">
            <li style="cursor:pointer" onclick="goFirstPage()">首页</li>
            <li style="cursor:pointer" onclick="prePage()">上一页</li>
            <li style="cursor:pointer" onclick="nextPage()">下一页</li>
            <li style="cursor:pointer" onclick="goLastPage()">末页</li>
            <li>当前<span id="curPage">6</span>/<span id="pageCount">6</span>页</li>
        </ul>
        <div class="page_goto">
            <span>转到</span>
            <input type="text" id="gotoPageIndex">
            <button style="cursor:pointer" type="button" onclick="goPage()"></button>
        </div>
    </div>
</div>
</body>
</html>
