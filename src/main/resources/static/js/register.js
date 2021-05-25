$("#register").click(function () {
    let status = true;
    let acc1 = $("[name=fName]").eq(0).val();
    let acc4 = $("[name=account]").eq(0).val();
    let acc5 = $("[name=pwd]").eq(0).val();
    let acc6 = $("[name=pwdr]").eq(0).val();
    let acc7 = $("[name=email]").eq(0).val();
    let acc8 = $("[name=dob]").eq(0).val();
    let acc9 = $("[name=phone]").eq(0).val();
   
    console.log(status);
    let status2 = true;
    $.ajax({
        url: "http://localhost:8080/api/checkusername?username=" + acc4,
        method: "GET",
        async: false,
        headers: { "Accept": "application/json; odata=verbose" },
        success: function (data) {
            if (data) {
                status2 = false;
            }
        }
    })

    let status3 = true;
    if (acc5 != acc6) {
        status3 = false;
    }

    let formData1 = {
        username: acc4,
        password: acc5,
        fullName: acc1,
        email: acc7,
        dob: acc8,
        phoneNumber: acc9,
    }
    if (status == true && status2 == true) {
        $.ajax({
            url: "http://localhost:8080/api/register",
            method: "POST",
           
            dataType: "json",
            async: false,
            data: JSON.stringify(formData1),
            contentType: 'application/json'
        });
        alert("Thêm thành công!");
          window.location.href = '/';
    } else if (status == false) {
        alert("Không được bỏ trống");
    } else if (status3 == false) {
        alert("Mật khẩu phải giống nhau!");
    } else {
        alert("Tài khoản này đã tồn tại!");
    }

});









