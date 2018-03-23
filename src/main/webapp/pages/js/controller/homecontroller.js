var app = angular.module("myApp", []);
app.controller("homecontroller", function($scope, $http) {

	$scope.clearTest = function() {
		$scope.textarea = "";
	}
	$scope.sendTest = function() {

		var data = {
			// data:$scope.textarea,
			method : 'GET',
			url : 'http://localhost:8080/undoPuzzled/getTimeCard.action'
		};
		$http(data).success(function(data, header, config, status) {
			var qq1 = data;
			var qq2 = header;
			var qq3 = config;
			var qq4 = status;
			
			// 响应成功
			//debugger;
			//return data;
		}).error(function(data, header, config, status) {
			// 处理响应失败
			return data
		});

		/*
		 * $http(data).then(function successCallback(response) { $scope.names =
		 * response.data; $scope.names = response.data; $scope.names1 =
		 * response.data.cards; $scope.names = response.data.sites; }, function
		 * errorCallback(response) { // 请求失败执行代码 $scope.textarea = "aaa"; });
		 */
	}
});