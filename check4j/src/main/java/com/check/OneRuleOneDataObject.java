package com.check;

/**
 * 单条规则，单条数据
 * 
 * @author 80274996
 * 
 */
public class OneRuleOneDataObject extends CheckDataObject {
	private String rule;
	private Object data;
	private Boolean result;

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Boolean getResult() {
		return result;
	}

	protected void setResult(Boolean result) {
		this.result = result;
	}

}
