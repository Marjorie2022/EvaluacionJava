
public class Area {

    private String codigoArea;
    private String nombre;
    private int cantidadEmpleados;
    private int numeroEdificios;

    public Area(String codigoArea, String nombre, int cantidaEmpleados, int numeroEdificios) {
        this.codigoArea = codigoArea;
        this.nombre = nombre;
        this.cantidadEmpleados = cantidaEmpleados;
        this.numeroEdificios = numeroEdificios;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public int getNumeroEdificios() {
        return numeroEdificios;
    }

    public void mostrarArea() {
        System.out.println("\n==========DATOS CAPTURADOS DEL AREA==========");
        System.out.println("Codigo de Area: " + getCodigoArea());
        System.out.println("Nombre Area: " + getNombre());
        System.out.println("Cantidad de empleado: " + getCantidadEmpleados());
        System.out.println("Numero de edificios: " + getNumeroEdificios());
        System.out.println("\n=============================================");
    }

}
