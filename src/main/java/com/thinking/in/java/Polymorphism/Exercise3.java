package com.thinking.in.java.Polymorphism;

/*Exercise3 3: (1) Add a new method in the base class of Shapes.java that prints a
message, but don’t override it in the derived classes. Explain what happens. Now override it
in one of the derived classes but not the others, and see what happens. Finally, override it in
all the derived classes.
*/
public class Exercise3 {
}
class Shapes{
   public void print(){
       System.out.println("Shape");
   }
}
class Circles extends Shapes{

}
class Squares extends Shapes{}

class Triangles extends Shapes{}
