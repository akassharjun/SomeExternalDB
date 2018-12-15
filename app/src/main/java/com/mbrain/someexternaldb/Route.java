package com.mbrain.someexternaldb;

public class Route {
	String name;
	String code;
	int status;

	public Route(String name, String code, int status) {
		this.name = name;
		this.code = code;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Route(int status) {
		this.status = status;
	}
}
