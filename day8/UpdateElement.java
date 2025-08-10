package day8;

import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) 
    {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Biology");
        subjects.add("English");

        System.out.println("Before update: " + subjects);

        int index = subjects.indexOf("Math");
        if (index != -1) 
        {
            subjects.set(index, "Statistics");
        }

        System.out.println("After update: " + subjects);
    }
}

