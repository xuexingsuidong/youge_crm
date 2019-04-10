<%--<!DOCTYPE html>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<head>
    <meta charset="UTF-8">
    <title>后台登录-X-admin2.1</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="stylesheet" href="../css/font.css">
    <link rel="stylesheet" href="../css/xadmin.css">
    <!--<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>-->
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="https://cdn.bootcss.com/blueimp-md5/2.10.0/js/md5.min.js"></script>
    <script src="../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../js/xadmin.js"></script>
    <script type="text/javascript" src="../js/cookie.js"></script>
    <script>
        // 是否开启刷新记忆tab功能
        var is_remember = false;
    </script>
</head>
<body>
<div class="container">
    <div class="logo"><a href="http://www.baidu.com"><img src="../images/education.jpg" alt=""></a></div>
    <div class="left_open">
        <i title="展开左侧栏" class="iconfont">&#xe6f2;</i>

    </div>

    <div>
        <button><a href="${pageContext.request.contextPath}/logout" style="align-content: end">退出</a></button>
    </div>

    </span>
</div>
<!--顶部结束  sec:authorize="hasRole('ROLE_ADMIN')"-->
<div class="left-nav">
    <div id="side-nav" >
        <ul id="nav">
            <security:authorize access="hasRole('ROLE_ADMIN')">
                <li>
                    <a href="javascript:;">
                        <i class="iconfont">&#xe6b8;</i>
                        <cite>前台</cite>
                        <i class="iconfont nav_right">&#xe697;</i>
                    </a>
                    <ul class="sub-menu">
                        <li date-refresh="1">
                            <a _href="/admin/add">
                                <i class="iconfont">&#xe6b8;</i>
                                <cite>新增用户</cite>
                            </a>
                        </li>
                        <li>
                            <a _href="/admin/mystudent2.html">
                                <i class="iconfont">&#xe6b8;</i>
                                <cite>学生管理</cite>
                            </a>
                        </li>
                    </ul>
                </li>
            </security:authorize>
            <!--前台-->
            <div>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ba;</i>
                    <cite>招生</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="http://www.baidu.com">
                            <i class="iconfont">&#xe6b2;</i>
                            <cite>这是一个测试</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="http://www.baidu.com">
                            <i class="iconfont">&#xe6b2;</i>
                            <cite>这是一个测试</cite>
                        </a>
                    </li>
                </ul>
            </li>
            </div>
            <!--招生-->
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b2;</i>
                    <cite>教务</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="http://www.baidu.com">
                            <i class="iconfont">&#xe6ba;</i>
                            <cite>教务主页</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <!--教务-->
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6d2;</i>
                    <cite>学生管理</cite>
                    <i class="iconfont nav_right">&#xe697</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="manager.html">
                            <i class="iconfont">&#xe726;</i>
                            <cite>未分班学生</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="http://www.baidu.com">
                            <i class="iconfont">&#xe726;</i>
                            <cite>在读学生管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="http://www.baidu.com">
                            <i class="iconfont">&#xe726;</i>
                            <cite>往届学生管理</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <!--学生管理-->
<%--            <!--        <shiro:hasRole name="test"> sec:authorize="hasRole('ROLE_ADMIN')" th:each-->--%>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b2;</i>
                    <cite>系统管理</cite>
                    <i class="iconfont nav_right">&#xe697</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="/sys/highschool">
                            <i class="iconfont">&#xe6b2;</i>
                            <cite>高中学校信息维护</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="/sys/highschool">
                            <i class="iconfont">&#xe6b2;</i>
                            <cite>财务</cite>
                        </a>
                    </li>
                </ul>
            </li>

<%--            <!--        </shiro:hasRole>-->--%>

        </ul>
    </div>
</div>
<!--左侧结束-->
<div class="page-content">
    <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
        <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
        </ul>
        <div class="layui-unselect layui-form-select layui-form-selected" id="tab_right">
            <dl>
                <dd data-type="this">关闭当前</dd>
                <dd data-type="other">关闭其它</dd>
                <dd data-type="all">关闭全部</dd>
            </dl>
        </div>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='welcome.html' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
        </div>
        <div id="tab_show"></div>
    </div>
</div>
</body>