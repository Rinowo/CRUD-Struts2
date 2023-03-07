//package org.example.controller;
//
//import org.example.model.Usuario;
//import org.example.services.ControleUsuario;
//import org.example.exceptions.UsuarioNAutorizado;
//
//public class LoginAction extends BaseAction{
//
//	private String login;
//
//	private String senha;
//
//
//	public String getLogin() {
//		return login;
//	}
//
//	public void setLogin(String login) {
//		this.login = login;
//	}
//
//	public String getSenha() {
//		return senha;
//	}
//
//	public void setSenha(String senha) {
//		this.senha = senha;
//	}
//
//	public String login(){
//		Usuario usuario = new Usuario(); // cria novo usuario
//
//
//		usuario.setLogin(getLogin()); // seta login
//		usuario.setSenha(getSenha()); // seta senha
//		try {
//			ControleUsuario.autenticaUsuario(usuario); // tenta autenticar
//			getSessionMap().put("Usuario", usuario); // constroi sessao
//		} catch (UsuarioNAutorizado e) {
//			addActionError("Usuario Não Autorizado");
//			return "negado";
//		}
//		return "autorizado";
//	}
//
//
//}
