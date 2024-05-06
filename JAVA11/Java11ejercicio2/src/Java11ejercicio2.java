// NIVEL 2
// Que todos estos datos los entre el cliente: usuario entra Artista, título, año y duración (no hace falta hacer un CRUD entero)

import java.util.ArrayList;
import java.util.Scanner;

public class Java11ejercicio2 {
    public static void main(String[] args) throws Exception {
        
        ArrayList <Discos> discos = new ArrayList<>();

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce los datos de los discos que te interesan. Para salir, escribe 'salir'");

        boolean condicion = true;

        do{
            System.out.println("Dime un artista:");
            String artistaUsuario = sc.nextLine();

            if (artistaUsuario.equals("salir")){
                condicion = false;
                System.out.println("OK, ya está.");
            } else {
                System.out.println("Dime un título de un álbum de ese artista:");
    
                String albumUsuario = sc.nextLine();
    
                System.out.println("Dime el año de ese título:");

                int añoUsuario = sc.nextInt();
    
                System.out.println("Dime la duración de ese álbum:");

                double duraciónUsuario = sc.nextDouble();
                
                sc.nextLine();

                Discos disco = new Discos(artistaUsuario, albumUsuario, añoUsuario, duraciónUsuario);
                
                discos.add(disco);
            }
   
        } while (condicion);

        System.out.println("Discos completos: ");
        for (Discos disco : discos){
            System.out.println(disco);
        }

        sc.close();

    }

}