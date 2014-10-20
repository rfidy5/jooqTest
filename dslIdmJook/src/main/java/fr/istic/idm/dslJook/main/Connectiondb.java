package fr.istic.idm.dslJook.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * classe permettant de faire la connexion avec la base de donnees
 * @author fidy
 *
 */
public class Connectiondb {
	
	private static Connection _conn;

	private Connectiondb() {
	}
	
	/**
	 * recuperation instance de Connection en singleton
	 * @return instance de Connection
	 */
	public static synchronized Connection getConnection() {
//		Connection conn = null;

        String userName = "root";
        String password = "123456";
        String url = "jdbc:mysql://localhost:3306/jookTest_bdd";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            _conn = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
		return _conn;
	}
	
	/**
	 * permet de fermer la connexion si elle n'est pas nulle
	 */
	public static void closeConnection(){
		if (_conn != null) {
            try {
                _conn.close();
            } catch (SQLException ignore) {
            }
        }
	}
	
}
