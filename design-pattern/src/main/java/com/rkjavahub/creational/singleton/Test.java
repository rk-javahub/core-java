package com.rkjavahub.creational.singleton;

/*Class to test singleton behavior of Logger class.*/
public class Test {

    public static void main(String[] args) {
        // Generate compile time error since we cant access private constructor.
        // Logger log1=new Logger();
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        log2.setLogMessage("Hello log4 object....");
        Logger log3 = Logger.getInstance();
        log3.setLogMessage("Hello log6 object....");

        // Check object equality
        System.out.println(log1 == log2);

        // Get log message
        System.out.println(log2.getLogMessage());
        System.out.println(log3.getLogMessage());

        // Trying to clone object which throws exception.
        // Logger log4 = (Logger) log2.clone();
    }
}
