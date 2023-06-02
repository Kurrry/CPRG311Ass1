package utilities;

import shapes.Shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.StringTokenizer;
import shapes.*;
import sorts.SortController;

public class Controller {
    String fileName/* = "C:\ProgrammingStuff\polyfor1.txt"*/;
    char typeSort;
    char sortMethod;
    Shapes[] shapes;
    public Controller(String[] args) {
        for (String s : args) {
            switch (s.toLowerCase().charAt(1)) {
                case 'f':
                    String temp = s.substring(2);
                    temp = temp.replaceAll("\"", "");
                    fileName = temp;
                    break;

                case 't': typeSort = s.toLowerCase().charAt(2); break;
                case 's': sortMethod = s.toLowerCase().charAt(2); break;
            }
        }

        char[] typeSortDict = {'h', 'v', 'a'};
        char[] sortMethodDict = {'b', 's', 'i', 'm', 'q', 'z'};

        boolean typeSortCheck = validateInput(typeSort, typeSortDict);
        boolean sortMethodCheck = validateInput(sortMethod, sortMethodDict);

        if(!typeSortCheck || !sortMethodCheck) {
            System.out.println("Please enter a valid input for -t and -m options." +
                    "Valid input for -t is h, v or a.\n" +
                    "valid input for -m is b, s, i, m, q or z.");
            System.exit(1);
        }


        parseFile();
        long start = System.currentTimeMillis();
        doSort();
        long stop = System.currentTimeMillis();
        long runTime = stop - start;

        printResults();
        /*for(Shapes s : shapes) {
            System.out.println(s + " " + s.calcVolume());
        }*/
        System.out.println("Time to sort in ms: " + runTime);

        //System.out.println(shapes[0]);
        //System.out.println(shapes[shapes.length-1]);
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
            System.out.println("Please enter a valid file path using the -f option.");
            System.exit(2);
        }
    }

    private void doSort() {
        switch (typeSort) {
            case 'h': SortController.sort(shapes, sortMethod); break;
            case 'a': SortController.sort(shapes, sortMethod, new AreaCompare()); break;
            case 'v': SortController.sort(shapes, sortMethod, new VolumeCompare()); break;
        }
    }

    private static boolean validateInput(char input, char[] dict) {
        for (char c : dict) {
            if(input == c) {
                return true;
            }
        }
        return false;
    }

    private void printResults() {
        String sortMethodRead = "The sort method used for this sort is ";
        String concatSort = "";
        switch (sortMethod) {
            case 'b': concatSort = "BubbleSort"; break;
            case 's': concatSort = "SelectionSort"; break;
            case 'i': concatSort = "InsertionSort"; break;
            case 'q': concatSort = "QuickSort"; break;
            case 'z': concatSort = "HeapSort"; break;
            case 'm': concatSort = "MergeSort"; break;
        }
        System.out.println(sortMethodRead + concatSort);

        switch (typeSort) {
            case 'a':
                System.out.println("First Shape: " + shapes[1] + "  Area: " + shapes[1].calcBaseArea() +
                        "\nLast Shape: " + shapes[shapes.length-1] + " Area: " + shapes[shapes.length-1].calcBaseArea());

                for(int i = 999; i < shapes.length; i += 1000) {
                    System.out.println("The Shape at index " + i + ": " + shapes[i] + " Area: " + shapes[i].calcBaseArea());
                }
                break;
            case 'v':
                System.out.println("First Shape: " + shapes[1] + " Volume: " + shapes[1].calcVolume() +
                        "\nLast Shape: " + shapes[shapes.length-1] + " Volume: " + shapes[shapes.length-1].calcVolume());

                for(int i = 999; i < shapes.length; i += 1000) {
                    System.out.println("The Shape at index " + i + ": " + shapes[i] + " Volume: " +
                            shapes[i].calcVolume());
                }
                break;
            case 'h':
                System.out.println("First Shape: " + shapes[1] + " Height: " + shapes[1].getHeight() +
                        "\nLast Shape: " + shapes[shapes.length-1] + " Height: " + shapes[shapes.length-1].getHeight());

                for(int i = 999; i < shapes.length; i += 1000) {
                    System.out.println("The Shape at index " + i + ": " + shapes[i] + " Height: " +
                            shapes[i].getHeight());
                }
                break;
        }
    }
}
