package vehiculos;
import java.util.HashMap;
import java.util.Map;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private double precio;
    private double peso;
    private String traccion;
    private Fabricante fabricante;
    
    private static int cantidadVehiculos = 0;
    private static int cantidadAutomoviles = 0;
    private static int cantidadCamionetas = 0;
    private static int cantidadCamiones = 0;

    private static Map<String, Integer> ventasPorPais = new HashMap<>();
    private static Map<String, Integer> ventasPorFabricante = new HashMap<>();

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso,
                    String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        cantidadVehiculos++;
        
        // Registrar ventas
        ventasPorPais.put(fabricante.getPais().getNombre(),
                ventasPorPais.getOrDefault(fabricante.getPais().getNombre(), 0) + 1);
        
        ventasPorFabricante.put(fabricante.getNombre(),
                ventasPorFabricante.getOrDefault(fabricante.getNombre(), 0) + 1);
    }

    public static String vehiculosPorTipo() {
        return "Automoviles: " + cantidadAutomoviles + "\n" +
               "Camionetas: " + cantidadCamionetas + "\n" +
               "Camiones: " + cantidadCamiones;
    }

     protected static void incrementarAutomoviles() {
        cantidadAutomoviles++; // Control de acceso mediante metodo
     }

     protected static void incrementarCamiones() {
        cantidadCamiones++; // Control de acceso mediante metodo
     }

     protected static void incrementarCamionetas() {
        cantidadCamionetas++; // Control de acceso mediante metodo
     }

     public static int getCantidadAutomoviles() {
        return cantidadAutomoviles;
    }

    public static String paisMasVendedor() {
        return ventasPorPais.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No hay ventas registradas");
    }

    public static String fabricaMayorVentas() {
        return ventasPorFabricante.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No hay ventas registradas");
    }

     public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }


}