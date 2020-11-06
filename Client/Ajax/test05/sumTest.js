function sum() {
    var b = document.getElementById("bottom").value
    var h = document.getElementById("height").value
    if (b == "" || h == "") {
        alert("숫자를 입력하세요");
    } else {
        if (isNaN(b) || isNaN(h)) {
            alert("문자가 아닌 숫자를 입력하세요")
        } else {
            var xhr = new XMLHttpRequest();
            var url="sumTest.jsp?" + getParamValue();
            xhr.onreadystatechange = function () {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    document.getElementById('sumResult').innerHTML = xhr.responseText;
                }
            }
        
            xhr.open("GET", url, true);
            xhr.send(null);
        }
    }    
}

function getParamValue() {
    var bottom = document.getElementById("bottom").value;
    var height = document.getElementById("height").value;

    return "bottom=" + bottom + "&height=" + height;
}