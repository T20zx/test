package cn.jbit.bean;

// Generated 2017-3-1 15:51:07 by Hibernate Tools 3.4.0.CR1

/**
 * DataDictionary generated by hbm2java
 */
public class DataDictionary implements java.io.Serializable {

	private Long id;
	private String typeCode;
	private String typeName;
	private Integer valueId;
	private String valueName;

	public DataDictionary() {
	}

	public DataDictionary(String typeCode, String typeName, Integer valueId,
			String valueName) {
		this.typeCode = typeCode;
		this.typeName = typeName;
		this.valueId = valueId;
		this.valueName = valueName;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getValueId() {
		return this.valueId;
	}

	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}

	public String getValueName() {
		return this.valueName;
	}

	public void setValueName(String valueName) {
		this.valueName = valueName;
	}

}
