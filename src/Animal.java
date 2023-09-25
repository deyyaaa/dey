public class Animal {
        public void AnimalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Pig extends
            Animal {
        public void AnimalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Dog extends Animal {
        public void AnimalSound() {
            System.out.println("The dog says: bow wow");
        }
    }
