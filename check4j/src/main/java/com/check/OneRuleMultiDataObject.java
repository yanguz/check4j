package com.check;

import java.util.List;

/**
 * 单条规则，多条数据
 * 
 * @author 80274996
 * 
 */
public class OneRuleMultiDataObject extends CheckDataObject {
	private String rule;
	private List<Object> datas;
	private List<Boolean> results;

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
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
