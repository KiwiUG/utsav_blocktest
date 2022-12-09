import model.Items;
import model.Orders;
import model.Users;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Items i_one = new Items(1,"Nerd",12345,"S","Levis");
        Items i_two = new Items(2,"LV",2500,"M","LV");
        Items i_three = new Items(3,"GUCCI",3500,"L","GUCCI");
        Items i_four = new Items(4,"VANS",4500,"XL","VANS");
        Items i_five = new Items(5,"SIDEMEN",5500,"XXL","SIDEMEN");

        ArrayList<Items> items_one = new ArrayList<>();
        items_one.add(i_one);
        items_one.add(i_three);

        ArrayList<Items> items_two = new ArrayList<>();
        items_two.add(i_four);
        items_two.add(i_five);
        items_two.add(i_two);



        Orders o_one = new Orders(1,"one","Need good quality","Delivery in time",items_one);
        Orders o_two = new Orders(2,"two","Need good quality","Delivery in time",items_two);
        Orders o_three = new Orders(3,"three","Need good quality","Delivery in time",items_one);
        Orders o_four = new Orders(4,"four","Need good quality","Delivery in time",items_two);

        ArrayList<Orders> orders_one = new ArrayList<>();
        orders_one.add(o_one);
        orders_one.add(o_two);

        ArrayList<Orders> orders_two = new ArrayList<>();
        orders_two.add(o_three);
        orders_two.add(o_four);

        Users u_one = new Users(1,"UG",17,"ug@gmail.com",orders_one);
        Users u_two = new Users(2,"AA",17,"AA@gmail.com",orders_two);

        i_one.display();


    }
}
