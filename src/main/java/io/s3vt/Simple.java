package io.s3vt;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static io.s3vt.OrderProduct.order_product_relationship;
import static java.time.LocalDate.parse;

public class Simple {
    static List<Customer> customerList = new ArrayList<>();

    public static List<Customer> customers() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Stefan Walker", 1));
        customerList.add(new Customer(2, "Daija Von", 1));
        customerList.add(new Customer(3, "Ariane Rodriguez", 1));
        customerList.add(new Customer(4, "Marques Nikolaus", 2));
        customerList.add(new Customer(5, "Rachelle Greenfelder", 0));
        customerList.add(new Customer(6, "Larissa White", 2));
        customerList.add(new Customer(7, "Fae Heidenreich", 1));
        customerList.add(new Customer(8, "Dino Will", 2));
        customerList.add(new Customer(9, "Eloy Stroman", 1));
        customerList.add(new Customer(10, "Brisa O Connell", 1));
        return  customerList;
    }



    static List<Product> productList = new ArrayList<>();
    static List<Order> orderList = new ArrayList<>();

    public static void createData() {

        customerList.add(new Customer(1, "Stefan Walker", 1));
        customerList.add(new Customer(2, "Daija Von", 1));
        customerList.add(new Customer(3, "Ariane Rodriguez", 1));
        customerList.add(new Customer(4, "Marques Nikolaus", 2));
        customerList.add(new Customer(5, "Rachelle Greenfelder", 0));
        customerList.add(new Customer(6, "Larissa White", 2));
        customerList.add(new Customer(7, "Fae Heidenreich", 1));
        customerList.add(new Customer(8, "Dino Will", 2));
        customerList.add(new Customer(9, "Eloy Stroman", 1));
        customerList.add(new Customer(10, "Brisa O Connell", 1));


        productList.add(new Product(1, "omnis quod consequatur", "Games", 184.83));
        productList.add(new Product(2, "vel libero suscipit", "Toys", 12.66));
        productList.add(new Product(3, "non nemo iure", "Grocery", 498.02));
        productList.add(new Product(4, "voluptatem voluptas aspernatur", "Toys", 536.80));
        productList.add(new Product(5, "animi cum rem", "Games", 458.20));
        productList.add(new Product(6, "dolorem porro debitis", "Toys", 146.52));
        productList.add(new Product(7, "aspernatur rerum qui", "Books", 656.42));
        productList.add(new Product(8, "deleniti earum et", "Baby", 41.46));
        productList.add(new Product(9, "voluptas ut quidem", "Books", 697.57));
        productList.add(new Product(10, "eos sed debitis", "Baby", 366.90));
        productList.add(new Product(11, "laudantium sit nihil", "Toys", 95.50));
        productList.add(new Product(12, "ut perferendis corporis", "Grocery", 302.19));
        productList.add(new Product(13, "sint voluptatem ut", "Toys", 295.37));
        productList.add(new Product(14, "quos sunt ipsam", "Grocery", 534.64));
        productList.add(new Product(15, "qui illo error", "Baby", 623.58));
        productList.add(new Product(16, "aut ex ducimus", "Books", 551.39));
        productList.add(new Product(17, "accusamus repellendus minus", "Books", 240.58));
        productList.add(new Product(18, "aut accusamus quia", "Baby", 881.38));
        productList.add(new Product(19, "doloremque incidunt sed", "Games", 988.49));
        productList.add(new Product(20, "libero omnis velit", "Baby", 177.61));
        productList.add(new Product(21, "consectetur cupiditate sunt", "Toys", 95.46));
        productList.add(new Product(22, "itaque ea qui", "Baby", 677.78));
        productList.add(new Product(23, "non et nulla", "Grocery", 70.49));
        productList.add(new Product(24, "veniam consequatur et", "Books", 893.44));
        productList.add(new Product(25, "magnam adipisci voluptate", "Grocery", 366.13));
        productList.add(new Product(26, "reiciendis consequuntur placeat", "Toys", 359.27));
        productList.add(new Product(27, "dolores ipsum sit", "Toys", 786.99));
        productList.add(new Product(28, "ut hic tempore", "Toys", 316.09));
        productList.add(new Product(29, "quas quis deserunt", "Toys", 772.78));
        productList.add(new Product(30, "excepturi nesciunt accusantium", "Toys", 911.46));

        orderList.add(new Order(1, parse("2021-02-28"), parse("2021-03-08"), "NEW", 5));
        orderList.add(new Order(2, parse("2021-02-28"), parse("2021-03-05"), "NEW", 3));
        orderList.add(new Order(3, parse("2021-04-10"), parse("2021-04-18"), "DELIVERED", 5));
        orderList.add(new Order(4, parse("2021-03-22"), parse("2021-03-27"), "PENDING", 3));
        orderList.add(new Order(5, parse("2021-03-04"), parse("2021-03-12"), "NEW", 1));
        orderList.add(new Order(6, parse("2021-03-30"), parse("2021-04-07"), "DELIVERED", 9));
        orderList.add(new Order(7, parse("2021-03-05"), parse("2021-03-09"), "PENDING", 8));
        orderList.add(new Order(8, parse("2021-03-27"), parse("2021-04-05"), "NEW", 4));
        orderList.add(new Order(9, parse("2021-04-14"), parse("2021-04-18"), "NEW", 10));
        orderList.add(new Order(10, parse("2021-03-10"), parse("2021-03-19"), "NEW", 8));
        orderList.add(new Order(11, parse("2021-04-01"), parse("2021-04-04"), "DELIVERED", 1));
        orderList.add(new Order(12, parse("2021-02-24"), parse("2021-02-28"), "PENDING", 5));
        orderList.add(new Order(13, parse("2021-03-15"), parse("2021-03-21"), "NEW", 5));
        orderList.add(new Order(14, parse("2021-03-30"), parse("2021-04-07"), "PENDING", 4));
        orderList.add(new Order(15, parse("2021-03-13"), parse("2021-03-14"), "DELIVERED", 5));
        orderList.add(new Order(16, parse("2021-03-13"), parse("2021-03-21"), "NEW", 1));
        orderList.add(new Order(17, parse("2021-03-31"), parse("2021-03-31"), "DELIVERED", 6));
        orderList.add(new Order(18, parse("2021-03-25"), parse("2021-03-31"), "PENDING", 9));
        orderList.add(new Order(19, parse("2021-02-28"), parse("2021-03-09"), "DELIVERED", 9));
        orderList.add(new Order(20, parse("2021-03-23"), parse("2021-03-30"), "NEW", 5));
        orderList.add(new Order(21, parse("2021-03-19"), parse("2021-03-24"), "DELIVERED", 9));
        orderList.add(new Order(22, parse("2021-02-27"), parse("2021-03-01"), "NEW", 5));
        orderList.add(new Order(23, parse("2021-04-19"), parse("2021-04-24"), "PENDING", 4));
        orderList.add(new Order(24, parse("2021-03-24"), parse("2021-03-24"), "DELIVERED", 1));
        orderList.add(new Order(25, parse("2021-03-03"), parse("2021-03-10"), "NEW", 1));
        orderList.add(new Order(26, parse("2021-03-17"), parse("2021-03-26"), "NEW", 10));
        orderList.add(new Order(27, parse("2021-03-20"), parse("2021-03-25"), "NEW", 1));
        orderList.add(new Order(28, parse("2021-04-09"), parse("2021-04-16"), "DELIVERED", 2));
        orderList.add(new Order(29, parse("2021-04-06"), parse("2021-04-08"), "PENDING", 1));
        orderList.add(new Order(30, parse("2021-04-19"), parse("2021-04-20"), "DELIVERED", 1));
        orderList.add(new Order(31, parse("2021-03-03"), parse("2021-03-04"), "NEW", 3));
        orderList.add(new Order(32, parse("2021-03-15"), parse("2021-03-24"), "DELIVERED", 2));
        orderList.add(new Order(33, parse("2021-04-18"), parse("2021-04-24"), "PENDING", 1));
        orderList.add(new Order(34, parse("2021-03-28"), parse("2021-03-28"), "NEW", 6));
        orderList.add(new Order(35, parse("2021-03-15"), parse("2021-03-17"), "NEW", 1));
        orderList.add(new Order(36, parse("2021-03-04"), parse("2021-03-08"), "DELIVERED", 2));
        orderList.add(new Order(37, parse("2021-03-18"), parse("2021-03-25"), "NEW", 8));
        orderList.add(new Order(38, parse("2021-04-11"), parse("2021-04-20"), "NEW", 8));
        orderList.add(new Order(39, parse("2021-04-12"), parse("2021-04-17"), "NEW", 9));
        orderList.add(new Order(40, parse("2021-03-12"), parse("2021-03-12"), "PENDING", 3));
        orderList.add(new Order(41, parse("2021-02-24"), parse("2021-02-26"), "NEW", 5));
        orderList.add(new Order(42, parse("2021-04-08"), parse("2021-04-14"), "DELIVERED", 9));
        orderList.add(new Order(43, parse("2021-03-03"), parse("2021-03-11"), "NEW", 3));
        orderList.add(new Order(44, parse("2021-03-12"), parse("2021-03-14"), "DELIVERED", 4));
        orderList.add(new Order(45, parse("2021-04-01"), parse("2021-04-06"), "DELIVERED", 1));
        orderList.add(new Order(46, parse("2021-03-16"), parse("2021-03-22"), "NEW", 10));
        orderList.add(new Order(47, parse("2021-04-07"), parse("2021-04-12"), "PENDING", 2));
        orderList.add(new Order(48, parse("2021-04-05"), parse("2021-04-06"), "NEW", 2));
        orderList.add(new Order(49, parse("2021-04-10"), parse("2021-04-13"), "NEW", 7));
        orderList.add(new Order(50, parse("2021-03-18"), parse("2021-03-21"), "NEW", 9));


        order_product_relationship(1, 21);
        order_product_relationship(1, 19);
        order_product_relationship(1, 5);
        order_product_relationship(2, 17);
        order_product_relationship(2, 11);
        order_product_relationship(2, 14);
        order_product_relationship(2, 13);
        order_product_relationship(3, 5);
        order_product_relationship(3, 3);
        order_product_relationship(3, 19);
        order_product_relationship(3, 13);
        order_product_relationship(3, 15);
        order_product_relationship(4, 22);
        order_product_relationship(4, 26);
        order_product_relationship(4, 12);
        order_product_relationship(5, 5);
        order_product_relationship(6, 5);
        order_product_relationship(6, 12);
        order_product_relationship(7, 8);
        order_product_relationship(7, 25);
        order_product_relationship(7, 21);
        order_product_relationship(7, 1);
        order_product_relationship(7, 13);
        order_product_relationship(7, 10);
        order_product_relationship(8, 12);
        order_product_relationship(8, 8);
        order_product_relationship(9, 8);
        order_product_relationship(10, 14);
        order_product_relationship(10, 8);
        order_product_relationship(11, 12);
        order_product_relationship(11, 6);
        order_product_relationship(11, 21);
        order_product_relationship(11, 22);
        order_product_relationship(11, 27);
        order_product_relationship(11, 11);
        order_product_relationship(12, 19);
        order_product_relationship(12, 13);
        order_product_relationship(12, 11);
        order_product_relationship(12, 6);
        order_product_relationship(13, 11);
        order_product_relationship(13, 24);
        order_product_relationship(13, 26);
        order_product_relationship(13, 23);
        order_product_relationship(14, 18);
        order_product_relationship(15, 16);
        order_product_relationship(15, 13);
        order_product_relationship(15, 7);
        order_product_relationship(16, 23);
        order_product_relationship(16, 29);
        order_product_relationship(16, 18);
        order_product_relationship(16, 16);
        order_product_relationship(16, 22);
        order_product_relationship(16, 26);
        order_product_relationship(17, 18);
        order_product_relationship(17, 4);
        order_product_relationship(18, 13);
        order_product_relationship(18, 3);
        order_product_relationship(18, 27);
        order_product_relationship(18, 2);
        order_product_relationship(19, 26);
        order_product_relationship(19, 22);
        order_product_relationship(19, 18);
        order_product_relationship(19, 14);
        order_product_relationship(19, 15);
        order_product_relationship(19, 13);
        order_product_relationship(20, 22);
        order_product_relationship(21, 21);
        order_product_relationship(21, 26);
        order_product_relationship(22, 7);
        order_product_relationship(22, 6);
        order_product_relationship(23, 27);
        order_product_relationship(23, 7);
        order_product_relationship(23, 11);
        order_product_relationship(23, 5);
        order_product_relationship(24, 24);
        order_product_relationship(24, 2);
        order_product_relationship(24, 6);
        order_product_relationship(24, 28);
        order_product_relationship(24, 4);
        order_product_relationship(25, 28);
        order_product_relationship(25, 17);
        order_product_relationship(25, 2);
        order_product_relationship(25, 29);
        order_product_relationship(25, 19);
        order_product_relationship(26, 4);
        order_product_relationship(27, 6);
        order_product_relationship(27, 15);
        order_product_relationship(27, 24);
        order_product_relationship(28, 22);
        order_product_relationship(28, 9);
        order_product_relationship(29, 22);
        order_product_relationship(30, 29);
        order_product_relationship(30, 6);
        order_product_relationship(30, 8);
        order_product_relationship(31, 16);
        order_product_relationship(31, 12);
        order_product_relationship(31, 28);
        order_product_relationship(32, 8);
        order_product_relationship(32, 5);
        order_product_relationship(33, 12);
        order_product_relationship(33, 26);
        order_product_relationship(33, 21);
        order_product_relationship(33, 23);
        order_product_relationship(33, 29);
        order_product_relationship(33, 13);
        order_product_relationship(34, 1);
        order_product_relationship(34, 6);
        order_product_relationship(34, 22);
        order_product_relationship(34, 19);
        order_product_relationship(34, 13);
        order_product_relationship(34, 27);
        order_product_relationship(35, 5);
        order_product_relationship(35, 11);
        order_product_relationship(35, 26);
        order_product_relationship(35, 9);
        order_product_relationship(36, 28);
        order_product_relationship(36, 7);
        order_product_relationship(37, 15);
        order_product_relationship(37, 11);
        order_product_relationship(38, 18);
        order_product_relationship(38, 11);
        order_product_relationship(38, 14);
        order_product_relationship(38, 20);
        order_product_relationship(38, 7);
        order_product_relationship(39, 1);
        order_product_relationship(39, 21);
        order_product_relationship(40, 12);
        order_product_relationship(40, 10);
        order_product_relationship(40, 11);
        order_product_relationship(40, 29);
        order_product_relationship(40, 1);
        order_product_relationship(41, 13);
        order_product_relationship(41, 19);
        order_product_relationship(41, 5);
        order_product_relationship(41, 29);
        order_product_relationship(41, 14);
        order_product_relationship(41, 4);
        order_product_relationship(42, 2);
        order_product_relationship(43, 6);
        order_product_relationship(44, 20);
        order_product_relationship(44, 18);
        order_product_relationship(44, 8);
        order_product_relationship(44, 24);
        order_product_relationship(44, 26);
        order_product_relationship(44, 13);
        order_product_relationship(45, 23);
        order_product_relationship(45, 1);
        order_product_relationship(45, 25);
        order_product_relationship(45, 15);
        order_product_relationship(46, 16);
        order_product_relationship(46, 24);
        order_product_relationship(46, 19);
        order_product_relationship(46, 13);
        order_product_relationship(46, 11);
        order_product_relationship(47, 23);
        order_product_relationship(47, 28);
        order_product_relationship(47, 20);
        order_product_relationship(47, 21);
        order_product_relationship(48, 15);
        order_product_relationship(48, 3);
        order_product_relationship(48, 26);
        order_product_relationship(48, 7);
        order_product_relationship(48, 19);
        order_product_relationship(48, 10);
        order_product_relationship(49, 5);
        order_product_relationship(49, 13);
        order_product_relationship(49, 29);
        order_product_relationship(49, 3);
        order_product_relationship(49, 12);
        order_product_relationship(49, 17);
        order_product_relationship(50, 15);
        order_product_relationship(50, 16);


    }


    public static void main(String[] args) {
        createData();
//
//        orderList.forEach(order ->
//                order.billAmount = order.products.stream()
//                        .map(product -> product.price)
//                        .reduce(Double::sum)
//                        .orElseThrow()
//        );


        orderList.stream().filter(order -> Objects.equals(order.status, "NEW")).forEach(order->System.out.print(order.status));


//        orderList.forEach(order -> System.out.println("Order id " + order.id + "  Bill Amount  " + order.billAmount));

    }


}
