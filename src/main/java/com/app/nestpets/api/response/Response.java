package com.app.nestpets.api.response;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import lombok.Data;

@Data
public class Response<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private T data;
	
	private Long timestamp;
	private Integer status;
	private String message;
	private String path;
	
	public Response() {
		
	}
		
	public void notFound() {
		this.timestamp = System.currentTimeMillis();
		this.status = 404;
		this.message = "Não encontrado";
		this.data = null;
	}

}
