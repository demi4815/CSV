package Karina.pr4;

import com.opencsv.CSVReader;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        try
        {
            //String csvFilePath = "D:\\CSV\\src\\Karina\\pr4\\foreign_names.csv";

            //CSVReader csvReader = new CSVReader(new FileReader(csvFilePath));

            File file = new File("D:\\CSV\\src\\Karina\\pr4\\foreign_names.csv");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String str;

            while ((str= reader.readLine()) != null)
            {
                String[] contents = str.split(";");
                for (String cell : contents)
                {
                    System.out.print(cell);
                }
                System.out.println();
            }
        }

        catch (FileNotFoundException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
