package Wzorce.Fish;

public class Fish {
    private double lenght;
    private int age;
    private String colour;
    private double weight;
    private boolean flying;

    private Fish() { //tylko po to aby się dało tylko przez builder\
    }

    public static class FishBuilder {
        private double lenght;
        private int age;
        private String colour;
        private double weight;
        private boolean flying;

        public Fish build() {
            Fish fish = new Fish();
            fish.lenght = this.lenght;
            fish.age = this.age;
            fish.colour = this.colour;
            fish.weight = this.weight;
            fish.flying = this.flying;

            return fish;
        }

        ;


        public FishBuilder lenght(double lenght) {
            this.lenght = lenght;
            return this;
        }

        public FishBuilder age(int age) {
            this.age = age;
            return this;
        }

        public FishBuilder colour(String colour) {
            this.colour = colour;
            return this;
        }

        public FishBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public FishBuilder flying(boolean flying) {
            this.flying = flying;
            return this;
        }


    }

}
