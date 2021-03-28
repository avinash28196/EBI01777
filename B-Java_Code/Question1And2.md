# Question 1: Explain the following code. What version of Java does this need?

```java
List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9)
.stream().filter(n -> (n%3 == 0))
.map(n -> n*2).collect(Collectors.toList());
System.out.println(numbers);
```
# Soultion:

1. Arrays class contains various methods for manipulating arrays (such as sorting and searching). Here we are using Arrays.asList() which takes the array by which the list will be backed, 
2. creates a sequential stream using collections stream API. Using filters, which returns a stream consisting of the results of applying the given function to the elements of this stream. In the above filter, we are applying a function which takes an element from the stream and check if the element is divisible by 3. 
3. The result will be passed to the intermediate function through Stream map() for multiplying by 2. 
4. collect method will accumulate all the results into mutable result container and by calling Collectors.toList method we will return a list of Integers.


# Question 2: What does the following code do? How could the same result be achieved in a simpler way?

```java
public static List<Integer> foo(int length) {

        List<Integer> list = new ArrayList<>();
        boolean isDone = false;
        Random random = new Random();

        while (!isDone) {
            int r = random.nextInt(10) + 1;
            boolean isFound = false;
            for (int n : list)
                if (n == r) {
                    isFound = true;
                    break;
                }
            if (!isFound)
                list.add(r);
            if (list.size() == length)
                isDone = true;
        }
        return list;
    }
}

public static void main(String[] args) {
        System.out.println(foo(5));
}
```

## Soultion: 
