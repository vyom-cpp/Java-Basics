## Q-1(c)-(3)

```java
for (int i = 0; i < 10; i++)
for (int j = 0; j < i; j++)
 System.out.println(i * j);
```

When i = 0; j < 0 which is false
When i = 1; j = 0 means it will execute once
When i = 2; j = 0,1 means it will execute twice
When i = 3; j = 0,1,2 means it will execute thrice
Hence, when i = 0, number of executions are 0, when i = 1, number of executions are 1, similarly when i = 9, number of executions are 9
Hence, 0+1+2+3+4+5+6+7+8+9 = 45
Total 45 executions

## Q-1(c)-(4)

```java
x % 2 = = 0
```

If x = 1, then it will return false

## Q-2(b)-(1)

```java
Thing item, stuff;
item = new Thing();
Thing entity = new Thing();
```

A reference variable is one that refers to the address of another variable.
A Java object is a member (also called an instance) of a Java class.

3 reference variables and 2 objects
Reference Variables: item, stuff, and entity
Objects: item and entity

## Q-2(b)-(2)

```java
public class MyClass {
public static void main(String[] args) {
C c = new C(); // Calls class C
System.out.println(c.max(12, 29));
}
}
class A {
int max(int x, int y) { if (x>y) return x; else return y; } // since 31 > 22, 31 - 10 = 21 is returned
}
class B extends A{
int max(int x, int y) { return super.max(y, x) - 10; } // returns super.max(31, 22) - 10 to the class A
}
class C extends B {
int max(int x, int y) { return super.max(x+10, y+2); } // returns x = 22 and y = 31 to the class B
}
```

Output: 21

## Q-2(c)-OR ?

## Q-5(a)
#### (i)    `java.util`
#### (ii)   `Queue`
#### (iii)  `contains`