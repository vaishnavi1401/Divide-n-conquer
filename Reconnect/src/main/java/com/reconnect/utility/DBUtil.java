package com.reconnect.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con;
	public static Connection getMyConnection() {
		if(con==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				//Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/reconnect";
				con=DriverManager.getConnection(url,"root","mysql");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return con;
	}

	public static void closeMyConnection() {
		try {
			if(con!=null)
			    con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
