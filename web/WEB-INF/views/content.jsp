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
                <li><a id="leftbarItem172" href="javascript:void(0);" onclick="showDetail(172)"
                       class="leftbarList hideleftbar_selected">“大数据＋”概述</a></li>
                <li><a id="leftbarItem173" href="javascript:void(0);" onclick="showDetail(173)" class="leftbarList">“健坤”大数据平台</a>
                </li>
                <li><a id="leftbarItem245" href="javascript:void(0);" onclick="showDetail(245)" class="leftbarList">“穿山甲”互联网信息采集与分析系统</a>
                </li>
                <li><a id="leftbarItem198" href="javascript:void(0);" onclick="showDetail(198)" class="leftbarList">“灵狐”大数据可视化系统</a>
                </li>
                <li><a id="leftbarItem174" href="javascript:void(0);" onclick="showDetail(174)"
                       class="leftbarList">创我云</a></li>
            </h1>
        </ul>
        <div class="menubg"></div>
    </div>
    <div id="divContent" class="rightbar"><h1>
        <span style="line-height:1.5;"><span style="line-height:1;"></span><span style="font-family:'Microsoft YaHei';">“大数据+” 概述</span></span>
    </h1>

    </div>
</div>
</body>
</html>
