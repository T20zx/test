package cn.jbit.bean;

// Generated 2017-3-1 15:51:07 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AuFunction generated by hbm2java
 */
public class AuFunction implements java.io.Serializable {

	private Long id;
	private String functionCode;
	private String functionName;
	private String funcUrl;
	private Long parentId;
	private Date creationTime;

	public AuFunction() {
	}

	public AuFunction(String functionCode, String functionName, String funcUrl,
			Long parentId, Date creationTime) {
		this.functionCode = functionCode;
		this.functionName = functionName;
		this.funcUrl = funcUrl;
		this.parentId = parentId;
		this.creationTime = creationTime;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFunctionCode() {
		return this.functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFuncUrl() {
		return this.funcUrl;
	}

	public void setFuncUrl(String funcUrl) {
		this.funcUrl = funcUrl;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Date getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

}