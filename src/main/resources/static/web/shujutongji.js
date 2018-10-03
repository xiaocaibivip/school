"use strict";
app.controller('ShujutongjiController', ['$scope', '$http',
    function ($scope, $http) {
        $scope.list = [];
        $scope.brand = "";

        let shuJuTonJi = function (brand) {
            if (!brand || brand === "") {
                brand = "null";
            }
            return $http.get("/sql/shujutongji/" + brand);
        };

        $scope.click = function () {
            shuJuTonJi($scope.brand).success(function (result) {
                $scope.list = result;
                $scope.brand = "";
            });
        }

    }
]);