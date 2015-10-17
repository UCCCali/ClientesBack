package co.edu.ucc.endpoints;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;

import co.edu.ucc.logica.LCliente;
import co.edu.ucc.modelo.Cliente;

import com.google.api.server.spi.config.ApiNamespace;

@Api(name = "clienteendpoint", namespace = @ApiNamespace(ownerDomain = "co.edu", ownerName = "ucc", packagePath = "ucc.endpoints") , version = "1")
public class ClienteEndpoint {

	@ApiMethod(name = "insertar", path = "insertar", httpMethod = HttpMethod.POST)
	public void insertar(Cliente cliente) throws Exception {
		
		try {
			
			LCliente objLCliente = new LCliente();
			objLCliente.insertar(cliente.getNombres(), cliente.getApellidos(), cliente.getEmail(), cliente.getCelular(),
					cliente.getFechaNacimiento());			
			
		} catch (Exception e) {
			throw e;
		}

	}

	
	@ApiMethod(name = "gettodos", path = "gettodos", httpMethod = HttpMethod.GET)
	public List<Cliente> getTodos() throws Exception {
		
		try {
			
			LCliente objLCliente = new LCliente();
			return objLCliente.getTodos();			
			
		} catch (Exception e) {
			throw e;
		}

	}

	
}
