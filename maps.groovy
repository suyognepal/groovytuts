/*

Maps is very similar to a list: But it contains list of objects with keys (similar to key:value pair (dictionary) in python)

*/

class GroovyTut{
    static void main(String[] args){
        
        def suyogMap =  [
        'name' : 'Suyog',
        'age' : 35,
        'address': 'Patan Main St',
        'list': [1,2,3]
        ];
        

//Diffrent ways to access map objects
        println("Name " + suyogMap
        ['name']);

        println("List Item " + suyogMap['list'][2])

        println("Age " + suyogMap.get('age'));

//add keys to maps

        suyogMap.put('city', 'Lalitpur');

//Check for key
        println("Has City " + suyogMap.containsKey('city'));

//Size of map
        println("Size " + suyogMap.size());
    }
   
}