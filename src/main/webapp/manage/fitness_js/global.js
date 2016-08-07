/**
 * Created by chenlj on 2016/8/7.
 */
var fitness = {};
fitness.module = {};
//config
fitness.config = {};
fitness.config.url = {
    base_url: 'http://localhost:8080/fitness',
    timeout: 10000  //10s
}

//page
fitness.page = {
    login: fitness.config.url.base_url + '/manage/login.html', //登录页
    main: fitness.config.url.base_url + '/manage/index.html'  //首页
}

//util
fitness.util = {};
//util->http
fitness.util.http = {
    post: function (req) {
        $.ajax({
            url: req.url,
            type: 'post',
            timeout: fitness.config.url.timeout,
            data: req.data,
            dataType: 'json',
            success: function (data, textStatus, xhr) {
                req.success(data, textStatus, xhr);
            },
            error: function (xhr, textStatus, errorThrown) {
                console.error(req.url + 'post error!');
            }
        });
    },
    handleResult: function (data, success) {
        if (data.errcode == 0) {
            success();
        } else {
            fitness.util.dialog.info(data.errmsg);
        }
    }
};

//util->dialog
fitness.util.dialog = {
    info: function (title) {
        swal({
            title: title,
            type: 'info',
            confirmButtonText: '确定'
        });
    }
};