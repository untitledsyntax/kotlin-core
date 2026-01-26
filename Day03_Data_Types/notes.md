KOTLIN DATATYPES

Data types are divided into different group:
1.Numbers 
2.Characters 
3.Booleans 
4.Strings 
5.Arrays

1. Numbers are divided into two groups:

1.Integer types

It include Whole Numbers, Positive or Negative Number ex.123,-786 (Without Decimal Number)
In Kotlin, Byte, Short, Int, and Long are the four main integer data types, used to store whole numbers. The primary difference between them is the amount of memory they consume and, consequently, the range of values they can store. 

Type 	Size (bits)	    Size (bytes)	Range	       
Byte	8-bit	        1 byte	        -128 to 127	
Short	16-bit	        2 bytes	        -32,768 to 32,767
Int	    32-bit	        4 bytes	        -2,147,483,648 to 2,147,483,647	
Long	64-bit	        8 bytes	        -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

2.Floating point types

It represent real numbers with fractional Parts

Type 	Size (bits)
Float	32-bit
Double	64-bit

2. Characters

Char: Represents a single character, such as 'A', '1', or '$', enclosed in single quotes.

3. Boolean: Represents logical values, either true or false. Booleans are crucial for control flow and decision-making in code. 

4. String

String: Represents a sequence of characters, enclosed in double quotes ("Hello, Kotlin!")

5. Array

Array: A fixed-size container for storing multiple elements of the same type, accessed using an index (e.g., numbers[0]). Arrays can be created using functions like arrayOf()