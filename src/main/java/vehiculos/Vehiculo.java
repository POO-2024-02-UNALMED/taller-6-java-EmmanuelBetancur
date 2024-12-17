package vehiculos;

public class Vehiculo {
    public String placa;
    public int puertas;
    public int velocidadMaxima;
    public String nombre;
    public double precio;
    public double peso;
    public String traccion;
    public Fabricante fabricante;

    public static int cantidadAutomoviles = 0;
    public static int cantidadCamionetas = 0;
    public static int cantidadCamiones = 0;

    // Contadores de ventas por pais y por fabricante
    public static int ventasPorPaisEcuador = 0;
    public static int ventasPorPaisJapon = 0;
    public static int ventasPorFabricanteToyota = 0;
    public static int ventasPorFabricanteRenault = 0;

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

        // Actualizar el contador de ventas por pais y por fabricante
        if (fabricante.getPais().getNombre().equals("Ecuador")) {
            ventasPorPaisEcuador++;
        } else if (fabricante.getPais().getNombre().equals("Japon")) {
            ventasPorPaisJapon++;
        }

        if (fabricante.getNombre().equals("Toyota")) {
            ventasPorFabricanteToyota++;
        } else if (fabricante.getNombre().equals("Renault")) {
            ventasPorFabricanteRenault++;
        }

        // Incrementar el numero total de vehiculos
        cantidadAutomoviles++; 
    }

    // Metodos estaticos para obtener el conteo de vehiculos
    public static String paisMasVendedor() {
        if (ventasPorPaisEcuador > ventasPorPaisJapon) {
            return "Ecuador";
        } else {
            return "Japon";
        }
    }

    public static String fabricaMayorVentas() {
        if (ventasPorFabricanteToyota > ventasPorFabricanteRenault) {
            return "Toyota";
        } else {
            return "Renault";
        }
    }
}
