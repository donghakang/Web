function startMethod() {
    var xhr = new XMLHttpRequest();
    /* URL change. */
    var url = "result.jsp";
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4 && xhr.status == 200) {
            document.getElementById('display').innerHTML = xhr.responseText;
        }
    }

    /* POST 방식 */
    xhr.open("POST", url, true);

    /*
    Content-type    => 데이터가 어떤 종류 인지,
    application/..  => Key=value 로 Map 형태로 표현 (ex. name=kim&age=20&phone=010-2902-8330)
    */
    xhr.setRequestHeader("Content-Type",
        "application/x-www-form-urlencoded;charset=UTF-8");

    // value 를 보낸다.
    xhr.send(getParamValue());
}

function getParamValue() {
    // var name = document.getElementById("name").value;
    // var age = document.getElementById("age").value;
    // var phone = document.getElementById("phone").value;

    var name = encodeURI(document.getElementById("name").value);
    var age = encodeURI(document.getElementById("age").value);
    var phone = encodeURI(document.getElementById("phone").value);

    return "name=" + name + "&age=" + age + "&tel=" + phone;
}