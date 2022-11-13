package org.example;

import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.List;

public class Main {
	static final List<String> BookingLopesan = List.of(
					"https://www.booking.com/reviewlist.es.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaEaIAQGYAQq4ARnIAQzYAQHoAQH4AQuIAgGoAgO4ArWvxJsGwAIB0gIkOGRhZWI3N2MtMDk0Ny00ZGQ5LWFiZTItZTUyODA1NzI5ODYx2AIG4AIB&sid=6ab8fa75fdaed67b6e4aa8696b26052b&cc1=es;dist=1;length_of_stay=8;pagename=lopesan-costa-meloneras-resort-spa-casino;srpvid=c54c722386240082;type=total&&offset=0;rows=25",
					"https://www.booking.com/reviewlist.es.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaEaIAQGYAQq4ARnIAQzYAQHoAQH4AQuIAgGoAgO4ArWvxJsGwAIB0gIkOGRhZWI3N2MtMDk0Ny00ZGQ5LWFiZTItZTUyODA1NzI5ODYx2AIG4AIB&sid=6ab8fa75fdaed67b6e4aa8696b26052b&cc1=es;dist=1;length_of_stay=8;pagename=lopesan-costa-meloneras-resort-spa-casino;srpvid=c54c722386240082;type=total&&offset=25;rows=25",
					"https://www.booking.com/reviewlist.es.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaEaIAQGYAQq4ARnIAQzYAQHoAQH4AQuIAgGoAgO4ArWvxJsGwAIB0gIkOGRhZWI3N2MtMDk0Ny00ZGQ5LWFiZTItZTUyODA1NzI5ODYx2AIG4AIB&sid=6ab8fa75fdaed67b6e4aa8696b26052b&cc1=es;dist=1;length_of_stay=8;pagename=lopesan-costa-meloneras-resort-spa-casino;srpvid=c54c722386240082;type=total&&offset=50;rows=25",
					"https://www.booking.com/reviewlist.es.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaEaIAQGYAQq4ARnIAQzYAQHoAQH4AQuIAgGoAgO4ArWvxJsGwAIB0gIkOGRhZWI3N2MtMDk0Ny00ZGQ5LWFiZTItZTUyODA1NzI5ODYx2AIG4AIB&sid=6ab8fa75fdaed67b6e4aa8696b26052b&cc1=es;dist=1;length_of_stay=8;pagename=lopesan-costa-meloneras-resort-spa-casino;srpvid=c54c722386240082;type=total&&offset=75;rows=25",
					"https://www.booking.com/reviewlist.es.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaEaIAQGYAQq4ARnIAQzYAQHoAQH4AQuIAgGoAgO4ArWvxJsGwAIB0gIkOGRhZWI3N2MtMDk0Ny00ZGQ5LWFiZTItZTUyODA1NzI5ODYx2AIG4AIB&sid=6ab8fa75fdaed67b6e4aa8696b26052b&cc1=es;dist=1;length_of_stay=8;pagename=lopesan-costa-meloneras-resort-spa-casino;srpvid=c54c722386240082;type=total&&offset=100;rows=25",
					"https://www.booking.com/reviewlist.es.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaEaIAQGYAQq4ARnIAQzYAQHoAQH4AQuIAgGoAgO4ArWvxJsGwAIB0gIkOGRhZWI3N2MtMDk0Ny00ZGQ5LWFiZTItZTUyODA1NzI5ODYx2AIG4AIB&sid=6ab8fa75fdaed67b6e4aa8696b26052b&cc1=es;dist=1;length_of_stay=8;pagename=lopesan-costa-meloneras-resort-spa-casino;srpvid=c54c722386240082;type=total&&offset=125;rows=25",
					"https://www.booking.com/reviewlist.es.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaEaIAQGYAQq4ARnIAQzYAQHoAQH4AQuIAgGoAgO4ArWvxJsGwAIB0gIkOGRhZWI3N2MtMDk0Ny00ZGQ5LWFiZTItZTUyODA1NzI5ODYx2AIG4AIB&sid=6ab8fa75fdaed67b6e4aa8696b26052b&cc1=es;dist=1;length_of_stay=8;pagename=lopesan-costa-meloneras-resort-spa-casino;srpvid=c54c722386240082;type=total&&offset=150;rows=25",
					"https://www.booking.com/reviewlist.es.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaEaIAQGYAQq4ARnIAQzYAQHoAQH4AQuIAgGoAgO4ArWvxJsGwAIB0gIkOGRhZWI3N2MtMDk0Ny00ZGQ5LWFiZTItZTUyODA1NzI5ODYx2AIG4AIB&sid=6ab8fa75fdaed67b6e4aa8696b26052b&cc1=es;dist=1;length_of_stay=8;pagename=lopesan-costa-meloneras-resort-spa-casino;srpvid=c54c722386240082;type=total&&offset=175;rows=25"
	);
	static final List<String> TripAdvisorLopesan = List.of(
					"https://www.tripadvisor.es/Hotel_Review-g2089121-d241729-Reviews-Lopesan_Costa_Meloneras_Resort_Spa-Meloneras_Gran_Canaria_Canary_Islands.html",
					"https://www.tripadvisor.es/Hotel_Review-g2089121-d241729-Reviews-or5-Lopesan_Costa_Meloneras_Resort_Spa-Meloneras_Gran_Canaria_Canary_Islands.html",
					"https://www.tripadvisor.es/Hotel_Review-g2089121-d241729-Reviews-or10-Lopesan_Costa_Meloneras_Resort_Spa-Meloneras_Gran_Canaria_Canary_Islands.html",
					"https://www.tripadvisor.es/Hotel_Review-g2089121-d241729-Reviews-or15-Lopesan_Costa_Meloneras_Resort_Spa-Meloneras_Gran_Canaria_Canary_Islands.html",
					"https://www.tripadvisor.es/Hotel_Review-g2089121-d241729-Reviews-or20-Lopesan_Costa_Meloneras_Resort_Spa-Meloneras_Gran_Canaria_Canary_Islands.html",
					"https://www.tripadvisor.es/Hotel_Review-g2089121-d241729-Reviews-or25-Lopesan_Costa_Meloneras_Resort_Spa-Meloneras_Gran_Canaria_Canary_Islands.html",
					"https://www.tripadvisor.es/Hotel_Review-g2089121-d241729-Reviews-or30-Lopesan_Costa_Meloneras_Resort_Spa-Meloneras_Gran_Canaria_Canary_Islands.html",
					"https://www.tripadvisor.es/Hotel_Review-g2089121-d241729-Reviews-or35-Lopesan_Costa_Meloneras_Resort_Spa-Meloneras_Gran_Canaria_Canary_Islands.html"
	);
	static final List<String> TripAdvisorAulani = List.of(
					"https://www.tripadvisor.es/Hotel_Review-g60654-d2140201-Reviews-Aulani_A_Disney_Resort_Spa-Kapolei_Oahu_Hawaii.html",
					"https://www.tripadvisor.es/Hotel_Review-g60654-d2140201-Reviews-or5-Aulani_A_Disney_Resort_Spa-Kapolei_Oahu_Hawaii.html",
					"https://www.tripadvisor.es/Hotel_Review-g60654-d2140201-Reviews-or10-Aulani_A_Disney_Resort_Spa-Kapolei_Oahu_Hawaii.html",
					"https://www.tripadvisor.es/Hotel_Review-g60654-d2140201-Reviews-or15-Aulani_A_Disney_Resort_Spa-Kapolei_Oahu_Hawaii.html",
					"https://www.tripadvisor.es/Hotel_Review-g60654-d2140201-Reviews-or20-Aulani_A_Disney_Resort_Spa-Kapolei_Oahu_Hawaii.html",
					"https://www.tripadvisor.es/Hotel_Review-g60654-d2140201-Reviews-or25-Aulani_A_Disney_Resort_Spa-Kapolei_Oahu_Hawaii.html",
					"https://www.tripadvisor.es/Hotel_Review-g60654-d2140201-Reviews-or30-Aulani_A_Disney_Resort_Spa-Kapolei_Oahu_Hawaii.html",
					"https://www.tripadvisor.es/Hotel_Review-g60654-d2140201-Reviews-or35-Aulani_A_Disney_Resort_Spa-Kapolei_Oahu_Hawaii.html"
	);

	public static void main(String[] args) throws Exception {
		Store store = new Store("reviews.db");
		List<Website> websites = new ArrayList<>();

		for (String url : BookingLopesan) {
			websites.add(new Booking(url, "Lopesan Costa Meloneras Resort & Spa"));
		}
		for (String url : TripAdvisorLopesan) {
			websites.add(new TripAdvisor(url, "Lopesan Costa Meloneras Resort & Spa"));
		}
		for(String url : TripAdvisorAulani) {
			websites.add(new TripAdvisor(url, "Aulani"));
		}

		Observable.fromIterable(websites)
				.flatMap(Website::getReviews)
				.subscribe(store);
		store.close();
	}
}