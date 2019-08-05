public class StringCalculator {

    public int add(String s) {
        if (s.equals(""))
            return 0;

        String delimiter = "";
        String[] split = s.split(",|\n");
        String negativeNumbers = "";

        if (s.contains("//")) {
            delimiter = String.valueOf(s.charAt(2));
            split = s.split(",|\n|" + delimiter);
        }

        for (String e : split
        ) {
            if (Integer.parseInt(e) < 0)
                negativeNumbers += e + ", ";
        }

        int total = 0;

        for (int i = 0; i < split.length; i++) {
            try {
                total += Integer.parseInt(split[i]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return total;
    }
}
