
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main obje = new Main();

        Scanner leer = new Scanner(System.in);

        try {

            System.out.println("Digite 'D'(si es Docente) o 'A'(si es Administrativo)");
            String empleado = leer.nextLine();

            if ("D".equals(empleado)) {
                System.out.println("Si usted es Docente permanente digite 'P' ó digite 'S' si es docente por servicio");
                String tipo = leer.nextLine();
                if ("P".equals(tipo)) {
                    // recibe datos del docente
                    System.out.println("\n==============DATOS DOCENTE PERMANENTE==============");
                    System.out.println("Ingrese nombre del Docente:");
                    String nombre = leer.nextLine();

                    System.out.println("Ingrese código de Docente:");
                    String codigo = leer.nextLine();

                    System.out.println("Ingrese la edad:");
                    int edad = Integer.parseInt(leer.nextLine());

                    System.out.println("Ingrese dirección:");
                    String direccion = leer.nextLine();

                    System.out.println("Ingrese área a la que pertenece:");
                    String areaPertenece = leer.nextLine();

                    System.out.println("Ingrese cargo que desempeña en el área:");
                    String cargo = leer.nextLine();

                    System.out.println("Ingrese el sueldo base:");
                    double sueldo = Double.parseDouble(leer.nextLine());

                    System.out.println("Ingrese fecha de ingreso");
                    String fecha = leer.nextLine();

                    // recibe datos del área
                    System.out.println("==============Digite Datos del Área==============");
                    System.out.println("Ingrese codigo de area");
                    String codigoArea = leer.nextLine();

                    System.out.println("Ingrese nombre de area");
                    String nombreArea = leer.nextLine();

                    System.out.println("Ingrese la cantidad de empleados que tiene dicha area");
                    int cantidadEmpleado = Integer.parseInt(leer.nextLine());

                    System.out.println("Ingrese numero de edificios");
                    int numeroEdificios = Integer.parseInt(leer.nextLine());

                    // recibe datos del edificio
                    System.out.println("==============Digite Datos del Edificio==============");
                    System.out.println("Ingrese la ubicacion del edificio");
                    String ubicacacionEdificio = leer.nextLine();

                    System.out.println("Ingrese nombre del edificio");
                    String nombreEdificio = leer.nextLine();

                    System.out.println("Ingrese la cantidad de departamentos");
                    int cantidadDepartamento = Integer.parseInt(leer.nextLine());

                    System.out.println("Ingrese la cantidad de pisos");
                    int cantidadPisos = Integer.parseInt(leer.nextLine());

                    Docentes obj = new Docentes(nombre, codigo, edad, direccion, areaPertenece, cargo, sueldo, fecha);
                    obj.mostrardatosDocente();

                    Area area = new Area(codigoArea, nombreArea, cantidadEmpleado, numeroEdificios);
                    area.mostrarArea();

                    Edificio edificios = new Edificio(ubicacacionEdificio, nombreEdificio, cantidadDepartamento, cantidadPisos);
                    edificios.mostrarDatosEdificio();

                    CalculoDescuentos des = new CalculoDescuentos(sueldo);
                    des.calcularDescuentos();

                } else if ("S".equals(tipo)) {

                    System.out.println("\n===========DATOS DOCENTE POR SERVICIO===========");
                    System.out.println("Ingrese nombre del Docente");
                    String nombre = leer.nextLine();

                    System.out.println("Ingrese codigo de Docente: ");
                    String codigo = leer.nextLine();

                    System.out.println("Ingrese edad: ");
                    int edad = Integer.parseInt(leer.nextLine());

                    System.out.println("Ingrese direccion");
                    String direccion = leer.nextLine();

                    System.out.println("Ingrese área a la que pertenece");
                    String areaPertenece = leer.nextLine();

                    System.out.println("Ingrese cargo que desempeña en el área");
                    String cargo = leer.nextLine();

                    System.out.println("Sueldo base");
                    double sueldo = Double.parseDouble(leer.nextLine());

                    System.out.println("Ingrese fecha de ingreso");
                    String fecha = leer.nextLine();

                    //  recibe datos del área
                    System.out.println("==============Digite Datos del Área==============");
                    System.out.println("Ingrese codigo de area");
                    String codigoArea = leer.nextLine();

                    System.out.println("Ingrese nombre de area");
                    String nombreArea = leer.nextLine();

                    System.out.println("Ingrese la cantidad de empleados que tiene dicha area");
                    int cantidadEmpleado = Integer.parseInt(leer.nextLine());

                    System.out.println("Ingrese numero de edificios");
                    int numeroEdificios = Integer.parseInt(leer.nextLine());

                    // recibe datos del edificio
                    System.out.println("==============Digite Datos del Edificio==============");
                    System.out.println("Ingrese la ubicacion del edificio");
                    String ubicacacionEdificio = leer.nextLine();

                    System.out.println("Ingrese nombre del edificio");
                    String nombreEdificio = leer.nextLine();

                    System.out.println("Ingrese la cantidad de departamentos");
                    int cantidadDepartamento = Integer.parseInt(leer.nextLine());

                    System.out.println("Ingrese la cantidad de pisos");
                    int cantidadPisos = Integer.parseInt(leer.nextLine());

                    Docentes obj = new Docentes(nombre, codigo, edad, direccion, areaPertenece, cargo, sueldo, fecha);
                    obj.mostrardatosDocente();

                    Area area = new Area(codigoArea, nombreArea, cantidadEmpleado, numeroEdificios);
                    area.mostrarArea();

                    Edificio edificios = new Edificio(ubicacacionEdificio, nombreEdificio, cantidadDepartamento, cantidadPisos);
                    edificios.mostrarDatosEdificio();

                    CalculoDescuentos des = new CalculoDescuentos(sueldo);
                    des.calcularRENTA();

                }

            } else if ("A".equals(empleado)) {

                System.out.println("\n============DATOS ADMINISTRATIVOS============");
                System.out.println("Ingrese nombre: ");
                String nombre = leer.nextLine();

                System.out.println("Ingrese codigo: ");
                String codigo = leer.nextLine();

                System.out.println("Ingrese edad: ");
                int edad = Integer.parseInt(leer.nextLine());

                System.out.println("Ingrese direccion");
                String direccion = leer.nextLine();

                System.out.println("Ingrese área a la que pertenece");
                String areaPertenece = leer.nextLine();

                System.out.println("Ingrese cargo que desempeña en el área");
                String cargo = leer.nextLine();

                System.out.println("Sueldo base");
                double sueldo = Double.parseDouble(leer.nextLine());

                System.out.println("Ingrese fecha de ingreso");
                String fecha = leer.nextLine();

                //  recibe datos del area
                System.out.println("==============Digite Datos del Área==============");
                System.out.println("Ingrese codigo de area");
                String codigoArea = leer.nextLine();

                System.out.println("Ingrese nombre de area");
                String nombreArea = leer.nextLine();

                System.out.println("Ingrese la cantidad de empleados que tiene dicha area");
                int cantidadEmpleado = Integer.parseInt(leer.nextLine());

                System.out.println("Ingrese numero de edificios");
                int numeroEdificios = Integer.parseInt(leer.nextLine());

                // recibe datos del edificio
                System.out.println("==============Digite Datos del Edificio==============");
                System.out.println("Ingrese la ubicacion del edificio");
                String ubicacacionEdificio = leer.nextLine();

                System.out.println("Ingrese nombre del edificio");
                String nombreEdificio = leer.nextLine();

                System.out.println("Ingrese la cantidad de departamentos");
                int cantidadDepartamento = Integer.parseInt(leer.nextLine());

                System.out.println("Ingrese la cantidad de pisos");
                int cantidadPisos = Integer.parseInt(leer.nextLine());

                Administrativo obj = new Administrativo(nombre, codigo, edad, direccion, areaPertenece, cargo, sueldo, fecha);
                obj.mostrardatosAdministrativo();

                Area area = new Area(codigoArea, nombreArea, cantidadEmpleado, numeroEdificios);
                area.mostrarArea();

                Edificio edificios = new Edificio(ubicacacionEdificio, nombreEdificio, cantidadDepartamento, cantidadPisos);
                edificios.mostrarDatosEdificio();

                CalculoDescuentos des = new CalculoDescuentos(sueldo);
                des.calcularDescuentos();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
