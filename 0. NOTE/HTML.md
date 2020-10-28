# HTML


## Table of Contents
  - [Basic Format](#basic-format)
  - [Spacing](#spacing)
  - [문자 사용](#문자-사용)
  - [특수 문자](#특수-문자)
  - [p테그, span태그, div태그](#p-span-div)
  - [이미지, 비디오, 오디오](#이미지-비디오-오디오)
  - [리스트](#리스트)
  - [링크](#링크)
  - [테이블](#테이블)

---

## Basic Format

```html
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>
        Insert title here
    </title>
</head>

<body>
    Hello World
</body>

</html>
```

---

## Spacing
- ```<br>```: = ```\n```
- ```&nbsp;```: = ```\t```
- ```<pre>``` = 있는 그대로를 표시 (\``` \```) 와 비슷
    ```html
    <pre>
        있는 그대로를 표시한다.
    </pre>
    ```
    <pre>
        있는 그대로를 표시한다.
    </pre>

---

## 문자 사용
- ```<b>```: 굵은 글꼴
- ```<i>```: 기울임 꼴
- ```<em>```: 강조
- ```<small>```: 작은 글자
- ```<mark>```: 하이라이트
- ```<strong>```: 글자 강력하게 강조
- ```<sub>```: 아래 첨자
- ```<sup>```: 윗 첨자
- ```<ins>```: 밑줄
- ```<del>```: 취소 줄

```html
<body>
    <p><b> b 태그는 굵은 글꼴입니다.</b></p>
    <p><i> i 태그는 기울임 꼴입니다.</i> </p>
    <p><em> em 태그는 강조로 표시합니다.</em> </p>
    <p><small> small 태그는 작은 글자를 표시합니다.</small> </p>
    <p><mark> mark 태그는 음영 </mark>으로 표시합니다.</p>
    <p><strong> strong 태그는 문자를 강력하게 강조합니다.</strong> </p>
    <p>X<sub>2</sub>(아래 첨자) 와 Y<sup>2</sup>(위 첨자)입니다. </p>
    <p>ins 태그는 <ins>추가한 내용을 밑줄</ins>로 표시합니다.</p>
    <p><del>del 태그는 취소선을 표시합니다.</del> </p>
    <p>X<sup>2</sup> + Y<sup>2</sup> = Z<sup>2</sup> </p>
</body>
```

<body>
    <p><b> b 태그는 굵은 글꼴입니다.</b></p>
    <p><i> i 태그는 기울임 꼴입니다.</i> </p>
    <p><em> em 태그는 강조로 표시합니다.</em> </p>
    <p><small> small 태그는 작은 글자를 표시합니다.</small> </p>
    <p><mark> mark 태그는 음영 </mark>으로 표시합니다.</p>
    <p><strong> strong 태그는 문자를 강력하게 강조합니다.</strong> </p>
    <p>X<sub>2</sub>(아래 첨자) 와 Y<sup>2</sup>(위 첨자)입니다. </p>
    <p>ins 태그는 <ins>추가한 내용을 밑줄</ins>로 표시합니다.</p>
    <p><del>del 태그는 취소선을 표시합니다.</del> </p>
    <p>X<sup>2</sup> + Y<sup>2</sup> = Z<sup>2</sup> </p>
</body>

---

## 특수 문자

- ```&nbsp;```: 공백
- ```&lt;```: less than
- ```&gt;```: greater than
- ```&amp;```: &
- ```&cent;```: cent 표시
- ```&pound;```: pound 표시
- ```&yen;```: yen 표시
- ```&euro;```: euro 표시
- ```&sect;```: section 표시
- ```&copy;```: copyright 표시
- ```&reg;```: registered trademark 표시

```html
<body>
	<p>space: &nbsp;  (공백)</p>
	<p>less than: &lt;</p>     
	<p>greater than: &gt; </p>  
	<p>ampersand: &amp;</p>    
	<p>cent: &cent; </p>
	<p>pound: &pound; </p>
	<p>yen: &yen;</p>
	<p>euro: &euro; </p>
	<p>section: &sect; </p>
	<p>copyright: &copy; </p>
	<p>registered trademark: &reg; </p>
</body>
```
<body>
	<p>space: &nbsp;  (공백)</p>
	<p>less than: &lt;</p>     
	<p>greater than: &gt; </p>  
	<p>ampersand: &amp;</p>    
	<p>cent: &cent; </p>
	<p>pound: &pound; </p>
	<p>yen: &yen;</p>
	<p>euro: &euro; </p>
	<p>section: &sect; </p>
	<p>copyright: &copy; </p>
	<p>registered trademark: &reg; </p>
</body>

---

## p, span, div
- ```div```: 칸에 맞게 빽빽히 스택을 쌓아놓는다.
- ```p```: div 칸끼리 사이에 공백을 추가한다.
- ```span```: 그냥 글 사이즈에 알 맞게 집어넣는다.

```html
<body>
    div
    <div style="background-color: orange;">12345</div>
    <div style="background-color: yellow;">ABCD</div>
    <div style="background-color: green;">가나다라</div>
    <br>
    p
    <p style="background-color: orange;">12345</p>
    <p style="background-color: yellow;">가나다라</p>
    <p style="background-color: green;">ABCD</p>
    <br>
    span
    <span style="background-color: orange;">12345</span>
    <span style="background-color: yellow;">ABCD</span>
    <span style="background-color: green;">가나다라</span>
</body>
```

<body>
    div
    <div style="background-color: orange;">12345</div>
    <div style="background-color: yellow;">ABCD</div>
    <div style="background-color: green;">가나다라</div>
    <br>
    p
    <p style="background-color: orange;">12345</p>
    <p style="background-color: yellow;">가나다라</p>
    <p style="background-color: green;">ABCD</p>
    <br>
    span
    <span style="background-color: orange;">12345</span>
    <span style="background-color: yellow;">ABCD</span>
    <span style="background-color: green;">가나다라</span>
</body>

---

# 이미지 비디오 오디오
- **이미지**
    ```<img src="" width="" height="" alt="">```
    - ```src```: 이미지 주소
    - ```width```: 가로길이
    - ```height```: 세로길이
    - ```alt```: 이미지가 없을때 나오는 문구

    ```html
    <body>
        <img src="image/mouse.png">
        <img src="image/mouse.png" width="80px" height="80px">
        <img src="image/mouse2.png" alt="No Mouse">
    </body>
    ```

    <body>
        <img src="image/mouse.png">
        <img src="image/mouse.png" width="80px" height="80px">
        <img src="image/mouse2.png" alt="No Mouse">
    </body>

    <br><br>

    - ```figure```: 이미지 그룹으로 묶어준다.
    - ```figcaption```: 그림의 제목


    ```html
    <body>
    <figure>
        <img src="image/w3c.png" alt="w3c.png" width="75px">
        <figcaption>[그림 1-1] w3c 공식 사이트 </figcaption>
    </figure>
    </body> 
    ```

    <body>
    <figure>
        <img src="image/w3c.png" alt="w3c.png" width="75px">
        <figcaption>[그림 1-1] w3c 공식 사이트 </figcaption>
    </figure>
    </body>



---

## 리스트
- ```<ul>```: 오더가 없는 리스트 (circle, square, disc, none)
- ```<ol>```: 순서가 있는 리스트 (1. 2. 3.. ...)

    ```html
    <body>
    <!-- type: circle, square, disc, none -->
    <ul type="disc">
        <li>카페라떼</li>
        <li>아메리카노</li>
        <li>콜드브루</li>
    </ul>

    <!-- type: "1", "A" "I"
    reversed : 거꾸로
    start : 시작점 -->
    <ol type="1" start="50", reversed>
        <li>카페라떼</li>
        <li>아메리카노</li>
        <li>콜드브루</li>
    </ol>
    </body>
    ```

    <body>
    <!-- circle, square, disc, none -->
    <ul type="disc">
        <li>카페라떼</li>
        <li>아메리카노</li>
        <li>콜드브루</li>
    </ul>

    <!-- type: "1", "A" "I"
    reversed : 거꾸로
    start : 시작점 -->
    <ol type="1" start="50", reversed>
        <li>Cafe Latte</li>
        <li>Americano</li>
        <li>Cold Brew</li>
    </ol>
    </body>

- ```<dl><dt><dd>```: 탭을 사용하여 리스트를 나타낸다
    ```html
    <body>
        <dl>
            <dt>HTML</dt>
            <dd>Hyper Text Markup Language</dd>

            <dt>CSS</dt>
            <dd>Cascading Style Sheet</dd>
        </dl>
    </body>
    ```

    <body>
        <dl>
            <dt>HTML</dt>
            <dd>Hyper Text Markup Language</dd>
            <dt>CSS</dt>
            <dd>Cascading Style Sheet</dd>
        </dl>
    </body>

---

## 링크

- ```target="_top:```: 해당 페이지가 링크로 바뀐다.
- ```target="_blank:```: 새 페이지에서 링크가 열린다.
- ```target="_self:```: 버튼을 소유하고 있는 칸에서 화면이 나온다.
```html
<body>
    <a href="http://www.w3c.org" target="_top">W3C</a>

    <br>

    <a href="ex01_01.html" target="_blank">1 페이지로 이동</a>
    <a href="ex01_02.html" target="_blank">
        <img src="image/mouse.png" width=70px height="70px" alt="mouse">
    </a>
</body>
```

<body>
    <a href="http://www.w3c.org" target="_top">W3C</a>
    <br>
    <a href="http://www.facebook.com" target="_blank">페이스북 페이지로 이동</a>
    <br>
    <a href="http://www.naver.com" target="_blank">
        <img src="image/mouse.png" width=70px height="70px" alt="mouse">
    </a>
</body>

--- 

## 테이블

```html
<body>
<table border="1">
    <caption align="bottom">회원주소록</caption>
    <tr>
        <th>이름</th>
        <th>연락처</th>
        <th>주소</th>
    </tr>
    <tr>
        <td>이순신</td>
        <td>010-1234-5678</td>
        <td>서울</td>
    </tr>
    <tr>
        <td>홍길동</td>
        <td>010-5678-1234</td>
        <td>부산</td>
    </tr>
</table>
</body>
```

<img src="image/table.png" width=40%>
