
public class Docentes extends Empleados {

    public Docentes(String nombre, String codigoEmpleado, int edad, String direccion, String areaPertenece, String cargoDesempeña, double sueldoBase, String fechaIngreso) {

        super(nombre, codigoEmpleado, edad, direccion, areaPertenece, cargoDesempeña, sueldoBase, fechaIngreso);
    }

    public void mostrardatosDocente() {

        System.out.println(
                "================== Datos del Docente ==============="
                + "\nNombre de Docente: " + getNombre()
                + "\nCodigo de Docente: " + getCodigoEmpleado()
                + "\nEdad: " + getEdad()
                + "\nArea a la cual pertenece: " + getAreaPertenece()
                + "\nDirección: " + getDireccion()
                + "\nCargo que desempeña: " + getCargoDesempeña()
                + "\nSueldo Base: " + getSueldoBase()
                + "\nFecha de ingreso: " + getFechaIngreso()
                + "\n======================================================="
        );
    }
}
