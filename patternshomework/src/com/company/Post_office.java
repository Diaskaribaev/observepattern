package com.company;

import java.util.ArrayList;
import java.util.List;

public class Post_office implements Subject {
    private List<Client> clients = new ArrayList<>();
    private String name;
    private String Title;



    @Override
    public void newpackage(String title, Client client){
        this.name=name;
        this.Title=title;
        notifyperson(client);
    }


    @Override
    public void newclient(Client client){
        clients.add(client);
    }


    @Override
    public void removeclient(Client client){
        clients.remove(client);
    }


    @Override
    public void notifyperson(Client client) {
        client.update();

    }




}
