
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.lang.model.util.SimpleAnnotationValueVisitor14;
import javax.sound.midi.SysexMessage;

public class Tienda{
    static void main(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = simpleDateFormat.parse();
        ProductoAlimento productoAlimento = new ProductoAlimento("Pala", 5000, 5, 02/1/2020);
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do{
            System.out.println("MENU TIENDA");
            System.out.println("1. Mostrar productos disponibles");
            System.out.print("2.Agregar productos al carrito");
            System.out.println("3.Ver carrito y total");
            System.out.println("4. Finalizar compra");
            System.out.println("0. Salir");

            try {
                switch (opcion) {
                case 1:
                    productoAlimento.obtenerInformacion(fechaVencimiento, nombre, opcion);
                    break;
                case 2:
                    
                default:
                    throw new AssertionError();
            }

                
            } catch (Exception e) {
            }
        }while(opcion != 0);
    }
}