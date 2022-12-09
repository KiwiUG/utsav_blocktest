package model;

import java.util.ArrayList;

public class Orders {
    int o_num;
    String o_name;
    String o_desp;
    String o_req;
    ArrayList<Items> items;

    public Orders(int o_num, String o_name, String o_desp, String o_req, ArrayList<Items> items) {
        this.o_num = o_num;
        this.o_name = o_name;
        this.o_desp = o_desp;
        this.o_req = o_req;
        this.items = items;
    }

    public int getO_num() {
        return o_num;
    }

    public void setO_num(int o_num) {
        this.o_num = o_num;
    }

    public String getO_name() {
        return o_name;
    }

    public void setO_name(String o_name) {
        this.o_name = o_name;
    }

    public String getO_desp() {
        return o_desp;
    }

    public void setO_desp(String o_desp) {
        this.o_desp = o_desp;
    }

    public String getO_req() {
        return o_req;
    }

    public void setO_req(String o_req) {
        this.o_req = o_req;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
}

