package problem4.problem4after;

import java.util.List;

public class Registrar{
    public void enrollAll(List<Learner> learners, String code){
        for (int i = 0; i < learners.size(); i++) learners.get(i).enrollInCourse(code);
    }
}
