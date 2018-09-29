"use strict";
app.controller('LiangbiaolianjiechaxunController', ['$scope', '$http',
    function ($scope, $http) {
        $scope.list = [];
        $scope.modelParam = "";
        let liangBiaoLianJieChaXun = function (brandname) {
            if (!brandname || brandname === "") {
                brandname = "null";
            }
            return $http.get("/sql/liangbiaolianjiechaxun/" + brandname);
        };

        $scope.click = function () {
            liangBiaoLianJieChaXun($scope.modelParam).success(function (result) {
                $scope.list = result;
                $scope.modelParam = "";
            });
        }
    }
]);