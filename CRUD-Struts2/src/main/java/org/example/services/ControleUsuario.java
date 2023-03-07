///*
// * Classe responsavel por implementar regras de negocios de manejamento de usuarios
// * usando os insumos (criados na package util)
//*/
//package org.example.services;
//
//import org.example.exceptions.UsuarioNAutorizado;
//import org.example.model.Usuario;
//import org.example.util.SQLAutentica;
//
//public class ControleUsuario{
//
//	 /* Autenticacao de usuarios
//	 */
//	public static void autenticaUsuario(Usuario usuario) throws UsuarioNAutorizado {
//		if (!SQLAutentica.doAutentica(usuario)) throw new UsuarioNAutorizado();
//	}
//
//
//}
//
