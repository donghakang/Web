package dto;

//setter & getter
public class FileDTO {
	private String subject;
	private String content;
	private String filename1;
	private String filename2;
	private String originalfilename1;
	private String originalfilename2;
	private long filesize1;
	private long filesize2;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFilename1() {
		return filename1;
	}
	public void setFilename1(String filename1) {
		this.filename1 = filename1;
	}
	public String getFilename2() {
		return filename2;
	}
	public void setFilename2(String filename2) {
		this.filename2 = filename2;
	}
	public String getOriginalfilename1() {
		return originalfilename1;
	}
	public void setOriginalfilename1(String originalfilename1) {
		this.originalfilename1 = originalfilename1;
	}
	public String getOriginalfilename2() {
		return originalfilename2;
	}
	public void setOriginalfilename2(String originalfilename2) {
		this.originalfilename2 = originalfilename2;
	}
	public long getFilesize1() {
		return filesize1;
	}
	public void setFilesize1(long filesize1) {
		this.filesize1 = filesize1;
	}
	public long getFilesize2() {
		return filesize2;
	}
	public void setFilesize2(long filesize2) {
		this.filesize2 = filesize2;
	}
}
