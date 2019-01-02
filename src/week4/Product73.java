package week4;

public class Product73 {
    public static void main(String[] args) {
        Product pr = new Product("Banan", 100,5);
        pr.printProduct();

    }

}

    class Product{
    private String name;
    private double count;
    private int price;


        public Product(String name, int price, double count) {
            this.name = name;
            this.price = price;
            this.count = count;
        }

        public void printProduct(){
            System.out.println(name + ", " + count + ", " + price);

        }
    }
