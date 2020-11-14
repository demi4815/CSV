package Karina.pr4;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        try
        {

            /**
             * Java класс BufferedReader читает текст из потока ввода символов,
             * буферизуя прочитанные символы, чтобы обеспечить эффективное считывание символов,
             * массивов и строк. Можно указать в конструкторе вторым параметром размер буфера.
             */

            File file = new File("D:\\CSV\\src\\Karina\\pr4\\foreign_names.csv");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String str;

            str = reader.readLine(); //Пропускаем первую строку с названиями столбцов

            /**
             * Метод split() в Java разделяет данную строку вокруг данного регулярного выражения.
             */

            ListOfPerson listOfPerson = new ListOfPerson();
            ListOfSubdivisions listOfSubdivisions = new ListOfSubdivisions();

            /*while ((str = reader.readLine()) != null)
            {
                String[] contents = str.split(";");
                for (String cell : contents)
                {
                    System.out.print(cell);
                }
                System.out.println();
            }*/

            while ((str = reader.readLine()) != null)
            {
                String[] content = str.split(";");
                listOfPerson.addPerson(
                        Long.valueOf(content[0]),
                        content[1],
                        content[2],
                        content[3],
                        listOfSubdivisions.getSubdivision(content[4]),
                        Long.valueOf(content[5]));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
