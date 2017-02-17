package com.example.hawking.listviewcontact;

/**
 * Created by hawking on 07/02/2017.
 */

public class Contact {
    private String name;
    private String number;
    private int srcAvt;
    public Contact(String name, String number, int srcAvt){
        this.name = name;
        this.number = number;
        this.srcAvt = srcAvt;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getSrcAvt(){
        return srcAvt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
