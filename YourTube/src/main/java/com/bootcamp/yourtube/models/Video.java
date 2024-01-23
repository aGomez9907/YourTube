package com.bootcamp.yourtube.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "videos")
public class Video {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;
	private String url;
	private String category;
	private String description;
	private Integer views;
	private Integer likes;
	private Integer dislikes;
	
	
	

	
	public Video() {
	
	}
	public Video(Integer id, String url, String category) {
	
		this.id = id;
		this.url = url;
		this.category = category;
	}
	public Video(Integer id, String url, String category, String description) {
	
		this.id = id;
		this.url = url;
		this.category = category;
		this.description = description;
	}
	
	
	
	public Video(String url, String category) {
	
		this.id = id;
		this.url = url;
		this.category = category;
	}
	public Video(String url, String category, String description) {
	
		this.id = id;
		this.url = url;
		this.category = category;
		this.description = description;
	}
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public Integer getDislikes() {
		return dislikes;
	}
	public void setDislikes(Integer dislikes) {
		this.dislikes = dislikes;
	}
	
	

}
