package com.company;

public class Main {

    public static void main(String[] args) {

        Post_office kzpost = new Post_office();


        Client client1 = new Client("Dias");
        Client client2 = new Client("Akzhol");
        Client client3 = new Client("Salauat");

        kzpost.newclient(client1);
        kzpost.newclient(client2);
        kzpost.newclient(client3);


        client1.Register_to_post_office(kzpost);
        client2.Register_to_post_office(kzpost);
        client3.Register_to_post_office(kzpost);

        kzpost.newpackage("phone",client1);













    }
}
