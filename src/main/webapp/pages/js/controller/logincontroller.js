var app = angular.module("myApp", []);
app.controller("logincontroller", function($scope,$http) {
	
	var url=window.location.href;
	var id=url.indexOf('=');

	if (id == -1){
		$scope.isLogin =true;
	} else{
		$scope.isLogin =false;
	}

	$scope.login = function() {
		 $scope.isLogin =true;
	 };
	 
	 $scope.register = function() {
		 $scope.isLogin =false;
	 };
});