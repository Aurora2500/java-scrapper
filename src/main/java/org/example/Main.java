package org.example;

public class Main {

	public static void main(String[] args) throws Exception {
		Store store = new Store("reviews.db");

		store.close();
	}
}