package vehiculos;

public class Pais {
    public String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo para obtener el pais con mas ventas
    public static String paisMasVendedor() {
        if (Vehiculo.ventasPorPaisEcuador > Vehiculo.ventasPorPaisJapon) {
            return "Ecuador";
        } else {
            return "Japon";
        }
    }
}
