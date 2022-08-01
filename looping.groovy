class GroovyTut{
    static void main(String[] args){

        def i = 0;

        while(i < 10){
            if(i % 2){
                i++;
                continue;
            } 
            if (i == 8){
                break;
            }
            println(i);
            i++
        }


        //For Loop with increment

        for(i = 0; i < 5; i++){
            println(i);
        }

        //For loop with range
        for(k in 2..6){
            println(k);
        }

        //For loop with list
        def randList = [10,12,13,14]

        for (f in randList){
            println(f);
        }

        //For loop with maps
        def custs = [
            100: "Paul",
            101: "Sally",
            102: "Sue"
        ];

        for(cust in custs){
            println("$cust.value: $cust.key")
        }
    }
}