public class Producto{
    private String nombre;
    private double precio;
    private int stock;
    public Producto(String nombre,double precio,int stock){
        nombre = " ";
        precio = 0.00;
        stock = 0;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }

    public void reducirSotck(int cantidad){
        cantidad -= cantidad;
    }
}