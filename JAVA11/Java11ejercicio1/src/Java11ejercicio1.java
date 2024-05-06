// Crear un arraylist con al menos 5 discos, con los datos: Artista, título, año, duración (pueden ser otros). OK


// - Mostrar todos los discos, con todos los datos OK


// - Mostrar uno determinado: por ejemplo el año del tercer disco (esto lo podría pedir el cliente, o no) OK


// - Cambiar ese mismo año (esto lo podría pedir el cliente, o no) y mostrar ese cambio OK A ver si lo encontráis! 


// - Etc hacer pruebas

// EXTRA: buscador con contains() o con equals(). Que el usuario escriba nombre de artista y me diga si está, y en qué posición está. OK

import java.util.ArrayList;
import java.util.Scanner;

public class Java11ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        ArrayList <Discos> discosDisponibles = new ArrayList<>();

        discosDisponibles.add(new Discos("Bring me the Horizon", "Sempiternal", 2013, 53.45));
        discosDisponibles.add(new Discos("While She Sleeps", "SO WHAT", 2019, 48.30));
        discosDisponibles.add(new Discos("Bad Omens", "THE DEATH OF PEACE OF MIND", 2022, 53.08));
        discosDisponibles.add(new Discos("Slipknot", "We Are Not Your Kind", 2019, 60.03));
        discosDisponibles.add(new Discos("Limp Bizkit", "Significant Other", 1999, 59.06));

        System.out.println(discosDisponibles);

        for (Discos x: discosDisponibles){
            System.out.println(x);
        }

        System.out.println("Año del tercer disco: " + discosDisponibles.get(2).getAño());

        discosDisponibles.get(1).setTitulo("You Are We");

        System.out.println(discosDisponibles);

        Scanner sc = new Scanner (System.in);
        System.out.println("Te viene un cliene a tu tienda de vinilos y quieres saber si tienes o no tienes un vinilo en concreto.");
        System.out.println("Buenas tardes, tenéis el vinilo de Sempiternal de Bring me the Horizon?");
        System.out.println("Si, lo tenemos, deja que te lo confirme.");

        boolean encontrado = false;
        for (Discos disco : discosDisponibles) {
            if (disco.getTitulo().equals("Sempiternal")) {
                encontrado = true;
                System.out.println("Sí, tenemos ese vinilo");
                System.out.println("Este vinilo es de " + disco.getArtista() + " y es un álbum de " + disco.getAño());
            }
        }
        
        if (!encontrado) {
            System.out.println("Lo siento, no tenemos ese vinilo disponible.");
        }

        sc.close();

    }
}
