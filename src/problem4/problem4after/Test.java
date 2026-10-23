package problem4.problem4after;

import java.util.List;

public class Test{
    public static void main(String[] args){
        Student student = new Student("SAFI Amal");
        Professor professor = new Professor("Prof. KALLOUBI");
        TeachingAssistant assistant = new TeachingAssistant("ALAMI Samir");

        List<Learner> learners = List.of(student, assistant);
        List<Teacher> teachers = List.of(professor, assistant);

        Registrar registrar = new Registrar();
        ExamBoard examBoard = new ExamBoard();

        registrar.enrollAll(learners, "SE101");
        examBoard.collectGrades(teachers, "SE101");
    }
}
