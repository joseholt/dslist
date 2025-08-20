package com.holtdev.dslist.projections;

public interface GameMinProjection {
	
	Long getId();
	String getTitle();
	Integer getYear();
	String getGenre();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
	
}
