package 리스트연습;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

public class AnimalMain {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<Animal>();
        List<Integer> codeList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in);

    int selectNumber = 0;
    int index = 0;
    String index2= null;

    System.out.println("몇 마리를 입력 하시나요");
    selectNumber = scanner.nextInt();

    System.out.println("Animal Code를 입력하세요");
    for(int i = 0; i < selectNumber; i++) {
        index = scanner.nextInt();
        codeList.add(index);
    }
    String empty = scanner.nextLine();

    System.out.println("Animal Name을 입력하세요");
    for(int i = 0; i < selectNumber ; i++) {
            index2 = scanner.nextLine();
            nameList.add(index2);
        }

        System.out.println(codeList);
        System.out.println(nameList);

        for(int i = 0; i < codeList.size(); i++) {
        Animal animal = new Animal(codeList.get(i), nameList.get(i));
        animals.add(animal);
        }

        Gson gson  = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(animals);
        System.out.println(json);

    }
}
