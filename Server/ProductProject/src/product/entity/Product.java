/*---------------------------------------------------------------------------------------------
 * NAME   : notice.model.Notice
 * DESC   : 공지사항 정보를 저장하기 위한 클래스
 * VER      :1.0
 *---------------------------------------------------------------------------------------------
*/
package product.entity;

import java.io.Serializable;

/**
 * <pre>
 * 공지사항 정보를 저장하고, 전달하기 위한 클래스
 * </pre>
 *
 */
public class Product implements Serializable {
	private int num;
	private String writer;
	private String inDate;
	private String name;
	private String description;

	/**
	 * Default Constructor
	 */
	public Product() {
	}
	/**
	 * 객체 생성시작성자,제목,내용을 저장하기 위한 생성자
	 * 
	 * @param writer
	 *            작성자
	 * @param title
	 *            제목
	 * @param content
	 *            내용
	 */
	public Product(String writer, String name, String description) {
		setWriter(writer);
		setName(name);
		setDescription(description);
	}
	/**
	 * 객체 생성시 공지사항 번호, 작성자, 작성일자, 제목을 저장하기위한 생성자
	 * 
	 * @param num
	 *            공지사항 번호
	 * @param writer
	 *            작성자
	 * @param inDate
	 *            작성일자
	 * @param title
	 *            제목
	 */
	public Product(int num, String writer, String inDate, String name) {
		this(num, writer, inDate, name, "");
	}
	/**
	 * 객체 생성시 공지사항 번호, 작성자, 작성일자, 제목,내용을 저장하기위한 생성자
	 * 
	 * @param num
	 *            공지사항 번호
	 * @param writer
	 *            작성자
	 * @param inDate
	 *            작성일자
	 * @param title
	 *            제목
	 * @param content
	 *            내용
	 */
	public Product(int num, String writer, String inDate, String name,
			String description) {
		setNum(num);
		setWriter(writer);
		setInDate(inDate);
		setName(name);
		setDescription(description);
	}
	/**
	 * 번호를 저장하기 위한 메소드
	 * 
	 * @param num
	 *            번호
	 * @return void
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * 작성자를 저장하기 위한 메소드
	 * 
	 * @param writer
	 *            작성자
	 * @return void
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}
	/**
	 * 작성일를 저장하기 위한 메소드
	 * 
	 * @param inDate
	 *            작성일
	 * @return void
	 */
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	/**
	 * 제목를 저장하기 위한 메소드
	 * 
	 * @param title
	 *            제목
	 * @return void
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 내용를 저장하기 위한 메소드
	 * 
	 * @param content
	 *            내용
	 * @return void
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 번호를 리턴하기 위한 메소드
	 * 
	 * @return int :번호
	 */
	public int getNum() {
		return num;
	}
	/**
	 * 아이디를 리턴하기 위한 메소드
	 * 
	 * @return String : 아이디
	 */
	public String getWriter() {
		return writer;
	}
	/**
	 * 작성일를 리턴하기 위한 메소드
	 * 
	 * @return String : 작성일
	 */
	public String getInDate() {
		return inDate;
	}
	/**
	 * 제목를 리턴하기 위한 메소드
	 * 
	 * @return String : 제목
	 */
	public String getName() {
		return name;
	}
	/**
	 * 내용를 리턴하기 위한 메소드
	 * 
	 * @return String : 내용
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Notice 객체가 가지고 있는 값을 문자열로 리턴합니다.
	 * 
	 * @return String : 객체에 저장된 속성값들
	 */
	public String toString() {
		return num + ":" + writer + ":" + inDate + ":" + name;
	}
}