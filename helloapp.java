public class helloapp {
    public static void main (String[] args)  {
        //Default name
        String name = "World";
        
        //check if a line is provided as command line argument
        if (args.length > 0) {
            name = args[0]; //use the provided name
        }
        System.out.println("Hello, " + name + "!");
    }
}