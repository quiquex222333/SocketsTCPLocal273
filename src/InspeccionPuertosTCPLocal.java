
//Importacion de libreria de ecepciones en entrada y salida
import java.io.IOException;

//Importacion de libreria para el manejo de sockets
import java.net.Socket;

public class InspeccionPuertosTCPLocal {

	//metodo principal para la ejecucion
	public static void main(String[] args) {
		
		//creamos un bucle para recorrer todos los puertos en este caso hasta el 35534
		//y se los asigna a la variable temporal puerto
		for (int puerto = 0; puerto < 65535; puerto++) {
			
			//se crea un bloque try para posibles interrupciones
			try {
				
				//creamos un socket dandole localhost como nombre de host
				//y el puerto que varia gracias al bucle
				Socket socket = new Socket("localhost", puerto);
				
				//si el socket en localhost el puerto asignado esta ocupado por un servidor
				//entonces imprimimos el mensaje seguido del numero de puerto
				System.out.println("Hay un servidor en el puerto: "+puerto);
				socket.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
	}

}