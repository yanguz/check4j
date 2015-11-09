package com.check;

import java.util.List;

public class MultiRuleMultiDataObject {
	private List<String> rules;
	private List<Object> datas;
	private List<Boolean> results;

	public List<String> getRules() {
		return rules;
	}

	public void setRules(List<String> rules) {
		this.rules = rules;
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
