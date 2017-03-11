var storeModule=angular.module('storeModule',[])
.controller('productCtrl',function($scope,menuData){
	console.log('inside',menuData);
	$scope.menuItems=menuData.FoodType;
}).controller('mainCtrl',function($scope,$location){
	$scope.redirect=function(){
		console.log('redirecrt');
		$location.path('/');
	}
});