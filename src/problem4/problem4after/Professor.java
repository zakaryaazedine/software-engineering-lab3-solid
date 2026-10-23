package problem4.problem4after;

public class Professor implements Teacher, Researcher{
    private final String name;

    public Professor(String name){
        this.name = name;
    }

    @Override
    public void teach(String code){
        System.out.println(name + " teaches " + code);
    }

    @Override
    public void gradeExam(String code){
        System.out.println(name + " grades " + code);
    }

    @Override
    public void publishPaper(String title){
        System.out.println(name + " publishes " + title);
    }
}
