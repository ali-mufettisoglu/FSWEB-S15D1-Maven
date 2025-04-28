package org.example.models;

import java.util.*;

public class Grocery {
    public static List<String> groceryList = new ArrayList<>();

    public void startGrocery(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        switch (input){
            case 0:
            case 1:
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                String addInput = scan.nextLine();
                addItems(addInput);
                break;
            case 2:
                System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
                String removeInput = scan.nextLine();
                removeItems(removeInput);
                break;
        }
    }

    public static void addItems(String input){
        String[] arr = input.trim().split(",");

        for(String str: arr){
            if(!checkItemIsInList(str))
                groceryList.add(str);
        }

        Collections.sort(groceryList);
    }

    public static void removeItems(String input){
        String[] arr = input.trim().split(",");

        for(String str: arr){
            if(checkItemIsInList(str))
                groceryList.remove(str);
        }

        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String product){
        return groceryList.contains(product);
    }

    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }
}
