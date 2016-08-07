/**
 * Created by chenlj on 2016/8/6.
 * 登录模块
 */
$(function () {
    var config = fitness.config; //config模块
    var http = fitness.util.http; //http模块
    var page = fitness.page; //page模块
    var module_login = fitness.module.module_login =
    {
        url: {
            login: config.url.base_url + '/sys/login.htm'  //登录
        },
        event: {
            login: function () {
                http.post({
                    url: module_login.url.login,
                    data: {
                        accountName: $('#accountName').val(),
                        pwd: $.md5($('#password').val())
                    },
                    success: function (data) {
                        http.handleResult(data, function () {
                            window.location = page.main;
                        });
                    }
                });
            }
        }
    };

    $('#login_form').validate(
        {
            rules: {
                accountName: 'required',
                password: 'required'
            },
            submitHandler: function () {
                module_login.event.login();
            }
        }
    );
});



