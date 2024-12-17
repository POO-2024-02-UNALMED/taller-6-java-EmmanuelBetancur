package vehiculos;
import java.util.Map;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static String fabricaMayorVentas(Map<String, Integer> ventasPorFabricante) {
    String fabricaMax = null;
    int maxVentas = 0;

    for (Map.Entry<String, Integer> entry : ventasPorFabricante.entrySet()) {
        if (entry.getValue() > maxVentas) {
            fabricaMax = entry.getKey(); 
            maxVentas = entry.getValue(); 
        }
    }
   
    return fabricaMax;
}

}