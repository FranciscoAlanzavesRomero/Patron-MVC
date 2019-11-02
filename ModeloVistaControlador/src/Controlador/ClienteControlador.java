package Controlador;

import Modelo.Cliente;
import Vista.ClienteVista;

public class ClienteControlador {
	//objetos vista y modelo
		private ClienteVista vista;
		private Cliente modelo;
	 
		//constructor para inicializar el modelo y la vista
		public ClienteControlador(ClienteVista vista, Cliente modelo) {
			super();
			this.vista = vista;
			this.modelo = modelo;
		}

		//getters y setters para el modelo
		public int getId() {
			return modelo.getId();
		}
		public void setId(int id) {
			this.modelo.setId(id);
		}
		public String getNombre() {
			return modelo.getNombre();
		}
		public void setNombre(String nombre) {
			this.modelo.setNombre(nombre); 
		}
		public String getApellido() {
			return modelo.getApellido();
		}
		public void setApellido(String apellido) {
			this.modelo.setApellido(apellido);
		}
		
		//pasa el modelo a la vista para presentar los datos
		public void actualizarVista() {
			vista.imprimirDatosCliente(modelo.getId(),modelo.getNombre(), modelo.getApellido());
		}
}
