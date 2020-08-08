<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/resources/bootstrap.min.css" var="bCss"></c:url>
<c:url value="/resources/bootstrap.min.js" var="bJs"></c:url>
<c:url value="/resources/jquery.min.js" var="jqJs"></c:url>
<c:url value="/resources/pooper.min.js" var="ppJs"></c:url>

<link rel="stylesheet" href="${bCss}" />

<script src="${jqJs}"></script>
<script src="${ppJs}"></script>
<script src="${bJs}"></script>