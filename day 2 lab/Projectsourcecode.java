 import java.util.Scanner;
 public class Projectsourcecode {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter consumption in kWh: ");
            double consumption = scanner.nextDouble();

            System.out.print("Enter tariff rate per kWh: ");
            double tariffRate = scanner.nextDouble();

            double billAmount = consumption * tariffRate;

            System.out.println("Electricity bill amount: $" + billAmount);

            scanner.close();
        }
    }

