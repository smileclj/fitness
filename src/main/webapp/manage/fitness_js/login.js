/**
 * Created by chenlj on 2016/8/6.
 */
var module_login = {
    url: {},
    event: {
        login: function () {
            $('.uname').poshytip({
                content: 'hello'
            });
        }
    }
};

$(function () {
    $('#login_form').validate(
        {
            rules: {
                username: 'required',
                password: 'required'
            },
            submitHandler: function () {
                alert('1');
            }
        }
    );
});



