/**
 * 
 */
package com.br.rn;
import java.util.ArrayList;

import com.br.dao.DaoUsuario;
import com.br.model.Usuarios;

/**
 * @author Christian
 *
 */
public class RnUsuario {
	public ArrayList<Usuarios> getUsuarios(boolean bringPassword) {
		return new DaoUsuario().listaUsuarios(bringPassword);
	}
}
