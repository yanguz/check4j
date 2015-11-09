package com.check;

import java.util.List;

public class OneRuleMultiDataObject {
	private String expression;
	private List<Object> datas;
	private List<Boolean> results;

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public List<Object> getDatas() {
		return datas;
	}

	public void setDatas(List<Object> datas) {
		this.datas = datas;
	}

	public List<Boolean> getResults() {
		return results;
	}

	protected void setResults(List<Boolean> results) {
		this.results = results;
	}

}
