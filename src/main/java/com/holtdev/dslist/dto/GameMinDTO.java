package com.holtdev.dslist.dto;

import com.holtdev.dslist.entities.Game;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {
		
	}
	
	public GameMinDTO(Long id, String title, Integer year, String genre, String imgUrl, String shortDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
	}
	
	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.genre = entity.getGenre();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	
}
