import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductoAlimento extends Producto{
    private Date fechaVencimiento;
    public ProductoAlimento(String nombre,double precio,int stock,Date fechaVencimiento){
        super(nombre, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaProximoAvencer()
    throws FechaInvalidaException{
        validarFecha(fechaVencimiento);
        return false;
    }

    public String obtenerInformacion(Date fechaVencimiento,String nombre,double precio){
        System.out.println("Nombre = " + nombre);
        System.out.println("Precio = " + precio);
        System.out.println("Fecha = " + fechaVencimiento);
        return "";
    }

    public void validarFecha(Date fecha)
    throws FechaInvalidaException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if(fecha.after(new Date(00/01/2026))){
            throw  new FechaInvalidaException("La fecha esta proxima a vencer");
        }
        if(fecha.after(new Date(00/02/2026))){
            throw new FechaInvalidaException("La fecha esta proxima a vencer");
        }
    }
}