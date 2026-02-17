public class EmpleadoTiempoCompleto extends  Empleado{
    private double bono;
    private double salarioBase;
    private  String nombre;
    public EmpleadoTiempoCompleto(String nombre,double salarioBase, double bono){
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario(){
        
        return salarioBase + bono;
    }

    @Override
    public String toString(){
        return "Nombre" + nombre +
                " | Salario total" + calcularSalario();
  }
}