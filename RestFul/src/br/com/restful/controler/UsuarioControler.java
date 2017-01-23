package br.com.restful.controler;

import br.com.restful.dao.UsuarioDao;

public class UsuarioControler {
	/*
	 * Metodo responsavel por ser o controlador entre o resource e a camada dao
	 */
	public static String validaUsuario(String json){
		return UsuarioDao.getInstance().validaUsuario(json);
	}
}