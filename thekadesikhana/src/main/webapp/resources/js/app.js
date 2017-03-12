

(function() {
	var thekaApplication = angular.module('theka', [ 'ui.router','storeModule']);
	

	
	thekaApplication.config(['$stateProvider', '$urlRouterProvider',
		function($stateProvider, $urlRouterProvider) {

			$stateProvider.state('main', {
				url: '/',
				templateUrl: 'resources/views/index.html',
			    controller:'mainCtrl'
				
			});
			
			$stateProvider.state('products', {
				url: '/products',
				templateUrl: 'resources/views/products.html',
				controller: 'productCtrl',
				resolve:{
					menuData:function($http){
						console.log('test');
						return $http.get('http://107.23.59.43:8787/thekadesi/webmenu/today').then(function(response){
							return response.data;
						});
					}
				}
			});
			$stateProvider.state('cartDetail', {
				url: '/cartDetail',
				templateUrl: 'resources/views/cartDetail.html',
				controller: 'cartCtrl'
			});
			$stateProvider.state('contact', {
				url: '/contact',
				templateUrl: 'resources/views/contact.html',
				controller: 'contactCtrl'
			});
			$stateProvider.state('gallery', {
				url: '/gallery',
				templateUrl: 'resources/views/gallery.html'
				
			});
			$stateProvider.state('about', {
				url: '/gallery',
				templateUrl: 'resources/views/about.html'
				
			});

			$urlRouterProvider
				.otherwise('main');

		}
	]);





	
			

	
})();
