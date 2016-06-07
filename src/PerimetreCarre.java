import java.util.Scanner;
public class PerimetreCarre {

    public static void main(String [] args){
        double cote, perimetre;
        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("Entrer une valuer pour le coté du carré :");

        cote=lectureClavier.nextDouble();

        perimetre=cote*4;

        System.out.println("Le périmètre du carré est de" + perimetre);





    }
}
