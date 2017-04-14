/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

/**
 *
 * @author blodu
 */
public class name {
    public static void main(String [] args) {
        // Print I
        
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                if(i==0 || i==4) {
                    System.out.print("I");
                }
                else {
                    if(j==2) {
                        System.out.print("I");
                    }
                    else
                        System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        
        
        // Print M
        int n=9;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(j==0 || j==n-1) {
                    System.out.print("M");
                }
                else {
                    if(i<=n/2) {
                        if(j==i || j==n-i-1)
                        System.out.print("M");
                        else
                        System.out.print(" ");
                    }
                    else
                        System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        
        // Print S
        int m=9;
        for(int i=0;i<m;i++) {
            for(int j=0;j<m;j++) {
                if(i==0 || i==m-1 || i==m/2) {
                    if(j==0 || j==m-1)
                    System.out.print(" ");
                    else
                    System.out.print("S");
                }
                else {
                    if(i<=m/4 || i>=3*m/4) {
                        if(j==0 || j==m-1)
                        System.out.print("S");
                        else
                        System.out.print(" ");
                    }
                    else if(i<m/2 && i!=0) {
                        if(j==0)
                        System.out.print("S");
                        else
                        System.out.print(" ");
                    }
                    else if(i>m/2 && i!=m-1) {
                        if( j==m-1)
                        System.out.print("S");
                        else
                        System.out.print(" ");
                    }
                        
                }
            }
            System.out.print("\n");
        }
    }
}


