package mainApp.Controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mainApp.dto.Cliente;
import mainApp.Service.ClienteServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class ClienteController {
	@Autowired
	ClienteServiceImpl clienteServideImpl;
	
	
	@GetMapping("/clientes")
	public List<Cliente> listarClientes(){
		return clienteServideImpl.listarClientes();
	}
		
		@Autowired
		private ClienteServiceImpl clienteServiceAPI;
		//LISTAR TRABAJADOR POR SUELDO
		@GetMapping("/clientes/sueldo/{sueldo}")
		public List<Cliente> listarClienteSueldo(@PathVariable(name="sueldo") int sueldo) {
			return clienteServideImpl.listarClienteSueldo(sueldo);
		}
		//listar TRABAJADOR por campo nombre
		@GetMapping("/clientes/nombre/{nombre}")
		public List<Cliente> listarClienteNombre(@PathVariable(name="nombre") String nombre) {
		    return clienteServideImpl.listarClienteNombre(nombre);
		}
		
		//Listar Trabajadores por campo trabajo	
		@GetMapping("/clientes/trabajo/{trabajo}")
		public List<Cliente> listarClienteTrabajo(@PathVariable(name="trabajo") String trabajo) {
		    return clienteServideImpl.listarClienteTrabajo(trabajo);
		}
		
		//AÑADIR CONTENIDO
		@PostMapping("/clientes")
		public Cliente salvarCliente(@RequestBody Cliente cliente) {
			
			return clienteServideImpl.guradarCliente(cliente);
		}
		
		//ACTUALIZAR CLIENTE
		@PutMapping("/clientes/Actualizar/{id}")
		public Cliente actualizarCliente(@PathVariable(name="id")Long id,@RequestBody Cliente cliente) {
			
			Cliente cliente_seleccionado= new Cliente();
			Cliente cliente_actualizado= new Cliente();
			
			cliente_seleccionado= clienteServideImpl.clienteXID(id);
			
			cliente_seleccionado.setId(cliente.getId());
			cliente_seleccionado.setNombre(cliente.getNombre());
			cliente_seleccionado.setTrabajo(cliente.getTrabajo());
			String Trabajo =  cliente.getTrabajo();
			switch (Trabajo) {
				case("Policia"):
					cliente_seleccionado.setSueldo(2000);
					break;
				case("Informatico"):
					cliente_seleccionado.setSueldo(1000);
					break;
				case("Medico"):
					cliente_seleccionado.setSueldo(2300);
					break;
				default:
					cliente_seleccionado.setSueldo(500);
				
			}
				
			
			cliente_actualizado = clienteServideImpl.actualizarCliente(cliente_seleccionado);
			
			System.out.println("El cliente actualizado es: "+ cliente_actualizado);
			
			return cliente_actualizado;
		}
		
		//ELIMINAR
		@DeleteMapping("/clientes/delete/{id}")
		public void eleiminarCliente(@PathVariable(name="id")Long id) {
			clienteServideImpl.eliminarCliente(id);
		}
		
		
		
		
}
