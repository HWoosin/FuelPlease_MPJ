<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Fuel Please</title>

    <!-- <link href="${pageContext.request.contextPath }/resources/css/bootstrap.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script> -->
    <!--개인 디자인 추가-->
    <!-- <link href="${pageContext.request.contextPath }/resources/css/style.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath }/resources/js/bootstrap.js"></script> -->
</head>
<body>
	<header>
        <div class="container-fluid">
            <div class="row">
                <div class="container">
                    <div class="navbar">
                        <div class="navbar-header">
                            <!-- 왼쪽 메인 로고 -->
                            <a class="navbar-brand" href="#"><img width="30" src="#" alt="Brand"></a>
                        </div>


                        <!-- 가운데 메뉴 -->
                        <div class="collapse navbar-collapse" id="myNavbar">
                            <ul class="nav navbar-nav">
                                <li><a href="#">주유소</a></li>
                                <li><a href="#">전기충전소</a></li>
                                <li><a href="#">LPG 충전소</a></li>
                                <li><a href="#">Board</a></li>                                                                   
                            </ul>


                            <!-- 오른쪽 메뉴 모음 -->
                            <ul class="nav navbar-nav navbar-right">
                                <li class="dropdown">
                                    <!-- 로그인 옆 아이콘 -->
                                    <img src="#" alt="#">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">로그인
                                        <span class="caret"></span></a>

                                    <ul class="dropdown-menu">
                                        <!-- 로그인 안했을 때 드롭다운 메뉴 -->
                                        <li><a href="#"><span class="glyphicon glyphicon-user"></span>Join</a></li>
                                        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
                                        
                                        <!-- 로그인 했을 때 드롭다운 메뉴 -->
                                        <li><a href="#"><span class="glyphicon glyphicon-user"></span>MyPage</a></li>
                                        <li><a href="#"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
                                    </ul>
                                </li>
                            </ul>

                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>