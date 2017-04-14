/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;
/**
 *
 * @author himanshugarg
 */
public class ParentChildConstructor extends ZipFiles{
    
    String name1="hi";
    public ParentChildConstructor() {
        name1="child";
    }
   
    public static void main(String[] args) {
        ParentChildConstructor ob=new ParentChildConstructor();
        System.out.println(ob.name+" "+ob.name1);
    }
    
}