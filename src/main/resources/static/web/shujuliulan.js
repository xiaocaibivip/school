"use strict";
app.controller('ShujuliulanController', ['$scope', '$http',
    function ($scope, $http) {
        $scope.list = [];
        let liuLanShouJiXinXi = function () {
            return $http.get("/sql/liulanshoujixinxi");
        };

        $scope.init = function () {
            liuLanShouJiXinXi().success(function (result) {
                $scope.list = result;
                console.log($scope.list);
            });
        }

        $scope.init();
    }
]);