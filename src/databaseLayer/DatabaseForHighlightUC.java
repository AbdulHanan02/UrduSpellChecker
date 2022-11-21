package databaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class DatabaseForHighlightUC {
	Statement st;
	public void createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/urduspellchecker","root","");
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connection failed");
		}
	}
	public ArrayList<String> GetWordsListFromDB() {

		ArrayList<String> wordList = new ArrayList<String>();
		
		try {
			String sqlb = "select word as wList from word;";
			ResultSet Result = st.executeQuery(sqlb);

			while (Result.next()) {
				String oneWord = Result.getString("wList");
				wordList.add(oneWord);
			}
			return wordList;
		} catch (Exception e) {
			e.printStackTrace();
			return wordList;
		}

	}

}