package br.com.restful.resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import br.com.restful.controler.UsuarioControler;


/**
 * Classe responsavel por conter os metodos rest de acesso ao webservice
 */



@Path("/usuario")
public class UsuarioResource {
	/**
	 *  Metodo responsavel por fazer chamada ao controler
	 * @return 
	 * @return Boolean usuario
	 */
	
	@GET
	@Path("/validarUsuario")
	@Produces("application/json")
//	@Produces("aplication/xml")
	
	//http://localhost:8080/RestFul/usuario/validarUsuario?param1=developer&param2=developer
	//http://localhost:8080/RestFul/usuario/validarUsuario?paramJsonUser={"usuario":{"dsLogin": "developer","dsSenha": "developer"}}
	
	
	public String validarUsuario(@Context UriInfo info){
		String result = "NOK";
		String json = info.getQueryParameters().getFirst("paramJsonUser");
		try{
			if(json != null && json.length()>0){
				return		UsuarioControler.validaUsuario(json);
			}
		}catch(Exception e){
			e.getMessage().toString();
		}
	
		return result;
	}
}
