package vehiculos;
import java.util.Map;

public class Pais {
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


public static String paisMasVendedor(Map<String, Integer> ventasPorPais) {
        String paisMax = null;
        int maxVentas = 0;
        for (Map.Entry<String, Integer> entry : ventasPorPais.entrySet()) {
            if (entry.getValue() > maxVentas) {
                paisMax = entry.getKey();
                maxVentas = entry.getValue();
            }
        }
        return paisMax; 
    }

}
