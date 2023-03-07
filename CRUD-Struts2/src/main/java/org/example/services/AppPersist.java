/* 
 * Classe que representa persistencia para as Actions. novas implementacoes podem 
 * ser adicionadas aqui para as Actions compartilharem entre sis uma persistencia
 * que nao fica em banco de dados mas sim em tempo de execucao no jboss
*/
package org.example.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AppPersist {
	
	private List list = new ArrayList();
	
	/* Pega list
	 * @return List
	*/	
	public List getList() {
		return list;
	}

	
	

}
