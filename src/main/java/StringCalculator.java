public class StringCalculator {

    public int add(String s) {
        if (s.equals(""))
            return 0;
        String[] split = s.split(",");
        int total = 0;

        for (String e : split) {
            total += Integer.parseInt(e);
        }
        return total;
    }
}
