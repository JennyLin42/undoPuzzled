var app = angular.module("myApp", []);
app.controller("homecontroller", function($scope,$http) {

	 $scope.clearTest = function () {
		 $scope.textarea = "";
	 }
	 
	    $http({
	        method: 'GET',
	        url: 'http://localhost:8080/undoPuzzled/getTimeCard.do'
	    }).then(function successCallback(response) {
	            $scope.names = response.data.sites;
	        }, function errorCallback(response) {
	            // 请求失败执行代码
	    });
	  
});