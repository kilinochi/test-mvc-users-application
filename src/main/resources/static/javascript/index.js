var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $http) {
    _scope = $scope;
    $scope.filter_login = "";
    $scope.filter_name = "";
    $scope.filter_email = "";
    $scope.users = null;
    $http.get("/users").then(
        function (response) {
            console.log(response.data);
            $scope.users = response.data;
        }, function (error) {
            console.log(error)
        });
});