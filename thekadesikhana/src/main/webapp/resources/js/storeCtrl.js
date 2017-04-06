var storeModule=angular.module('storeModule',[])
.controller('productCtrl',function($scope,menuData,DataService,$http, $window){
	$scope.user={
       
    };

    $scope.paymentMethod="online";

	$scope.cart=DataService.cart;
    if(menuData){
	$scope.menuItems=menuData.FoodType;
}
	$scope.addToCart=function(id,name,price,quantity,type){
	   $scope.cart.addItem(id,name,price,quantity,type);
       $scope.$emit('updateCart');
	}
	
    $scope.placeOrder=function(){
        var orderDetails={};
        orderDetails.userInfo=$scope.user;
        orderDetails.orderInfo=$scope.cart.items;
        orderDetails.paymentType=$scope.paymentMethod;
        orderDetails.totalDue=$scope.cart.getTotalPrice();
        console.log(JSON.stringify(orderDetails));
        $http.post('http://107.23.59.43:8787/thekadesi/weborder',orderDetails).then(function (response) {
        	$window.location.href=response.data.paymentUrl;
        },function(error)
        {

        })
    }
   
    
}).controller('contactCtrl',function($scope,$http){
    $scope.user={};

    $scope.contactUs=function(){
       
        console.log(JSON.stringify($scope.user));
        $http.post('http://107.23.59.43:8787/thekadesi/feedback',$scope.user).then(function (response) {
            // body...
        },function(error)
        {

        })
    }
   
    
}).controller('mainCtrl',function($scope,DataService){

    var updateCart=function(){
    $scope.itemsInCart=DataService.cart.getTotalCount();
}

    $scope.$on('updateCart',function(){
     updateCart();
    })
   
    updateCart();
})
.factory("DataService", function () {

    
    var myCart = new shoppingCart("theka");

    
    return {
       
        cart: myCart
    };
}).directive('onlyDigits', function () {
    return {
      require: 'ngModel',
      restrict: 'A',
      link: function (scope, element, attr, ctrl) {
        function inputValue(val) {
          if (val) {
            var digits = val.replace(/[^0-9]/g, '');

            if (digits !== val) {
              ctrl.$setViewValue(digits);
              ctrl.$render();
            }
            return parseInt(digits,10);
          }
          return undefined;
        }            
        ctrl.$parsers.push(inputValue);
      }
    };
});;