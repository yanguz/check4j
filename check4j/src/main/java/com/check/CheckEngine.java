package com.check;

import java.util.List;

import org.mvel2.MVEL;

public class CheckEngine {
	/**
	 * 单表达式，单对象
	 * 
	 * @param expression
	 * @param ctx
	 * @return
	 */
	public static Object check(String expression, Object ctx) {
		return MVEL.eval(expression, ctx);
	}

	/**
	 * 单表达式，多对象
	 * 
	 * @param expression
	 * @param ctx
	 * @return
	 */
	public static Object check(String expression, List<Object> ctx) {
		return null;
	}

	public static Object check(List<String> expressions, Object ctx) {
		return null;
	}

	public static Object check(List<String> expressions, List<Object> ctx) {
		return null;
	}
}
