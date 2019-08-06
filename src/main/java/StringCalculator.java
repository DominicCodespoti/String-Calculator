import java.util.regex.Pattern;

public class StringCalculator {

    public String enclose(String target)
    {
        target = "\\Q" + target + "\\E";
        return target;
    }

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
                for (int i = 0; i < s.length(); i++)
                {
                    if (s.charAt(i) == s.charAt(s.indexOf("[")))
                    {
                        delimiter += enclose(String.valueOf(s.charAt(i + 1)));
                        delimiter += "|";
                    }
                }
                delimiter = delimiter.substring(0,delimiter.length() - 1);
                s = s.replace('\n', delimiter.charAt(2));
            }
            split = split[1].split(delimiter);
        }

        for (int i = 0; i < split.length; i++) {
            try {
                if (Integer.parseInt(split[i]) < 1000) {
                    if (Integer.parseInt(split[i]) > 0)
                        total += Integer.parseInt(split[i]);
                    else {
                        negativeNumbers += split[i] + " ";
                        System.out.println(negativeNumbers);
                    }
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return total;
    }
}
