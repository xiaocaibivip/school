"use strict";
app.controller('TiaojianchaxunController', ['$scope', '$http',
    function ($scope, $http) {
        $scope.list = [];
        $scope.cityParam = "";

        let tiaoJianChaXun = function (city) {
            if (!city || city === "") {
                city = "null";
            }
            return $http.get("/sql/tiaojianchaxun/" + city);
        };

        $scope.click = function () {
            tiaoJianChaXun($scope.cityParam).success(function (result) {
                $scope.list = result;
                $scope.cityParam = "";
            });
        }

    }
]);