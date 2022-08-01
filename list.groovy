class GroovyTut{
    static void main(String[] args) {

        def primes = [2,3,5,7,11,13];


//Get list items as index

        println("2nd Prime " + primes[1]);
        println("3rd Prime " + primes.get(2));

def employee = ["Suyog", 40, 6.25, [1,2,3]];


//geting 2 item from list of list
println("2nd Number " + employee[3][1]);

//length of list
println("Length " + primes.size());

//add to index
primes.add(17)

//append to index
primes<<19;

primes.add(23);

//Conct to list
primes + [29, 31]

//remove last intem from list
primes - [31]

print("Is Empty " + primes.isEmpty());

//First 3 items of list

println("\n1st 3 item of list " + primes[0..2]);

println(primes);


//Mathcings list
println("Matches " + primes.intersect([2,3,7]));

//Reverse List
println("Reveres "  + primes.reverse());

//sorting list
println("Sort " + primes.sort());


//poping last item from list
println("Last " + primes.pop());
    }
}