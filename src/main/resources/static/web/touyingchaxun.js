"use strict";
app.controller('TouyingchaxunController', ['$scope', '$http',
    function ($scope, $http) {
        $scope.list = [];
        let getTouyingchaxun = function () {
            return $http.get("/sql/touyingchaxun");
        };

        $scope.click = function () {
            getTouyingchaxun().success(function (result) {
                $scope.list = result;
            });
        }
    }
]);