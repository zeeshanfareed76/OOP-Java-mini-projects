
package lab09;

/**
 *
 * @author BOSS
 */
public class Q3_Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Student phd = new PhdStudent();
        Student grad = new GradStudent();
        phd.takeExam();
        grad.takeExam();
    }
}
