package vehiculos;

public class Automovil extends Vehiculo {
    public int puestos;

    // Constructor de la clase Automovil
    public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        incrementarAutomoviles(); // Incrementa el contador de automoviles
    }

    // Sobrescribir toString() para representar el objeto Automovil
    @Override
    public String toString() {
        return "Automovil {" +
                "Placa='" + placa + '\'' +  // Accede directamente al atributo 'placa'
                ", Nombre='" + nombre + '\'' +  // Accede directamente al atributo 'nombre'
                ", Precio=" + precio +  // Accede directamente al atributo 'precio'
                ", Peso=" + peso +  // Accede directamente al atributo 'peso'
                ", Traccion='" + traccion + '\'' +  // Accede directamente al atributo 'traccion'
                ", Puertas=" + puertas +  // Accede directamente al atributo 'puertas'
                ", Puestos=" + puestos +  // Atributo especifico de Automovil
                ", Fabricante=" + fabricante.getNombre() +  // Accede al fabricante
                ", Pais=" + fabricante.getPais().getNombre() +  // Accede al pais del fabricante
                '}';
    }
}