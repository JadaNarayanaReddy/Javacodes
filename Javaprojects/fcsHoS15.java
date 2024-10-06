class fcsHoS15
{
public static void main(String [] args)
{
 int n,i,c;
 if(args.length==0)
 System.out.println("Please enter an integer number");
 else
 {
 n=Integer.parseInt(args[0]);
 
 for(i=1;i<=n;i++)
 {
  c=1;
  while(c<=i)
  {
   System.out.print("*\t");
   c++;
  }
  System.out.println();
 }
 }
}
}
