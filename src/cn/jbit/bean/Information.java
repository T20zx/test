package cn.jbit.bean;

// Generated 2017-3-1 15:51:07 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Information generated by hbm2java
 */
public class Information implements java.io.Serializable {

	private Long id;
	private String title;
	private String content;
	private Integer state;
	private String publisher;
	private Date publishTime;
	private Integer typeId;
	private String typeName;
	private String fileName;
	private String filePath;
	private Double fileSize;
	private Date uploadTime;

	public Information() {
	}

	public Information(String title, String content, Integer state,
			String publisher, Date publishTime, Integer typeId,
			String typeName, String fileName, String filePath, Double fileSize,
			Date uploadTime) {
		this.title = title;
		this.content = content;
		this.state = state;
		this.publisher = publisher;
		this.publishTime = publishTime;
		this.typeId = typeId;
		this.typeName = typeName;
		this.fileName = fileName;
		this.filePath = filePath;
		this.fileSize = fileSize;
		this.uploadTime = uploadTime;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Double getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(Double fileSize) {
		this.fileSize = fileSize;
	}

	public Date getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

}