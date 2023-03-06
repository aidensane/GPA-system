public class Driver {
    public static void main(String[] args) {
        Student aiden = new Student("Aiden");
        aiden.add("Mathematics", "C");
        aiden.add("English", "A");
        aiden.add("History", "B");
        aiden.add("Geography", "D");
        System.out.println(aiden.getName() + " has a GPA of " + aiden.getGPA());
        

    }
}