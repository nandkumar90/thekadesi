(function() {

    var thekaDirectives = angular.module('thekaDirectives', []);

    thekaDirectives.directive('headerTemplate', function() {

        return {
            restrict: 'E',
            templateUrl: 'issui/parts/Utility/header.html',
            scope: { value: '=' },
            replace: true

        }
    });

  
    thekaDirectives.directive('spinner', function() {

        return {
            restrict: 'E',
            templateUrl: 'issui/parts/Utility/spinnerTemplate.html',
        }
    });

    thekaDirectives.directive('validNumber', function() {
        return {
            require: '?ngModel',
            link: function(scope, element, attrs, ngModelCtrl) {
                if (!ngModelCtrl) {
                    return;
                }

                ngModelCtrl.$parsers.push(function(val) {
                    var clean = val.replace(/[^0-9]+/g, '');
                    if (val !== clean) {
                        ngModelCtrl.$setViewValue(clean);
                        ngModelCtrl.$render();
                    }
                    return clean;
                });

                element.bind('keypress', function(event) {
                    if (event.keyCode === 32) {
                        event.preventDefault();
                    }
                });
            }
        };
    });


    thekaDirectives.directive('onlyAlphabets', function() {
        return {
            require: 'ngModel',
            link: function(scope, element, attr, ngModelCtrl) {
                function fromUser(text) {
                    var transformedInput = text.replace(/[^a-zA-Z\s]/g, '');
                    if (transformedInput !== text) {
                        ngModelCtrl.$setViewValue(transformedInput);
                        ngModelCtrl.$render();
                    }
                    return transformedInput;
                }
                ngModelCtrl.$parsers.push(fromUser);
            }
        };
    });

    thekaDirectives.directive('tooltip', function() {
        return {
            restrict: 'A',
            link: function(scope, element, attrs) {

                element.on('mouseenter', function() {

                    var $this = angular.element(element)
                    if (this.offsetWidth < this.scrollWidth) {
                        $this.tooltip({
                            title: $this.text(),
                            placement: 'auto right'

                        })
                        $this.tooltip('show');
                    }
                })
            }
        }
    });

    issuiDirectives.directive('alphaNumeric', function() {
        return {
            require: 'ngModel',
            link: function(scope, element, attr, ngModelCtrl) {
                function fromUser(text) {
                    var transformedInput = text.replace(/[^a-zA-Z0-9\s]/g, '');
                    //console.log(transformedInput);
                    if (transformedInput !== text) {
                        ngModelCtrl.$setViewValue(transformedInput);
                        ngModelCtrl.$render();
                    }
                    return transformedInput;
                }
                ngModelCtrl.$parsers.push(fromUser);
            }
        };
    });


    
    
})();
