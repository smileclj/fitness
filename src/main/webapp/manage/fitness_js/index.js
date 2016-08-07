/**
 * Created by chenlj on 2016/8/7.
 * 首页
 */
$(function () {
    var config = fitness.config; //config模块
    var http = fitness.util.http; //http模块
    var page = fitness.page; //page模块
    var module_main = fitness.module.module_main = {
        url: {
            exit: config.url.base_url + '/sys/exit.htm'  //退出
        },
        event: {
            exit: function () {
                http.post({
                    url: module_main.url.exit,
                    success: function (data) {
                        http.handleResult(data, function () {
                            window.location = page.login;
                        });
                    }
                });
            }
        }
    };

    //init
    $('#exitBtn1').click(module_main.event.exit);
    $('#exitBtn2').click(module_main.event.exit);
});