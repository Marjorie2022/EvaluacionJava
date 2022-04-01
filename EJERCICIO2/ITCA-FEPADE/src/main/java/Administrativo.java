
public class Administrativo extends Empleados {

    public Administrativo(String nombre, String codigoEmpleado, int edad, String direccion, String areaPertenece, String cargoDesempeña, double sueldoBase, String fechaIngreso) {

        super(nombre, codigoEmpleado, edad, direccion, areaPertenece, cargoDesempeña, sueldoBase, fechaIngreso);

    }

    public void mostrardatosAdministrativo() {
        System.out.println(
                "==============Datos Administrativos Capturados=============="
                + "\nNombre de Administrador: " + getNombre()
                + "\nCodigo de Administrador: " + getCodigoEmpleado()
                + "\nEdad: " + getEdad()
                + "\nArea a la cual pertenece: " + getAreaPertenece()
                + "\nDirección: " + getDireccion()
                + "\nCargo que desempeña: " + getCargoDesempeña()
                + "\nSueldo Base: " + getSueldoBase()
                + "\nFecha de ingreso: " + getFechaIngreso()
                + "\n=========================================================="
        );
    }
}
