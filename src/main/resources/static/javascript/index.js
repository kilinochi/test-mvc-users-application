var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $http) {
    $scope.users = null;
    $http.get("/users").then(
        function (response) {
            console.log(response.data);
            $scope.users = response.data;
        }, function (error) {
            console.log(error)
        });
});