import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Testeo testeado=new Testeo();
        menu(testeado);
    }
    public static void menu(Testeo testeado)
    {
        int opcion;
        testeado.cargarDatos();
        do {
            Scanner entrada = new Scanner(System.in);
            String cadena= """
                Bienvenido al menu
                \t[1]Ver lista de estructuras
                \t[2}Ver lista de edificios
                \t[3]Ver polideportivos
                \t[0]Salir
                """;
            System.out.println(cadena);
            opcion=entrada.nextInt();
            switch (opcion)
            {
                case 1:
                {
                    System.out.println(testeado.mostrarListaEdificios());
                    break;
                }
                case 2:
                {
                    System.out.println(testeado.mostrarListaOficinas());
                    break;
                }
                case 3:
                {
                    System.out.println(testeado.mostrarPolideportivo());
                    break;
                }
                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion!=0);

    }
}
