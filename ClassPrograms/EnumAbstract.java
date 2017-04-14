/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

/**
 *
 * @author himanshugarg
 */
public class EnumAbstract {
    public static void main(String args[]) {
        for(TLight light: TLight.values()) {
            System.out.printf("%s; %d seconds, next is %s\n", light, light.getSeconds(), light.next());
        }
    }
}

enum TLight {
    RED(30) {
        public TLight next() {
            return GREEN;
        }
    },
    AMBER(10) {
        public TLight next() {
            return RED;
        }
    },
    GREEN(30) {
        public TLight next() {
            return AMBER;
        }
    };
    
    public abstract TLight next();
    private final int seconds;
    
    TLight(int seconds) {
        this.seconds= seconds;
    }
    
    int getSeconds() {
        return seconds;
    }
}

