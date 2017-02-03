myApp.factory("userService",["$http",function($http){
	var url="http://localhost:8080/collabaration/";
	return{
		register:function(user){
			return $http.post(url+'register',user)
			.then(function(d){
				return d.data;
			},function(e){
				alert("error")
			})
		},
		authenticate:function(user){
			return $http.post(url+'login',user)
			.then(function(d){
				return d.data;
			},function(e){
				alert("error in login")
			
			})
		},
		logout:function(){
			return $http.post(url+'logout')
			.then(function(d){
				alert("suceess fully logout")
				return d.data;
			},function(e){
				alert("error in logout")
			
			})
		},
	
		list:function(){
		return $http.get(url+'list')
		.then(function(d){
			return d.data;
		},function(e){
			alert("error");
		})
		
	
		}
	}
}]);