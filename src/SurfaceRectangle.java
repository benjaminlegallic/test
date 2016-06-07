import java.util.Scanner;

public class SurfaceRectangle {

    public static void main(String[] args){
        double longueur;
        double largeur;
        double surface;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("entrer une valeur pour la longueur :" );
        longueur=lectureClavier.nextDouble();

        System.out.println("entrer une valeur pour la largeur :" );
        largeur=lectureClavier.nextDouble();


        surface= longueur*largeur;

        System.out.println("la surface du rectangle est " + surface);


    }
}
