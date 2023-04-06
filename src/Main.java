import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("INPUT.TXT"));
        ArrayList<Double> perimeters = new ArrayList<>();
        ArrayList<Double> areas = new ArrayList<>();
        while (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            areas.add(a*b);
            perimeters.add((a+b)*2);
        }
        Collections.sort(areas);
        System.out.println(areas.get(perimeters.size()-1)+", "+areas.get(perimeters.size()-2));
        Collections.sort(perimeters);
        System.out.println(perimeters.get(perimeters.size()/2));
    }
}