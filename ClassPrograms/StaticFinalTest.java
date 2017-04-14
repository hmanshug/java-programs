/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author himanshugarg
 */
public class StaticFinalTest {
    public static void main(String[] args) throws IOException {
        Parent parent= new Parent();
        Child child= new Child();
        Parent parentchild= new Child();
        
        parent.isStatic();
        parent.isStaticFinal();
        
        child.isStatic();
        child.isStatic();
        child.isStaticFinal();
        
        parentchild.isStatic();
        parentchild.isStaticFinal();
        parentchild.show();
        //parentchild.too();
        parentchild.foo();
        
        
//        char a='\n';
//        char b='\r';
//        System.out.println(a+"rhifhgn"+b);
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(br.readLine());
        
        
    }
    
}
class Parent {
    static int i=0;
    int a[]=new int[10];
    
    void show() {
        System.out.println("Parent Show");
    }
    
    void foo() {
        
        System.out.println("Foo");
    
    }
        
    static void isStatic() {
        i++;
        System.out.println("Parent Static "+i);
    }
    
    public static final void isStaticFinal() {
        System.out.println("Parent Static Final");
    }
}

class Child extends Parent{
    
    void too() {
        System.out.println("too");
    }
    void show() {
        System.out.println("Child Show");
    }
    
    public static void isStatic() {
        i++;
        System.out.println("Child Static "+i);
    }
    
//    public static final void isStaticFinal() {
//        System.out.println("Child Static Final");
//    }
}