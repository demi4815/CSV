package Karina.pr4;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try
        {
            //Java класс BufferedReader читает текст из потока ввода символов,
            //буферизуя прочитанные символы, чтобы обеспечить эффективное считывание символов,
            //массивов и строк. Можно указать в конструкторе вторым параметром размер буфера.

            File file = new File("D:\\CSV\\src\\Karina\\pr4\\foreign_names.csv");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String str;

            str = reader.readLine(); //Пропускаем первую строку с названиями столбцов

            ListOfPerson listOfPerson = new ListOfPerson();
            ListOfSubdivisions listOfSubdivisions = new ListOfSubdivisions();

            while ((str = reader.readLine()) != null)
            {
                String[] content = str.split(";");// Метод split() в Java разделяет данную строку вокруг данного выражения.
                listOfPerson.addPerson(
                        Long.valueOf(content[0]),
                        content[1],
                        content[2],
                        content[3],
                        listOfSubdivisions.getSubdivision(content[4]),
                        Long.valueOf(content[5]));
            }

            for (Person person : listOfPerson.personList) {
                System.out.println(person.toString());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();//Поможет определить, какой метод вызывает ошибку.
        }

    }
}
