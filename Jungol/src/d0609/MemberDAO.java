package d0609;

import java.sql.*;
import java.util.*;

public class MemberDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	String user = "C##himedia";
	String password = "himedia";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	
	public ArrayList<MemberVo> list(String id){
		ArrayList<MemberVo>list = new ArrayList<MemberVo>();
		try {
			connDB();
			
			String query = "SELECT * FROM member";
			if(id != null) {		
				query += " where id='" + id + "'";
			}
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());
			if(rs.getRow() == 0) {
				System.out.println("0 row selected.....");
			}else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();
				while(rs.next()) {
					String sh = rs.getString("id");
					String password = rs.getString("password");
					
					MemberVo data = new MemberVo(sh, password);
					list.add(data);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url,user,password);
			System.out.println("oracle connection success.");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}