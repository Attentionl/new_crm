package com.sxu.crm.basic.utils;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 返回数据
 */
public class Result extends LinkedHashMap<String, Object> implements Serializable {
	private static final long serialVersionUID = 1L;

	public Result() {
		put("code", 0);
	}

	public static Result error() {
		return error(500, "未知异常，请联系管理员");
	}

	public static Result error(String msg) {
		return error(500, msg);
	}

	public static Result noAuth() {
		return error("没有权限");
	}

	public static Result error(int code, String msg) {
		Result r = new Result();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static Result ok(String msg) {
		Result r = new Result();
		r.put("msg", msg);
		return r;
	}

	public static Result ok(Map<String, Object> map) {
		Result r = new Result();
		r.putAll(map);
		return r;
	}

	public static Result ok() {
		return new Result();
	}

	@Override
	public Result put(String key, Object value) {
		super.put(key, value);
		return this;
	}
	public boolean isSuccess(){
		return super.containsKey("code")&&super.get("code").equals(0);
	}

	public static Result isSuccess(boolean b, String msg){
		return b? Result.ok(): Result.error(msg);
	}
	public static Result isSuccess(boolean b){
		return isSuccess(b,null);
	}

}
