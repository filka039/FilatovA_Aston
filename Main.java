import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){

        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Дмитрий", "Первая", 1, 3, 4,
                5, 3, 3));
        students.add(new Student("Андрей", "Вторая", 2, 2, 4,
                3, 4, 5));
        students.add(new Student("Алексей", "Первая", 3, 4, 2,
                1, 4, 5));
        students.add(new Student("Павел", "Первая", 2, 3, 4,
                5, 3, 3));
        students.add(new Student("Олег", "Вторая", 1, 2, 2,
                2, 2, 2));

        printStudentsInfo(students);
        expulsion(students);
        printStudentsInfo(students);
        toNextCourse(students);
        printStudents(students, 2);
        System.out.println("___________\n");

        //задание 2:
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add(884922, "Пушкин");
        telephoneDirectory.add(125332, "Есенин");
        telephoneDirectory.add(545668, "Толстой");
        telephoneDirectory.add(154856, "Гоголь");
        telephoneDirectory.add(221457, "Онегин");
        telephoneDirectory.add(362985, "Пушкин");

        telephoneDirectory.printAllDirectory();
        telephoneDirectory.get("Пушкин");

    }

    public static void printStudentsInfo(HashSet<Student> students) {
        for (var stud : students) {
            System.out.println("Имя: " + stud.getName() + ", группа: " + stud.getGroup() + ", курс: " + stud.getCourse()
                    + ", математика: " + stud.getMathGrade() + ", химия: " + stud.getChemistryGrade() + ", английский: "
                    + stud.getEnglishGrade() + ", физика: " + stud.getPhysicsGrade() + ", биология: " +
                    stud.getBiologyGrade() + ". Средняя оценка: " + ((stud.getMathGrade() + stud.getChemistryGrade() +
                    stud.getEnglishGrade() + stud.getPhysicsGrade() + stud.getBiologyGrade()) / 5));
        }
        System.out.println("");
    }

    public static void expulsion(HashSet<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student forExplulsion = iterator.next();
            if(forExplulsion.getAverage() < 3){
                iterator.remove();
            }
        }
    }

    public static void toNextCourse(HashSet<Student> students){
        for (var stud : students){
            if (stud.getAverage() >= 3){
                stud.setCourse(stud.getCourse() + 1);
            }
        }
    }

    public static void printStudents(HashSet<Student> students, int course){
        System.out.println("Студенты, обучающиеся на " + course + " курсе:");
        for (var stud : students){
            if (stud.getCourse() == course){
                System.out.println(stud.getName());
            }
        }

    }



}