package Person;

public class Student extends Person{
    private int[] testScores;
    private String grade;
    private int average;
    private int total;
    /*
     *  Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.*/
    // Write your constructor here
    public Student(String firstName, String lastName, int identification, int [] scores) {
        super(firstName, lastName, identification);
        this.testScores=testScores;
    }
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */

    public int calculate() {
        total=0;
        for (int i = 0; i < testScores.length; i++) {
            total=total+testScores[i];
        }
        average=total/testScores.length;
        return average;
    }
    public void printPerson(){
    }


    // Write your method here

}