/*Calcular el salario de un trabajador en base a los siguientes criterios.
a) Se debe pedir por teclado el número de horas trabajadas en el mes (HT) y el pago por hora (PH). Trabajar con número
reales para ambos casos.
Evaluar las horas trabajas según lo siguiente:
b) Si las horas trabajadas son menores o iguales a 40, se considera que el empleado no ha realizado horas
extras en el mes.
c) Si las horas trabajadas son mayores a 40 y menores o iguales a 48, se considera que el empleado ha
realizado horas extras que se le pagan al doble del pago de una hora normal. Haciendo para este caso un total
de 8 horas pagadas como máximo al doble.
d) Si las horas trabajadas exceden de 48, se considera que el empleado ha realizado horas extras que se le
pagan al doble y al triple del pago de una hora normal, Haciendo un total de 8 horas extras pagadas al doble y
las que excedan de 8 se pagan al triple del pago de una hora normal
e) Se debe aplicar el descuento de la retención (RENTA) del 10% al salario bruto.
f) Se debe imprimir en pantalla el nombre del empleado, salario bruto (sin renta), salario líquido (con renta) y
finalmente el monto de la retención aplicada.*/
package salario;

import java.util.Scanner;

public class Salario {
    double ht,ph,HEdobles,HEtriples,SalBruto,SalLiquido,Retencion;
    String nombre;
    public void PedirDatos(){
        Scanner datos =new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        nombre=datos.nextLine();
        System.out.print("Ingrese las horas trabajadas: ");
        ht=datos.nextDouble();
        System.out.print("Ingrese el pago por horas: ");
        ph=datos.nextDouble();
    }
    public void evaluacion(){
        if (ht<=40){
            System.out.println(" ");
            System.out.println(":::::::::(Sin Horas extras)::::::");
            HEdobles=0;
            HEtriples=0;
            SalBruto=ht*ph;
            Retencion=SalBruto*0.10;
            SalLiquido=SalBruto-Retencion;
        }else if(ht>40 && ht>48 ){
            System.out.println(" ");
            System.out.println(":::::::::(Horas exceden de 48)::::::");
            HEdobles=8;
            HEtriples=ht-8;
            SalBruto=(ht+(HEdobles*2)+(HEtriples*3))*ph;
            Retencion=SalBruto*0.10;
            SalLiquido=SalBruto-Retencion;
        }else {
            System.out.println("El empleado a realizado horas extras");
            HEdobles= ht-40;
            SalLiquido=(40*ph)+(HEdobles*2*ph);
            Retencion =SalLiquido*0.10;
            SalLiquido = SalBruto + Retencion;
            System.out.println(" ");
            System.out.println("::::::(Mayores de 40 y menores a 48)::::::::");
            HEdobles=8;
            HEtriples=0;
            SalBruto=(ht+(HEdobles*2))*ph;
            Retencion=SalBruto*0.10;
            SalLiquido=SalBruto-Retencion;
        }
        }
    public void imprimir(){
        System.out.println(":::::::::::: MOSTRANDO DATOS:::::::::::");
        System.out.println("Empleado: "+nombre);
        System.out.println("Salario Bruto: "+SalBruto);
        System.out.println("Salario Liquido: "+SalLiquido);
        System.out.println("Retención Aplicada: "+Retencion);
    }
    
    public static void main(String[] args) {
        Salario empleado1=new Salario();
        empleado1.PedirDatos();
        empleado1.evaluacion();
        empleado1.imprimir();
        
        
        
    }
    
}
