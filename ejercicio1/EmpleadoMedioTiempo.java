
public class EmpleadoMedioTiempo extends Empleado {

    private double horasTrabajadas;
    private String nombre;
    private double salarioBase;

    public EmpleadoMedioTiempo(String nombre, double salarioBase, double horasTrabajadas) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {

        return salarioBase * horasTrabajadas;

    }

    @Override
    public String toString(){
        return "Nombre = " + nombre + " | Salario = " + calcularSalario();
    }

}
