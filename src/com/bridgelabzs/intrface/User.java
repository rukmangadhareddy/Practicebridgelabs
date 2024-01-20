package com.bridgelabzs.intrface;

public class User {
	public static void main(String[] args) {
    Lenovo lenovo = new Lenovo();
    lenovo.capture();
    lenovo.keyboard();
    lenovo.paste();
    lenovo.cut();
    lenovo.security();
    Laptop.audio();
    Hp hp = new Hp();
    hp.copy()    ;
    hp.cut();
    hp.keyboard();
    hp.paste();
    
	}
}
