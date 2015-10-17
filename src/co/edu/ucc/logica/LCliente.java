package co.edu.ucc.logica;

import java.util.List;

import co.edu.ucc.dao.DAOCliente;
import co.edu.ucc.modelo.Cliente;

public class LCliente {
	
	private DAOCliente objDAOCliente;
	
	public LCliente(){
		objDAOCliente = new DAOCliente();
	}
	
	public void insertar(String nombres, String apellidos, String email, String celular, String fechaNac) throws Exception{
		
		if (nombres.trim().equals("")) {
			throw new Exception("El nombre no es valido");			
		}
		
		if (apellidos.trim().equals("")) {
			throw new Exception("El nombre no es valido");			
		}
		
		if (email.trim().equals("")) {
			throw new Exception("El nombre no es valido");			
		}
		
		if (celular.trim().equals("")) {
			throw new Exception("El nombre no es valido");			
		}
		
		if (fechaNac.trim().equals("")) {
			throw new Exception("El nombre no es valido");			
		}
		
		
		Cliente objCliente = new Cliente();
		objCliente.setApellidos(apellidos);
		objCliente.setCelular(celular);
		objCliente.setEmail(email);
		objCliente.setFechaNacimiento(fechaNac);
		objCliente.setNombres(nombres);
				
		objDAOCliente.insertar(objCliente);
	}
	
	public List<Cliente> getTodos(){
		return objDAOCliente.getTodos();
	}

}
