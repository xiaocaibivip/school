"use strict";
app.controller('dengluController', ['$scope', '$http',
    function ($scope, $http) {
        $scope.username = "";
        $scope.password = "";
        let dengluAjax = function () {
            return $http.get("/sql/login/" + $scope.username + "/" + $scope.password);
        };

        $scope.click = function () {
            if ($scope.username != null && $scope.username != "" && $scope.password != null && $scope.password != "") {
                dengluAjax().success(function (result) {
                    if (result == "true") {
                        let windowUrl = "http://" + window.location.host;
                        console.log(windowUrl)
                        window.location.href = windowUrl;
                    } else {
                        alert("用户名或密码输入错误");
                    }
                });
            } else {
                alert("请输入用户名或密码");
            }

        }
    }
]);
