import java.awt.Rectangle; 

public class Main
{
   public static void main(String[] args)
   {
      Rectangle box = new Rectangle(5, 10, 20, 30);

      // Move the rectangle
      box.translate(15, 25);

      // Print information about the moved rectangle 
      System.out.print("x: "); 
      System.out.println(box.getX());
      System.out.println("Expected: 20"); 

      System.out.print("y: "); 
      System.out.println(box.getY());
      System.out.println("Expected: 35"); 
      double perimeter = 2*(box.getHeight() + box.getWidth());
      System.out.println("The perimeter is = "+perimeter);
      double area = box.getHeight() * box.getWidth();
      System.out.println("The area is = "+area);
   }
}
