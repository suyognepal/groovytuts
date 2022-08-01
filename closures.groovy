//Closures: Can access values outside of it

class GroovyTut{
    static void main(String[] args){

        def greeting = "Goodbye";

        def sayGoodbye = {theName -> println("$greeting $theName")};

        sayGoodbye("Suyog");


        //Another examples : commonly used to form operations on each item in a list

        def numList = [1,2,3,4];
        numList.each {println(it)};

        def employees = [
            'Paul': 34,
            'Sally': 35,
            'Sam': 36
        ];

        employees.each {println("$it.key" : "$it.value");}

        def randNums = [1,2,3,4,5,6];
        randNums.each {num -> if(num % 2 == 0)
        println(num)};

        def namelist = ["Doug", "Sally", "Sue"];

        def matchEle = namelist.find {item -> item == 'Doug'}
        println(matchEle);

        def randNumsList = [1,2,3,4,5,6,7];
        def numMatches = randNumsList.findAll{item -> item > 4}
        println(numMatches);
        println("> 5 : " + randNumsList.any {item -> item > 5});
        println("> 1 : " + randNumsList.every {item -> item > 1});  
        println("Double : " + randNumsList.collect {item -> item * 2});    

        def getEven = {num -> return(num % 2 ==0)}
        def evenNums = listEdit(randNumsList, getEven);
        println("Evens : " + evenNums);   

        
    }

    static def listEdit(list, clo){
        return list.findAll(clo);
    }
}