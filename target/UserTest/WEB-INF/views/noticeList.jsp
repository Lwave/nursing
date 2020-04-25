<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>公告提示</title>

    <link rel="stylesheet" type="text/css" href="/welcome/css/style.css" media="all">

    <script type="text/javascript" src="/welcome/js/jquery.min.js"></script>
    <style>
        .body {
            font-family: "微软雅黑";
            overflow-x: hidden;
            color: #E4E2CF;
        }

        .notice {
            width: 100%;
        }

        .title {
            font-size: 40px;
            color: #9C753E;
            font-family: Arial, Helvetica, sans-serif;
            text-align: center;
        }

        .date {
            width: 100%;
            height: 20px;
        }

        .details p {
            font-size: 18px;
            color: #999999;
            /*       text-align: center;*/
        }

        .a {
            width: 100%;
            text-align: center;
            margin-top: 30px;
        }

        .img {
            transition: all .5s;
            position: relative;
            top: 0px;
        }

        .img:hover {
            box-shadow: 8px 5px 10px #333;
            top: -4px;
        }


        .case {
            background: #301A0B;
            /*  position: absolute;*/
            margin: auto;
            width: 100%;
            height: 60px;
            overflow: hidden;
        }

        /*    .case .part1 {
                float: left;
                width: auto;
                height: auto;
            }*/

        .case .part2 {
            float: left;
            width: 100%;
            height: 60px;
            text-indent: 1em;
            overflow: hidden;
        }

        #part2 ul {
            width: 100%;
            height: auto;
            list-style: none;
            padding: 0;
            margin: 0;
        }

        #part2 ul li {
            background: #301A0B;
            width: 100%;
            font-size: 30px;
            line-height: 60px;
            color: white;
            overflow: hidden;
            white-space: nowrap;
            text-overflow: ellipsis;
        }
    </style>
</head>
<body style="background-color: #E4E2CF">
<div>
    <div class="case">
        <!-- <div class="part1">
          公告提示：
         </div>-->
        <div class="part2" id="part2">
            <div id="scroll1">
                <c:forEach items="${notices}" var="notice">
                    <ul>
                        <li><span>公告提示：</span></li>
                        <li><span>${notice.title}</span></li>
                        <li><span>${notice.content}</span></li>
                        <li><span style="float: right">${notice.notecreatedateStr}</span></li>
                    </ul>
                </c:forEach>
            </div>
            <div id="scroll2"></div>
        </div>
    </div>
    <div class="date"></div>
    <div class="title">欢迎您关注夕阳红养老院</div>
    <div class="details" style="margin-top: 15px;">
        <p> 我们公司成为"海上望明月"，养老院，坐落在天津市南开区咸阳路47号，建筑面积4000余平方米， 拥有床位近300张，
            为老年人提供养老服务的非营利性组织，又称养老院。西方国家的养老院通常由地方政府或慈善机构与企业合作开办，能接收有各种各样需求的老人。
            可提供日托、整托、日间照料，等多种形式服务，是一所集养老一体的综合性养老机构。是天津市规模较大档次较高的一家老年公寓。
            我院属楼房结构、均为南北朝向，院落环境：绿树成荫凉亭叙旧、鹅卵石地、健身休闲、花草怡人。
            室内区有：修养区、娱乐健身区、生活服务区、等还设有图书、书画、棋牌、健身、娱乐、教学等多功能配套设施，还专门为信佛教的老年朋友设有庄重的佛堂，供她们念佛、诵经之用。
            居室房间设有单...
        </p>
    </div>
    <!--图片-->
    <div class="examples_body">
        <ul class="bannerHolder">
            <li>
                <div class="banner">
                    <a href="javascript:;">
                        <img height="350" width="350" alt="The Best Designs" src="/welcome/img/notice_3.png"/>
                        <h2 style="text-align: center;text-decoration: none;">接收对象</h2>
                    </a>
                    <p class="companyInfo">敬老院的收养对象主要是五保老人。有条件的敬老院，还接收享受退休金的自费老人，坚持入院自愿、出
                        院自由的原则。敬老院经常组织一些老人参加力所能及的生产劳动和适合老人特点的文娱体育活动。</p>
                    <div class="cornerTL"></div>
                    <div class="cornerTR"></div>
                    <div class="cornerBL"></div>
                    <div class="cornerBR"></div>
                </div>
            </li>
            <li>
                <div class="banner">
                    <a href="javascript:;" >
                        <img height="350" width="350" alt="Mail Chimp" src="/welcome/img/notice_2.png"/>
                        <h2 style="text-align: center;">服务内容</h2>
                    </a>
                    <p class="companyInfo">
                        1.全自理护理，为老人建立档案每天两次测量血压体温并记录，按时提醒老人吃药，提供可以自理的老人健身打牌等活动。为老人洗衣服，每月带领老人洗澡理发。<br/>
                        2.半自理护理，为老人建立档案每天两次测量血压体温并记录，按时提醒并帮助老人吃药，提供可以半自理的老人健身、打牌等活动。<br/>
                        3.完全不自理护理，为老人建立档案每天两次测量血压体温并记录，按时喂老人吃饭吃药，每天最少3次帮助肢体活动，按摩、翻身、擦洗污渍等。为老人洗衣服，提供老人用防褥疮床垫，每月擦洗一次身体。对于一些特殊的老人经家属同意会增加一些服务项目。
                    </p>
                    <div class="cornerTL"></div>
                    <div class="cornerTR"></div>
                    <div class="cornerBL"></div>
                    <div class="cornerBR"></div>
                </div>
            </li>
            <li>
                <div class="banner">
                    <a href="javascript:;">
                        <img height="350" width="350" alt="Mail Chimp"  src="/welcome/img/notice_1.png"/>
                        <h2 style="text-align: center;">入住流程</h2>
                    </a>
                        <p class="companyInfo">
                                 1.咨询参观：有家属陪同，考察敬老院硬件软件建设，设施、服务、伙食、收费等详细情况。<br/>
                                 　　 2.受理入住申请：院方同意即可。<br/>
                                 　　 3.调查访问：了解入住老人的反映、老人家属的口碑。<br/>
                                 　 　 4.入住评估：即老人试住感受。<br/>
                                 　　 5.入住申请：向院方申请入住，同时提交身体检查报告单。<br/>
                                 　　 6.预定床位：向院方提前预定养老床位。<br/>
                                 　　 7.签订入住协议：甲乙双方协议，由家属签字。<br/>
                                 　　 8.缴纳入住费用：生活物品自带，交付少许押金，以后养老服务费用按月缴纳。<br/>
                                 　　 9.开始入住

                        </p>
                    <div class="cornerTL"></div>
                    <div class="cornerTR"></div>
                    <div class="cornerBL"></div>
                    <div class="cornerBR"></div>
                </div>
            </li>
        </ul>
        <!-- Examples body -->
    </div>
</div>
<script type="text/javascript">

    var PartArea = document.getElementById('part2');
    var Scroll1 = document.getElementById('scroll1');
    var Scroll2 = document.getElementById('scroll2');

    Scroll2.innerHTML = Scroll1.innerHTML;

    function roll() {
        if (Scroll2.offsetHeight - PartArea.scrollTop <= 0) {
            PartArea.scrollTop -= Scroll1.offsetHeight;
        } else {
            PartArea.scrollTop++;
        }
    }

    var StopRoll = setInterval(roll, 60);

    PartArea.onmouseover = function () {
        clearInterval(StopRoll);
    }
    PartArea.onmouseout = function () {
        StopRoll = setInterval(roll, 60);
    }



    <!--图片js-->
    $(document).ready(function () {

        // 0.4代表遮罩的透明度
        $('.banner div').css('opacity', 0.4);

        $('.banner').hover(function () {

            var el = $(this);

            // 先淡出阴影，后淡入文字
            el.find('div').stop().animate({width: 480, height: 470}, 'slow', function () {

                el.find('p').fadeIn('fast');
            });

        }, function () {

            var el = $(this);

            // 隐藏文字
            el.find('p').stop(true, true).hide();

            // 去掉遮罩
            el.find('div').stop().animate({width: 60, height: 60}, 'fast');

        }).click(function () {

            // 点击图片时打开链接

         /*   window.open($(this).find('a').attr('href'));*/

        });
    });
</script>
</body>
</html>
