import java.util.Scanner;

public class Switchcase {
        public  static void main(String[] args)
        {
            Scanner in=new Scanner(System.in);
            System.out.print("Enter a number 1-6 \n");
            int n=in.nextInt();
            switch (n)
            {
                case 1:
                    System.out.print("1 is selected");
                    break;
                case 2:
                    System.out.print("2 is selected");
                    break;
                case 3:
                    System.out.print("3 is selected");
                    break;
                case 4:
                    System.out.print("4 is selected");
                    break;
                case 5:
                    System.out.print("5 is selected");
                    break;
                case 6:
                    System.out.print("6 is selected");
                    break;
                default:
                    System.out.print("Invalid input");
            }
        }
    }

