package com.green.movie.dto;

import lombok.Data;

@Data
public class BoardDTO {

	private long seq;
	private String title;
	private String etitle;
	private int productYear;
	private String producCountry;
	private String genre;
	private String director;
}
