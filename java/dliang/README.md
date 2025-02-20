# Intro to Java Programming and Data Structures, 13th edition

_By Daniel Liang_

## CH1 - Intro

**1.4**

Write a program that displays the following table:

```
a      a^2    a^3
1      1      1
2      4      8
3      9      27
4      16     64
```

**1.5**

Write a program that displays the result of:

```
(9.5 * 4.5 - 2.5 * 3)/(45.5 - 3.5) 
```

_should be 0.8392857142857143_

## CH2 - Programming Basics

**2.13 Case Study**

Write a program that displays current time in GMT in hour:minute:second format converted from `System.currentTimeMillis(), 
without using any packages or libraries.


**2.18 Case Study**

Develop a program  lets the user enter an amount as a value representing a total in dollars and cents, and outputs a 
report listing the monetary equivalent in the maximum number of dollars, quarters, dimes, nickels, and pennies, 
in this order, to result in the minimum number of coins.

Ex:
- Input: 11.56
- Output: "11 dollars, 2 quarters, 0 dimes, 1 nickels, and 1 pennies"


**2.1**

Write a program that reads a Celsius degree in a  value from the console, then converts it to Fahrenheit, and 
displays the result. The formula for the conversion is as follows: `f = (9/5) * c + 32`


**2.5**

Write a program that reads subtotal and gratuity rate, then computes the gratuity and total.

Ex:
- Input: 10 subtotal, 15% gratuity rate
- Output: 11.5 total, 1.5 gratuity


**2.6**

Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer

Ex:
- Input: 932
- Output: 14

## CH3 - Selections

**3.5**

Write a program that prompts the user to enter an integer for today's day of the week 
(Sunday is 1, Monday is 2, . . . , and Saturday is 7). 
Also prompt the user to enter the number of days after today for a future day and display the future day of the week.

Ex:
```
Enter today’s day of week (1 to 7): 2
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
```