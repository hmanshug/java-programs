
package completed;

public class spikey {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n / 2) {
                    if (j >= n / 2 - i - 1 && j < n / 2) {
                        System.out.print("\\");
                    } else if (j <= n / 2 + i && j >= n / 2) {
                        System.out.print("/");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= i - n / 2 && j < n / 2) {
                        System.out.print("/");
                    } else if (j <= n + n / 2 - 1 - i && j >= n / 2) {
                        System.out.print("\\");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");

    }
}
