using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
   class goog
   {
       int sum = 0;
       public int[] NumbersIn(int value)
       {
           var numbers = new Stack<int>();

           for (; value > 0; value /= 10)
               numbers.Push(value % 10);

           return numbers.ToArray();
       }

       public int call(int h,int b)
       {
           int n=0;
           int g=1;
           while (n < b)
           {
               g = h * g;
               n++;
           }
           return g;
       }
       public static void Main(string[] args)
       {
           
           goog m = new goog();
           Console.WriteLine("enter the  number");
           int a = int.Parse(Console.ReadLine());
           int sum = 0;
           var numbers = m.NumbersIn(a).ToArray();
           int c = numbers.Length;
           for (int i = 0; i < c; i++)
           {
               sum = m.call(numbers[i],c) + sum;
           }
           Console.WriteLine("the sum is   " + sum);
           Console.ReadLine();
       }
   }
}