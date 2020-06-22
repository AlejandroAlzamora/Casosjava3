import java.util.Scanner;

public class Caso10 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float sueldob=0, bonificacion=0, descuento=0,  sueldon=0, Palcanzado=0, sueldoa=0, sueldoe=100000000, minmayor=0;
		int i=0;
		int c=0;
		
		String continuar="S", empleado= "", nombrea= "", nombree="", nombreM="";
		
		while (continuar.equals("S") || continuar.equals("s")) {
			i++;
			System.out.println("==========================");
			System.out.println("Registro de Empleados (" + i +")");
			System.out.println("==========================");
			
			System.out.print("Empleado: ");
			empleado=sc.nextLine();
			
			System.out.print("Horas trabajadas: ");
			int ht=sc.nextInt();
			
			System.out.print("Tarifa por hora: ");
			float tarifa=sc.nextFloat();
			
			System.out.print("Minutos de tardanza: ");
			int min=sc.nextInt();
			
			sueldob=ht*tarifa;
			
			if (ht<=50) {
				bonificacion=0;
			} if (ht>50 && ht<=60) {
				bonificacion=sueldob*0.02f;
			} if (ht>60 && ht<=70) {
				bonificacion=sueldob*0.08f;
			} if (ht>70 && ht<=80) {
				bonificacion=sueldob*0.13f;	
			} if (ht>80) {
				bonificacion=sueldob*0.15f;
			}
		
			if (min<=15) {
				descuento=0;
			} if (min>15 && min<=30) {
				descuento=sueldob*(0.003f*min);
			} if (min>30) {
				descuento=sueldob*(0.005f*min);
			}
			
			sueldon=(sueldob+bonificacion)-descuento;
			
			Palcanzado=(100*ht)/80;
			
			System.out.print("**********");
			System.out.print("Resultados");
			System.out.println("**********");
			System.out.println("Sueldo bruto: " + sueldob);
			System.out.println("Bonificación: " + bonificacion);
			System.out.println("Descuento: " + descuento);
			System.out.println("Sueldo neto: " + sueldon);
			System.out.println("% Alcanzado: " + Palcanzado + "%");
			System.out.println("**********");
			
			
			if (sueldon>sueldoa) {
				sueldoa=sueldon;
				nombrea= empleado;
			}
			
			if (sueldon<sueldoe) {
				sueldoe=sueldon;
				nombree= empleado;
			
			}
			
			if (min>minmayor) {
				minmayor=min;
				nombreM= empleado;
			
			}
			 
			if(Palcanzado>90)
				 c++;
				
			sc.nextLine();
			
			System.out.println("¿Nuevo Empleado? [S/N]");
			continuar = sc.nextLine();
 		}
			
		System.out.println("=======");
		System.out.println("Resumen");
		System.out.println("=======");
		System.out.println("Numero de Empleados registrados: " + i);
		System.out.println("Sueldo neto mayor: " + sueldoa + " pertenece a: " + nombrea);
		System.out.println("Sueldo neto menor: " + sueldoe + " pertenece a: " + nombree);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza: " + nombreM + " (" + minmayor + ") min.");
		System.out.println("Cantidad de empleados con mas del 90% de la meta: " + c);
	}

}
