"use strict";
app.controller('huiyuantongjiController', ['$scope', '$http',
    function ($scope, $http) {
        $scope.list = [];
        let getHuiyuantongji = function () {
            return $http.get("/sql/huiyuantongji");
        };

        $scope.click = function () {
            getHuiyuantongji().success(function (result) {
                $scope.list = result;
            });
        }
    }
]);