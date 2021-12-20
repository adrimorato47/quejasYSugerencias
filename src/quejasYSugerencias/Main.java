package quejasYSugerencias;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		ConnectionJDBC conn = new ConnectionJDBC();
		Select s = new Select();
		Insert i = new Insert();
		Delete d = new Delete();
		
		conn.ConnectionJDBC();
		
		System.out.println("Qué quieres hacer?");
		System.out.println("1. Ver datos de la tabla");
		System.out.println("2. Añadir datos");
		System.out.println("3. Eliminar datos");
		System.out.println("4. Salir");
		
		int opcion = sc.nextInt();
		
		String campouno="", campodos ="", campotres ="", campocuatro="", campocinco="", camposeis="", 
				camposiete="", campoocho="", camponueve="", campodiez="", campoonce="", campodoce="";	
		
		switch (opcion) {
			case 1: s.Consulta(); break;
			case 2: i.insertar(campouno, campodos, campotres, campocuatro, campocinco, camposeis, camposiete,
					campoocho, camponueve, campodiez, campoonce, campodoce); break;
			case 3: int id = d.numero();
					d.eliminar(id); 
					break;
			case 4: break;
		}	*/
		
		VentanaPrincipal vp = new VentanaPrincipal();
		vp.setVisible(true);
	}
}
