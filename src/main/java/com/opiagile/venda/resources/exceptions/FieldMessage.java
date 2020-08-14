package com.opiagile.venda.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String fieldMessage;
	private String msg;
	
	public FieldMessage(String fieldMessage, String msg) {
		super();
		this.fieldMessage = fieldMessage;
		this.setMsg(msg);
	}

	public String getFieldMessage() {
		return fieldMessage;
	}

	public void setFieldMessage(String fieldMessage) {
		this.fieldMessage = fieldMessage;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
