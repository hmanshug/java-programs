/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

/**
 *
 * @author himanshugarg
 */
public class AnnotationTest {
    public static void main(String[] args) {
        new AnnotationTest().doSomeTestNow();
    }
    
    @SuppressWarnings ({"checked","deprication"})
    public void doSomeTestNow() {
        TestDepricated.display();
    }
    
}
class TestDepricated {
    
    @Deprecated
    static void display(){
        System.out.println("display");
    }
}