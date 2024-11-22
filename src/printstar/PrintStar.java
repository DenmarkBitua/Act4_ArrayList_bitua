
package printstar;
import java.util.Scanner;

public class PrintStar {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Number of stars: ");
        int stars = scn.nextInt();
        System.out.println("");
        
        
        PrintstarClass.printStars(stars);
    }
}
