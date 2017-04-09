(function() {

    var thekaServices = angular.module('thekaServices', []);

//
//
//    thekaServices.factory('successAlert', function($uibModal) {
//        var modal = {};
//        modal.message = function(msg) {
//            var uibModalInstance = $uibModal.open({
//                template: '<div class="text-center modal-body"><i class="fa fa-check-circle icon-check" aria-hidden="true"></i><span>{{msg}}</span></div><hr class="hr-success">',
//                size: 'sm',
//                controller: function($scope, $timeout, $uibModalInstance) {
//                    $scope.msg = msg;
//                    $timeout(function() { $uibModalInstance.close(); }, 2000);
//
//                }
//            });
//        }
//        return modal;
//    });
//
//    thekaServices.factory('errorAlert', function($uibModal) {
//        var modal = {};
//        modal.message = function(msg) {
//            var uibModalInstance = $uibModal.open({
//                template: '<div class="modal-body text-center"><i class="fa fa-exclamation-triangle icon-error" aria-hidden="true"></i><span>{{msg}}</span></div><div class="modal-footer" style="padding:5px;border-top:2px solid red"><button class=" button button-primary" type="button" ng-click="ok()">OK</button></div>',
//                size: 'sm',
//                controller: function($scope, $uibModalInstance) {
//                    $scope.msg = msg;
//                    $scope.ok = function() {
//                        $uibModalInstance.close();
//                    }
//                }
//            });
//        }
//		modal.detailedMessage = function(msg, detail) {
//            var uibModalInstance = $uibModal.open({
//                template: '<div class="modal-body text-center"> <i class="fa fa-exclamation-triangle icon-error" aria-hidden="true"></i> <span>{{msg}}</span> <p>{{detail}}</p> </div><div class="modal-footer" style="padding:5px;border-top:2px solid red"><button class=" button button-primary" type="button" ng-click="ok()">OK</button></div>',
//                size: 'md',
//                controller: function($scope, $uibModalInstance) {
//                    $scope.msg = msg;
//                    $scope.detail = detail;
//                    $scope.ok = function() {
//                        $uibModalInstance.close();
//                    }
//                }
//            });
//        }
//        return modal;
//    });

    thekaServices.service('commCache', function($window) {
        var commCache = {};
        commCache.LookupData = {};

        commCache.RemoveSessionStorage = function(vKey) {
            sessionStorage.removeItem(vKey);
        };

        commCache.ClearSessionStorage = function() {
            do {
                var vLen = $window.sessionStorage.length;
                if (vLen > 0) {
                    var vKey = $window.sessionStorage.key(vLen - 1);
                    sessionStorage.removeItem(vKey);
                }
            } while (vLen != 0);
        };

        commCache.Set = function(vName, vValue, bSession) {
            if (bSession === null || bSession === undefined)
                bSession = true;

            if (bSession) {
                if (vValue !== undefined)
                    $window.sessionStorage[vName] = JSON.stringify(vValue);
            } else
                commCache[vName] = vValue;
        };

        commCache.Get = function(vName, bSession) {
            var vRet = null;
            if (bSession === null || bSession === undefined)
                bSession = true;

            if (bSession === true) {

                if ($window.sessionStorage[vName] !== null && $window.sessionStorage[vName] !== undefined)
                    vRet = JSON.parse($window.sessionStorage[vName]);
            } else if ($window.sessionStorage[vName] !== null && $window.sessionStorage[vName] !== undefined)
                vRet = JSON.parse($window.sessionStorage[vName]);
            else if (commCache[vName] !== null && commCache[vName] !== undefined)
                vRet = commCache[vName];

            return vRet;
        };

        commCache.removeLocalStorage = function(vKey) {
            localStorage.removeItem(vKey);
        };

        commCache.ClearLocalStorage = function() {
            do {
                var vLen = $window.localStorage.length;
                if (vLen > 0) {
                    var vKey = $window.localStorage.key(vLen - 1);
                    localStorage.removeItem(vKey);
                }
            } while (vLen != 0);
        };

        commCache.Setlocal = function(vName, vValue, bLocal) {
            if (bLocal === null || bLocal === undefined)
                bLocal = true;

            if (bLocal) {
                if (vValue !== undefined && vValue !== null)
                    $window.localStorage[vName] = JSON.stringify(vValue);
            } else
                commCache[vName] = vValue;
        };

        commCache.Getlocal = function(vName, bLocal) {
            var vRet = null;
            if (bLocal === null || bLocal === undefined)
                bLocal = true;

            if (bLocal === true) {

                if ($window.localStorage[vName] !== null && $window.localStorage[vName] !== undefined)
                    vRet = JSON.parse($window.localStorage[vName]);
            } else if ($window.localStorage[vName] !== null && $window.localStorage[vName] !== undefined)
                vRet = JSON.parse($window.localStorage[vName]);
            else if (commCache[vName] !== null && commCache[vName] !== undefined)
                vRet = commCache[vName];

            return vRet;
        };
        return commCache;
    });


//    thekaServices.service('commAjax', ['$http', function($http) {
//        var commAjax = {};
//
//        commAjax.Call = function(strUrl, strMet, bAsy, bCac, oHdr, oPar, oData, fnSuc, fnErr) {
//            oPar = oPar || {};
//            oPar['ncache'] = new Date().getTime();
//            $http({
//                url: strUrl,
//                method: strMet,
//                async: bAsy,
//                cache: bCac,
//                headers: oHdr,
//                params: oPar,
//                data: oData
//            }).then(fnSuc, fnErr);
//        };
//
//        return commAjax;
//    }]);

//
//    thekaServices.service('fileUpload', ['$http', function($http) {
//        var uploadFileToUrl = function(uploadUrl, file, param) {
//
//            var fd = new FormData();
//            fd.append('file', file);
//            
//
//            return $http.post(uploadUrl, fd, {
//                transformRequest: angular.identity,
//                headers: { 'Content-Type': undefined },
//                params: param
//            });
//
//
//        };
//
//        return { uploadFileToUrl: uploadFileToUrl };
//    }]);
//
//
//   
//
//    thekaServices.service('postRequest', ['$http', function($http) {
//        var post = function(url, data) {
//
//            return $http.post(url, data, {
//                transformRequest: angular.identity,
//                headers: { 'Content-Type': 'application/json' }
//            });
//        };
//        return { post: post };
//    }]);




})();
