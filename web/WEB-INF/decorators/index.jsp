<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ include file="/common/taglibs.jsp" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title><sitemesh:title></sitemesh:title>dysz</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <![endif]-->
    <link rel="stylesheet" href="/resource/css/css2.css">

    <!-- jQuery 2.1.4 -->
    <script src="/resource/js/jquery-1.7.2.min.js"></script>
    <!-- jQuery UI 1.11.4 -->

    <script type="text/javascript" src="/resource/js/common.js"></script>
    <script type="text/javascript" src="/resource/js/jquery.flexslider-min.js"></script>
    <script type="text/javascript" src="/resource/js/Marquee.js"></script>
    <sitemesh:head></sitemesh:head>
    <style>
        @media only screen and (max-width:768px) {
            .slides li{height: 90px!important;}
            .slides li:nth-of-type(1){background: url() no-repeat!important; background-size: 100% auto!important;}
        }
    </style>
</head>
<body bgcolor="#F0F0F0">

            <d:menu></d:menu>



    <sitemesh:body></sitemesh:body>


    <div style="display: none; right: 10px;" class="back-to" id="toolBackTop">
        <a title="返回顶部" onclick="window.scrollTo(0,0);return false;"
           href="http://www.creawor.com/content.aspx?cateId=57#top" class="back-top">
            返回顶部</a>
    </div>
    <div class="frilinkbg">
        <div class="container frilink">
            <ul class="fri_l">
                <li>
                    <h1>产品以及服务</h1>

                    <div><a href="http://www.creawor.com/content.aspx?cateId=56">大数据+</a></div>

                    <div><a href="http://www.creawor.com/content.aspx?cateId=57">电信行业产品</a></div>

                    <div><a href="http://www.creawor.com/content.aspx?cateId=58">公共安全产品</a></div>

                    <div><a href="http://www.creawor.com/content.aspx?cateId=59">金融证券产品</a></div>

                    <div><a href="http://www.creawor.com/content.aspx?cateId=60">运营服务</a></div>

                </li>
                <li>
                    <h1>解决方案</h1>

                    <div><a href="http://www.creawor.com/content.aspx?cateId=97">技术优势</a></div>

                    <div><a href="http://www.creawor.com/content.aspx?cateId=64">政府行业</a></div>

                    <div><a href="http://www.creawor.com/content.aspx?cateId=61">金融行业</a></div>

                    <div><a href="http://www.creawor.com/content.aspx?cateId=65">娱乐媒体</a></div>

                </li>
                <li>
                    <h1>成功案例</h1>

                    <div><a href="http://www.creawor.com/content.aspx?cateId=66">电信行业</a></div>

                    <div><a href="http://www.creawor.com/content.aspx?cateId=98">公共安全</a></div>

                    <div><a href="http://www.creawor.com/content.aspx?cateId=68">娱乐媒体</a></div>

                </li>
                <li>
                    <h1>公司简介</h1>
                    <div><a href="http://www.creawor.com/content.aspx?cateId=70">发展历程</a></div>
                    <div><a href="http://www.creawor.com/content.aspx?cateId=71">企业文化</a></div>
                    <div><a href="http://www.creawor.com/infonews.aspx">新闻中心</a></div>
                    <div><a href="http://www.creawor.com/content.aspx?cateId=74">合作伙伴</a></div>
                </li>
            </ul>
            <dl class="fri_r">
                <dt>
                <h1>联系我们</h1>
                <div>联系电话：0756-3377435</div>
                <div>服务热线：400-1000-731</div>
                <div>传真号码：0756-3377436</div>
                <div>电子邮箱：info@creawor.com</div>
                <div>公司地址：珠海市高新区南方软件园B6栋2楼</div>
                </dt>
                <dd>
                    <img src="./创我科技_files/ewm.png">
                </dd>
            </dl>
        </div>
    </div>
    <div class="footerbg">
        <div class="container footer">
            <img src="./创我科技_files/logo01.png">
            <div style="margin-top:27px;">版权所有 广东创我科技发展有限公司 粤ICP备10060444号 Copyright 1997-2015 Creawor All Rights
                Reserved
                <br>
                <div style="margin-top:0;">
                    <img src="./创我科技_files/beian.png" style="margin-top: 0;">
                    <a target="_blank"
                       href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=44049102496043"
                       style="display:inline-block;text-decoration:none;height:20px;line-height:20px;"><img
                            src="http://www.creawor.com/content.aspx?cateId=57" style="float:left;">
                        <p style="float:left;height:20px;line-height:20px;margin: 0px 0px 0px 5px; color:#939393;">粤公网安备
                            44049102496043号</p></a></div>
            </div>
        </div>
    </div>
    <style>
        .back-to A {
            COLOR: #3354aa; TEXT-DECORATION: none;BORDER-BOTTOM: 0px; BORDER-LEFT: 0px; PADDING-BOTTOM: 0px; MARGIN: 0px; OUTLINE-style: none; OUTLINE-COLOR: invert; PADDING-LEFT: 0px; OUTLINE-WIDTH: 0px; PADDING-RIGHT: 0px; BACKGROUND: none transparent scroll repeat 0% 0%; FONT-SIZE: 100%; VERTICAL-ALIGN: baseline; BORDER-TOP: 0px; BORDER-RIGHT: 0px; PADDING-TOP: 0px
        }
        .back-to A:hover {
            BORDER-BOTTOM: medium none; COLOR: #444
        }
        .back-to {
            Z-INDEX: 999; POSITION: fixed; WIDTH: 110px; BOTTOM: 35px; OVERFLOW: hidden; RIGHT: 10px
        }
        .back-to .back-top {
            TEXT-INDENT: -9999em; OUTLINE-style: none; OUTLINE-COLOR: invert; OUTLINE-WIDTH: 0px; WIDTH: 40px; DISPLAY: block; BACKGROUND: url(images/back-top.png) no-repeat 0px 0px; FLOAT: right; HEIGHT: 40px; MARGIN-LEFT: 10px
        }
        .back-to .back-top:hover {
            BACKGROUND-POSITION: -40px 0px
        }
        @media only screen and (max-width:768px) {
            .back-to .back-top {
                TEXT-INDENT: -9999em; OUTLINE-style: none; OUTLINE-COLOR: invert; OUTLINE-WIDTH: 0px; WIDTH: 30px; DISPLAY: block; BACKGROUND: url(images/back-top_mi.png) no-repeat 0px 0px; FLOAT: right; HEIGHT: 30px; MARGIN-LEFT: 10px
            }
            .back-to .back-top:hover {
                BACKGROUND-POSITION: -30px 0px
            }
            .online_qqbox{ display:none;}
        }
    </style>
    <meta name="format-detection" content="telephone=no">
<script type="text/javascript">
    $(document).ready(function () {
        var menu = 2;
        if (menu != -1)
            $("#nav0"+menu).addClass("nav_a_selected");
    });

    $(document).ready(function () {
        var bt = $('#toolBackTop');
        var sw = $(document.body)[0].clientWidth;

        var limitsw = (sw - 840) / 2 - 80;
        if (limitsw > 0) {
            limitsw = parseInt(limitsw);
            bt.css("right", 10);
        }

        $(window).scroll(function () {
            var st = $(window).scrollTop();
            if (st > 30) {
                bt.show();
            } else {
                bt.hide();
            }
        });
    })</script>
</body>
</html>