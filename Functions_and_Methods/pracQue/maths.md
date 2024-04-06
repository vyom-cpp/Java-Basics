1. Math.min()
- > It is used to return the Smallest of two values.

2. Math.max()
- > It returns the Largest of two values.

3. Math.sqrt()
- > It is used to return the square root of a number.

4. Math.pow()
- > It returns the value of first argument raised to the power to second argument.

5. Math.abs()
- > It will return the Absolute value of the given value.

`Example`
```java
public class JavaMathExample1    
{    
    public static void main(String[] args)     
    {    
        double x = 28;    
        double y = 4;    
          
        // return the maximum of two numbers  
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
          
        // return the square root of y   
        System.out.println("Square root of y is: " + Math.sqrt(y));   
          
        //returns 28 power of 4 i.e. 28*28*28*28    
        System.out.println("Power of x and y is: " + Math.pow(x, y));      
  
        // return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
          
        // return the logarithm of given value when base is 10      
        System.out.println("log10 of x is: " + Math.log10(x));   
        System.out.println("log10 of y is: " + Math.log10(y));    
          
        // return the log of x + 1  
        System.out.println("log1p of x is: " +Math.log1p(x));    
  
        // return a power of 2    
        System.out.println("exp of a is: " +Math.exp(x));    
           // return (a power of 2)-1  
        System.out.println("expm1 of a is: " +Math.expm1(x));  
    }    
}    
```

`Output`

```
Maximum number of x and y is: 28.0
Square root of y is: 2.0
Power of x and y is: 614656.0
Logarithm of x is: 3.332204510175204
Logarithm of y is: 1.3862943611198906
log10 of x is: 1.4471580313422192
log10 of y is: 0.6020599913279624
log1p of x is: 3.367295829986474
exp of a is: 1.446257064291475E12
expm1 of a is: 1.446257064290475E12
```