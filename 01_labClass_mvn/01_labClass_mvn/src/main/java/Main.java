public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bill Phil", "1");
        Student student2 = new Student("Filip Röttele", "2");
        Student student3 = new Student("Bill Hill", "3");
        Student student4 = new Student("Jan Phil", "4");
        LabClass labClass = new LabClass(5);
        labClass.enrollStudent(student1);
        labClass.enrollStudent(student2);
        labClass.enrollStudent(student3);
        labClass.enrollStudent(student4);
        labClass.setInstructor("Instructor");
        labClass.setRoom("5");
        labClass.setTime("23.08.2021, 15:00");
        labClass.printList();
    }
}
