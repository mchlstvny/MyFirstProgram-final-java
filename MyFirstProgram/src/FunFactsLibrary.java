import java.util.Random;

public class FunFactsLibrary {                       // Fun Facts Library, got the funcfacts from ChatGPT
    public static final String[][] FUN_FACTS = {     // It has to final not void, because I'm returning a value which is a funfact
    
        // MultiDimensional Array (https://www.programiz.com/java-programming/multidimensional-array)
        { 
            "Did you know that Java was once free of semicolons?", 
            "In early Java versions, semicolons were sometimes optional, but later they became required to structure the code properly." 
        },
        { 
            "Did you know that Java was originally named Oak?", 
            "Java was initially called 'Oak' because James Gosling, its creator, named it after an oak tree outside his office. Later, it was renamed 'Java' to avoid trademark issues." 
        },
        { 
            "Did you know that Java was created by James Gosling?", 
            "James Gosling, known as the 'Father of Java,' developed Java at Sun Microsystems in the mid-1990s." 
        },
        { 
            "Did you know that Java was first released in 1995?", 
            "Java was officially released in 1995 by Sun Microsystems and has since become one of the most widely used programming languages." 
        },
        { 
            "Did you know that Java is a high-level programming language?", 
            "Java is considered high-level because it abstracts complex operations, making it easier for developers to write code without dealing with low-level hardware details."
        },
        { 
            "Did you know that Java is a platform-independent language?", 
            "Java is platform-independent due to its 'Write Once, Run Anywhere' capability, enabled by the Java Virtual Machine (JVM)." 
        },
        { 
            "Did you know that NASA's Mars Rover was programmed in Java?", 
            "NASA used Java in its Mars Rover project because of Java’s reliability and cross-platform capabilities, making it ideal for space exploration." 
        },
        { 
            "Did you know that Java was designed for embedded systems?", 
            "Java was originally developed for interactive TV systems, but it was too advanced for its time. Today, it is widely used in Android, enterprise applications, and IoT devices." 
        },
        { 
            "Did you know that Java does not use pointers like C/C++?", 
            "Unlike C and C++, Java does not allow direct memory access using pointers. Instead, it uses references for security and memory safety." 
        },
        { 
            "Did you know that Java has an automatic garbage collector?", 
            "Java manages memory automatically using garbage collection, which removes unused objects to free up memory and prevent leaks." 
        },
        { 
            "Did you know that Java supports multithreading?", 
            "Java allows multiple tasks to run simultaneously using multithreading, making it ideal for high-performance applications like games and servers." 
        },
        { 
            "Did you know that Java uses a Just-In-Time (JIT) Compiler?", 
            "Java’s JIT compiler optimizes performance by translating bytecode into machine code at runtime, speeding up execution." 
        },
        { 
            "Did you know that Java’s Math.random() is not truly random?", 
            "Math.random() generates pseudorandom numbers based on an algorithm, meaning the output follows a predictable pattern." 
        },
        { 
            "Did you know that Java applets were removed due to security risks?", 
            "Java Applets were small programs that ran inside web browsers but were discontinued due to security vulnerabilities and the rise of modern web technologies." 
        },
        { 
            "Did you know that Java’s switch statement supports strings?", 
            "Since Java 7, the switch statement can use String values, making it more flexible for handling text-based conditions." 
        },
        { 
            "Did you know that Java is widely used in banking and finance?", 
            "Many financial institutions use Java for security, reliability, and scalability in applications like ATMs and trading platforms." 
        },
        { 
            "Did you know that Java has a Robot class?", 
            "The Robot class can simulate keyboard and mouse actions, making it useful for automation and testing." 
        },
        { 
            "Did you know that Java has a 'transient' keyword?", 
            "In Java serialization, the 'transient' keyword prevents sensitive fields from being saved, ensuring data security." 
        },
        { 
            "Did you know that Java runs on over 3 billion devices?", 
            "Java is one of the most widely used programming languages, running on computers, mobile devices, smart cards, and more." 
        },
        { 
            "Did you know that Java is still evolving?", 
            "With new versions released every six months, Java continues to improve with features like records, pattern matching, and enhanced performance." 
        }
    };


    // Randomly selecting a fun fact
    public static String[] getRandomFunFact() {
        Random random = new Random();
        return FUN_FACTS[random.nextInt(FUN_FACTS.length)];
    }
}
