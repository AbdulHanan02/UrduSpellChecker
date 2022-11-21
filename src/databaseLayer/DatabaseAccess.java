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
 *         Database Insert and Select Statements
 *
 */

public class DatabaseAccess {

	private Connection con= null;

	public DatabaseAccess() {
		try {
			String userName = "root";
			String password = "";
			String url = "jdbc:MySQL://localhost:3306/urduspellchecker";
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection established");
			} catch (Exception e) {
			System.err.println("Cannot connect to database server");
			e.printStackTrace();
			}
	}

	public void insertData(String author, String title, String paragraph) {
		try {
			String query = "Insert into filedata Values ("+null+",'" + author + "','" + title + "','" + paragraph + "')";
			PreparedStatement st = con.prepareStatement(query);
			st.execute();
		} catch (SQLException e) {
			System.out.println("Connection Error");
			System.exit(0);

		}
	}

	public TransferData fetchData() {
		TransferData objS = new TransferData();
		try {
			String query = "Select * from filedata";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				objS.setData(rs.getString(4));
			}
			System.out.println("File Fetched");
		} catch (SQLException e) {
			System.out.println("File Not Fetched");
			System.exit(0);
		}
		return objS;
	}

	public void insertWord(String word, int freq) {
		try {

			String query = "Insert into word Values ("+null+",'" + word + "'," + freq + ")";

			PreparedStatement st = con.prepareStatement(query);
			st.execute();
		} catch (SQLException e) {
			
			System.out.println("Connection Error");

		}
	}
}
