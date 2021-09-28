package com.company;

public class Client implements Observer {
    private String name;
    private Post_office post_office = new Post_office();

    public Client(String name) {
        this.name = name;
    }



    @Override
    public void update(){
        System.out.println("Hello " + name + " new package on post office" );
    }


    @Override
    public void Register_to_post_office(Post_office office){
        post_office=office;
    }



}
