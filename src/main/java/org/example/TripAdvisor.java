package org.example;

import io.reactivex.rxjava3.core.Observable;
import org.jsoup.nodes.Document;

public class TripAdvisor extends Website {
	public TripAdvisor(String url) {
		super(url);
	}

	@Override
	protected Observable<Review> parseDocument(Document document) {
		return null;
	}
}