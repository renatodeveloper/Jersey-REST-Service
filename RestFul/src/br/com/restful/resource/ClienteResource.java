package br.com.restful.resource;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.restful.controler.ClienteControler;
import br.com.restful.model.Cliente;

/**
 * Classe responsavel por conter os metodos rest de acesso ao webservice
 */

/*
 *  ** tomcat7  **
 * http://localhost:8080/RestFul/cliente/listarTodos
 * 
 * retorno:
 * 
 * {"cliente":[{"cpf":"0779695875","endereco":"Rua do sucesso","id":"1","nome":"Renato"},{"cpf":"0121095875","endereco":"Rua do amor","id":"2","nome":"Alice"}]}
 * 
 */

//21:26 anotacao pelo jar= > javax.ws.rs.jar

@Path("/cliente")
public class ClienteResource {
	/**
	 *  Metodo responsavel por fazer chamada ao controler
	 * @return ArrayList cliente
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
//	@Produces("aplication/xml")
	public ArrayList<Cliente> listarProdutos(){
		return ClienteControler.listarTodos();
	}
}
