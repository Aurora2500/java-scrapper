package org.example;

import io.reactivex.rxjava3.core.Observable;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public abstract class Website {
	private final String url;

	protected Website(String url) {
		this.url = url;
	}

	protected abstract Observable <Review> parseDocument(Document document);

	public Observable<Review> getReviews() throws IOException {
		Connection.Response response = Jsoup.connect(url).execute();
		Document doc = response.parse();
		return parseDocument(doc);
	}
}
