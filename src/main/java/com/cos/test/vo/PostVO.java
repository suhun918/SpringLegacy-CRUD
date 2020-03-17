package com.cos.test.vo;

import java.sql.Timestamp;

import lombok.Data;


@Data
public class PostVO {
	
	private int id;
	private String title;
	private String content;
	private int userId;
	private Timestamp createDate;
}
