package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaDelete {
	public static void main(String[] args) throws SQLException {

			/*Connection con = new ConnectionFactory().recuperaConexion();
			
			Statement statement = con.createStatement();
			
			statement.execute("DELETE FROM PRODUCTO WHERE ID= 99");
			
			System.out.println(statement.getUpdateCount());*/
ConnectionFactory factory = new ConnectionFactory();
	    
		Connection con = factory.recuperaConexion();
	    
		Statement statement = con.createStatement();
	    
		statement.execute("UPDATE PRODUCTO SET "
	            + " NOMBRE = 'Cuchara'"
	            + " WHERE ID = 5");

	    System.out.println(statement.getUpdateCount());
		
	}
}
