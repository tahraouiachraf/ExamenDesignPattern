package security;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SecurityAspect {

    @Before("execution(* model.Dessin.*(..))")
    public void verifierAcces() {
        // Vérification des rôles ou authentification de l'utilisateur
        System.out.println("Vérification des droits d'accès avant l'exécution de la méthode.");
    }
}
