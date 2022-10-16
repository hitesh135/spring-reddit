package com.spring.reddit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommonResponse {
	private String message;
	private Object data;

	public CommonResponse(String message) {
		this.message = message;
	}

}
