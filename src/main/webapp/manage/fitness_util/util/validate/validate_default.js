/**
 * Created by chenlj on 2016/8/7.
 */
$.validator.setDefaults(
    {
        onfocusout: false,
        onkeyup: false,
        onclick: false,
        showErrors: function (map, list) {
            if (list.length > 0) {
                var error = list[0];
                var element = error.element;
                $(element).poshytip({
                    className: 'tip-violet',
                    content: error.message,
                    showOn: 'none',
                    alignTo: 'target',
                    alignX: 'inner-right',
                    offsetY: 5
                })
                $(element).poshytip('show');
                $(element).blur(function () {
                    $(element).poshytip('destroy');
                });
            }
        }
    }
);