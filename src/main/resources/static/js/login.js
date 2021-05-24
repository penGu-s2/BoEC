$("#login").click(function () {
    let name = $("[name=account]").eq(0).val();
    let pass = $("[name=account]").eq(1).val();

    $.ajax({
        url: "https://http://localhost:8080/api/login?username=" + name + "&password=" + pass,
        method: "GET",
        headers: { "Accept": "application/json; odata=verbose" },
        success: function (data) {
            if (!data) {
                alert("Sai thông tin đăng nhập!");
            } else {
                window.location.href = 'index.html';
            }
        }
    })
})