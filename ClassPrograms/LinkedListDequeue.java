/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author himanshugarg
 */
public class LinkedListDequeue {

    LinkedList<String> ll = new LinkedList<String>();
    Thread th = Thread.currentThread();
    Scanner sc = new Scanner(System.in);
    BufferedReader br;
    
    int choice;
    
    public LinkedListDequeue() throws InterruptedException, IOException {
        System.out.println("DEQUE IMPLEMENTATION USING LINKED LIST");
        System.out.println();
        
        do {
            System.out.println("1. ADD");
            System.out.println("2. DELETE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.println("ENTER YOUR CHOICE");

            //choice = sc.nextInt();
            br= new BufferedReader(new InputStreamReader(System.in));
            choice =  Integer.valueOf(br.readLine());
            clrscr();

            switch (choice) {

                case 1:
                    do {
                        System.out.println("1. ADD AT FIRST");
                        System.out.println("2. ADD AT LAST");
                        System.out.println("3. BACK");
                        System.out.println("ENTER YOUR CHOICE");

                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("ENTER YOUR DATA");
                                ll.addFirst(sc.next());
                                clrscr();
                                break;

                            case 2:
                                System.out.println("ENTER YOUR DATA");
                                ll.addLast(sc.next());
                                clrscr();
                                break;

                            case 3:
                                clrscr();
                                break;

                            default:
                                clrscr();
                                break;
                        }
                    } while (choice != 3);
                    break;

                case 2:
                    do {
                        System.out.println("1. DELETE AT FIRST");
                        System.out.println("2. DELETE AT LAST");
                        System.out.println("3. BACK");
                        System.out.println("ENTER YOUR CHOICE");

                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("DELETED DATA = " + ll.removeFirst());
                                clrscr();
                                break;

                            case 2:
                                System.out.println("DELETED DATA = " + ll.removeLast());
                                clrscr();
                                break;
                                
                            case 3:
                                clrscr();
                                break;
                                
                            default:
                                clrscr();
                                break;
                        }
                    } while (choice != 3);
                    break;

                case 3:
                    System.out.println("DATA DISPLAYED = " + ll);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    clrscr();
                    break;

            }
        } while (choice != 4);
    }

    void clrscr() throws InterruptedException {
        System.out.println("WAIT..................");
        th.sleep(1000);
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}

class Test {

    public static void main(String[] args) throws InterruptedException, IOException {
        new LinkedListDequeue();
    }
}