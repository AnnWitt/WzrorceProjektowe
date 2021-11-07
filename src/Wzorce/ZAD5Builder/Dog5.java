package Wzorce.ZAD5Builder;

import java.util.List;

public class Dog5 {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    public Dog5() {
    }

    public static class Dog5Builder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        public Dog5 build() {
            Dog5 dog = new Dog5();
            dog.name = this.name;
            dog.type = this.type;
            dog.age = this.age;
            dog.toys = this.toys;
            return dog;
        }

        public Dog5Builder name(String name) {
            this.name = name;
            return this;
        }

        public Dog5Builder type(String type) {
            this.type = type;
            return this;
        }

        public Dog5Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Dog5Builder toys(List<String> toys) {
            this.toys = toys;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Dog5{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", toys=" + toys +
                '}';
    }
}
