
package printstar;


public class PrintstarClass {
    

    public static int printStars(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println("*");
            return printStars(n - 1);
        }
    }
}
