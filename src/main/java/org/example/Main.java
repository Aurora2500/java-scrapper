package org.example;

public class Main {

	public static void main(String[] args) throws Exception {
		Store store = new Store("reviews.db");
		Website tripAdvisor = new TripAdvisor(
						"https://www.tripadvisor.es/Hotel_Review-g2089121-d241729-Reviews-Lopesan_Costa_Meloneras_Resort_Spa-Meloneras_Gran_Canaria_Canary_Islands.html#REVIEWS",
						"Lopesan Costa Meloneras Resort Spa"
		);
		tripAdvisor.getReviews().subscribe(store);
		store.close();
	}
}