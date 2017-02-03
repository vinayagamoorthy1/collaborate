myApp.controller("friendControl",["friendService","$rootScope","$location","$cookieStore","userService",function(friendService,$rootScope,$location,$cookieStore,userService){

	
	var temp=this;
	temp.requests=[];
	temp.myrequest=[];
	temp.myfriends=[];
	temp.friend={
			id:'',
			FriendId:'',
			UserId:'',
			status:'',
			errorCode:'',
			errorMessage:''
	}
	temp.users=[];
	temp.sendFriendRequest=function(id){
		friendService.sendRequest(id,$rootScope.currentUser.id)
		.then(function(d){
			alert(d.errorMessage);
		},null)
		
	}
	temp.listofusers=function(){
		alert("hi");
		userService.list()
		.then(function(d){
			temp.users=d;
			console.log(temp.users);
		},null)
	}
	temp.listofusers();
	//reject request
	temp.rejectrequst=function(id){
		friendService.reject(id,$rootScope.currentUser.id)
		.then(function(d){
			alert(d.errorMessage);
			temp.getFriendRequests();
		},null)
			
		
	}
	temp.listofusers();
	temp.getFriendRequests=function(){
		friendService.getRequest($rootScope.currentUser.id)
		.then(function(d){
			temp.requests=d;
			console.log(temp.requests);
		},null)
			}
	if($rootScope.currentUser){
		temp.getFriendRequests();
	}
	temp.acceptRequest=function(id){
		alert("controller")
		friendService.accept($rootScope.currentUser.id,id)
		.then(function(res){
			if(res.errorCode=="200"){
				temp.getFriendRequests();
			}
			alert(res.errorCode);
			
		},null)
	}
	temp.getRequest=function(){
		friendService.getsendrequest($rootScope.currentUser.id)
		.then(function(d){
			temp.myrequest=d;
		},null)
	}
	temp.myfriendsid=function(){
		friendService.myfriends($rootScope.currentUser.id)
		.then(function(d){
			temp.myfriends=d;
		},null)
		
	}
}])
