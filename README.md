# HW1
***I did not add screenshots of part 2 because there is no output. I explained below.***
## Part 1
In this section, we are expected to implement an algorithm which finds maximum number of chain that refers number of summation of any number with its reversed to produce palindrome.

I accepted all decimal numbers in this algorithm as **int**. So, the algorithm outputs:
> "There is no palindrome for this number for Integer data type."

for the numbers that exceed 2,147,483,647. Also, exceeding this number means degrading under 0. Hence, there is an if statement to check this condition.
- At the beginnging, in ***getReverse*** function, I used StringBuilder to make time complexity of this function O(1) when reversing, but I faced weird errors. So, I used for loop which is O(N) :(
- I used ***recursive*** approach to solve this problem.

### P.S. : I think that the important part of this algorithm problem is the implementation, not the data types. So, I went with integer data type. I hope that's okay :)


## Part 2 (This part has code snippets.)

Java does not support **Multiple Inheritance** while some of the software languages do. Java acts like that to avoid Ambiguity (İki Anlamlılık).

**Here is an example:**
```java
class Patika{
    public void greetings(){
        System.out.print('Hello from Patika!');
    }
}

class Kodluyoruz{
    public void greetings(){
        System.out.print('Hello from Kodluyoruz!');
    }
}

class Test extends Patika, Kodluyoruz{
    ...
}
```
**This code snippet gives compile-time error :**
> '{' or implements expected.

which shows us we can solve this problem by using **Interfaces** in Java. There are lots of languages that allow the developer to use ***Multiple Inheritance*** such as C++, Common Lisp, Python, R etc. Each software languages have its own way to handle this problem. For example in C++, the methods are called in reverse order of constructors but in Python, the methods are called in normal order. If you extends class Patika before Kodluyoruz, method of the patika will be override.

***We can handle this problem in Java by using Interface as I mentioned before.*** 

**Here is an example:**
```java
interface Patika{
    public void greetings();
}

interface Kodluyoruz{
    public void greetings();
}

class Test implements Patika, Kodluyoruz{
    @Override
    public void greetings(){
        System.out.print("I am properly working rn!!!!!!");
    }
}
```
**This code snippet gives output as :**
>I am properly working rn!!!!!!




## Part 3
In this section, we are expected to implement Object Oriented design of real estate application like **Hepsiemlak**.

**Here are the details:**

- First of all, I tried to use most of the basics of Object Oriented Programming which are Inheritance, Polymorpishm and Encapsulation. So, all attributes (fields) has ***private*** access modifier. Also, I tried to divide all system into small classes to make the system similar to microservices architecture.

- In general I have 7 classes which are ***Advert, User, Property, House, Land, Address and Message.***

- Advert (İlan) class is the most important class in my design. It holds data about Property, price, title, userId etc. 

- Property (Gayrimenkul) class is a **superclass** of House and Land. I thought that there could be few property types such as ***House (Ev), Land (Arsa), Building (Bina).*** Each of the property type has their own attribute. For example; there is <u>roomNumber</u> and <u>saloonNumber</u> for ***House*** class, there is <u>parcelNo</u> and <u>blockNo</u> for ***Land*** class. Therefore, subclasses (House and Land) extends ***Property*** class. We can add more subclasses like building but I thought that two subclasses are enough for this homework.

- User (Kullanıcı) class is the second important class in my design system. Because almost every process is closely interested in user. Also, ***User*** class has two collection interface which are List and Set to store data about Messages, Favorite Adverts, Adverts, Addresses.

- Address (Adres) class refers address of any property. Also, there is an attribute named Addresses in ***User*** class to hold more than one address for user.

- Message (Mesaj) class refers message that sent from sender to receiver. It holds sender, receiver, date and seen information.

***NOTE: Implementation details has given in the code as command lines.***
