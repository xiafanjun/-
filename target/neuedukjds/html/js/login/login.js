//单击验证码图片是重置验证码
function resetcode(){
    //jquery ajax
    $('#codeImg').attr('src',"/code?num="+Math.random());
}
//获取登录表单的输入的用户名、密码、验证码数据
function getLoginInfo(){
    var username=$('#loginname').val();
    var password=$('#password').val();
    var code=$('#code').val();
    var loginInfo={
        'username':username,
        'password':password,
        'code':code
    };
    return loginInfo;
}
//登录请求和响应
function login(){
    //获取到输入数据
    var loginInfo=getLoginInfo();
    var url="/sysUser/login";
    //发起请求
    $.ajax({
        type: "POST",
        url: url,
        data: JSON.stringify(loginInfo),
        dataType:'json',
        contentType: 'application/json',
        success: function(data){
            if(200 == data.status){
                window.location.href = "index.html";
            }else{
                alert(data.msg);
            }
        }
    });
}