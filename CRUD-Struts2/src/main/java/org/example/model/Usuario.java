///*
// * Representacao de Usuario para o Hibernate
// *
//*/
//package org.example.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//
//import org.hibernate.annotations.GenericGenerator;
//
//@Entity
//public class Usuario {
//
//	@GenericGenerator(name="gen",strategy="increment")
//	@GeneratedValue(generator="gen")
//	@Column(name = "id", unique = true, nullable = false, precision = 15, scale = 0)
//	@Id
//	private int id;
//
//	private String login;
//
//	private String nome;
//
//	private String senha;
//
//
//
//	public String getSenha() {
//		return senha;
//	}
//
//	public void setSenha(String senha) {
//		this.senha = senha;
//	}
//
//	public String getLogin() {
//		return login;
//	}
//
//	public void setLogin(String login) {
//		this.login = login;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//
//
//}
