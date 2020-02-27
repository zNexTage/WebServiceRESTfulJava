/**
 * 
 */
package com.br.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Christian
 *
 */
public class DatabaseFactory {	
	private Connection conexao;
	
	public static Connection conectar() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=chriskywalker19;databaseName=DB_JAVA_WEB_SERVICE");
		}
		catch(Exception err) {
			err.printStackTrace();
		}
		
		return null;
	}
	
	public static void desconectar(Connection conexao) {
		try {
			if(!conexao.isClosed()) {
				conexao.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void desconectar(Connection conexao, PreparedStatement pstComando) {
		try {
			if(!pstComando.isClosed()) {
				pstComando.close();
			}
			
			desconectar(conexao);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void desconectar(Connection conexao, PreparedStatement pstComando, ResultSet rsValores) {
		try {
			if(!rsValores.isClosed()) {
				rsValores.close();
			}
			
			desconectar(conexao, pstComando);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
