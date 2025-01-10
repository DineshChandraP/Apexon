package StreamAPI;

public class Overview {
/*
The Java 8 Stream API is a powerful and flexible tool for working with sequences of data in a functional style. Below are the primary methods available in the Stream API.

Stream Creation Methods:
1.Stream.of(T... values): Creates a Stream from a given array of values.
Scenario: You have a list of employee names and want to create a stream to process them.
Stream<String> employeeStream = Stream.of("Alice", "Bob", "Charlie", "David");
employeeStream.forEach(System.out::println);


2.Stream.ofNullable(T value): Creates a Stream from a nullable value, which can either produce an empty or single-element Stream.
Scenario: You want to create a stream from an optional value (nullable).
String name = null;
Stream<String> nameStream = Stream.ofNullable(name);  // Empty stream since name is null
nameStream.forEach(System.out::println);


3.Arrays.stream(T[] array): Creates a Stream from an array.
Scenario: You want to convert an array of numbers into a stream for processing.
int[] numbers = {1, 2, 3, 4, 5};
Arrays.stream(numbers).forEach(System.out::println);

4.IntStream.range(int startInclusive, int endExclusive): Generates an IntStream of integers from startInclusive to endExclusive.
Scenario: You need to create a stream of integers representing days of the week.
IntStream.range(1, 8).forEach(System.out::println); // 1 to 7

5.IntStream.rangeClosed(int startInclusive, int endInclusive): Generates an IntStream of integers from startInclusive to endInclusive (inclusive).
Scenario: You need a stream to represent months (1 to 12).
IntStream.rangeClosed(1, 12).forEach(month -> System.out.println("Month " + month));

6.Stream.iterate(T seed, UnaryOperator<T> f): Creates an infinite Stream by iteratively applying a function to generate elements.
Scenario: Generating a sequence of Fibonacci numbers.
Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
      .limit(10)
      .map(t -> t[0])
      .forEach(System.out::println);

7.Stream.generate(Supplier<T> s): Creates an infinite Stream by repeatedly invoking the provided supplier function.
Scenario: Generating an infinite stream of random numbers.
Stream.generate(Math::random)
      .limit(5)
      .forEach(System.out::println);

Intermediate Operations (Lazy):
1.filter(Predicate<? super T> predicate): Filters the elements of the Stream based on a given predicate.
Scenario: Filtering employees who are above 30 years old.
List<Employee> employees = getEmployees();
employees.stream()
         .filter(e -> e.getAge() > 30)
         .forEach(System.out::println);

2.map(Function<? super T, ? extends R> mapper): Transforms each element using the provided function.
Scenario: Converting a list of employee objects to a list of employee names.
employees.stream()
         .map(Employee::getName)
         .forEach(System.out::println);

3.mapToInt(ToIntFunction<? super T> mapper): Converts the Stream to an IntStream by applying a function that produces integers.
Scenario: Converting a stream of employees to their ages as an IntStream.
employees.stream()
         .mapToInt(Employee::getAge)
         .forEach(System.out::println);

4.mapToLong(ToLongFunction<? super T> mapper): Converts the Stream to a LongStream by applying a function that produces long values.
Scenario: Converting employee salaries to a LongStream.
employees.stream()
         .mapToLong(Employee::getSalary)
         .forEach(System.out::println);

5.mapToDouble(ToDoubleFunction<? super T> mapper): Converts the Stream to a DoubleStream by applying a function that produces double values.
Scenario: Converting a list of employees to a DoubleStream of their performance ratings.
employees.stream()
         .mapToDouble(Employee::getPerformanceRating)
         .forEach(System.out::println);

6.flatMap(Function<? super T, ? extends Stream<? extends R>> mapper): Flattens the Stream by applying a mapping function that returns a Stream for each element.
Scenario: Flattening a stream of lists of employee projects into a single stream of projects.
List<List<Project>> projectLists = getEmployeeProjects();
projectLists.stream()
            .flatMap(List::stream)
            .forEach(System.out::println);

7.flatMapToInt(Function<? super T, ? extends IntStream> mapper): Similar to flatMap, but converts to an IntStream.
Scenario: Flattening a stream of lists of integers (e.g., number of hours worked by different teams) into a single IntStream.
List<List<Integer>> hoursWorked = getEmployeeWorkHours();
hoursWorked.stream()
           .flatMapToInt(List::stream)
           .forEach(System.out::println);

8.flatMapToLong(Function<? super T, ? extends LongStream> mapper): Similar to flatMap, but converts to a LongStream.

9.flatMapToDouble(Function<? super T, ? extends DoubleStream> mapper): Similar to flatMap, but converts to a DoubleStream.


10.distinct(): Removes duplicate elements from the Stream.
Scenario: Removing duplicate items from a list of employee names.
List<String> employeeNames = Arrays.asList("Alice", "Bob", "Alice", "Charlie");
employeeNames.stream()
             .distinct()
             .forEach(System.out::println);  // Output: Alice, Bob, Charlie

11.sorted(): Sorts the Stream elements in natural order.
Scenario: Sorting employees by name in natural order.
employees.stream()
         .map(Employee::getName)
         .sorted()
         .forEach(System.out::println);

12.sorted(Comparator<? super T> comparator): Sorts the Stream elements using a custom comparator.
Scenario: Sorting employees by their salary in descending order.
employees.stream()
         .sorted(Comparator.comparing(Employee::getSalary).reversed())
         .forEach(System.out::println);

13.peek(Consumer<? super T> action): Performs a specified action on each element without modifying the Stream.
Scenario: Logging employee names while processing the stream.
employees.stream()
         .peek(e -> System.out.println("Processing: " + e.getName()))
         .map(Employee::getSalary)
         .forEach(System.out::println);

14.limit(long maxSize): Limits the Stream to the first maxSize elements.
Scenario: Limiting the stream to the first 5 employees.
employees.stream()
         .limit(5)
         .forEach(System.out::println);

15.skip(long n): Skips the first n elements in the Stream.
Scenario: Skipping the first 3 employees and processing the rest.
employees.stream()
         .skip(3)
         .forEach(System.out::println);



Terminal Operations (Eager):
1.forEach(Consumer<? super T> action): Performs an action on each element of the Stream.
Scenario: Printing out each employee's name.
employees.stream()
         .map(Employee::getName)
         .forEach(System.out::println);

2.forEachOrdered(Consumer<? super T> action): Performs an action on each element in encounter order.
Scenario: Printing employee names in encounter order (important in parallel streams).
employees.stream()
         .parallel()
         .map(Employee::getName)
         .forEachOrdered(System.out::println);

3.toArray(): Collects the Stream's elements into an array.
Scenario: Collecting employee names into an array.
String[] namesArray = employees.stream()
                                .map(Employee::getName)
                                .toArray(String[]::new);

4.reduce(T identity, BinaryOperator<T> accumulator): Performs a reduction (accumulation) of elements using the provided binary operator.
Scenario: Calculating the total salary of employees.
double totalSalary = employees.stream()
                               .map(Employee::getSalary)
                               .reduce(0.0, Double::sum);
System.out.println("Total Salary: " + totalSalary);

5.reduce(BinaryOperator<T> accumulator): Performs a reduction of elements, without an identity.
Scenario: Finding the employee with the highest salary.
Optional<Employee> highestSalaryEmployee = employees.stream()
                                                    .reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
highestSalaryEmployee.ifPresent(e -> System.out.println(e.getName()));

6.collect(Collector<? super T, A, R> collector): Collects the elements of the Stream into a container using a provided Collector.
Scenario: Collecting employees into a List.
List<Employee> employeeList = employees.stream()
                                       .collect(Collectors.toList());

7.min(Comparator<? super T> comparator): Returns the minimum element of the Stream according to the provided comparator.
Scenario: Finding the employee with the lowest salary.
Optional<Employee> lowestSalaryEmployee = employees.stream()
                                                   .min(Comparator.comparing(Employee::getSalary));
lowestSalaryEmployee.ifPresent(e -> System.out.println(e.getName()));

8.max(Comparator<? super T> comparator): Returns the maximum element of the Stream according to the provided comparator.
Scenario: Finding the employee with the highest salary.
Optional<Employee> highestSalaryEmployee = employees.stream()
                                                    .max(Comparator.comparing(Employee::getSalary));
highestSalaryEmployee.ifPresent(e -> System.out.println(e.getName()));

9.count(): Counts the number of elements in the Stream.
Scenario: Counting the number of employees.
long count = employees.stream()
                      .count();
System.out.println("Number of employees: " + count);

10.anyMatch(Predicate<? super T> predicate): Checks if any element matches the given predicate.
Scenario: Checking if there is any employee older than 60.
boolean hasSenior = employees.stream()
                             .anyMatch(e -> e.getAge() > 60);
System.out.println("Is there a senior employee? " + hasSenior);

11.allMatch(Predicate<? super T> predicate): Checks if all elements match the given predicate.
Scenario: Checking if all employees have more than 5 years of experience.
boolean allExperienced = employees.stream()
                                  .allMatch(e -> e.getYearsOfExperience() > 5);
System.out.println("All employees are experienced: " + allExperienced);

12.noneMatch(Predicate<? super T> predicate): Checks if no element matches the given predicate.
Scenario: Checking if no employees are on probation.
boolean noProbation = employees.stream()
                               .noneMatch(e -> e.isOnProbation());
System.out.println("No probation employees: " + noProbation);

13.findFirst(): Returns an Optional containing the first element of the Stream.
Scenario: Finding the first employee in the list.
Optional<Employee> firstEmployee = employees.stream()
                                            .findFirst();
firstEmployee.ifPresent(e -> System.out.println("First employee: " + e.getName()));

14.findAny(): Returns an Optional containing any element of the Stream (optimized for parallel streams).
Scenario: Finding any employee from the list (parallel stream friendly).
Optional<Employee> anyEmployee = employees.stream()
                                          .findAny();
anyEmployee.ifPresent(e -> System.out.println("Any employee: " + e.getName()));

15.iterator(): Returns an iterator over the Stream's elements (available in non-parallel streams).
Scenario: Using an iterator on a stream (not recommended for parallel streams).
Iterator<Employee> iterator = employees.stream().iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next().getName());
}

16.toList() (Since Java 16): Collects the elements into a List.
Scenario: Collecting elements into a list.
List<Employee> employeeList = employees.stream()
                                      .toList();

17.toSet() (Since Java 16): Collects the elements into a Set.
Scenario: Collecting elements into a set (removes duplicates).
Set<Employee> employeeSet = employees.stream()
                                     .toSet();


Special Streams:
1.IntStream: A specialized Stream for primitive int values.
Scenario: Processing a stream of integers.
IntStream.range(1, 5).forEach(System.out::println);

2.LongStream: A specialized Stream for primitive long values.
Scenario: Processing a stream of long numbers.
LongStream.range(1, 5).forEach(System.out::println);

3.DoubleStream: A specialized Stream for primitive double values.
Scenario: Processing a stream of double values.
DoubleStream.of(1.2, 3.4, 5.6).forEach(System.out::println);


Additional Methods (for Parallel Streams):
1.parallel(): Converts a Stream into a parallel stream.
Scenario: Switching to parallel processing to improve performance.
employees.stream()
         .parallel()
         .forEach(System.out::println);

2.sequential(): Converts a Stream into a sequential stream (default mode).
Scenario: Switching back to sequential processing.
employees.stream()
         .sequential()
         .forEach(System.out::println);


Utility Methods:
1.concat(Stream<? extends T> a, Stream<? extends T> b): Concatenates two Streams into one.
Scenario: Concatenating two streams of employee names.
Stream<String> stream1 = Stream.of("Alice", "Bob");
Stream<String> stream2 = Stream.of("Charlie", "David");
Stream<String> combined = Stream.concat(stream1, stream2);
combined.forEach(System.out::println);

2.empty(): Creates an empty Stream.
Scenario: Creating an empty stream.
Stream<String> emptyStream = Stream.empty();
emptyStream.forEach(System.out::println); // No output


These are the core methods of the Java 8 Stream API. The operations fall into two categories:
1.Intermediate operations, which are lazy (i.e., they don’t do anything until a terminal operation is invoked).
2.Terminal operations, which trigger the processing of the Stream and produce a result.
 */
}
