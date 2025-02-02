import java.util.*;

class Shop {
    List<Book> books;
    List<Clothes> clothes;
    List<Electronic> electronics;

    public Shop() {
        books = new ArrayList<>();
        clothes = new ArrayList<>();
        electronics = new ArrayList<>();
        books.add(new Book("Java Programming", 50, 5));
        books.add(new Book("Data Structures", 40, 8));
        clothes.add(new Clothes("T-shirt", 20, 15));
        clothes.add(new Clothes("Jeans", 30, 20));
        electronics.add(new Electronic("Smartphone", 500, 10));
        electronics.add(new Electronic("Laptop", 800, 7));
    }
    public void displayProducts(int category) {
        if (category == 1) {
            System.out.println("Available books:");
            System.out.printf("%-15s %-10s %-10s%n", "Name", "Price", "Stock");
            int i=1;
            for (Book book : books) {
                System.out.printf(i+"."+"%-15s $%-10.2f %-10d%n", book.name, book.price, book.stock);
                i++;
            }
        } else if (category == 2) {
            System.out.println("Available clothes:");
            System.out.printf("%-15s %-10s %-10s%n", "Name", "Price", "Stock");
            int i=1;
            for (Clothes cloth : clothes) {
                System.out.printf(i+"."+"%-15s $%-10.2f %-10d%n", cloth.name, cloth.price, cloth.stock);
                i++;
            }
        } else if (category == 3) {
            System.out.println("Available electronics:");
            System.out.printf("%-15s %-10s %-10s%n", "Name", "Price", "Stock");
            int i=1;
            for (Electronic electronic : electronics) {
                System.out.printf(i+"."+"%-15s $%-10.2f %-10d%n", electronic.name, electronic.price, electronic.stock);
                i++;
            }
        } else {
            System.out.println("Invalid category.");
        }
    }

    public Product getProduct(int category, int index) {
        if (category == 1) {
            if (index >= 0 && index < books.size()) {
                return books.get(index);
            }
        } else if (category == 2) {
            if (index >= 0 && index < clothes.size()) {
                return clothes.get(index);
            }
        } else if (category == 3) {
            if (index >= 0 && index < electronics.size()) {
                return electronics.get(index);
            }
        } else {
            System.out.println("Invalid category.");
        }
        return null;
    }

    public void updateProductStock(Product product, int quantity) {
        product.decreaseStock(quantity);
    }
    public void menu(Scanner scanner)
    {
        Shop shop = new Shop();
        //Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the shop!");

        ShoppingCart cart = new ShoppingCart();
        boolean infoEntered = false;
        String customerName = "";
        String customerMobile = "";
        String customerEmail = "";

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Buy Product");
            System.out.println("2. Add Product");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                if (!infoEntered) {
                    System.out.print("Enter your name: ");
                    customerName = scanner.nextLine();
                    System.out.print("Enter your mobile number: ");
                    customerMobile = scanner.nextLine();
                    System.out.print("Enter your email: ");
                    customerEmail = scanner.nextLine();
                    infoEntered = true;
                }

                double totalPrice = cart.calculateTotal();while (true) {
                    System.out.println("Select category:");
                    System.out.println("1. Books");
                    System.out.println("2. Clothes");
                    System.out.println("3. Electronics");
                    System.out.print("Enter category: ");
                    int category = Integer.parseInt(scanner.nextLine());

                    shop.displayProducts(category);

                    System.out.print("Enter the number of the product you want to buy: ");
                    int productIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    Product selectedProduct = shop.getProduct(category, productIndex);
                    if (selectedProduct != null && selectedProduct.getStock() > 0) {
                        System.out.print("Enter quantity: ");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        if (quantity <= selectedProduct.getStock()) {
                            cart.addItem(selectedProduct, quantity);
                            shop.updateProductStock(selectedProduct, quantity);
                            System.out.println(quantity + " " + selectedProduct.name + "(s) added to your cart.");
                            System.out.println("\nOptions:");
                            System.out.println("1. Buy another product");
                            System.out.println("2. Show Bill");
                            System.out.print("Enter your choice: ");
                            String buyChoice = scanner.nextLine();
                            if (buyChoice.equals("2")) {
                                // Show the bill and update ATM balance
                                System.out.println("\n----- Invoice -----");
                                System.out.println("Customer Name: " + customerName);
                                System.out.println("Customer Mobile: " + customerMobile);
                                System.out.println("Customer Email: " + customerEmail);
                                System.out.println("Your Cart:");
                                int i=1;
                                for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
                                    System.out.println(i+"."+"Product name = "+entry.getKey().name + "   " +"Quantity = "+ entry.getValue()+"   "+"Price = "+entry.getValue()*entry.getKey().price);
                                    i++;
                                }
                                System.out.println("\nTotal Price: $" + cart.calculateTotal() );
                                System.out.println("\nThank you for your purchase!");
                                infoEntered = false;
                                break;
                            }
                        } else {
                            System.out.println("Insufficient stock.");
                        }
                    } else {
                        System.out.println("Invalid product number or out of stock.");
                    }
                }
            } else if (choice.equals("2")) {
                System.out.println("Select category to add:");
                System.out.println("1. Clothes");
                System.out.println("2. Electronics");
                System.out.println("3. Books");
                System.out.print("Enter category: ");
                int addCategory = Integer.parseInt(scanner.nextLine());if (addCategory == 1) {
                    System.out.print("Enter clothes name: ");
                    String newClothesName = scanner.nextLine();
                    System.out.print("Enter clothes price: ");
                    double newClothesPrice = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter clothes quantity: ");
                    int newClothesQuantity = Integer.parseInt(scanner.nextLine());
                    shop.clothes.add(new Clothes(newClothesName, newClothesPrice, newClothesQuantity));
                    System.out.println(newClothesQuantity + " " + newClothesName + "(s) added to the shop.");
                } else if (addCategory == 2) {
                    System.out.print("Enter electronics name: ");
                    String newElectronicName = scanner.nextLine();
                    System.out.print("Enter electronics price: ");
                    double newElectronicPrice = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter electronics quantity: ");
                    int newElectronicQuantity = Integer.parseInt(scanner.nextLine());
                    shop.electronics.add(new Electronic(newElectronicName, newElectronicPrice, newElectronicQuantity));
                    System.out.println(newElectronicQuantity + " " + newElectronicName + "(s) added to the shop.");
                } else if (addCategory == 3) {
                    System.out.print("Enter book name: ");
                    String newBookName = scanner.nextLine();
                    System.out.print("Enter book price: ");
                    double newBookPrice = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter book quantity: ");
                    int newBookQuantity = Integer.parseInt(scanner.nextLine());
                    shop.books.add(new Book(newBookName, newBookPrice, newBookQuantity));
                    System.out.println(newBookQuantity + " " + newBookName + "(s) added to the shop.");
                } else {
                    System.out.println("Invalid category.");
                }
            } else if (choice.equals("3")) {
                // Exit the program
                System.out.println("Exiting the program. Goodbye!");
                return;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}