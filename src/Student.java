import java.time.LocalDate;
import java.time.Period;

public class Student implements  Study{

    String name;
    String surname;

    LocalDate dateOfStart;

    char gender;
    EducationCenter educationCenter;

    public Student(String name, String surname, LocalDate dateOfStart, char gender, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.dateOfStart = dateOfStart;
        this.gender = gender;
        this.educationCenter = educationCenter;
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println("Student is studying at education center : " + educationCenter);
    }

    @Override
    public void getStudentsStudyingYear() {
        LocalDate currentDate = LocalDate.now();
        int studyingYears = currentDate.getYear() - dateOfStart.getYear();
        System.out.println("Student studying here for " + studyingYears + " years.");
    }

    }


