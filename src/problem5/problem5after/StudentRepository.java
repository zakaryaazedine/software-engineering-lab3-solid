package problem5.problem5after;

public interface StudentRepository{
    boolean exists(String cne);
    void save(String cne, String name, String email);
}
