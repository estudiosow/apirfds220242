package com.codideep.main.Service.Person.ResponseObject;


import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class ResponseUpdate {
	private String type;
	private List<String> listMessage;

	public ResponseUpdate() {
		this.type = "error";
		this.listMessage = new ArrayList<>();
	}

	public void addResponseMesssage(String message) {
		this.listMessage.add(message);
	}

	public void success() {
		this.type = "success";
	}

	public void warning() {
		this.type = "warning";
	}

	public void error() {
		this.type = "error";
	}

	public void exception() {
		this.type = "exception";
	}
}
