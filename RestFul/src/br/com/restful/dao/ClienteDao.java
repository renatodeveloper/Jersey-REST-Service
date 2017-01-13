package br.com.restful.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.restful.factory.ConnectionFactory;
import br.com.restful.model.Cliente;
/**
 * Classe responsavel por conter os metodos de consulta, altera��o e exclus�o (CRUD)
 * @author renato
 *
 */
public class ClienteDao extends ConnectionFactory{
private static ClienteDao instance;
	
	
	/*
	 * Metodo responsavel por criar uma instancia da classe clienteDao
	 */
	public static ClienteDao getInstance(){
		if(instance == null){
			instance = new ClienteDao();
			return instance;
		}
		return instance;
	}
	
	/**
	 * Metodo responsavel por listar todos os clientes
	 * @return clientes
	 */
	public ArrayList<Cliente> listarTodos(){
		Connection conn = null;
		conn = criarConexao();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Cliente> clientes = null;
		
		clientes = new ArrayList<Cliente>();
		try{
			pstmt = conn.prepareStatement("SELECT * FROM CLIENTE");
			rs = pstmt.executeQuery();
			while(rs.next()){
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setEndereco(rs.getString("endereco"));
				clientes.add(cliente);
				System.out.print("\n Nome:" + cliente.getNome().toString() + "\n");
			}
			
		}catch(Exception e){
			System.out.print("Erro ao listar os cliente" );
			e.printStackTrace();
		}finally{
			fecharConnexao(conn, pstmt, rs);
		}
		
		return clientes;
	}
}
