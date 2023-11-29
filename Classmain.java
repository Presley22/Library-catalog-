static ArrayList<Book> bookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        System.out.println("******** Welcome to the Library Catalog ********");
        System.out.println("1: Add new book");
        System.out.println("2:Display all books ");
        System.out.println("5: Exit");
        System.out.print("Enter your choice: ");
        System.out.print("Enter book title: ");
        String title = scanner.next();
        System.out.print("Enter book author:Name ");
        String author = scanner.next();

      
        System.out.println("Book added successfully!");
        System.out.println("List of Books:cinderella , Peter and Jane,Kigogo");
 
}
}
