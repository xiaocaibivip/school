"use strict";
app.controller('zhuceController', ['$scope', '$http',
    function ($scope, $http) {
        $scope.username = "";
        $scope.password = "";
        let dengluAjax = function () {
            return $http.get("/sql/login/" + $scope.username + "/" + $scope.password);
        };

        $scope.click = function () {


        }
    }
]);
