package mainApp.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IClienteDAO;
import mainApp.dto.Cliente;

@Service
public class ClienteServiceImpl{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IClienteDAO iClienteDAO;
	

	public List<Cliente> listarClientes(){
		return iClienteDAO.findAll();
	}
	
	public Cliente guradarCliente(Cliente cliente) {
		return iClienteDAO.save(cliente);
	}
	
	public Cliente clienteXID(Long id) {
		return iClienteDAO.findById(id).get();
	}
	
	public Cliente actualizarCliente(Cliente cliente) {
		return iClienteDAO.save(cliente);
	}
	
	public void eliminarCliente(long id) {
		iClienteDAO.deleteById(id);
	}
	
	public List<Cliente> listarClienteNombre(String nombre){
		return iClienteDAO.findByNombre(nombre);
	}
	
	public List<Cliente> listarClienteTrabajo(String trabajo){
		return iClienteDAO.findByTrabajo(trabajo);
	}
	
	public List<Cliente> listarClienteSueldo(int sueldo){
		return iClienteDAO.findBySueldo(sueldo);
	}
	
	
	
	
}
