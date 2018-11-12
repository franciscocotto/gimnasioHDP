$(document).ready(function () {
    datatable();
    datetimepicker();
});

var datatable = function () {

   $('.table.tabler').not('.loadJson').each(function () {
        $(this).DataTable({
            'scrollX': true,
            'ordering': false,
            "searching": false,           
            "bLengthChange": false,
            'scrollCollapse': true,
        });
    });
};

var datetimepicker = function () {
    $('.datetimePicker').each(function () {
        $(this).datetimepicker({
            'format': 'DD/MMM/YYYY',
            'ignoreReadonly': true,
            'allowInputToggle': true
        });
    });
};
