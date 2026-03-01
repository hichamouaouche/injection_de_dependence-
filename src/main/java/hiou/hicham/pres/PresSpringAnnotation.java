package hiou.hicham.pres;

import hiou.hicham.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new AnnotationConfigApplicationContext("hiou.hicham");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("resultat = " + metier.calcul());
    }
}
