package com.check;

public class OneRuleOneDataObject {
	private String expression;
	private Object data;
	private Boolean result;

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
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
