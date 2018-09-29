"use strict";
app.controller('SanbiaochaxunController', ['$scope', '$http',
    function ($scope, $http) {
        $scope.list = [];
        $scope.modelParam = "";
        let sanBiaoChaXun = function (brandname) {
            if (!brandname || brandname === "") {
                brandname = "null";
            }
            return $http.get("/sql/sanbiaochaxun/" + brandname);
        };

        let cutStr = function (buydate) {
            return buydate.substr(0,11);
        };

        $scope.click = function () {
            sanBiaoChaXun($scope.modelParam).success(function (result) {
                $scope.list = result;
                for (let i = 0; i < $scope.list.length; i++) {
                    $scope.list[i].buydate = ($scope.list[i].buydate).toString().substr(0,10);
                }
                $scope.modelParam = "";
            });
        }


    }
]);