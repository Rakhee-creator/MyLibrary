import java.time.LocalDate;
import java.util.Scanner;

import java.time.LocalDate;
import java.util.Scanner;
    public class MyLibrary{
        public static void main(String[] args) {

            int borrowed=0;
            int books=0;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("List of Books : ");
                System.out.println("1.Spiritual Books");
                System.out.println("2.Self Improvement Books");
                System.out.println("3.Regional Books");
                System.out.println("4.IT Books");

                books = sc.nextInt();
                // ✅ check exit before asking for quantity
                if (books == 5) {
                    break;
                }


                System.out.println(" Number of books borrowed: ");
                int quantity = sc.nextInt();
                LocalDate dueDate = LocalDate.now().plusDays(14);
                String categoryName="";
                switch (books) {

                    case 1:
                        categoryName = "Spiritual Book";
                        borrowed+= quantity;
                        for (int i = 0; i < quantity; i++) {
                            System.out.println("Book " + (i + 1) + " due on " + dueDate);
                        }
                        break;
                    case 2:
                        categoryName = "Self Improvement Book";
                        borrowed += quantity;
                        for (int i = 0; i < quantity; i++) {
                            System.out.println("Book " + (i + 1) + " due on " + dueDate);
                        }
                        break;
                    case 3:
                        categoryName = "Regional Book";
                        borrowed += quantity;
                        for (int i = 0; i < quantity; i++) {
                            System.out.println("Book " + (i + 1) + " due on " + dueDate);
                        }
                        break;
                    case 4:
                        categoryName = "IT Book";
                        borrowed+= quantity;
                        for (int i = 0; i < quantity; i++) {
                            System.out.println("Book " + (i + 1) + " due on " + dueDate);
                        }
                        break;
                    default:
                        System.out.println("invalid input");

                }

            }while (books<=4);
            System.out.println("Books issued :" + borrowed);
        }

    }

