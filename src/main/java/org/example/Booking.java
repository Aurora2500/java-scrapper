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
		return Observable.fromIterable(document.select("ul.review_list>li"));
	}

	@Override
	protected Review parseReview(Element review) {
		String title = review.select("h3.c-review-block__title").text();
		int rating = (int) (Float.parseFloat(review.select("div.c-score>div").text().replace(",", ".")) * 10);

		StringBuilder content = new StringBuilder();
		for (Element p : review.select("div.c-review>div.c-review__row")) {
			String prefix = p.select("span.bui-u-sr-only").text();
			switch (prefix) {
				case "Gustó" -> content.append("BUENO: ");
				case "No gustó" -> content.append("MALO: ");
				default -> System.out.println("Unknown prefix: " + prefix);
			}
			content.append(p.select("span.c-review__body").text()).append("\n");
		}
		return new Review(title, content.toString(), rating, location, source);
	}
}
