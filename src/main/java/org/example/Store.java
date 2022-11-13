package org.example;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Store implements Observer<Review> {
	private static String INSERT_REVIEW = "INSERT INTO reviews (title, content, rating, location, source) VALUES (?, ?, ?, ?, ?)";
	private final Connection connection;

	public Store(String path) throws SQLException {
		connection = DriverManager.getConnection("jdbc:sqlite:" + path);
		connection.createStatement().execute("CREATE TABLE IF NOT EXISTS reviews (title TEXT, content TEXT, rating INTEGER, location TEXT, source TEXT)");
	}

	public void close() throws SQLException {
		connection.close();
	}

	@Override
	public void onSubscribe(@NonNull Disposable d) {
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void onNext(@NonNull Review review) {
		try {
			PreparedStatement statement = connection.prepareStatement(INSERT_REVIEW);
			statement.setString(1, review.title());
			statement.setString(2, review.content());
			statement.setInt(3, review.rating());
			statement.setString(4, review.location());
			statement.setString(5, review.source());
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void onError(@NonNull Throwable e) {
		try {
			connection.rollback();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
		throw new RuntimeException(e);
	}

	@Override
	public void onComplete() {
		try {
			connection.commit();
			connection.setAutoCommit(true);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
