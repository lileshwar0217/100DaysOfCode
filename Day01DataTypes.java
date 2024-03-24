public class Day01DataTypes {

    public static void main(String[] args) {
        // Primitive Data Types
        // 1. byte: 1 byte, range from -128 to 127
        byte byteVar = 100;
        
        // 2. short: 2 bytes, range from -32,768 to 32,767
        short shortVar = 20000;
        
        // 3. int: 4 bytes, range from -2^31 to 2^31-1
        int intVar = 1000000;
        
        // 4. long: 8 bytes, range from -2^63 to 2^63-1
        long longVar = 1000000000L; // Note the 'L' suffix to indicate it's a long literal
        
        // 5. float: 4 bytes, range from 1.4e-45 to 3.4e+38, 7 decimal digits
        float floatVar = 3.14f; // Note the 'f' suffix to indicate it's a float literal
        
        // 6. double: 8 bytes, range from 4.9e-324 to 1.8e+308, 15 decimal digits
        double doubleVar = 3.14159;
        
        // 7. char: 2 bytes, Unicode characters
        char charVar = 'A';
        
        // 8. boolean: 1 bit, true or false
        boolean booleanVar = true;
        
        // Non-Primitive Data Types
        // 9. String: Represents a sequence of characters
        String stringVar = "Hello, World!";
        
        // Displaying values of variables
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);
        System.out.println("stringVar: " + stringVar);
        
        // Interview Features
        // Common Interview Questions
        
        // Question 1: What are the eight primitive data types in Java?
        // Answer: Java has eight primitive data types: byte, short, int, long, float, double, char, and boolean.
        
        // Question 2: Explain the differences between primitive data types and reference data types.
        // Answer: Primitive data types store actual values, while reference data types store references or memory addresses of objects. Primitive data types are not objects and are passed by value, whereas reference data types are objects and are passed by reference.
        
        // Question 3: What is autoboxing in Java?
        // Answer: Autoboxing is the automatic conversion of primitive data types to their corresponding wrapper classes by the Java compiler. For example, converting an int to an Integer or a boolean to a Boolean.
        
        // Question 4: What is the default value of the boolean data type in Java?
        // Answer: The default value of the boolean data type in Java is 'false'.
        
        // Question 5: How are floating-point numbers handled in Java?
        // Answer: Java has two floating-point primitive data types: float and double. By default, floating-point literals are treated as double unless explicitly specified as float using the 'f' or 'F' suffix.
    }
}
