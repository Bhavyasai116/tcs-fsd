package com.tcs.patterns;

public class Connection {
	private static Connection con=null;
	private Connection() {
	}
	public static Connection getConnection() {
		if(con==null)
			con=new Connection();
//		else
//			return con;
		return con;
	}

}
