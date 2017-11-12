var exec = require('cordova/exec');

exports.login = function (arg0, success, error) {
    exec(success, error, 'Sportal', 'login', [arg0]);
};

exports.logout = function (success) {
    exec(success, null, 'Sportal', 'logout', []);
}
