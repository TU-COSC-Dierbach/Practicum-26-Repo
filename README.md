# Instructions  

## PRACTICUM 26 - ColorXYCoord Subclass (10 pts.)<br>

### BACKGROUND

**Defining Subclasses in Java**<br>
Subclasses of a given class can be defined that provide
a subtype of the original class. For example, a
class named ColorXYCoord may be defined as a subclass
of the XYCoord class,
```java
public class ColorXYCoord extends XYCoord {
  // possible added variables and/or method
}
```
**Subclasses as Subtypes**<br>
A `subclass` (also called `child class`)
inherits all of the members (e.g. instance variables
and methods) of the `superclass` (also called `parent 
class`). Subclasses, being a subtype, add their own
instance variables and/or methods to those inherited
from the parent class.<br>
<br>
Subclasses, as subtypes, are thus are more specific
entities then their parent class. That is, there is 
*more* that can be specfied about them. For example, when describing what an Animal is, you can
say things like it is a `living being`, it `can reproduce`,
it `consumes food`, etc. An Elephant is a type of animal.
Therefore, everything that is true about Animals in 
general is true about Elephants. However, we can *add* 
that Elephants `have a trunk`, are `large and grey`, etc.

**Access of Inherited Members in a Subclass**<br>
Although subclasses inherit all of the members of its
super (parent) class, the subclass cannot access those
inherited members declared `private` (usually the
instance variables).<br><br>
For example, the `ColorXYCoord` class (as a subclass
of the XYCoord class) inherits the private instance
variables `int x` and `int y`, as well as all of the
public methods of the `XYCoord` class. Therefore, `x`
and `y`
are part of the value of a given `ColorXYCoord` object.
But since the instance variables `x` and `y` are
*private* in the XYCoord class, only methods of the
`XYCoord` class can access them direcly. However,
*public* methods like `getX()` and `setX(int x)`
are able to be called in the `ColorXYCoord` subclass, 
which gives *indirect* access to these variables.

**Constructors of Subclasses**<br>
It a subclass adds its own instance variables other
than those inherited from its parent class, then
the subclass needs its own constructor. Consider
the following code,
```java
public class ColorXYCoord extends XYCoord {
  private String color;

  // constructor
  public ColorXYCoord(int x, int y, String color) {
    super(x,y);
    this.color = color;
  }
```
The constructor (just like methods) of a subclass
cannot directly access the private instance variables
inherited from its parent class. Therefore, constructor
ColorXYCoord cannot directly assign the values of `x`
and `y`. <br><br>
In such cases, the subclass constructor calls
the constructor of the parent class, since the 
constructor in the parent class can access the
instance variables. Thus, as depicted in the example
above, the way to call the constructor of the 
parent class is to use the special identifier `super`
with appropriate parameters passed, `XYCoord(x,y)`. 
<br><br>
It is `important to note` that the call to the parent 
constructor in a subclass constructor must be the
first line in the subclass's constructor.

### WHAT TO DO<br>
- For the XYCoord class given, create a ColorXYCoord
  subclass with the following methods:
  `constructor`, `getter` (for color), `toString` and
  `equals` methods.
- Ensure that the provided test driver (main program) gives the
  correct results.
