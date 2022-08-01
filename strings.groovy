class GroovyTut{
    static void main(String[] args) {

        def name = "Suyog"

/*

Whatevr within a single quote is taken seriously example below.

*/
        println('I am ${name}\n');
        println("I am ${name}\n");

        def multString = '''Triple qoutes are used  as miltiString it is  a String that goes on form many lines \n ''';

        println(multString)


        //Accesing Letters from string as indexs

        println("3rd Indx of Name " + name[3]);
        println("Index of y " + name.indexOf('y'));

        println("1st 3 Chars " + name[0..2]);

        println("Every Other Character " + name[0,2,4]);


        println("Substring at 1 to 4 " + name.substring(0,4));

        println("Substring at 1 " + name.substring(0));


        //Concatinating Strings

        println("My Name " + name);
        println("My Name ".concat(name));


        //other operations
        println("What I Said is " * 2 );

        //check for equality

        println("Suyog == Suyog " + ('Suyog'.equals('Suyog')));

        println("Suyog == suyog " + ('Suyog'.equalsIgnoreCase('suyog')));

        //Length of String

        println("Length " + name.length());

        def repeatStr = "What is said us " * 2

        println("Length of the string = " + repeatStr.length() )

        println(repeatStr - "What"); //Removes what from the sentence

        println(repeatStr.split(' ')); //Splits Words in space
        println(repeatStr.toList()); //Converts every letter into a list including spaces

        // println(repeatStr.replacAll('is', 'She'));


        println("To Uppercase " + name.toUpperCase());
        println("To lowercase " + name.toLowerCase());

        //Comparing Strings print 1 when true -1 when false
        println("Ant <=> Banana " + ('Ant')<=>('Banana'))

        println("Ant <=> ANT " + ('Ant')<=>('ANT'))


        println("Ant <=> Banana " + ('Ant')<=>('Banana'));

        println("Ant <=> Banana " + (('Ant')<=>('Banana')) );   

        
            


    }
}