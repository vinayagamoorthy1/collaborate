myApp.controller("userController",["userService","$location","$rootScope","$cookieStore","$http",function(userService,$location,$rootScope,$cookieStore,$http){
	
	var self=this;
	self.user={
			id:'',
			name:'',
			password:'',
			email:'',
			address:'',
			mobile:'',
			role:'',
			errorCode:'',
			errorMessage:''
	}
	self.users=[];
	self.register=function(){
		alert("enetrin to reg")
		userService.register(self.user)
		.then(function(d){
			self.user=d;
		$location.path("/index")
		},function(e){
			alert("error occured")
		})
	},
	self.listofuser=function(){
		alert("service entering")
		userService.list()
		.then(function(d){
			self.users=d;
			console.log(d);
		},function(e){
			alert("error in list")
		
		})
	},
	self.authenticate=function(){
		alert("entering into login")
		userService.authenticate(self.user)
		.then(function(d){
			if(d.errorCode=="200"){
				$rootScope.currentUser=d;
				$http.defaults.headers.common['Authorization']='Basic'+$rootScope.currentUser;
				$cookieStore.put("currentUser",$rootScope.currentUser);
				alert($rootScope.currentUser.id);
			}
			alert(d.errorMessage)
			$location.path("/")
			console.log(d);
		},function(e){
			alert("error in login")
		})
	
	},
	self.logout=function(){
		var status=$cookieStore.remove("currentUser");
		alert(status)
alert($rootScope.currentUser.id)
		alert("logout entering")
		userService.logout()
		.then(function(d){
			self.users=d;
			if(d.errorCode=="200"){
				$rootScope.currentUser=null;
				$rootScope.message="sucessfully logout";
			}
			$location.path("/login")
			console.log(d);
		},function(e){
			alert("error in logout")
		
		})
	}
}]);