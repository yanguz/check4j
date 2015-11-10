package com.check;

import java.util.List;

/**
 * 多条规则，单条数据
 * 
 * @author 80274996
 * 
 */
public class MultiRuleOneDataObject extends CheckDataObject {
	private List<String> rules;
	private Object data;
	private List<Boolean> results;

	public List<String> getRules() {
		return rules;
	}

	public void setRules(List<String> rules) {
		this.rules = rules;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public List<Boolean> getResults() {
		return results;
	}

	protected void setResults(List<Boolean> results) {
		this.results = results;
	}

}
