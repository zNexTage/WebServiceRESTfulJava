/**
 * 
 */
package com.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.br.database.DatabaseFactory;
import com.br.model.Usuarios;

/**
 * @author Christian
 *
 */
public class DaoUsuario {
	private Connection conexao;

	public DaoUsuario() {
		conexao = DatabaseFactory.conectar();
	}

	public ArrayList<Usuarios> listaUsuarios(boolean bringPassword){
		StringBuilder sbComando;
		Usuarios usuario;
		PreparedStatement pstComando = null;
		ResultSet rsUsuarios = null;
		ArrayList<Usuarios> listUsuarios = null;		

		try {
			sbComando = new StringBuilder();

			if(bringPassword) {
				sbComando.append(" SELECT * FROM TBL_USUARIO ");
			}

			sbComando.append(" SELECT ID_USUARIO, LOGIN_USUARIO, PERFIL_USUARIO, EMAIL_USUARIO FROM TBL_USUARIO");

			pstComando = conexao.prepareStatement(sbComando.toString());
			
			rsUsuarios = pstComando.executeQuery();
			
			listUsuarios = new ArrayList<Usuarios>();
			
			while(rsUsuarios.next()) {
				usuario = new Usuarios();
				
				usuario.setId_Usuario(rsUsuarios.getInt("ID_USUARIO"));
				usuario.setEmail_Usuario(rsUsuarios.getString("EMAIL_USUARIO"));
				usuario.setLogin_Usuario(rsUsuarios.getString("LOGIN_USUARIO"));
				usuario.setPerfil_Usuario(rsUsuarios.getString("PERFIL_USUARIO"));
				if(bringPassword) {
					usuario.setSenha_Usuario(rsUsuarios.getString("SENHA_USUARIO"));
				}
				
				listUsuarios.add(usuario);
			}
		}
		catch(Exception err) {
			err.printStackTrace();
		}
		finally {
			DatabaseFactory.desconectar(conexao, pstComando, rsUsuarios);
		}
		
		return listUsuarios;
	}
}
