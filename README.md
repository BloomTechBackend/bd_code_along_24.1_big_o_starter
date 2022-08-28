# BD ACS Setup

## Option 1: CodeSignal (Preferred)
Load the starter code for each problem into CodeSignal environment and build out test cases as needed within CodeSignal.

## Option 2: Local environment

#### Project Setup

1. Clone this project to your machine using `git clone <github url>`
2. Open the project in IntelliJ
3. In IntelliJ, complete the solution for each problem and run main method present for each problem.
#### Running Your Tests

Hit the play button next to the main method.

### Problem 1 : HashMaps

#### Description

Build a hashmap to lookup the first n lowercase letters of the alphabet. The return value of alphabet() should be a hashmap where the keys are numbers 0-25

#### Example

Input:

```
        System.out.println(alphabets.get(1));
        System.out.println(alphabets.get(24));
        System.out.println(alphabets.get(25));
```

Output:

```
        b
        y
        z
```


### Problem 2 : Fibonacci using Memoization

#### Description

Use a HashMap to memoize solutions to fibonacci(n) to avoid repeating the same calculations over and over when computing solutions for higher values of n.

#### Example

Input & Output:

```
        System.out.println(memoization.fibonacci(0)); # 0
        System.out.println(memoization.fibonacci(1)); # 1
        System.out.println(memoization.fibonacci(2)); # 1
        System.out.println(memoization.fibonacci(8)); # 21
        System.out.println(memoization.fibonacci(17)); # 1597
        System.out.println(memoization.fibonacci(58)); # 39088169
```
