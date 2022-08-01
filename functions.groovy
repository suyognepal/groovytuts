//Methods or functions break our code into parts and also allows us to reuse our code 

class GroovyTut{
    static void main(String[] args){
        sayHello(); //method

        println("5 + 4 = " +getSum(5,4));

        def myName = "Suyog";
        passByValue(myName);
        println("In Main " + myName)

        def listToDouble = [1,2,3,4];
        listToDouble = doubleList(listToDouble);
        println(listToDouble);

        def nums = sumAll(1,2,3,4);
        println("Sum : " + nums);

        def fact4 = factorial(4);
        println("Factorial 4: " + fact4);

        def getFactorial = {num -> (num <= 1 ? 1: num call(num-1))};

        println("Factorial 4 : " + getFactorial(4));
    }

    static def sayHello(){
        println("Hello");
    }

    static def getSum(num1=0, num2=0){
        return num1 + num2;
    }

    static def passByValue(name){
        name = "In Function"
        println("Name: " + name);

    }

    static def doubleList(list){
        def newList = list.collect { it * 2};
        return newList;
    }

    static def sumAll(int... num) {
        def sum = 0;
        num.each {sum +=it;}
        return sum;
    }

//Functions that calls itself = recursion
    static def factorial(num) {
        if(num <= 1) {
            return 1;
        } else {
            return (num * factorial(num -1));
        }
    }

}