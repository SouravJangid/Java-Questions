public class runcommand {

    // javac filename.java
    // java filename

    public static void main(String[] args) {
        // public is scope of main method
        // is method is static then it will load in memory first 
        // lead to execute main method first
        // void (method will return anything )

        // there can be more than one main method in a source code 
        // called method overloading

        // string[] args is command line arguments 
        
    
        System.out.println("This is recognised by JRE");
        // main();  //user defined overloaded main method

    }

    public static void main() {
        System.out.println("This is not recognised by JRE");
    }
}
