package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Store {
	private final Connection connection;

	public Store(String path) throws SQLException {
		connection = DriverManager.getConnection("jdbc:sqlite:" + path);
	}

	public void close() throws SQLException {
		connection.close();
	}
}
