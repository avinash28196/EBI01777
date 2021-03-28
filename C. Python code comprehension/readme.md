# A. Python code comprehension
## Question 1
What does the following Python code do? How could the same result be achieved in a simpler way?


```python 
from random import randint, random

def foo(length):
    list = []
    is_done = False
    while (is_done == False):
        r = randint(1, length)
        is_found = False
        for n in list:
            if (n == r):
                is_found = True
                break
        if (is_found == False):
            list.append(r)
        if (len(list) == length):
            is_done = True


x = foo(10)
print(x)


```

Solution:

This code generates unique random number given the length.


```python
import random
from setuptools._vendor.ordered_set import OrderedSet

def foo(length):
    setOfNumbers = OrderedSet()
    while len(setOfNumbers) < length:
        setOfNumbers.add(random.randint(1, length))

    return setOfNumbers


x = foo(10)
print(x)
```
