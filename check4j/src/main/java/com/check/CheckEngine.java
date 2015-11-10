package com.check;

import java.util.ArrayList;
import java.util.List;

import org.mvel2.MVEL;

public class CheckEngine {
	// 1.单条规则，单条数据
	public static OneRuleOneDataObject check(OneRuleOneDataObject obj) {
		obj.setStart(System.currentTimeMillis());
		Boolean result = MVEL.evalToBoolean(obj.getRule(), obj.getData());
		obj.setResult(result);
		obj.setEnd(System.currentTimeMillis());
		return obj;
	}

	// 2.单条规则，多条数据
	public static OneRuleMultiDataObject check(OneRuleMultiDataObject obj) {
		obj.setStart(System.currentTimeMillis());
		String rule = obj.getRule();
		Object compiledExpression = MVEL.compileExpression(rule);
		List<Object> datas = obj.getDatas();
		List<Boolean> results = new ArrayList<Boolean>();
		if (datas != null && datas.size() > 0) {
			for (Object data : datas) {
				Boolean result = (Boolean) MVEL.executeExpression(
						compiledExpression, data);
				results.add(result);
			}

		}
		obj.setResults(results);
		obj.setEnd(System.currentTimeMillis());
		return obj;
	}

	// 3.多条规则，单条数据
	public static MultiRuleOneDataObject check(MultiRuleOneDataObject obj) {
		obj.setStart(System.currentTimeMillis());
		List<String> rules = obj.getRules();
		Object data = obj.getData();
		List<Boolean> results = new ArrayList<Boolean>();
		if (rules != null && rules.size() > 0) {
			for (String rule : rules) {
				Boolean result = MVEL.evalToBoolean(rule, data);
				results.add(result);
			}
		}
		obj.setResults(results);
		obj.setEnd(System.currentTimeMillis());
		return obj;
	}

	// 4.多条规则，多条数据
	public static MultiRuleMultiDataObject check(MultiRuleMultiDataObject obj) {
		obj.setStart(System.currentTimeMillis());
		List<String> rules = obj.getRules();
		List<Object> datas = obj.getDatas();
		List<List<Boolean>> results = new ArrayList<List<Boolean>>();
		if (rules != null && rules.size() > 0 && datas != null
				&& datas.size() > 0) {
			for (Object data : datas) {
				List<Boolean> inList = new ArrayList<Boolean>();
				for (String rule : rules) {
					Boolean result = MVEL.evalToBoolean(rule, data);
					inList.add(result);
				}
				results.add(inList);
			}
		}
		obj.setResults(results);
		obj.setEnd(System.currentTimeMillis());
		return obj;
	}
}
