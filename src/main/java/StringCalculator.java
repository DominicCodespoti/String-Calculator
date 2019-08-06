import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String s) {
        if (s.equals(""))
            return 0;

        int total = 0;
        String delimiter = "";
        String[] split = s.split(",|\n");
        String negativeNumbers = "Error, negative numbers detected: ";

        if (s.contains("//")) {
            if (s.contains("["))
            {
                delimiter = s.substring(s.indexOf("[") + 1, s.indexOf("]"));
                s = s.replace("\n", delimiter);
            }
            split = s.split(Pattern.quote(delimiter));
        }

        for (int i = 0; i < split.length; i++) {
            try {
                if (Integer.parseInt(split[i]) < 1000) {
                    if (Integer.parseInt(split[i]) > 0)
                        total += Integer.parseInt(split[i]);
                    else
                        negativeNumbers += split[i] + " ";
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return total;
    }
}
