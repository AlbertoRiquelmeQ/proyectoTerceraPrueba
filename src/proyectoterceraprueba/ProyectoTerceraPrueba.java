/*
        El programa en Java,calcula el porcentaje de  descuento del total de una compra,teniendo como maximo
        de descuento un 60% del total de la compra.
        Teniendo como opciones de compra:  vestuario, jugeteria, calzado y deporte.
        En vestuario: de 1 a 5 productos obtienes un 5% de descuento, de 6 a 10  productos un 15%
        de descuento, y por más de 11 productos un 20% de descuento.
        En calzado: por la compra de 2 pares de calzado, obtienes un 15% de descuento, al comprar sobre 3 pares
        obtienes un 20% de descuento.
        En deporte: por la compra de 3 a 5 articulos deportivos, obtienes un 5% de descuento, y sobre 6 productos
        se obtiene un 8% de descuento en el total de la compra.
        En jugeteria: por la compra de 1 a 3 jugetes un 7% de descuento, sobre 4 productos en jugeteria un 15%
        de descuento.
        Al final debe mostrar el % de descuento que obtendrá por la compra y consultar si desea o no comprar
        nuevos productos antes de finalizar la venta.
        Si el total de descuento supera el 60%, se asignará como máximo el 60%.
        

 */
package proyectoterceraprueba;
import java.util.Scanner; //Se importa la clase Scanner.
public class ProyectoTerceraPrueba {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);//Se instancia la  clase Scanner y se crea un objeto.
        Scanner tcl=new Scanner(System.in); // Agregamos un nuevo Scanner, pues no lo renococia para la validación.
        String opcionDos; // se declara la opciónDos (si o no) como un valor de tipo String (Alfanumérico)
        int totalDescuento=0; //inicio acumulador para almacenar el Porcentaje total.
        
        
        do {//inicio del ciclo de repetición.
        /* En las siguientes salidas estandar, se simula en pantalla el menú del programa, que da a conocer al usuario
           las alternativas que se le presentan. */
        System.out.println("Opciones de Compra");
        System.out.println("1. Vestuario");
        System.out.println("2. Calzado");
        System.out.println("3. Deporte");
        System.out.println("4. Jugeteria");
        System.out.print("Ingrese Opción de compra: ");
        int opcion=entrada.nextInt();// Se captura y almacena el número ingresado por el usuario en el identificador opción.
        //Con las salidas anteriores se simula el menú de opciones y se le solicita al usuario ingresar la  opción deseada.
        
        switch(opcion){ //keyword switch para iniciar el menu, lee el número ingresasdo en opción, para inciar un case.
            case 1: 
                System.out.print("Ingrese Cantidad de artículos de Vestuarios: ");
                int cantidadVestuario=entrada.nextInt(); // Se asigna lo ingresado por el usuario en el identificador cantidadVestuario.
                if(cantidadVestuario>=1 && cantidadVestuario<=5) // Se hace la consulta, si la cantidad esta entre 1 y 5,se hace un 5% de descuento.
                {
                    totalDescuento=totalDescuento+5;
                }
                else
                {
                    if(cantidadVestuario>=6 && cantidadVestuario<=10)// Si es mayor a 5 se hace la consulta si esta entre 6 y 10 se hace un 15%.
                    {
                        totalDescuento=totalDescuento+15;// se aumenta el acumulador
                    }
                    else // si es mayor a 10 se hace un 20%.
                    {
                        if(cantidadVestuario>10)//condición para preguntar si es mayor a 2. y en el caso, evitar que al agregar 0 de este descuento.
                        {
                            totalDescuento=totalDescuento+20;// se aumenta el acumulador
                        }
                    }
                }
                break;
            case 2:
                System.out.print("Ingrese cantida de articulos de Calzado: ");
                int cantidadCalzado=entrada.nextInt(); // Se asigna lo ingresado por el usuario en el identificador cantidadCalzado.
                if(cantidadCalzado>1 && cantidadCalzado<=2)//Se  hace la pregunta si la cantidad es mayor a 1 y menor o igual a 2.
                {
                    totalDescuento=totalDescuento+15;
                }
                else // en el caso que  sea mayor a 2 se acumula 20% de descuento.
                {
                    if(cantidadCalzado>2)//condición para preguntar si es mayor a 2. y en el caso, evitar que al agregar 0 de este descuento.
                    {
                        totalDescuento=totalDescuento+20;//se aumenta el acumulador.
                    }
                }
                        
                break;
            
            case 3:
                System.out.print("Ingrese cantidad de articulos de Deporte: ");
                int cantidadDeporte=entrada.nextInt(); // Se asigna la cantidad ingresado por el usuario al identificador cantidadDeporte.
                if(cantidadDeporte>=3 && cantidadDeporte<=5) // Se hace la pregunta si la cantidadDeporte eta entre 3 y 5, se asignará un 5% de descuento.
                {
                    totalDescuento=totalDescuento+5;//se aumenta el acumulador.
                }
                else // sino, se preguntará si es mayor a 6.
                {
                    if(cantidadDeporte>=6) // se pregunta si es mayor a 6, en el caso que en ninguna de las condiciones cumpla, no hará nada.
                    {
                        totalDescuento=totalDescuento+8;//se aumenta el acumulador.
                    }
                }
                break;
            
            case 4:
                System.out.print("Ingrese cantidad de articulos de Jugeteria: ");
                int cantidadJugeteria=entrada.nextInt();// Se asigna la cantidad ingresada por el usuario al identificador cantidadJugeteria
                if(cantidadJugeteria<=1 && cantidadJugeteria>=3) // se pregunta si la cantidad esta entre 1 y 3, se  acumulará un 7%.
                {
                    totalDescuento=totalDescuento+7;//se aumenta el acumulador.
                }
                else  // si la condición anteior no se cumple, el descuento será de 15.
                {
                    if(cantidadJugeteria>3)//como ultima condición, si es mayor a tres se asignará el siguiente descuento, 
                                           //con esto evitamos que al agregar 0 pasé por el descuento.
                    {
                        totalDescuento=totalDescuento+15;//se aumenta el acumulador.
                    }
                }
                                
                break;
                
            default:
                    System.out.println("Error de opción, la compra se reiniciará");//salida estandar que se arrojará en caso de opción inválida.
            }
        if(totalDescuento>60) // aquí se verifica si totalDescuento es menos que el máximo permitido que es 60, si sobrepasa los 60, se asigna 60% de descuento
        {
            totalDescuento=60;// se asigna un valor literal al identificador totalDescuento.
        }
        
        System.out.println("Desea continuar comprando? :(si/no)"); // se muestra en pantalla si desea continuar comprando.
        opcionDos=tcl.nextLine(); // se captura la linea ingresada por el usuario y se asigna a el identificador opcionDos de tipo String.
        
        }while(opcionDos.equals("si"));// Se evalua la condición Do while, si la opcion es igual a si, volverá a repetir el programa.
        
         System.out.println("El total de Descuento es: "+totalDescuento+"% en el total de la compra.");   
         //Este mensaje dará a conocer el total de descuento en la compra.
        
    }
}

/*integrantes:
    -Consuelo Castro.
    -Luis Ortega.
    -Giovanni Medina.
    -Alberto Riquelme.

 Sección: 70.
*/