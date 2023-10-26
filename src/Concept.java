
import java.util.*;

public class Concept {


    public static void main(String[] args) {
        HashMap<Integer, Animal> hashMap = new HashMap<>();
        Animal cat = new Animal(1, "Cat", 10.2);
        Animal dog = new Animal(2, "Dog", 5.2);
        Animal chicken = new Animal(55, "Chicken", 3.2);
        Animal snake = new Animal(3, "Snake", 100.2);
        Animal animal = new Animal(104, "Animal", 1.2);
        HashMap<Integer,Animal>animalHashMap=new LinkedHashMap<>();
        hashMap.put(dog.getId(),dog);
        hashMap.put(cat.getId(),cat);
        hashMap.put(chicken.getId(),chicken);
        hashMap.put(snake.getId(),snake);
        hashMap.put(animal.getId(),animal);
        for (Map.Entry<Integer, Animal> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            Animal value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
        System.out.println("================================================");
        SortedMap<Integer,Animal>animalSortedMap=new TreeMap<>();
        animalSortedMap.put(animal.getId(),animal);
        animalSortedMap.put(dog.getId(),animal);
        animalSortedMap.put(snake.getId(),snake);
        animalSortedMap.put(cat.getId(),cat );
        animalSortedMap.put(chicken.getId(),chicken);
        for (Map.Entry<Integer,Animal>entry:animalSortedMap.entrySet()) {
            int key=entry.getKey();
            Animal animalTreeMap=entry.getValue();
            System.out.println("Key:"+key +",Value:"+animalTreeMap);
        }
    }



}
