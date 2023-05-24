package introtooops;

public class Main {
    public static void main(String[] args) {
        Student chirag = new Student("Chirag",1);
        Student sachin = new Student("Sachin",2);

        chirag.solvedProblem(1);
        sachin.solvedProblem(2);

        chirag.solvedProblem(3);
        sachin.solvedProblem(1);
    }
}
