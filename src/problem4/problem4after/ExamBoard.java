package problem4.problem4after;

import java.util.List;

public class ExamBoard{
    public void collectGrades(List<Teacher> teachers, String code){
        for (int i = 0; i < teachers.size(); i++) teachers.get(i).gradeExam(code);
    }
}
