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

3. Supplier functional interface (Represents a supplier of results. This is a functional interface whose functional method is get().)  
   Supplier<String> supplier = () -> "Hello Rohit";
   System.out.println(supplier.get());
4. 



### Printing using foreach 
1. Print objects using foreach  <br/>
-> ls.forEach(System.out::println); // For List <br/>
-> map.forEach((key, value) -> System.out.println(key + " " + value)); // For Map  <br/>
-> map.entrySet().forEach(System.out::println); // For Map using EntrySet  <br/>


### Stream API 
1. filter method 
   1. filter employee based on department
      employees.stream().filter(emp -> emp.getDept().equals("Development")).toList().forEach(System.out::println);
   
   2. filter employee based on department and salary and store in map
      Map<String, Double> empleeMap = employees.stream().filter(emp -> emp.getDept().equals("Development") && emp.getSalary() > 80000).collect(Collectors.toMap(Employee::getName, Employee::getSalary));

2. map method (Get only names of employee)
   employees.stream().map(Employee::getName).forEach(System.out::println);

3. distinct method (Get distinct department names)
   employees.stream().map(Employee::getDept).distinct().forEach(System.out::println);

4. flatmap method (To get nested records. Here we are getting nested project class details inside employee class)
   employees.stream().flatMap(e -> e.getProjects().stream().map(Project::getName)).distinct().forEach(System.out::println);

5. sorting method
   1. ascending order (sort employees based on salary in ascending order)
      employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList().forEach(System.out::println);
   
   2. descending order (sort employees based on salary in descending order)
      employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).toList().forEach(System.out::println);
   
6. max method (Get employee with maximum salary)
   Optional<Employee> highestPaidEmployee = employees.stream().max(Comparator.comparing(Employee::getSalary));

7. min method (Get employee with minimum salary)
   Optional<Employee> lowesttPaidEmployee = employees.stream().min(Comparator.comparing(Employee::getSalary));

8. grouping by
   1. Group by gender
      Map<String, List<Employee>> groupEmployee = employees.stream().collect(Collectors.groupingBy(Employee::getGender));  
   
   2.  Group by gender and display gender and name only
       Map<String, List<String>> groupEmployee1 = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));   
   
   3. Group by gender and display gender and number of employees with that gender
      Map<String, Long> groupEmployee2 = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
   
9. 
