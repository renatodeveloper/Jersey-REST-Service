package br.com.restful.controler;

import java.util.ArrayList;

import br.com.restful.dao.ClienteDao;
import br.com.restful.model.Cliente;

public class ClienteControler {
	/*
	 * Metodo responsavel por ser o controlador entre o resource e a camada dao
	 */
	public static ArrayList<Cliente> listarTodos(){
		return ClienteDao.getInstance().listarTodos();
	}
}
