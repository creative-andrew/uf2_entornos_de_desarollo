/*
 * 
 */
package practica1;
import java.util.Scanner;


/**
 * Calcula el promedio de las notas de 3 UFs y si se está aprobado o suspendindo.
 * 
 *  @author  Carlos Valles Ribes
 *  @version 2022.10.04
 */
public class notas {
	
	/** Variables que representan cada UF.  */
	double uf1, uf2, uf3;
	
	/** Variables de acomulación */
	double acu1, acu2, acu3, def;
	
	/** Scanner para poder introducir los datos */
	Scanner entrada = new Scanner(System.in);
	 
	
	/**
	 * Pregunta las notas para cada UF usando el scanner.
	 * 
	 */
	public void IngresaNotas() {
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}

	
	/**
	 * Metodo para comprobar bien entroduccion de notas.
	 * 
	 */
	public void comprobarcion(){
		
		if (uf1>10) {
			System.out.println(" Nota1 mal introducida");
			
		}else {
			System.out.println(" Nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" Nota2 mal introducida");
			
		}else {
			System.out.println(" Nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" Nota3 mal introducida");
			
		}else {
			System.out.println(" Nota3 correcta");
		}
		
			
		
		
	}
	// 
	
	/**
	 * Metodo para calcular nota
	 * 
	 */
	public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
	}
	
	/**
	 * Imprime las notas en pantalla.
	 * 
	 */
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}

	/**
	 * Muestra si se está aprobado o suspendido.
	 * 
	 */
	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
		
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}