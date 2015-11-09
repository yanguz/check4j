package com.check;

import org.mvel2.MVEL;

public class CheckEngine {
	// 1.单条规则，单条数据
	public static OneRuleOneDataObject check(OneRuleOneDataObject obj) {
		Boolean result = MVEL.evalToBoolean(obj.getExpression(), obj.getData());
		obj.setResult(result);
		return obj;
	}

	// 2.单条规则，多条数据
	public static OneRuleMultiDataObject check(OneRuleMultiDataObject obj) {
		String rule = obj.getExpression();
		
		return null;
	}

	// 3.多条规则，单条数据
	public static MultiRuleOneDataObject check(MultiRuleOneDataObject obj) {
		return null;
	}

	// 4.多条规则，多条数据
	public static MultiRuleMultiDataObject check(MultiRuleMultiDataObject obj) {
		return null;
	}
}
