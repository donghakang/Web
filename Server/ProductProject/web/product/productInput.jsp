<!--
* NAME		: productInput.jsp
* DESC		: �������� �Է� ������
* VER		: 1.0
-->

<%@ page contentType="text/html;charset=euc-kr" %>
<html>
<head>
<Script Language ="JavaScript">
function confirm(){
	if (document.input.writer.value==''){
		alert("�̸��� �Է��Ͻʽÿ�.");
		document.input.id.focus();
		return;
	}
	if(document.input.title.value==''){
		alert("������ �Է��Ͻʽÿ�.");
		document.input.title.focus();
		return;
	}
	if(document.input.content.value==''){
		alert("������ �Է��Ͻʽÿ�.");
		document.input.cont.focus();
		return;
	}
	document.input.submit();
}
</Script>
</head>

<body>
<% String writer=(String)session.getAttribute("user");%>
<center><h1>��ǰ���</h1>
<form action="SAVE" method=post  name=input target="main">
    <table border=0>
      <tr >
		<td  width=103 bgcolor="8f8fbd" align="center">�� ��</td>
        <td><input type=text  name=writer size="20" value=<%=writer%>></td>
      </tr>
      <tr>
		<td width="103" bgcolor="8f8fbd" align="center">�� ��</td>
        <td><input type=text  name=title size="51" ></td>
      </tr>
      <tr>
		<td colspan=2 >
          <textarea name=content rows=10 cols=70></textarea>
		</td>
      </tr>
      <tr>
		<td colspan=2 align=center >
          <input type=button  value="����"  onclick="javascript:confirm();">
          <input type=reset  value="���">
        </td>
      </tr>
    </table>
 </form>
 </center>
</body>
</html>
