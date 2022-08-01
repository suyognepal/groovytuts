class GroovyTut{
    static void main(String[] args){

        //Print Content of File
        new File("test.txt").eachLine {
            line -> println "$line";

        //Overwrite a File
        new File("test.txt").withWriter ('utf-8') {
            writer -> writer.writeLine("Line 4");
        }            
        }

        //Append to a file

        File file = new File("test.txt");
        file.append("Line 5");
        println(file.text);

        //Get File Size
        println("File Size : ${file.length()} bytes");

        //Check whether it is file of not
        println("File : ${file.isFile()}");
        
        //Check whether it is dir

        println("Dir : ${file.isDirectory()}");

        //Copy contents of file to a new file
        def newFile = new File("test2.txt");
        newFile << file.text;

        //Delete a file
        newFile.delete();

        //List file absolute path
        def dirFiles = new File("").listRoots();
        dirFiles.each {
            item -> println file.absolutePath; 
        }


        
    }
}