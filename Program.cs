using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("enter the sentence");
            string s = Console.ReadLine();
            string[] w = s.Split(' ');
            for (int i = 0; i < w.Length; i++)
            {
                Console.WriteLine(w[i]);
            }

            for (int i = 0; i < w.Length; i++)
            {
                for (int j = i+1; j < w.Length; j++)
                {
                    int c=string.Compare(w[i],w[j]);
                    if (c == 1)
                    {
                        string temp = string.Copy(w[j]);
                        w[j] = w[i];
                        w[i] = temp;
                    }
                }
            }
            Console.WriteLine("after sort");
            for (int i = 0; i < w.Length; i++)
            {
               
                    Console.WriteLine(w[i]);
               
            }

                Console.ReadLine();
        
        }
    }
}
