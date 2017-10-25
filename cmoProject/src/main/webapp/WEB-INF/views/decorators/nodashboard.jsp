<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page errorPage="../pages/examples/500.jsp"%>
<jsp:include page="../parts/cachecontrol.jsp"></jsp:include>
<html>
    <head>
        <title><sitemesh:write property='title'/></title>
		<sitemesh:write property='head' />
    </head>
    <aside class="center">
         <sitemesh:write property='body' />
    </aside><
 </html>