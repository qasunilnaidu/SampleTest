package java_examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCheck {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");
		Connection c = DriverManager.getConnection("jdbc:postgresql://10.247.187.37:5432/sow4stgcov", "readonly", "readonly");
		System.out.println("Connection Established");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("select * from dlicense where dl_insert_date='2019-02-21' and dl_rtocode='CG18';");
		System.out.println("statement created");
		while (rs.next()) {
			String s = rs.getString("dl_applno");
			System.out.println(s);
//			if (s.contentEquals("")) {
//				System.out.println("User value & Database value both are MATCHES.");
//			} else {
//
//				System.out.println("User value & Database value both are NOT MATCHES Please check again.");
//
//			}

		}
	}
}
