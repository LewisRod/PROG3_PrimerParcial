
public class Empresa{
   static void main(){

    Empleado[] empleado;
    empleado = new Empleado[4];

    empleado[0] = new EmpleadoTiempoCompleto("Maria", 10000, 3000);
    empleado[1] = new EmpleadoTiempoCompleto("Juan", 10000, 3000);
    empleado[3] = new EmpleadoMedioTiempo("Pedro", 20000, 9);
    empleado[4] = new EmpleadoMedioTiempo("Jose", 20000, 6);

    for(int i = 0; i < empleado.length; i++){
      System.out.println(empleado[i]);
    }
   }
}