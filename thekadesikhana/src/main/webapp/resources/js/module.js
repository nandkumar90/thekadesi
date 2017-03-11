//(function(){
//
//var issuiSecurityModule = angular.module('thekaSecurity', [
//    'thekaSecurityControllers',
//    'thekaSecurityServices'
//    
//]);
//
//issuiSecurityModule.config(['$httpProvider', function ($httpProvider) {
//	$httpProvider.interceptors.push('authInterceptor');
//} ]);
//
//issuiSecurityModule.run(['issPermissionService', function (issPermissionService) {
//    issPermissionService.mapPermissions();
//}]);
//
//})();
