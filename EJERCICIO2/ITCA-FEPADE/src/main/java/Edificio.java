public class Edificio {
    private String ubicacion;
    private String nombreEdificio;
    private int cantidadDepertamento;
    private int piso;

    public Edificio(String ubicacion, String nombreEdificio, int cantidadDepertamento, int piso) {
        this.ubicacion = ubicacion;
        this.nombreEdificio = nombreEdificio;
        this.cantidadDepertamento = cantidadDepertamento;
        this.piso = piso;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public int getCantidadDepertamento() {
        return cantidadDepertamento;
    }

    public int getPiso() {
        return piso;
    }
    
    public void mostrarDatosEdificio(){
        System.out.println("\n==========DATOS CAPTURADOS DEL EDIFICIOS==========");
        System.out.println("Ubicación: " + getUbicacion());
        System.out.println("Nombre de edificio: " + getNombreEdificio());
        System.out.println("Cantidad de departamento: " + getCantidadDepertamento());
        System.out.println("Cantidad de pisos: " + getPiso());
        System.out.println("\n==================================================");
    }
}