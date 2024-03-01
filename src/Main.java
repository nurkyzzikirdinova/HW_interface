import java.time.LocalDate;

/**EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
Абстракт класска School , University, College деген саб класстарды тузунуз.
Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(), void getStudentsStudyingYear()деген 2метод тузунуз.
Student деген класс тузунуз. Полелери: name, surname, Gender gender,  LocalDate dateOfStart()(студент
 кайсылжылы окуп баштаганы),EducationCenter educationCenter; Main класста студенттердин массивин тузуп ичине
 10 студент салыныз. Студенттер ар кандай окуу жайда окусун.
//Main класста 1 метод тузунуз. 1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда
 окуганы тууралу маалыматты жана окуганыны канча жыл болгону тууралуу маалыматты чыгарып берсин.*/
public class Main {
    public static void main(String[] args) {

        EducationCenter uni = new University("AIU", "KG", LocalDate.of(2009, 7, 9));
        EducationCenter school = new School("36", "KG", LocalDate.of(2007, 2, 4));
        EducationCenter college = new College("UI college", "KG", LocalDate.of(2014, 8, 3));


        Student student1 = new Student("Nurkyz", "Zikirdinova", LocalDate.of(2023, 1, 9), 'F', uni);
        Student student2 = new Student("Ubrahim", "Zikirdinov", LocalDate.of(2014, 2, 2), 'M', uni);
        Student student3 = new Student("Nurkyz", "Zikirdinova", LocalDate.of(2022, 1, 4), 'F', school);
        Student student4 = new Student("Nurkyz", "Zikirdinova", LocalDate.of(2009, 3, 3), 'F', college);
        Student student5 = new Student("Nurel", "Zikirdinov", LocalDate.of(2007, 9, 9), 'M', uni);
        Student student6 = new Student("Nurkyz", "Zikirdinova", LocalDate.of(2020, 7, 7), 'F', school);
        Student student7 = new Student("Aziret", "Zikirdinov", LocalDate.of(2004, 9, 1), 'M', college);
        Student student8 = new Student("Urmat", "Zikirdinov", LocalDate.of(2014, 3, 6), 'M', uni);
        Student student9 = new Student("Nurkyz", "Zikirdinova", LocalDate.of(2015, 5, 1), 'F', school);
        Student student10 = new Student("Nurkyz", "Zikirdinova", LocalDate.of(2022, 1, 4), 'F', uni);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};


        studentsInfo(students);
    }

    public static void studentsInfo(Student[] students) {
        System.out.print("All students info");
        for (Student student : students) {
            System.out.println("\nStudent: " + student.name + " " + student.surname);
            System.out.println("Gender: " + student.gender);
            System.out.println("Date of start: " + student.dateOfStart);
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();


        }
    }
}

