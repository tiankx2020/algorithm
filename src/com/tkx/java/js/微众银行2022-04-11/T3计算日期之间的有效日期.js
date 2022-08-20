/**
 **datestr:形如‘2017-06-12’的字符串
 **return Date 对象
 **/
function getDate (datestr) {
    var temp = datestr.split("-");
    if (temp[1] === '01') {
        temp[0] = parseInt(temp[0],10) - 1;
        temp[1] = '12';
    } else {
        temp[1] = parseInt(temp[1],10) - 1;
    }
    //new Date()的月份入参实际都是当前值-1
    var date = new Date(temp[0], temp[1], temp[2]);
    return date;
}
/**
 ***获取两个日期间的所有日期
 ***默认start<end
 **/
function getDiffDate (start, end) {
    var startTime = getDate(start);
    var endTime = getDate(end);
    var dateArr = [];
    while ((endTime.getTime() - startTime.getTime()) > 0) {
        var year = startTime.getFullYear();
        var month = (startTime.getMonth()+1).toString().length === 1 ? "0" + (parseInt(startTime.getMonth().toString(),10) + 1) : (startTime.getMonth() + 1);
        var day = startTime.getDate().toString().length === 1 ? "0" + startTime.getDate() : startTime.getDate();
        dateArr.push(year + "-" + month + "-" + day);
        startTime.setDate(startTime.getDate() + 1);
    }
    return dateArr;
}

var start = "2020-9-29"
var end = "2020-11-3"
var result  =  getDiffDate(start,end);
console.log(result)