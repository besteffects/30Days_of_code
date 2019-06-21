package Person;

 class Student extends Person {
    private int[] testScores;

    /*
     *  Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.*/
    // Write your constructor here
     Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here

     char calculate() {
        String grade = "";
        int total = 0;
        int avg;
        for (int i = 0; i < testScores.length; i++) {
            total = total + testScores[i];
        }
        avg = total / testScores.length;

        if (avg < 40) {
            grade = "T";
        }
        if (avg >= 40 && avg < 55) {
            grade = "D";
        }
        if (avg > 55 && avg < 70) {
            grade = "P";
        }
        if (avg >= 70 && avg < 80) {
            grade = "A";
        }
        if (avg >= 80 && avg < 90) {
            grade = "E";
        }
        if (avg >= 90 && avg <= 100) {
            grade = "O";
        }
        return grade.charAt(0);
    }
}
