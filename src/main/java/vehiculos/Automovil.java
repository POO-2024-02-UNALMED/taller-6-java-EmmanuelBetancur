package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;

    // Constructor de la clase Automovil
    public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante); 
        this.puestos = puestos; 
        Vehiculo.incrementarAutomoviles(); 
    }

    // Getter para el atributo 'puestos'
    public int getPuestos() {
        return puestos;
    }

    // Setter para el atributo 'puestos'
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    // Sobrescribir toString() para representar el objeto Automovil
    @Override
    public String toString() {
        return "Automovil {" +
                "Placa='" + getPlaca() + '\'' +
                ", Nombre='" + getNombre() + '\'' +
                ", Precio=" + getPrecio() +
                ", Peso=" + getPeso() +
                ", Traccion='" + getTraccion() + '\'' +
                ", Puertas=" + getPuertas() +
                ", Puestos=" + puestos +
                ", Fabricante=" + getFabricante().getNombre() +
                ", Pais=" + getFabricante().getPais().getNombre() +
                '}';
    }
}
