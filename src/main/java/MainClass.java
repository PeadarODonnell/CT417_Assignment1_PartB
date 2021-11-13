import org.checkerframework.checker.units.qual.A;
import org.joda.time.*;
import java.util.ArrayList;
import java.util.Date;

public class MainClass {

    public static void main(String args[]){

        ArrayList<Module> modules = new ArrayList<Module>();
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();



        Student s_1 = new Student("Jimmy", 23, DateTime.parse("1998-10-11"), 1, courses, modules);
        Student s_2 = new Student("Johnny", 24, DateTime.parse("1997-10-11"), 2, courses, modules);
        Student s_3 = new Student("Jeff", 25, DateTime.parse("1996-10-11"), 3, courses, modules);
        students.add(s_1);
        students.add(s_2);
        students.add(s_3);



        Module m_1 = new Module("machine learning", 123, students, courses);
        Module m_2 = new Module("Artificial Intelligence", 456, students, courses);
        Module m_3 = new Module("Software Engineering", 789, students, courses);
        m_1.addStudent(s_1);
        m_1.addStudent(s_2);
        m_2.addStudent(s_1);
        m_2.addStudent(s_3);
        m_3.addStudent(s_2);
        m_3.addStudent(s_3);




        modules.add(m_1);
        modules.add(m_2);
        modules.add(m_3);




        CourseProgramme c_1 = new CourseProgramme("course 1", modules, students,
                DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        CourseProgramme c_2 = new CourseProgramme("course 2", modules, students,
                DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        CourseProgramme c_3 = new CourseProgramme("course 3", modules, students,
                DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));

        c_1.addModule(m_1);
        c_1.addModule(m_2);
        c_2.addModule(m_3);
        c_2.addModule(m_1);
        c_3.addModule(m_1);
        c_3.addModule(m_3);
        courses.add(c_1);
        courses.add(c_2);
        courses.add(c_3);

        System.out.println("ALL COURSES:");
        for (int i = 0; i < courses.size(); i++) {
            CourseProgramme element = courses.get(i);
            System.out.println(element.getCourseName());
            for(int e = 0; e < element.getModuleList().size(); e++){
                System.out.println(((element.getModuleList()).get(e)).getModuleName());
            }

        }


        System.out.println();
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }


    }
}
