package org.launchcode.java.demos.lsn6inheritance;

import javax.net.ssl.HostnameVerifier;

public class Main {


  public static void main(String[] args) {
    HouseCat morris = new HouseCat("Morris",10);
    morris.sleep();
    System.out.println(morris.isTired());


    HouseCat spike = new HouseCat("spike");
    System.out.println(spike.getWeight());


  }
}
