function startMethod() {
    var xhr = new XMLHttpRequest();
    var url="result.jsp?" + getParamValue();
    console.log(getParamValue());
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4 && xhr.status == 200) {
            document.getElementById('display').innerHTML = xhr.responseText;
        }
    }

    xhr.open("GET", url, true);
    xhr.send(null);
}

function getParamValue() {
    var name = encodeURI(document.getElementById("name").value);
    var age = encodeURI(document.getElementById("age").value);
    var phone = encodeURI(document.getElementById("phone").value);

    return "name=" +name + "&age=" + age + "&phone=" + phone;
}