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
        <li>
            <a href="http://www.creawor.com/content.aspx?cateId=56&amp;id=172"><img
                    src="/resource/image/banner01.jpg" draggable="false"></a></li>
        <li>
            <a href="http://www.creawor.com/content.aspx?cateId=58&amp;id=194"><img
                    src="/resource/image/banner02.jpg" draggable="false"></a></li>
        <li>
            <a href="http://www.creawor.com/content.aspx?cateId=57&amp;id=175"><img
                    src="/resource/image/banner03.jpg" draggable="false"></a></li>
        <li>
            <a href="http://www.creawor.com/content.aspx?cateId=59&amp;id=195"><img
                    src="/resource/image/banner04.jpg" draggable="false"></a></li>
    </ul>


</div>
<div class="container">
    <div class="float_news container">
        <div id="marquee5">
            <ul id="newsList" style="height: 1140px;">
                <li><a href="http://www.creawor.com/infonews.aspx?id=77" class="news_tag01"><h1>公</h1>
                    <h2><span>NEWS</span>
                        <p>司新闻</p></h2>
                </a><a href="http://www.creawor.com/infonewsDetail.aspx?id=214">创我科技正式启动新三板工作</a></li>

            </ul>
        </div>
    </div>
    <ul class="i_content i_content01">
        <!-- <li>
            <i class="i_pic01"></i>
            <a href="content01_a.html">大数据电信产品</a>
            <div>
                <p>流量经营精细化系统(FOSS系统)</p>
                <p>流量全景图</p>
                <p>客户标签及管理系统</p>
                <p>IMEI终端库识别更新系统</p>
                <span class="text_zhezhao"></span>
            </div>
        </li>
        <li>
            <i class="i_pic02"></i>
            <a href="">大数据公共安全产品</a>
            <div>
                <p>天网快速布防系统</p>
                <p>视信通</p>
            </div>
        </li>
        <li>
            <i class="i_pic03"></i>
            <a href="">大数据金融产品</a>
            <div>
                <p>股天下</p>
            </div>
        </li> -->
        <li>
            <i class="i_pic01" onclick="javascript:void(0);"></i>
            <a href="http://www.creawor.com/content.aspx?cateId=57">大数据电信产品</a>
            <div>
                <p>以先进大数据技术，为运营商提供数据支撑、数据分析、监控预警、客户细分、精准营销、渠道构建、触点营销、四网协同能力支撑，对内实现流量经营转变，对外实现大数据变现的需求</p>
            </div>
        </li>
        <li>
            <i class="i_pic02" onclick="javascript:void(0);"></i>
            <a href="http://www.creawor.com/content.aspx?cateId=58">大数据公共安全产品</a>
            <div>
                <p>依托4G无线网络、WiFi、GIS、手机信息采集、数据挖掘以及视频监控等先进技术手段，深化预测预警、实时监控、轨迹追踪、快速检索等应用，全面提升公共安全领域的技术支撑能力</p>
            </div>
        </li>
        <li>
            <i class="i_pic03" onclick="javascript:void(0);"></i>
            <a href="http://www.creawor.com/content.aspx?cateId=59">大数据金融产品</a>
            <div>
                <p>基于大数据，运用风控、预测、六维分析等多种模型对各种数据进行分析和挖掘，为银行、证券、互联网金融、商家及运营商在投资、营销和风险控制等方面提供全方位应用与信息服务</p>
            </div>
        </li>
    </ul>
    <a href="http://www.creawor.com/content.aspx?cateId=56&amp;id=172" class="center_banner"><img
            src="/resource/image/center_banner01.jpg"></a>
    <ul class="i_content i_content01">
        <li>
            <i class="i_pic04" onclick="javascript:void(0);"></i>
            <a href="http://www.creawor.com/content.aspx?cateId=56&amp;id=173">“健坤”大数据平台</a>
            <div>
                <p>对数据、计算能力、应急资源进行融合管理，对外提供统一的通信服务、数据访问服务、计算能力服务及分析服务</p>
            </div>
        </li>
        <li>
            <i class="i_pic05" onclick="javascript:void(0);"></i>
            <a href="http://www.creawor.com/content.aspx?cateId=56&amp;id=198">“灵狐”大数据可视化系统</a>
            <div>
                <p>运用智能数据引擎、多维智能分析技术，实现大数据可视化，提升决策效率</p>
            </div>
        </li>
        <li>
            <i class="i_pic06" onclick="javascript:void(0);"></i>
            <a href="http://www.creawor.com/content.aspx?cateId=56&amp;id=245">“穿山甲”互联网信息采集与分析系统</a>
            <div>
                <p>运用智能爬虫、自然语言处理及大数据技术，实现全媒体实时采集、海量数据存储处理、语义智能识别分析</p>
            </div>
        </li>
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
