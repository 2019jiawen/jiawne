<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="statics/css/reset.css" />
<link rel="stylesheet" type="text/css" href="statics/css/scanboardLogin.css" />
<link rel="stylesheet" type="text/css" href="statics/css/animsition.css" />
</head>
<body>
	<div class="wp animsition">
		<div class="boardLogin">
			<a href="#" class="logo">
			<h1>物流系统</h1>
				<!--<img src="images/loginLogo.png"> -->   <!--图片-->
			</a>
			<form action="${pageContext.request.contextPath }/dologin.html" method="post" id="myform">
				<div class="inpGroup">
					<span class="loginIco1"></span>
					<input type="text" id="userCode" name="userCode" placeholder="请输入您的用户名">
				</div>
				<div class="prompt">
					<p class="error">用户名错误或不存在</p>
				</div>
				
				<div class="inpGroup">
					<span class="loginIco2"></span>
					<input type="password" id="userPassword" name="userPassword" placeholder="请输入您的密码">
				</div>
				<div class="prompt">
					<p class="success">输入正确</p>
				</div>
				
				<!-- <button class="submit">登录</button> -->
				<a href="/logistics1.0/sys/main.html"  class="animsition-link submit" type="submit" id="denglu">登录</a>
				<!-- href="homepage.html" -->
				<a href="" class="animsition-link submit">注册</a>
				
			</form>
		</div>
	</div>
	<div id="particles-js"></div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery.animsition.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/particles.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/app.js"></script>
<script type="text/javascript">
	$(".animsition").animsition({
	    inClass               :   'fade-in',
	    outClass              :   'fade-out',
	    inDuration            :    800,
	    outDuration           :    1000,
	    linkElement           :   '.animsition-link',

	    loading               :    false,
	    loadingParentElement  :   'body',
	    loadingClass          :   'animsition-loading',
	    unSupportCss          : [ 'animation-duration',
	                              '-webkit-animation-duration',
	                              '-o-animation-duration'
	                            ],
	

	    overlay               :   false,
	    
	    overlayClass          :   'animsition-overlay-slide',
	    overlayParentElement  :   'body'
  	});
  /* 	$("#denglu").on("click",function(){
  		alert("登录")
  		 $("#myform").attr("action","/logistics1.0/dologin.html");
  		$("#denglu").submit()
  	}) */
</script>
</html>
