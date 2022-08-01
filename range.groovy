//Range represents a range of value

class GroovyTut{
    static void main(String[] args){

        def oneTo10 = 1..10;
        def aToZ = 'a'..'z'
        def zToA = 'z'..'a'

        println(oneTo10.toList());
        println(aToZ.toList());
        println(zToA.toList());


        println("Size "+ oneTo10.size());

        println("2nd Item " + oneTo10.get(1));

        println("Contains 11 " + oneTo10.contains(11));

        println("Get Last " + oneTo10.getTo());

        println("Get First " + oneTo10.getFrom());


    }
}