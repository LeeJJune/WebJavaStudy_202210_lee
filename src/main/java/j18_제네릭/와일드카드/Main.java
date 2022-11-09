package j18_제네릭.와일드카드;


public class Main {
    public AnimalData<?> getAnimal(int flag) {      // <?> 데이터 형식이 고정되지 않는다
        if (flag == 1) {
            AnimalData<Human> animalData = new AnimalData<Human>(new Human());

            return animalData;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;
        }else if (flag == 3) {
            AnimalData<Car> animalData = new AnimalData<Car>(new Car("K5"));
            return animalData;
            // 위 주석문은 <T extends Animal> 사용으로 인해 Car 클래스에 return 불가능하다
        }
        return null;
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getAnimal(2));

    }
}
