package ndhieu.thesis.activiti.businessprocess.use.testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class JDBCConnection {
	final static String url = "jdbc:mysql://localhost:3306/activiti";
	final static String user = "root";
	final static String password = "Thanhcong2019";

	private static Connection connection = getJDBCConnection();

	// private String table = "act_hi_actinst";

	public static Connection getJDBCConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * private void showProcessInfo(ResultSet rs) { try { System.out .println(
	 * "Information about the instances of the visiting lecturer contract liquidation process:"
	 * ); System.out .println(
	 * "\tProcessDefinition_ID\t\t\tExecution_ID\t\tFlowObject_ID\t\t\tTask_ID\t\t\t\tTask_Name\t\t\t\tFlowObject_Type\t\t\tAssignee\t\t\tStart_Time\t\t\t\t  End_Time"
	 * ); while (rs.next()) { System.out
	 * .printf("%-50s %-20s %-30s %-20s %-53s %-31s %-20s %-40s %-30s \n",
	 * rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6),
	 * rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11),
	 * rs.getString(12)); } } catch (SQLException e) { } }
	 */

	/*
	 * private ResultSet getProcessInfo() { ResultSet rs = null; String
	 * sqlCommand = "select * from " + table; Statement st; try { st =
	 * connection.createStatement(); rs = st.executeQuery(sqlCommand); } catch
	 * (SQLException e) { System.out.println("Select error: \n" + e.toString());
	 * }
	 * 
	 * return rs; }
	 */

	/*
	 * private ResultSet getProcessInfoById(String EXECUTION_ID_) { ResultSet rs
	 * = null; String sqlCommand = "select * from " + table +
	 * " where `EXECUTION_ID_` = ?"; PreparedStatement pst = null; try { pst =
	 * connection.prepareStatement(sqlCommand); pst.setString(1, EXECUTION_ID_);
	 * rs = pst.executeQuery(); } catch (SQLException e) {
	 * System.out.println("Select error: \n" + e.toString()); }
	 * 
	 * return rs; }
	 */

	public static void main(String[] args) {
		if (connection != null) {
			System.out.println("Connect success!");
		} else {
			System.out.println("Connect error!");
		}

		// JDBCConnection JDBCConnection = new JDBCConnection();
		// JDBCConnection.showProcessInfo(JDBCConnection.getProcessInfoById("53626"));
	}
}
