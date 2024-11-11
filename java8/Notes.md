# Java 8 Notes #

### Lambda Expression
1. Calling void method without arguments    
   Interf i1 = () -> System.out.println("Method m1 called using lambda expression.");
   i1.m1();

2. Calling method with arguments  
   Interf1 i1 = (a, b) -> System.out.println("Using lambda expression approach sum=" + (a + b));
   i1.add(10, 20);

3. Calling int method with string arguments   
   Interf2 i2 = String::length;
   System.out.println("String length using lambda expression approach is " + i2.length("Sachin"));

4. Multithreading Runnable Interface   
   Runnable r1 = () -> {
   for (int i = 0; i < 5; i++) {
   System.out.println("Child thread");
   try {
   Thread.sleep(1555);
   } catch (InterruptedException e) {
   e.printStackTrace();
   }
   }
   };

5. ArrayList comparator interface   
   al.sort(Integer::compareTo);
   al.sort(Comparator.reverseOrder());

6. Sort employees based on name   
   al.sort(Comparator.comparing(Employee::getEmpName));

7. Sort employees based on ID   
   al.sort(Comparator.comparing(Employee::getEmpId));

8. Block lambda expression   
   Factorial factorial = (int a) -> {
   int fact = 1;
   for (int i = 1; i <= a; i++) {
   fact = fact * i;
   }
   return fact;
   };

### Functional Interfaces
1. Consumer functional interface (Represents an operation that accepts a single input argument and returns no result. contains method accept())   
   Consumer<Integer> consumer = a -> System.out.println("Printing : " + a);
   consumer.accept(10);

2. Predicate functional interface (Represents a predicate (boolean-valued function) of one argument. This is a functional interface whose functional method is test(Object).)
   Predicate<Integer> predicate = i -> i % 2 == 0;
   System.out.println("Number is even : " + predicate.test(13)); // return true or false

3. 



### Stream API 
1. Print objects using foreach  <br/>
-> ls.forEach(System.out::println); // For List <br/>
-> map.forEach((key, value) -> System.out.println(key + " " + value)); // For Map  <br/>
-> map.entrySet().forEach(System.out::println); // For Map using EntrySet  <br/>


2.
