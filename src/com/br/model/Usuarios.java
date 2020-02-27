package com.br.model;

public class Usuarios {
	private int id_Usuario;
	private String login_Usuario;
	private String senha_Usuario;
	private String perfil_Usuario;
	private String email_Usuario;
	
	/*GETTERS AND SETTER*/
	/**
	 * @return the id_Usuario
	 */
	public int getId_Usuario() {
		return id_Usuario;
	}
	/**
	 * @param id_Usuario the id_Usuario to set
	 */
	public void setId_Usuario(int id_Usuario) {
		this.id_Usuario = id_Usuario;
	}
	/**
	 * @return the login_Usuario
	 */
	public String getLogin_Usuario() {
		return login_Usuario;
	}
	/**
	 * @param login_Usuario the login_Usuario to set
	 */
	public void setLogin_Usuario(String login_Usuario) {
		this.login_Usuario = login_Usuario;
	}
	/**
	 * @return the senha_Usuario
	 */
	public String getSenha_Usuario() {
		return senha_Usuario;
	}
	/**
	 * @param senha_Usuario the senha_Usuario to set
	 */
	public void setSenha_Usuario(String senha_Usuario) {
		this.senha_Usuario = senha_Usuario;
	}
	/**
	 * @return the perfil_Usuario
	 */
	public String getPerfil_Usuario() {
		return perfil_Usuario;
	}
	/**
	 * @param perfil_Usuario the perfil_Usuario to set
	 */
	public void setPerfil_Usuario(String perfil_Usuario) {
		this.perfil_Usuario = perfil_Usuario;
	}
	/**
	 * @return the email_Usuario
	 */
	public String getEmail_Usuario() {
		return email_Usuario;
	}
	/**
	 * @param email_Usuario the email_Usuario to set
	 */
	public void setEmail_Usuario(String email_Usuario) {
		this.email_Usuario = email_Usuario;
	}
}
