package com.collection.class18;

import javafx.concurrent.Task;

public class Task3 {

    /*Write a java class that have 4 constructors with 4 different access levels of
     * constructors(private,public,default,protected) and create 4 objects of this
     * class: 1 - inside same class; 2 - from outside the class; 3 - from different
     * class inside different package and observe results
     */

    private Task3(){
        System.out.println("private");
    }

    Task3(String name){System.out.println("default");
    }
    protected Task3(int age){ System.out.println("protected");
    }
    public Task3(double weigth){ System.out.println("public");
    }

    public static void main(String[] args) {
        new Task3();
        new Task3("name");
        new Task3(10);
        new Task3(45.2);

    }

}
