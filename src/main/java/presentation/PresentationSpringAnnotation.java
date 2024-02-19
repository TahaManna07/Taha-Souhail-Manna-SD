package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("dao","metier");// les packages qui va scanné
        // on peut utiliser "ma" directement
        IMetier metier  = context.getBean(IMetier.class); // si on ne connait pas le nom du classe
        System.out.println("Version Spring Avec Constructeur ");
        System.out.println(metier.getCalcul());


    }

}
