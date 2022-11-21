package databaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import transferObject.TransferData;

/**
 * 
 * @author Abdul Hanan
 * 
 * Database Insert and Select Statements
 *
 */


public class DatabaseAccess {

	Connection con;
	public DatabaseAccess() {

	}

	public void insertData(String author, String title, String paragraph) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/urduspellchecker?useSSL=false", "root", "");
			String query = "Insert into filedata Values ("+null+",'" + author + "','" + title + "','" + paragraph + "')";
			PreparedStatement st = con.prepareStatement(query);
			st.execute();
			con.close();
		} catch (SQLException e) {
			System.out.println("Connection Error");
			System.exit(0);
			
		}
	}
	public TransferData fetchData() {
		TransferData objS = new TransferData();
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/urduspellchecker?useSSL=false", "root", "");
			String query = "Select * from filedata";
			Statement st = con.createStatement();
			ResultSet rs =st.executeQuery(query);
			while(rs.next()) {
				objS.setData(rs.getString(4));
			}
			con.close();
			System.out.println("File Fetched");
		} catch (SQLException e) {
			System.out.println("File Not Fetched");
			System.exit(0);
		}
		return objS;
	}
	
	public void insertWord(String word, int freq) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/urduspellchecker?useSSL=false", "root", "");
			String query = "Insert into word Values ("+null+",'" + word + "'," + freq + ")";
			PreparedStatement st = con.prepareStatement(query);
			st.execute();
			con.close();
		} catch (SQLException e) {
			System.out.println("Connection Error");
			
		}
	}
}
