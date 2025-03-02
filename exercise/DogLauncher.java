public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog(1);
        Dog d2 = new Dog(10);

        Dog bigger = Dog.compare(d1, d2);
        bigger.makeNoise();
    }
}
