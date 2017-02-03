myApp.controller("ChatForumController" , function($scope, ChatForumService,friendService,$rootScope) {
	$scope.messages = [];
    $scope.message = "";
    $scope.max = 140;
    $scope.users=[];
    $scope.friend
    $scope.addMessage = function() {
    	console.log("addMessage")
    ChatForumService.send($scope.message);
    	$scope.message = "";
    };
    friendService.myfriends($rootScope.currentUser.id)
    .then(function(d){
    	$scope.users=d;
    },null)
 $scope.callfunction=function(x){
    	
    	alert(x);
    }
    ChatForumService.recieve().then(null , null, function(message) {
         console.log("recieve") 
         
       $scope.messages.push(message);  
    });
}); 