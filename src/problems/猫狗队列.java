package problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 猫狗队列 {
    static class Pet{
        private String type;

        public Pet(String type) {
            this.type = type;
        }
        public String getType(){
            return this.type;
        }
    }

    static class Dog extends Pet{

        public Dog() {
            super("dog");
        }
    }

    static class Cat extends Pet{

        public Cat() {
            super("cat");
        }
    }
    /**
     * 宠物、狗和猫的类如上
     * 实现一种猫狗队列的结构
     * 用户可以调用 add 方法将 cat 类或 dog 类的实例放入队列中
     * 用户可以调用 pollAll 方法，将队列中所有的实例按照进队列的先后顺序依次弹出
     * 用户可以调用 pollCat 方法，将队列中 cat 类的实例按照进队列的先后顺序依次弹出
     * 用户可以调用 isEmpty 方法，检查队列中是否还有 dog 或 cat 类的实例
     * 用户可以调用 isDogEmpty 方法，检查队列中是否还有 dog 类的实例
     * 用户可以调用 isCatEmpty 方法，检查队列中是否还有 cat 类的实例
     */


    public static void main(String[] args) {
        CatDogQueue queue = new CatDogQueue();
        queue.add(new Cat());
        queue.add(new Cat());
        queue.add(new Dog());
        System.out.println(queue.pollCat());
    }

    static class MyPet{
        private Pet pet;
        private int count;

        public MyPet(Pet pet, int count) {
            this.pet = pet;
            this.count = count;
        }
        private MyPet(){

        }

        public Pet getPet() {
            return pet;
        }

        public void setPet(Pet pet) {
            this.pet = pet;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    static class CatDogQueue{
        private Queue<MyPet> cats;
        private Queue<MyPet> dogs;
        private int count;

        public CatDogQueue() {
            cats = new LinkedList<>();
            dogs = new LinkedList<>();
            this.count = 0;
        }

        public void add(Pet pet){
            switch (pet.getType()) {
                case "dog":
                    dogs.add(new MyPet(pet, count++));
                    break;
                case "cat":
                    cats.add(new MyPet(pet, count++));
                    break;
                default:
                    throw new IllegalArgumentException("非猫非狗");
            }
        }

        public Pet pollAll(){
            if (!dogs.isEmpty() && !cats.isEmpty()){
                if (dogs.peek().getCount() < cats.peek().getCount()){
                    return dogs.poll().getPet();
                }else{
                    return cats.poll().getPet();
                }
            }else if (!dogs.isEmpty()){
                return dogs.poll().getPet();
            }else if (!cats.isEmpty()){
                return cats.poll().getPet();
            }else{
                throw new RuntimeException("空");
            }
        }

        public Cat pollCat(){
            if (!isCatEmpty()){
                return (Cat) cats.poll().getPet();
            }else{
                throw new RuntimeException("猫空");
            }
        }

        public Dog pollDog(){
            if (!isDogEmpty()){
                return (Dog) cats.poll().getPet();
            }else{
                throw new RuntimeException("狗空");
            }
        }

        public boolean isEmpty(){
            return dogs.isEmpty() && cats.isEmpty();
        }

        public boolean isCatEmpty(){
            return cats.isEmpty();
        }

        public boolean isDogEmpty(){
            return dogs.isEmpty();
        }
    }


}
