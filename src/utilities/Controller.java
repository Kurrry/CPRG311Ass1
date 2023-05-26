package utilities;

import shapes.Shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.StringTokenizer;
import shapes.*;

public class Controller {
    String fileName/* = "C:\ProgrammingStuff\polyfor1.txt"*/;
    char typeSort;
    char sortMethod;
    Shapes[] shapes;
    public Controller(String[] args) {
        for (String s : args) {
            switch (s.toLowerCase().charAt(1)) {
                case 'f' -> {
                    String temp = s.substring(2);
                    temp = temp.replaceAll("\"", "");
                    fileName = temp;
                }
                case 't' -> typeSort = s.toLowerCase().charAt(2);
                case 's' -> sortMethod = s.toLowerCase().charAt(2);
            }
        }


        parseFile();

        for(Shapes s : shapes) {
            System.out.println(s);
        }
    }

    private void parseFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int i = 0;
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            int size = Integer.parseInt(st.nextToken());
            shapes = new Shapes[size];

            while (i < size) {
                Object o;
                String className = "shapes." + st.nextToken();
                Class<?> clas = Class.forName(className);
                Class<?>[] paramTypes = new Class[2];
                paramTypes[0] = Double.TYPE;
                paramTypes[1] = Double.TYPE;
                Constructor<?> ct = clas.getConstructor(paramTypes);

                Object[] argList = new Object[2];
                argList[0] = Double.parseDouble(st.nextToken());
                argList[1] = Double.parseDouble(st.nextToken());
                o = ct.newInstance(argList);
                shapes[i] = (Shapes) o;
                i++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
