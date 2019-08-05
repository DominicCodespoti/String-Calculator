public class StringCalculator {

    public int add(String s) {
        if (s.contains(",")) {
            String[] split = s.split(",");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            return a + b;
        }
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
