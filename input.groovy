class GroovyTut{
    static void main(String[] args){

        println("Whats your Name ");
        def fName = System.console().readLine();
        println("Hello " + fName);


//Convert input into Double
        print("Enter A Number ");
        def num1 = System.console().readLine().toDouble();


        print("Enter A Number ");
        def num2 = System.console().readLine().toDouble();


        printf("%.2f + %.2f = %.2f \n",[num1, num2, (num1 + num2)]);


    
    
            }       
}
