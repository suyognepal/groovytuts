/*Everything in a Groovy is an object.
  
*/


//Defining a class

class GroovyTut{
    static void main(String[] args) {
    
    /*
    All code will run in this static function
    
    
    Staic means it method or functions that 
    belongs to the class.

    Void means it will return nothing when the method or functions runs. 


    Main means the main executable functions that is gonna executue whever file this executed. 

    String is an array that is called args if any thing is passed with the file like string or numbers or Float or whatever  every thing will be stored in that array.
    */

        println("Hello World");

        
//Basic math operations

        println("5 + 4 = " + (5 + 4));
        println("5 - 4 = " + (5 - 4));
        println("5 * 4 = " + (5 * 4));
        println("5 / 4 = " + (5.intdiv(4)));
        println("5 % 4 = " + (5 % 4));

//Floating point operations
        println("5.2 + 4.4 = " + (5.2.plus(4.4)));
        println("5.2 - 4.4 = " + (5.2.minus(4.4)));
        println("5.2 * 4.4 = " + (5.2 .multiply(4.4)));
        println("5.2 / 4.4 = " + (5.5/4.4));
              
//Order of operations is just like other programming lanuguages          
        println("3 + 2 * 5 = " + (3 + 2 * 5));          
        println("(3 + 2) * 5 = " + ((3 + 2) * 5));       

 /*
 Defining Variables or fields whatever you call them  by  def. 
 
  Variables can be numbers or letters or underscores.  

  Variables are dynamically typed what that means is u can define age and change it like below example.
  */ 
        def age = "Dog"; 
        age = 40;
        println(age)

/*
Increment and decrement of variables

*/

println("age ++ =" + (age++)); //prints 40 because we increment age after it is called
println("++age  =" + (++age)); //first adds the value and prints it

println("age-- =" + (age--));  //first prints out age and decrements it 

println("--age =" + (--age)); //first decrements and prints

// Largest integers, largest floats and  largest double

println("Biggest Int " + Integer.MAX_VALUE);
println("Smallest Int " + Integer.MIN_VALUE);

println("Biggest Float " + Float.MAX_VALUE);
println("Biggest Float " + Float.MIN_VALUE);

println("Biggest Double " + Double.MAX_VALUE);
println("Biggest Double " + Double.MIN_VALUE);
  
//Decimals are very accurate

println("1.101010101010101010101010 + 1.01010101020202021010 = " + (1.101010101010101010101010 + 1.11010101020202021010));

def randNum = 2.0;
println("Math.abs(-2.45) = "  + (Math.abs(-2.45)));
println("Math.round(2.55) = "  + (Math.round(2.55)));

//println("Math.round(2.45) = " + (Math.abs(-2.45)));
//println("Math.pow(-2.45) = " + (Math.abs(-2.45)));
// println("3.0.equals(2.0) = " + 3.0.equals(2.0)));
println("3.0.equals(2.0) = " + 3.0.equals(2.0));
// println("randNUm.equals(float.NAN)= " + (randNUm.equals(float.NAN))));
//println("randNum.equals(Float.NAN) = " + (randNUm.equals(Float.NAN)));

println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)));

println("Math.sqrt(9) = " + (Math.sqrt(9)));
println("Math.cbrt(27) = "+ (Math.cbrt(27)));
// println("Math.abs(-2.45) =" + (Math.ceil(-2.45)));
println("Math.floor(2.45) =" + (Math.floor(2.45)));

println("Math.min(2,3 = " + (Math.min(2,3)) );

println("Math.min(2,3 = " + (Math.max(2,3)) );


println("Math.log(2) = " + (Math.log(2)));
println("Math.log10(2) = " + (Math.log10(2)));

println("Math.toDegrees (Math.PI) =" + (Math.toDegrees(Math.PI)));
println("Math.toRadians(90) =" + (Math.toRadians(90)));


// sin, cos, tan, asin, acos, atan, sinh, cosh, tanh

println("Math.sin(0.5 * Math.PI) = " + (Math.sin(0.5 * Math.PI)));


println("Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1));


    }
}