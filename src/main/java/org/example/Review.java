package org.example;

public class Review {
	private final String title;
	private final String content;
	private final int rating;
	private final String location;
	private final String source;

	public Review(String title, String content, int rating, String location, String source) {
		this.title = title;
		this.content = content;
		this.rating = rating;
		this.location = location;
		this.source = source;
	}

	public String title() {
		return title;
	}

	public String content() {
		return content;
	}

	public int rating() {
		return rating;
	}

	public String location() {
		return location;
	}

	public String source() {
		return source;
	}
}
