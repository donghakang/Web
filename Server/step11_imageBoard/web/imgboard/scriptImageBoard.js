function checkImageBoardWrite() {
	if(document.imageBoardWriteForm.imageId.value=="")
		alert("상품코드를 입력하세요");
	else if(document.imageBoardWriteForm.imageName.value=="")
		alert("상품명을 입력하세요");
	else if(document.imageBoardWriteForm.imagePrice.value=="")
		alert("상품 단가를 입력하세요");
	else if(document.imageBoardWriteForm.imageQty.value=="")
		alert("상품 개수를 입력하세요");
	else if(document.imageBoardWriteForm.imageContent.value=="")
		alert("내용을 입력하세요");
	else if(document.imageBoardWriteForm.imagepath.value=="")
		alert("상품 이미지를 첨부하세요");
	else
		document.imageBoardWriteForm.submit();
}