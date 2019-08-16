var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $http) {
    $scope.users = null;
    $http.get("/users").then(
        function (response) {
            $scope.users = response.data;
        }, function (error) {
            alert(error)
        });
});