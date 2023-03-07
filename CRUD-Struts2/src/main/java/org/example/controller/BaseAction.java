/*
 * Classe Base apra todas as Actions. 
 * 
 * Possue sistema de persistencia para as actions compartilharem objetos entre sis
 * e manter persistencia de informacoes sem ser no banco de dados.
 * 
*/
package org.example.controller;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import org.example.services.AppPersist;

import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseAction extends ActionSupport implements SessionAware{

	/**
	 *  Serializada
	 */
	private static final long serialVersionUID = 1L;

	static { // LOAD BLOCK
		System.out.println("\n\n\n\n PersistClass Loaded");
		persist = new AppPersist();	
	} // LOAD BLOCK 

	private static AppPersist persist;
	private SessionMap<String,Object> sessionMap;

	public static AppPersist getPersist() {
		return persist;
	}
	
	
	/* Methodo que todas as classes Actions irao ter para pegar sessao
	*/
	@Override
	public void setSession(Map<String, Object> session) {
	    sessionMap = (SessionMap) session; 
	}
	
	public SessionMap getSessionMap(){
		return this.sessionMap;
	}


}
