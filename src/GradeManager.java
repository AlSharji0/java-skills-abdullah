
import java.util.ArrayList;
import java.util.Arrays;

public class GradeManager {
    /**
     * Reversed the characters of each name.
     * @param names
     * @return
     */
    public static String[] reverseStudentNames(String[] names) {
        String[] result = new String[names.length];

        for (int i = 0; i < result.length; ++i) {
            String name = names[i];
            char[] chars = name.toCharArray(); // Chars of each name

            char[] temp_chars = new char[chars.length];

            int opposite = 0;
            for (int j = chars.length - 1; j >= 0; --j) {
                temp_chars[opposite] = chars[j];
                ++opposite;
            }

            result[i] = new String(temp_chars);
        }

        return result;
    }

    /**
     * Returns letter grade equivilant.
     * @param score
     * @return
     */
    public static char getLetterGrade(int score) {
        if (score >= 90)
            return 'A';
        else if (score < 90 && score >= 80)
            return 'B';
        else if (score < 80 && score >= 70)
            return 'C';
        else if (score < 70 && score >= 60)
            return 'D';
        else 
            return 'f';
    }

    public static String[] findFailingStudents(
            String[] names, int[] scores) {
        ArrayList<String> failed = new ArrayList<>();
        for (int i = 0; i < scores.length; ++i) {
            if (scores[i] < 60)
                failed.add(names[i]);
        }

        return failed.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names = {"Ahmed", "Slap"};
        int[] scores = {90, 50};

        System.out.println("\nTask 3.1: ");
        System.out.println("Names: " + Arrays.toString(names));
        System.out.println("Scores: " + Arrays.toString(scores));

        // Tests 3.1:
        System.out.println("\nTesting Task 3.1: ");
        System.out.println("Ahmed's Letter Grade: " + getLetterGrade(scores[0]));
        System.out.println("Slap's Letter Grade: " + getLetterGrade(scores[1]));
        System.out.println("Failed students: " + Arrays.toString(findFailingStudents(names, scores)));
        System.out.println("Reversed names: " + Arrays.toString(reverseStudentNames(names)));
    }
}
