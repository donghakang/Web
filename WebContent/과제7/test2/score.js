

function total(kor, eng, mat) {
    return kor + eng + mat;
}

function avg(total) {
    return total / 3.0;
}

$(document).ready(function () {
    $('#process').on('click', function () {
        var student = {
            "name": $('#name').val(),
            "kor": Number($('kor').val()),
            "eng": Number($('eng').val()),
            "mat": Number($('mat').val())
        };
        var totalScore = total(student.kor, student.eng, student.mat)
        var avgScore = avg(totalScore);
        $('#result').text("홍길동의 총점은 " + total(student.kor, student.eng, student.mat) + "이고, "
            + "평균은 " + avgScore + "입니다");
    })
})