class GroovyTut{
    static void main(String[] args){
        
        def king = new Animal('King', 'Growl');

        println("$king.name says $king.sound");

        king.setSound('Grrrrr');

        println("$king.name says $king.sound");

        king.run();

        println(king.toString());

        //dog object

        def grover = new Dog('Grover','Grr', 'Suyog');

        king.makeSound();
        grover.makeSound();

    }
}