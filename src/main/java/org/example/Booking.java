package org.example;

import io.reactivex.rxjava3.core.Observable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Booking extends Website{
	public Booking(String url, String location) {
		super(url, "Booking", location);
	}

	@Override
	protected Observable<Element> reviewElements(Document document) {
		return null;
	}

	@Override
	protected Review parseReview(Element review) {
		return null;
	}
}
