package com.java501.S20230401.util;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailMessage {
	private String to;
	private String subject;
	private String message;
}
