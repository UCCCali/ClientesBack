package co.edu.ucc.dao;

import java.util.ArrayList;
import java.util.List;

import co.edu.ucc.modelo.Cliente;

public class DAOCliente {

	private static List<Cliente> lstCliente = new ArrayList<>();	

	public void insertar(Cliente objCliente) {
		lstCliente.add(objCliente);
	}

	public List<Cliente> getTodos() {
		return lstCliente;
	}

}
