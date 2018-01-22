/*
 * Copyright Gregory Stitt
 */
package annotate01;

import java.lang.annotation.Annotation;

/**
 * Exploring Annotations related functions in Java
 * @author Greg
 */
public class Annotate01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Annotation[] annotations = Annotate01.class.getAnnotations();
        System.out.println("The number of Annotations \"present\" on this object is: " +
                annotations.length);
        for(Annotation annotation : annotations) {
            System.out.println("Annotation :" + annotation.toString());
        }
    }
    
}
