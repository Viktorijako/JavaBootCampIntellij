package Bonus;


public abstract class Person {


    private int age;


    public static void main(String[] args) {

    }

        public Person() {

        }
        public abstract String getName();
        public abstract void setName(String name);

        public int getAge () {
            return age;
        }
        public void setAge ( int age){
            this.age = age;
        }
    }