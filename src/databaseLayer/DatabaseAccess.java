package databaseLayer;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseAccess {

	Connection con;
	public DatabaseAccess() {

	}

	public void insertData(String author, String title, String paragraph, String i) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/urduspellchecker?useSSL=false", "root", "");
			String query = "Insert into filedata Values ("+null+",'" + author + "','" + title + "','" + paragraph + "')";
			PreparedStatement st = con.prepareStatement(query);
			st.execute();
			con.close();
		} catch (SQLException e) {
			 e.printStackTrace();
			
		}
	}
	public void fetchData() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/urduspellchecker?useSSL=false", "root", "");
			String query = "Select * from filedata";
			Statement st = con.createStatement();
			ResultSet rs =st.executeQuery(query);
			
			con.close();
			System.out.println("File Fetched");
		} catch (SQLException e) {
			System.out.println("File Not Fetched");
		}
	}
}
