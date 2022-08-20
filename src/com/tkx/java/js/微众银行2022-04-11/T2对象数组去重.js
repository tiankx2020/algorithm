function unique(arr){
    var res = [];
    var obj = {};
    for(var i=0; i<arr.length; i++){
        if( !obj[arr[i]] ){
            obj[arr[i]] = 1;
            res.push(arr[i]);
        }
    }
    return res;
}
var arr = [123,"webank",[1,2,3],"123",{a:1},"tencent",123,[1,2,3],{a:1}];
var res = unique(arr)
console.log(res );