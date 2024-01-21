package com.guide.c1;

public class GalToLitTable {
  public static void main(String[] args) {
    double gallons;
    double liters;
    int count;

    for(count = 1; count <= 100; count++) {
      gallons = count;
      liters = gallons * 3.7854;
      System.out.println(gallons + " is equal to " + liters);
      if(count%10 == 0) {
        System.out.println();
      }
    }
  }
}
