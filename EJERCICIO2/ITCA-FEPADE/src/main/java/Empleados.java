
public class Empleados {

    //Atributos    
    private String nombre;
    private String codigoEmpleado;
    private int edad;
    private String direccion;
    private String areaPertenece;
    private String cargoDesempeña;
    private double sueldoBase;
    private String fechaIngreso;

    //Constructor
    public Empleados(String nombre, String codigoEmpleado, int edad, String direccion, String areaPertenece, String cargoDesempeña, double sueldoBase, String fechaIngreso) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.edad = edad;
        this.direccion = direccion;
        this.areaPertenece = areaPertenece;
        this.cargoDesempeña = cargoDesempeña;
        this.sueldoBase = sueldoBase;
        this.fechaIngreso = fechaIngreso;
    }

    //Metodo get
    public String getNombre() {
        return nombre;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getAreaPertenece() {
        return areaPertenece;
    }

    public String getCargoDesempeña() {
        return cargoDesempeña;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

}
