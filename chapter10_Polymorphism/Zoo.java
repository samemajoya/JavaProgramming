package chapter10_Polymorphism;

public class Zoo {

    public static void main(String[] args){

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal tomy = new Dog();
        tomy.makeSound();
        feed(tomy);

        tomy = new Cat();
        tomy.makeSound();
        ((Cat) tomy).scratch( );
        feed(tomy);
    }

    public static void feed(Animal animal){
            if (animal instanceof Dog){
                System.out.println("here's your dog food");
            }
            else if (animal instanceof Cat) {
                System.out.println("here's your cat food");
            }
    }
}
