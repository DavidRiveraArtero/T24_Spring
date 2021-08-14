package mainApp.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import mainApp.dto.Cliente;
public interface IClienteDAO extends JpaRepository<Cliente, Long>{
	
	//Listar clientes or campo nombre
	public List<Cliente> findByNombre(String nombre);
	public List<Cliente> findByTrabajo(String trabajo);
	public List<Cliente> findBySueldo(int sueldo);
	
	
	
}
