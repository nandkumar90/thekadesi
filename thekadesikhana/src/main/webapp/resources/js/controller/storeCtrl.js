var storeModule=angular.module('storeModule',[])
.controller('productCtrl',function($scope,menuData,DataService){
	
	$scope.cart=DataService.cart;
    if(menuData){
	$scope.menuItems=menuData.FoodType;
}
	$scope.addToCart=function(id,name,price,quantity,type){
	   $scope.cart.addItem(id,name,price,quantity,type);
       $scope.$emit('updateCart');
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
});