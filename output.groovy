class GroovyTut{
    static void main(String[] args){

        def randString = "Random";

        println("A $randString String");

        printf("A %s string \n", randString);


/*
s represents string
d integer
.2f 2decimal palaces
-10%s Puts padding in the left %10s puts padding in the right
*/

        printf("%-10s %d %.2f \n", ['Stuff', 10, 1.234, 'Random']);

        // printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.234, 'Random']);

   }

}