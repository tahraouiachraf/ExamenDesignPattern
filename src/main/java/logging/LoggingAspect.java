package logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* model.Dessin.*(..))")
    public Object logger(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("Début de la méthode : " + joinPoint.getSignature());
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("Fin de la méthode : " + joinPoint.getSignature());
        System.out.println("Durée d'exécution : " + (endTime - startTime) + "ms");
        return result;
    }
}
