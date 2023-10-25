
import java.util.HashMap;
import java.util.Map;

public class Concept {


    public static void main(String[] args) {
        HashMap<Integer, Animal> hashMap = new HashMap<>();
        Animal cat = new Animal(1, "Cat", 10.2);
        Animal dog = new Animal(2, "Dog", 5.2);
        Animal chicken = new Animal(2, "Chicken", 3.2);
        Animal snake = new Animal(3, "Snake", 100.2);
        Animal animal = new Animal(4, "Animal", 1.2);

        hashMap.put(cat.getId(),cat);
        hashMap.put(dog.getId(),dog);
        hashMap.put(chicken.getId(),chicken);
        hashMap.put(snake.getId(),snake);
        hashMap.put(animal.getId(),animal);
        hashMap.put(0,cat);
        for (Map.Entry<Integer, Animal> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            Animal value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }



}
