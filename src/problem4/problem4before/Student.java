package problem4.problem4before;

public class Student implements UniversityMember{
    private final String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public void enrollInCourse(String code){
        System.out.println(name + " enrolls in " + code);
    }

    @Override
    public void payTuition(double amount){
        System.out.println(name + " pays " + amount + " MAD");
    }

    @Override
    public void teach(String code){
        throw new UnsupportedOperationException();
    }

    @Override
    public void gradeExam(String code){
        throw new UnsupportedOperationException();
    }

    @Override
    public void publishPaper(String title){
        throw new UnsupportedOperationException();
    }
}
