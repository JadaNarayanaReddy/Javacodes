import java.util.Scanner;
class fcsHoS8
{
public static void main(String [] args)
{
 Scanner sc=new Scanner(System.in);
 char ch;
 System.out.println("Enter a Color Code (R,G,B,O,Y,W) ");
 ch=sc.next().charAt(0);
 switch(ch)
 {
  case 'R'|'r': System.out.println("Red");
		break;
case 'G'|'g': System.out.println("Green");
		break;
case 'B': System.out.println("Blue");
		break;
case 'O': System.out.println("Orange");
		break;
case 'Y': System.out.println("Yellow");
		break;
case 'W': System.out.println("White");
		break;
default: System.out.println("Invalid Code");
} 
}
}