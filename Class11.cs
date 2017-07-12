using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class con
    {
        
        public int[] NumbersIn(int value)
        {
            var numbers = new Stack<int>();

            for (; value > 0; value /= 10)
                numbers.Push(value % 10);

            return numbers.ToArray();
        }
         public int call(int h,int b)
        {
            int n = 0;
            int g = 1;
            while (n < b)
            {
                g = h * g;
                n++;
            }
            return g;
        }
        
        
        
        
        
        
        public static void Main(string[] args)
        {
            
            con m=new con();
            Console.WriteLine("eneter the number");
            int a = int.Parse(Console.ReadLine());
            var num = m.NumbersIn(a).ToArray();
            int c= num.Length;
            int sum=0;
               if(a>9)
                for (int i = 0; i < c; i++)
                {
                    if (i != c - 1)
                    {
                        sum = m.call(num[i], num[i + 1]) + sum;
                    }

                    else
                    {
                        sum = m.call(num[i], num[0]) + sum;
                    }
               }

               else
               {
                   Console.WriteLine("enter above 9");
               }

               Console.WriteLine("the sum is" + sum);

               Console.ReadLine();
        }
    
    
    }
}
