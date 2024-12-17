package vehiculos;

public class Camioneta extends Vehiculo {
    public boolean volco;

    public Camioneta(String placa, String nombre, double precio, double peso, Fabricante fabricante, boolean volco) {
        super(placa, 4, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        incrementarCamionetas(); // Incrementa el contador de camionetas
    }

    @Override
    public String toString() {
        return "Camioneta {" +
                "Placa='" + placa + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Precio=" + precio +
                ", Peso=" + peso +
                ", Traccion='" + traccion + '\'' +
                ", Puertas=" + puertas +
                ", Volco=" + volco +
                ", Fabricante=" + fabricante.getNombre() +
                ", Pais=" + fabricante.getPais().getNombre() +
                '}';
    }
}