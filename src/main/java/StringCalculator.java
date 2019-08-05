public class StringCalculator {

    public int add(String s) {
        if (s.contains(",")) {
            String[] split = s.split(",");
            int total = 0;

            for (String e: split)
            {
                total += Integer.parseInt(e);
            }
            return total;
        }

        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
