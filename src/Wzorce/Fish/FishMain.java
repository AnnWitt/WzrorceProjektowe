package Wzorce.Fish;

public class FishMain {
    public static void main(String[] args) {
        Fish goldFish = new Fish.FishBuilder()
                .age(15)
                .colour("red")
                .flying(true)
                .build(); //zamykam buildera
    }


}
