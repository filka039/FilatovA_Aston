import java.util.HashSet;

public class Student {
    private String name;
    private String group;
    private int course;
    private int mathGrade;
    private int chemistryGrade;
    private int englishGrade;
    private int physicsGrade;
    private int biologyGrade;


    Student(String name, String group, int course, int mathGrade, int chemistryGrade, int englishGrade,
            int physicsGrade, int biologyGrade){
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathGrade = mathGrade;
        this.chemistryGrade = chemistryGrade;
        this.englishGrade = englishGrade;
        this.physicsGrade = physicsGrade;
        this.biologyGrade = biologyGrade;
    }

    Student() {
    }

    public void setBiologyGrade(int biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    public void setChemistryGrade(int chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhysicsGrade(int physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public void setAllGrades(int mathGrade, int chemistryGrade, int englishGrade, int physicsGrade, int biologyGrade){
        this.mathGrade = mathGrade;
        this.chemistryGrade = chemistryGrade;
        this.englishGrade = englishGrade;
        this.physicsGrade = physicsGrade;
        this.biologyGrade = biologyGrade;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getBiologyGrade() {
        return biologyGrade;
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public int getPhysicsGrade() {
        return physicsGrade;
    }

    public double getAverage(){
        return (mathGrade + chemistryGrade + englishGrade + physicsGrade + biologyGrade) / 5;
    }
}
