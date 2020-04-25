<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>公告管理</title>
    <!-- Bootstrap -->
    <link href="/information/css/bootstrap.min.css" rel="stylesheet">
    <link href="/information/ionicons/css/ionicons.min.css" rel="stylesheet">
    <link href="/information/css/animate.min.css" rel="stylesheet">
    <link href="/information/css/aos.css" rel="stylesheet">
    <!-- main style -->
    <link href="/information/css/style.css" rel="stylesheet">
</head>

<body>
    <div class="popup-modal">
        <div style="width: 100%;height: 20px"></div>
        <!--THIS IS IMPORTANT! to close the modal, the class name has to match the name given on the ID -->
        <a id="aa" href="${pageContext.request.contextPath}/informationFix" style="float:right;margin-right: 15px;box-shadow:  #bce8f1;">
            <i class="ion-close-round" style="font-size: 20px"></i>
        </a>
        <div class="clearfix"></div>
        <div class="modal-content">
            <div class="container">
                <div class="portfolio-padding">
                    <div class="col-md-8 col-md-offset-2">
                        <h2 style="color: #3bb4f2">${infoo.title}</h2>
                        <div class="PageDetailsDate">
                            <span style="float: right;color: #00CC99">发布日期：${infoo.createtimeStr.substring(0,10)}</span>
                        </div>
                        <div class="h-20"></div>
                        <div class="h-20"></div>
                        <br />
                        <c:if test="${infoo.pic != ''}">
                        <img src="${infoo.pic}" alt="" style="margin-left: 90px" class="img-responsive" />
                        </c:if>
                        <div class="h-30"></div>
                        <br/>
                       <p>${infoo.content}</p>
                      </div>
                </div>
            </div>
        </div>
    </div>
    </div>


    <!-- jQuery -->
    <script src="/information/js/jquery.js"></script>
    <!--  plugins  -->
    <script src="/information/js/bootstrap.min.js"></script>
    <script src="/information/js/plugins.js"></script>
    <script src="/information/js/aos.js"></script>
    <script src="/information/js/jquery.form.js"></script>
    <script src="/information/js/jquery.validate.min.js"></script>

    <!--  main script  -->
    <script src="/information/js/custom.js"></script>
</body>
<style>
    .PageDetailsDate{
        font-family: "Microsoft Yahei", "微软雅黑", Tahoma, Arial, Helvetica, STHeiti;
        padding: 0;
        margin: 0;
        width: 100%;
        height: auto !important;
        min-height: 30px;
        line-height: 30px;
        font-size: 18px;
        text-align: center;
        color: #999;
    }

</style>
</html>