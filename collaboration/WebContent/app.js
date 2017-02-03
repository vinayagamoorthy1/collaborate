var myApp=angular.module("App",["ngRoute","ngCookies"]);
myApp.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "usermodule/home.html"
    }).when("/register", {
        templateUrl : "usermodule/register.html"
    })
    .when("/list", {
        templateUrl : "usermodule/list.html",
        controller:'userController'
    })
    .when("/login", {
        templateUrl : "usermodule/login.html",
        controller:'userController'
    })
    .when("/logout", {
        templateUrl : "usermodule/index.html",
        controller:'userController'
    })
    .when("/viewblog", {
        templateUrl : "usermodule/c_blog/viewblog.html",
        controller:'blogControl'
    })
    .when("/blog", {
        templateUrl : "usermodule/c_blog/blog.html",
        controller:'blogControl'
    })
     .when("/myblog", {
        templateUrl : "usermodule/c_blog/myblog.html",
        controller:'blogControl'
    })
    .when("/newblogs", {
        templateUrl : "usermodule/c_blog/newblogs.html",
        controller:'blogControl'
    })
    .when("/postevent", {
        templateUrl : "usermodule/event/postEvent.html",
        controller:'eventControl'
    })
    .when("/event", {
        templateUrl : "usermodule/event/event.html",
        controller:'eventControl'
    })
    .when("/applied", {
        templateUrl : "usermodule/c_job/appliedjobs.html",
        controller:'jobControl'
    })
    .when("/postjob", {
        templateUrl : "usermodule/c_job/postjob.html",
        controller:'jobControl'
    })
     .when("/showjob", {
        templateUrl : "usermodule/c_job/showjobs.html",
        controller:'jobControl'
    })
.when("/chat", {
        templateUrl : "usermodule/chatmodule/chat.html",
        controller:'ChatController'
    })
    .when("/friends", {
        templateUrl : "usermodule/c_friend/friends.html",
        controller:'friendControl'
    })
    .when("/friendrequest", {
        templateUrl : "usermodule/c_friend/friendrequests.html",
        controller:'friendControl'
    })
    .when("/myrequest", {
        templateUrl : "usermodule/c_friend/myrequest.html",
        controller:'friendControl'
    })
     .when("/myfriends", {
        templateUrl : "usermodule/c_friend/myfriends.html",
        controller:'friendControl'
    })
     .when("/collabaration", {
        templateUrl : "usermodule/collabaration.html",
       
    })
   });
myApp.run(function($rootScope,$cookieStore){
	alert("hi")
	$rootScope.currentUser=$cookieStore.get('currentUser')||{};
	alert($rootScope.currentUser.name)
	if ($rootScope.CurrentUser){
		$http.defaults.headers.common['Authorization']='Basic'+$rootScope.currentUser;
		
	}
});