public class PracticeProblem {

    public static void main(String args[]) {
    
    }

    public static String evenOrOdd (int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static String teacherOrStudent(String name) {
        if (name.equals("Kalisz")) {
            return "Teacher";
        } else {
            return "Student";
        }
    }

    public static int fartherFromZero(int num) {
        if (num > 0) {
            return num + 5;
        } else if (num < 0) {
            return num - 5;
        } else {
            return 0;
        }
    }
}
