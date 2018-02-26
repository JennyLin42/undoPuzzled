<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE>
<html>
<head>
<meta charset="utf-8">
<title>主页</title>
<link type="text/css" rel="stylesheet" href="style/reset.css">
<link type="text/css" rel="stylesheet" href="style/main.css">
<script type="text/javascript" src="js/checkLoginStatus.js" charset="UTF-8"></script>
</head>

<body background="images/小清新.jpg">
<div class="headerbar">
	<div class="topbar">
    	<div class="comWidth">
        	<div class="leftArea">
            	<a href="home" class="homePage">解忧驿站</a>
            </div>
            <div class="rightArea">
            	欢迎来到解忧驿站！<a id="userLogin" href="loginAll">[登录]</a>&nbsp;<a id="userRegist" href="regist">[免费注册]</a>
            </div>
        </div>
    </div>
    <div class="logobar">
    	<div class="comWidth">
        	<div class="logo fl">
            	<a href=""><img src="images/store.png" alt="百味杂货" width="70px" height="60px"></a>
            </div>
            <div class="shopCar fr">
            	<span class="shopText fl">倾听你心里的声音</span>
                <%-- <span class="shopNum fr">${cartSum }</span> --%>
            </div>
        </div>
    </div>
    <div class="navBox comWidth">
        	<div class="shopClass fl">
        	aaaa
        	aaaa
        	aaaa
        	aaaaaaaa
        	aaaa
        	aaaa
        	aaaa
        	aaaa
            </div>
            <ul class="nav fl">
            	<li><a href="home" class="active">首页</a></li>
                <li><a href="queryMoreNewGoods">新品上市</a></li>
				<li><a href="queryMoreSaleGoods">热卖推荐</a></li>
				<li><a href="quaryPage">全部商品</a></li>
            </ul>
        </div> 
</div>

<div class="banner comWidth clearfix">
	<div class="banner_bar banner_big">
    	<ul class="imgBox">
        	<li><a href="#"><img src="images/banner/bannerimg1.gif" alt="banner"></a></li>
            <li><a href="#"><img src="images/banner/bannerimg2.gif" alt="banner"></a></li>
        </ul>
        <div class="imgNum">
        	<a href="#" class="active"></a><a href="#"></a>
        </div>
    </div>
</div> 
<div class="shopTit comWidth">
	<h3><a href="queryMoreNewGoods">新品上市</a></h3>
</div>
<div class="shopList comWidth clearfix">
	<div class="leftArea">
    	<div class="banner_bar banner_sm">
    		<ul class="imgBox">
        		<li><a href="#"><img src="images/banner/newgoods1.jpg" alt="新品"></a></li>
            	<li><a href="#"><img src="images/banner/newgoods2.jpg" alt="新品"></a></li>
        	</ul>
        	<div class="imgNum">
        		<a href="#" class="active"></a><a href="#"></a>
        	</div>
    	</div>
    </div>
    
    <div class="rightArea">
    	<div class="shopList_right clearfix">
    	<c:forEach var="good" items="${moreNewGoods}">
        	<div class="list_item">
            	<div class="shopList_item_img">
                	<a href="browserGood?id=${good.goodId }"><img src=${good.image } alt="/"></a>
                </div>
                <h3>${good.goodName }</h3>
                <p>${good.price }</p>
            </div>
        </c:forEach>
        </div>
    </div>
</div>
<br><br>
<div class="shopTit comWidth">
	<h3><a href="queryMoreSaleGoods">热销商品</a></h3>
</div>
<div class="shopList comWidth clearfix">
	<div class="leftArea">
    	<div class="banner_bar banner_sm">
    		<ul class="imgBox">
        		<li><a href="#"><img src="images/banner/newgoods1.jpg" alt="新品"></a></li>
            	<li><a href="#"><img src="images/banner/newgoods2.jpg" alt="新品"></a></li>
        	</ul>
        	<div class="imgNum">
        		<a href="#" class="active"></a><a href="#"></a>
        	</div>
    	</div>
    </div>
    <div class="rightArea">
    	<div class="shopList_right clearfix">
    		<c:forEach var="good" items="${moreSaleGoods}">
        	<div class="list_item">
            	<div class="shopList_item_img">
                	<a href="browserGood?id=${good.goodId }"><img src=${good.image } /></a>
                </div>
                <h3>${good.goodName }</h3>
                <p>${good.price }</p>
            </div>
           </c:forEach>
        </div>
    </div>
</div>

<div class="footer">
	<p><a href="#">网上杂货店</a><i>|</i><a href="#">联系我们</a><i>|</i><a href="#">巴拉巴拉</a></p>
    <p>flsjdfljsljfal;kjdfljldskjflajlklf</p>
</div>
<input type="hidden" value=${user.userName } id="userStatus"/>
<script type="text/javascript">
window.onload = function(){
	var ULis = document.getElementsByClassName("shopClass_show");
	var Lis = ULis[0].getElementsByTagName("li");
	/* var userStatus = document.getElementById('userStatus').value;
	var userLogin = document.getElementById('userLogin');
	var userRegist = document.getElementById('userRegist');
	
	if(userStatus != null){
		userLogin.innerHTML = '尊贵的会员:'+userStatus;
		userRegist.innerHTML = "[退出登录]";
		userLogin.href="javascript:return false;";
		userRegist.href="javascript:return false;";
		
	} */
	//alert("ihi");
    checkLoginStut();	
	for(var i = 0 ; i < Lis.length ; i++){
		Lis[i].onmouseover = function(){
			this.className = "lihover";	
		}	
		Lis[i].onmouseout = function(){
			this.className = "";	
		}
	}
	
}

</script>
</body>
</html>
