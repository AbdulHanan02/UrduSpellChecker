package databaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import businessLayer.MutantGenerator;

/**
 * 
 * @author Sharif
 *
 */
public class MutantDataAccess {
	private Connection con = null;

	public MutantDataAccess() {//working for establishment of connection to Database server
		try {
			String userName = "root";
			String password = "";
			String url = "jdbc:MySQL://localhost:3306/urduspellchecker";
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection established");
		} catch (Exception ex) {
			System.err.println("Cannot connect to database server");
			ex.printStackTrace();
		}
	}
	public void genMutants() throws SQLException {
		List<String> mutants = new ArrayList<>();
		Statement st = null;
		String selectQuery = "Select word_id,word from word";
		ResultSet rs = null;

		MutantGenerator objS = new MutantGenerator();
		try {
			st = con.createStatement();
			rs = st.executeQuery(selectQuery);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				String word = rs.getString(2);
				mutants = objS.mutantList(word);
				for (String m : mutants) {
					Statement newst = con.createStatement();
					String insertQ = "insert into mutants values (" + rs.getString(1) + ",'" + m + "');";
					newst.executeUpdate(insertQ);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}