
public class calculator {

}
package com.java.switch;
//write a calculator program using switch statement

//input = 10 & 20      Add      output = 30
//input = 10 & 20      mul      output = 200
//input = 10 & 20      sub      output = -10
//input = 10 & 20      div      output = 0.5

public class calculatorassignment {
int num1 = 10 , num2 = 20;


string operation = "mul";

switch (operation) {
case "Add":
system.out.println(num1+num2);
break;
case "mul":
system.out.println(num1*num2);
break;
case "sub":
system.out.println(num1-num2);
break;
case "div":
system.out.println(num1/num2);
break;

default:
system.out.println("Enter valid operation");
}
}
}
