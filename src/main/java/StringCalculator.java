public class StringCalculator {

    public int add(String s) {
        if(s.contains(","))
        {
            int a, b;
            a = Integer.parseInt(s.split(",")[0]);
            b = Integer.parseInt(s.split(",")[1]);
            return a + b;
        }
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
