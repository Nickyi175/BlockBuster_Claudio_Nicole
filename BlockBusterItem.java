package Prueba1;

import java.util.Calendar;

public abstract class BlockBusterItem {
    private String nombre;
    private int codigo;
    private double precioRenta;
    private Calendar fecha;

    public BlockBusterItem(String nombre, int codigo, double precioRenta) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precioRenta = precioRenta;
        fecha=Calendar.getInstance();
    }
    
    public String toString() {
        return "Nombre: "+nombre+", Código: "+codigo+", Precio de renta: "+precioRenta;
    }
    public abstract double pagoRenta(int dias); 
    
}
