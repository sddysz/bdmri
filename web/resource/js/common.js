$(function(){
	//主导航
	$("#nav01").mouseover(function(){
		$(".navhidebg").slideUp(500);
	});
	$("#nav02").mouseover(function(){
		$(".navhide div").hide();
		$(".navhide div").eq(1).show();
		$(".navhidebg").slideDown(500);
	});
	$("#nav03").mouseover(function(){
		$(".navhide div").hide();
		$(".navhide div").eq(2).show();
		$(".navhidebg").slideDown(500);
	});
	$("#nav04").mouseover(function(){
		$(".navhide div").hide();
		$(".navhide div").eq(3).show();
		$(".navhidebg").slideDown(500);
	});
	$("#nav05").mouseover(function(){
		$(".navhide div").hide();
		$(".navhide div").eq(4).show();
		$(".navhidebg").slideDown(500);
	});
	$("#nav06").mouseover(function(){
		//$(".navhide div").hide();
		//$(".navhide div").eq(5).show();
	    //$(".navhidebg").slideDown(500);
	    $(".navhidebg").slideUp(500);
	});
	$(".navbox").mouseleave(function(){
		$(".navhidebg").slideUp(500)
	});

	//汉堡菜单
	$(".icon_menu").toggle(function(){
		$(".menuhide div").slideDown(200);
	},function(){
		$(".menuhide div").slideUp(200);
	})
	$(".menuhide h1").hide();
	$(".menuhide_span").click(function(){
		$(this).siblings().children("h1").slideUp(200);
		$(this).children("h1").slideDown(200);
	})

	//隐藏内容列表下拉
	$(".menu_selected").show();
	$(".icon_downarrow").toggle(function(){
		$(".hideleftbar").slideDown(200);
		$(".icon_downarrow").css("background","url(./images/icon_arrowu.png) center no-repeat");
	},function(){
		$(".menu_selected").siblings().slideUp(200);
		$(".icon_downarrow").css("background","url(./images/icon_arrowd.png) center no-repeat");
	})
});