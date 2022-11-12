package org.example;

import io.reactivex.rxjava3.core.Observable;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public abstract class Website {
	private final String url;
	protected final String source;
	protected final String location;

	protected Website(String url, String source, String location) {
		this.url = url;
		this.source = source;
		this.location = location;
	}

	protected abstract Observable<Element> reviewElements(Document document);
	protected abstract Review parseReview(Element review);

	public Observable<Review> getReviews() throws IOException {
		Connection.Response response = Jsoup.connect(url).execute();
		Document doc = response.parse();
		return reviewElements(doc).map(this::parseReview);
	}
}
