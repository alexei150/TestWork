import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Generator {
    public static void generate(int stringLength, int stringQuantity) {
        Random random = new Random();
        try {
            FileWriter fileWriter = new FileWriter("text.txt", true);
            for (int j = 0; j < stringQuantity; j++) {
                char[] chars = new char[stringLength];

                for (int i = 0; i < stringLength; i++) {
                    chars[i] = (char) (97 + random.nextInt(25));

                }
                String string = new String(chars);
                string = string + "\n";
                fileWriter.write(string);
                fileWriter.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
