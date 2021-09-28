package com.company;

public interface Subject {
    void newpackage(String title, Client client);

    void newclient(Client client);

    void removeclient(Client client);

    void notifyperson(Client client);
}
