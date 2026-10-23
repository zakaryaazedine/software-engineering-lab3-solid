package problem1.problem1before;

import java.io.IOException;

public class Test{
    public static void main(String args[]){
        Invoice x = new Invoice("ALAMI Samir");
        x.addLine("Laptop", 9000);
        x.addLine("Mouse", 150);
        x.addLine("USB cable", 50);
        System.out.println(x.total());
        System.out.println(x.print());
        try{
            x.save();
        } catch (IOException e){
            System.out.println("Error in executing save()");
        }
        //x.save();

    }


}

