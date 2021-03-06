/* @author Ege Darcin
 * Version 1.1
 * 21302460
 * Lab03a
 */   
public class Square extends Rectangle
{
  
  // Variables
  private int side;
  
  // Constructor
  public Square(int side, int x, int y) {
    super(side, side, x, y);
    this.side = side;
    setLocation(x, y); 
  }
  
  // Returns the area of the square
  public double getArea() {
    return super.getArea();
  }
  
  // Returns the properties of the square in a string form.
  public String getInfo() {
    String str = "not selected";
    if(selected) {
      str = "selected";
    }
    return "Square(" + x + ", " + y + ") has a side legnth of " + side + " cm and has area of " + getArea()+ " and is "+str;
  }
}