package org.example;

import io.reactivex.rxjava3.core.Observable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TripAdvisor extends Website {
	public TripAdvisor(String url, String location) {
		super(url, "TripAdvisor", location);
	}

	@Override
	protected Observable<Element> reviewElements(Document document) {
		Elements reviews = document.select("div.YibKl");
		return Observable.fromIterable(reviews);
	}
	@Override
	protected Review parseReview(Element review) {
		String title = review.select("a.Qwuub>span>span").text();
		String content = review.select("q.QewHA>span").text();
		Element rating_span = review.select("span.ui_bubble_rating").first();
		// rating_span has a class with the pattern bubble_XX, where XX is the rating
		String rating_str = rating_span.attr("class").split(" ")[1].split("_")[1];
		// Rating is normalized to a 1-100 scale
		int rating = Integer.parseInt(rating_str) * 2;

		return new Review(title, content, rating, location, source);
	}
}