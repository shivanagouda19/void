public class akshay {
    public static void main(String[] args) {
        System.out.print("Hi");
        System.out.println("Hi");// ln is added as suffix for next line
        System.out.print("Hi\n");// \n is added as suffix for next line
        System.out.print("Hi");
        System.out.print("\n");

        Scanner sc = new Scanner(System.in);

        String input = sc.next(); // takes only 1 word
        System.out.println(input);

        sc.nextLine();// clear leftover newline

        String name = sc.nextLine(); // takes a line 
        System.out.println(name);
        
        int num = sc.nextInt();// takes input of int
        System.out.println(num);
    }

}


