package com.check;

import java.util.List;

/**
 * 多条规则，多条数据
 * 
 * @author 80274996
 * 
 */
public class MultiRuleMultiDataObject extends CheckDataObject {
	private List<String> rules;
	private List<Object> datas;
	private List<List<Boolean>> results;

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

	public List<List<Boolean>> getResults() {
		return results;
	}

	public void setResults(List<List<Boolean>> results) {
		this.results = results;
	}

}
