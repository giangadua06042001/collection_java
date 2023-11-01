
import java.util.*;

 class Concept {


    public static void main(String[] args) {

        Animal cat = new Animal("01", "Cat", 10.2);
        Animal dog = new Animal("2", "Dog", 5.2);
        Animal chicken = new Animal("3", "Chicken", 3.2);
        Animal snake = new Animal("4", "Snake", 100.2);
        Animal animal = new Animal("5", "Animal", 1.2);
//        HashMap<Integer,Animal>animalHashMap=new LinkedHashMap<>();
//        hashMap.put(dog.getId(),dog);
//        hashMap.put(cat.getId(),cat);
//        hashMap.put(chicken.getId(),chicken);
//        hashMap.put(snake.getId(),snake);
//        hashMap.put(animal.getId(),animal);
//        for (Map.Entry<Integer, Animal> entry : hashMap.entrySet()) {
//            int key = entry.getKey();
//            Animal value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
//        }
//        System.out.println("================================================");
//        SortedMap<Integer,Animal>animalSortedMap=new TreeMap<>();
//        animalSortedMap.put(animal.getId(),animal);
//        animalSortedMap.put(dog.getId(),animal);
//        animalSortedMap.put(snake.getId(),snake);
//        animalSortedMap.put(cat.getId(),cat );
//        animalSortedMap.put(chicken.getId(),chicken);
//        animalSortedMap.put(8,chicken);
//        for (Map.Entry<Integer,Animal>entry:animalSortedMap.entrySet()) {
//            int key=entry.getKey();
//            Animal animalTreeMap=entry.getValue();
//            System.out.println("Key:"+key +",Value:"+animalTreeMap);
//        }
//        System.out.println("su dung iterator de duyet mang");
//        List<Animal> animalList = new ArrayList<>();
//        animalList.add(cat);
//        animalList.add(dog);
//        animalList.add(animal);
//        animalList.add(snake);
//        animalList.add(chicken);
//        animalList.add(cat);
//        for (Animal item : animalList) {
//            System.out.println("animal" + item);
//        }
//        System.out.println("===================================================");
//        Map<String, Animal> animalMap = new HashMap<>();
//        animalMap.put(null, dog);
//        animalMap.put(cat.getId(), cat);
//        animalMap.put(dog.getId(), dog);
//        animalMap.put(chicken.getId(), chicken);
//        animalMap.put(animal.getId(), animal);
//        animalMap.put(snake.getId(), snake);
//
//        System.out.println("Duyệt Map sử dụng Iterator:");
//        for (Map.Entry<String, Animal> entry : animalMap.entrySet()) {
//            String key = entry.getKey();
//            Animal value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
//        }
        List<Animal> animalListEd = new LinkedList<>();
        animalListEd.add(cat);
        animalListEd.add(chicken);
        animalListEd.add(snake);
        animalListEd.add(animal);
        List<Animal>arrayListAnimal=new ArrayList<>();
        arrayListAnimal.add(cat);
        arrayListAnimal.add(chicken);
        arrayListAnimal.add(snake);
        arrayListAnimal.add(animal);
        Animal animal1 = animalListEd.get(0);
        Animal arrayAnimail=arrayListAnimal.get(0);
        System.out.println("Day la dung LinkList"+" :"+animal1);
        System.out.println("Day la dung ArrayList"+" :"+arrayAnimail);
    }


//        Iterator<Animal> iterator = animalList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        for (Animal a :animalList) {
//            System.out.println(a.getName());
//        }
//        animalList.get(1);
}


