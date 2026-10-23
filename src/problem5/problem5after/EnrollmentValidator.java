package problem5.problem5after;

public class EnrollmentValidator{
    public static void checkCne(String cne){
        if (cne == null || cne.isBlank()) throw new IllegalArgumentException("CNE is required");
    }

    public static void checkDuplicate(boolean exists, String cne){
        if (exists) throw new IllegalStateException("Already enrolled: " + cne);
    }
}
