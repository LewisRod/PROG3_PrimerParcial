public class ProductoElectronico extends Producto{
    private int mesesGarantia;
    private String nombre;
    private double precio;
    private int stock;
    public ProductoElectronico(String nombre,double precio,int stock, int mesesGarantia){
        super(nombre, precio, stock);
        this.mesesGarantia = mesesGarantia;
    }
    public double calcularPecioConGarantia(){
        if(mesesGarantia > 12){
            precio += 50;
        }
        return precio;
    }
}