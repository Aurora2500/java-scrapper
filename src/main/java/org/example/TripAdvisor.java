package org.example;

import io.reactivex.rxjava3.core.Observable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TripAdvisor extends Website {
	public TripAdvisor(String url) {
		super(url);
	}

	@Override
	protected Observable<Element> reviewElements(Document document) {
		return Observable.fromIterable(document.select("div.reviewSelector"));
	}

	@Override
	protected Review parseReview(Element review) {
		return null;
	}
}