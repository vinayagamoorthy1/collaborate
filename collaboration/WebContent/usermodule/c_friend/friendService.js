myApp.factory("friendService",["$http",function($http){
	var url="http://localhost:8080/collabaration/";
	return{
		sendRequest:function(fid,uid){
			return $http.post(url+"savefriendrequest/"+fid+"/"+uid)
			.then(function(res){
				return res.data;
			},function(res){
				return res.data;
			})
		},
		getRequest:function(id){
			return $http.get(url+"getrequests/"+id)
			.then(function(res){
				return res.data;
			},function(res){
				return res.data;
			})
		},
		accept:function(uid,fid){
			alert("service")
			return $http.get(url+"accept/"+uid+"/"+fid)
			.then(function(res){
				return res.data;
			},function(res){
				return res.data;
			})

		},
		getsendrequest:function(id){
			return $http.get(url+"getmyrequest/"+id)
			.then(function(res){
				return res.data;
			},function(res){
				return res.data;
			})
		},
		reject:function(fid,uid){
			return $http.get(url+"rejectrequest/"+uid+"/"+fid)
			.then(function(res){
				return res.data;
			},function(res){
				return res.data;
			})
		},
		myfriends:function(id){
			return $http.get(url+"getmyfriends/"+id)
			.then(function(res){
				return res.data;
			},function(res){
				return res.data;
			})
			
		}
		
	}
	
}]);