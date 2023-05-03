package Metodos;

import javax.swing.JOptionPane;

public class Procesoss {
      String nombres[];
	 int validar = 0;
	  int edad[];
	  String cant[];
	public void iniciar() {
		System.out.println("hola iniciar");
		String menu="MENU ESTUDIANTES\n";
		menu+="1. Registrar\n";
		menu+="2. imprimir estudiantes y su edad\n";
		menu+="3. imprimir la mayor edad\n";
		menu+="4. imprimir mayores de edad\n";
		menu+="5. imprimir menores de edad\n";
		menu+="6. buscar por nombre\n";
		menu+="7. buscar por edades\n";
		menu+="8. imprimir promedio de edades de estudiantes\n";
		menu+="9. salir\n";
		menu+="  ingrese una opcion";
		
		int opc=0;
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
			validarOpcion(opc);
		} while (opc!=9);
	}
	
	
	public void validarOpcion (int opc) {
		switch (opc) {
		case 1: 
			validar = 1;
			  registrar ();
			
			break;
			
		case 2: 
			 if(nombres!= null) {
			   imprimir ();
			}else {
				System.out.println("No existe el codigo! ");
			}
			break;
			
		case 3: 
			if(nombres!= null) {
			   mayorEdad();
			}else {
				System.out.println("No existe el codigo! ");
			}
			break;
			
		case 4: 
			if(nombres!= null) {
			mayoresDeEdad();
			}else {
				System.out.println("No existe el codigo! ");
			}
			break;
		case 5: 
			if(nombres!= null) {
			menoresEdad();
			}else {
				System.out.println("No existe el codigo! ");
			}
			break;
		case 6: 
			if(nombres!= null) {
			buscarNombre();
			}else {
				System.out.println("No existe el codigo! ");
			}
			break;
		case 7: 
			if(nombres!= null) {
			 buscarEdad();
			}else {
				System.out.println("No existe el codigo! ");
			}
			break;
		case 8: 
			if(nombres!= null) {
			promedioEdades();
			}else {
				System.out.println("No existe el codigo! ");
			}
			break;
		
		case 9: 
			
			System.out.println("Chao!");
			
			break;

		default:System.out.println("No existe el codigo!");
			break; 
		}
	}
	
	public void registrar () {
		int cant = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de estudiantes a registrar"));
		
		nombres= new String[cant];
		edad= new int[cant];
		
		for (int i = 0; i < cant; i++) {
			nombres[i]=JOptionPane.showInputDialog("Ingrese el nombre");
			edad[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
		}
		System.out.println("Ingresa a registrar");
	}
	public void imprimir () {
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + " tiene "+ edad[i] + " anios ");
		}
		System.out.println("hola imprimir nombres y edades");
		
	}
	
	public void mayorEdad () {
		int mayor = edad[0];
		System.out.println( " la mayor edad en el grupo es");
		for (int i = 1; i < edad.length; i++) {
			if (edad[i] > mayor) {
				mayor = edad[i];
				
			}
		}System.out.println( mayor + " anios");

	}
	
	public void mayoresDeEdad ( ) {
		System.out.println( "los mayores de edad son ");
		for (int i = 0; i < nombres.length; i++) {
			if (edad[i] >= 18) {
				
				System.out.println( nombres[i] + " tiene "+ edad[i] + " anios ");
			}
	}
}
	public void menoresEdad () {
		System.out.println( "los menores de edad son ");
		for (int i = 0; i < nombres.length; i++) {
			if (edad[i] <= 17) {
				
				System.out.println( nombres[i] + " tiene "+ edad[i] + " anios ");
			}
			
		}
	}
	
	public void buscarNombre () {
		int cero = 0;
		String nombre1=JOptionPane.showInputDialog("Ingrese el nombre");
		 
        for (int i = 0; i < nombres.length; i++) {
   
        	if (nombres[i].equalsIgnoreCase(nombre1)) {
        		nombre1 = nombres[i];
        		cero ++;
				}
        
		}
        for (int i = 1; i < edad.length; i++) {
            if (cero >0) {
        	System.out.println(nombre1 + " anios " +  edad[i]);
		}else {
			System.out.println("no encontro el nombre: " + nombre1);
		}
      }
		
	}
	
	public void buscarEdad () {
		int edad2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del estudiante a buscar"));
		
		for (int i = 0; i < edad.length; i++) {
			
			if(edad[i]==edad2) {
				System.out.println("la edad es "+edad[i]+" del estudiante "+nombres[i]);
			}else {
				System.out.println("no se encontro la edad ingresada"+ edad[i]);
			}
		}

	}

	public void promedioEdades () {
		int suma = 0;
		int promedio = 0;
		int pro = 0;
	    for (int i = 0; i < pro; i++) {
	       suma += edad[i];
	    }
	    promedio = suma /pro;
	    System.out.println("El promedio de edades es: " + promedio);
	}
	
}

