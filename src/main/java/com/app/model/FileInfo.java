package com.app.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileInfo {
    private String filename;
    private String url;
    
    
	public FileInfo(String filename, String url) {
		super();
		this.filename = filename;
		this.url = url;
	}
	public FileInfo() {
		super();
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "FileInfo [filename=" + filename + ", url=" + url + "]";
	}
    
}
