<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page errorPage="../pages/examples/500.jsp"%>
<jsp:include page="../parts/cachecontrol.jsp"></jsp:include>
<html>
    <head>
        <title><sitemesh:write property='title' /></title>
		<sitemesh:write property='head' />
    </head>
    <body class="skin-blue">
        <!-- header logo: style can be found in header.less -->
        <header class="header">
            <a href="${pageContext.request.contextPath}/" class="logo">
                <!-- Add the class icon to your logo image or logo icon to add the margining -->
                SSP2 CMO
            </a>
            <!-- Header Navbar: style can be found in header.less -->
            <nav class="navbar navbar-static-top" role="navigation">
                <!-- Sidebar toggle button-->
                <a href="#" class="navbar-btn sidebar-toggle" data-toggle="offcanvas" role="button">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a>
                <div class="navbar-right">
                    <ul class="nav navbar-nav">
                        <!-- User Account: style can be found in dropdown.less -->
                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="glyphicon glyphicon-user"></i>
                                <span> Gabriel <i class="caret"></i></span>
                            </a>
                            <ul class="dropdown-menu">
                                <!-- User image -->
                                <li class="user-header bg-light-blue">
                                    <img src="${pageContext.request.contextPath}/resources/img/avatar5.png" class="img-circle" alt="User Image" />
                                    <p>
                                        Gabriel Tham- General
                                        <small>General since May 2000</small>
                                    </p>
                                </li>
                                <!-- Menu Footer-->
                                <li class="user-footer">
                                    <div class="pull-left">
                                        <a href="#" class="btn btn-default btn-flat">Profile</a>
                                    </div>
                                    <div class="pull-right">
                                        <a href="#" class="btn btn-default btn-flat">Sign out</a>
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
        <div class="wrapper row-offcanvas row-offcanvas-left">
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="left-side sidebar-offcanvas">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">
                    <!-- Sidebar user panel -->
                    <div class="user-panel">
                        <div class="pull-left image">
                            <img src="${pageContext.request.contextPath}/resources/img/avatar5.png" class="img-circle" alt="User Image" />
                        </div>
                        <div class="pull-left info">
                            <p>Hello, Gabriel</p>

                            <a href="#"><i class="fa fa-circle text-success"></i> Snoozing</a>
                        </div>
                    </div>
                    <!-- /.search form -->
                    <!-- sidebar menu: : style can be found in sidebar.less -->
                    <ul class="sidebar-menu">
                        <li class="active">
                            <a href="${pageContext.request.contextPath}/">
                                <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/pages/analyst">
                                <i class="fa fa-users"></i> <span>Analyst</span>
                            </a>
                        </li>
                        <li>
                        	   <a href="${pageContext.request.contextPath}/pages/pmo">
                                <i class="fa fa-user"></i> <span>PMO</span>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="${pageContext.request.contextPath}/pages/pmo"><i class="fa fa-angle-double-right"></i> Proposals</a></li>
                            </ul>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-bar-chart-o"></i>
                                <span>Charts</span>
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="${pageContext.request.contextPath}/pages/charts/morris"><i class="fa fa-angle-double-right"></i> Morris</a></li>
                                <li><a href="${pageContext.request.contextPath}/pages/charts/flot"><i class="fa fa-angle-double-right"></i> Flot</a></li>
                                <li><a href="${pageContext.request.contextPath}/pages/charts/inline"><i class="fa fa-angle-double-right"></i> Inline charts</a></li>
                            </ul>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-edit"></i> <span>Forms</span>
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="${pageContext.request.contextPath}/pages/forms/general"><i class="fa fa-angle-double-right"></i> General Elements</a></li>
                                <li><a href="${pageContext.request.contextPath}/pages/forms/advanced"><i class="fa fa-angle-double-right"></i> Advanced Elements</a></li>
                                <li><a href="${pageContext.request.contextPath}/pages/forms/editors"><i class="fa fa-angle-double-right"></i> Editors</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/pages/calendar">
                                <i class="fa fa-calendar"></i> <span>Calendar</span>
                                <small class="badge pull-right bg-red">3</small>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/pages/wewe">
                                <i class="fa fa-envelope"></i> <span>Mailbox</span>
                                <small class="badge pull-right bg-yellow">12</small>
                            </a>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-folder"></i> <span>Examples</span>
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="${pageContext.request.contextPath}/pages/examples/invoice"><i class="fa fa-angle-double-right"></i> Invoice</a></li>
                                <li><a href="${pageContext.request.contextPath}/pages/examples/login"><i class="fa fa-angle-double-right"></i> Login</a></li>
                                <li><a href="${pageContext.request.contextPath}/pages/examples/register"><i class="fa fa-angle-double-right"></i> Register</a></li>
                                <li><a href="${pageContext.request.contextPath}/pages/examples/lockscreen"><i class="fa fa-angle-double-right"></i> Lockscreen</a></li>
                                <li><a href="${pageContext.request.contextPath}/pages/examples/404"><i class="fa fa-angle-double-right"></i> 404 Error</a></li>
                                <li><a href="${pageContext.request.contextPath}/pages/examples/500"><i class="fa fa-angle-double-right"></i> 500 Error</a></li>
                                <li><a href="${pageContext.request.contextPath}/pages/examples/blank"><i class="fa fa-angle-double-right"></i> Blank Page</a></li>
                            </ul>
                        </li>
                    </ul>
                </section>
                <!-- /.sidebar -->
            </aside>

            <!-- Right side column. Contains the navbar and content of the page -->
            <aside class="right-side">
                <sitemesh:write property='body' />
            </aside><!-- /.right-side -->
        </div>
    </body>
</html>