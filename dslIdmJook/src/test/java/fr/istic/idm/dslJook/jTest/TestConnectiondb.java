package fr.istic.idm.dslJook.jTest;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.istic.idm.dslJook.main.Connectiondb;

public class TestConnectiondb {
	
	public TestConnectiondb() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetConnection() {
		Connection conn=Connectiondb.getConnection();
		assertNotNull(conn);
	}
	
	@Test
	public void testCloseConnection(){
        try {
        	
        	Connection conn=Connectiondb.getConnection();
        	assertTrue(!(conn.isClosed()));
        	
			Connectiondb.closeConnection();
			assertTrue(conn.isClosed());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
