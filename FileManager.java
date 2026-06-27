import java.io.*;
import java.util.ArrayList;

public class FileManager {

    // Save one line into any file
    public static void writeFile(String fileName, String data) {

        try {

            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(data);
            bw.newLine();

            bw.close();

        } catch (IOException e) {

            System.out.println("Error Writing File!");

        }

    }

    // Read all lines from any file
    public static ArrayList<String> readFile(String fileName) {

        ArrayList<String> list = new ArrayList<>();

        try {

            File file = new File(fileName);

            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {

                list.add(line);

            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error Reading File!");

        }

        return list;

    }

    // Rewrite a file (used for Update/Delete)
    public static void rewriteFile(String fileName,
                                   ArrayList<String> data) {

        try {

            BufferedWriter bw =
                    new BufferedWriter(new FileWriter(fileName));

            for (String line : data) {

                bw.write(line);
                bw.newLine();

            }

            bw.close();

        } catch (IOException e) {

            System.out.println("Error Updating File!");

        }

    }

}