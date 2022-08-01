
/*
OOP - Just like all other programming languages:

 Classes are blueprints that are going to define  objects.

Every objects is going to hold fields and capablities that are called methods
*/

import groovy.transform.ToString;

@ToString(includeNames=true, includeFields=true)

class Animal{
    def name;
    def sound;

    def run(){
        println("$name runs");
    }

    def makeSound(){
        println("$name says $sound")
    }

    def Animal(name, sound){
        this.name =  name;
        this.sound = sound;
    }
}