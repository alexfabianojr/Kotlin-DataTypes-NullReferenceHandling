public class DummyJavaClass {

    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on vacation" : "I'm working";
    }

    public static void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
