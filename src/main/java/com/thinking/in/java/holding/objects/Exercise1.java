package com.thinking.in.java.holding.objects;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Gerbil> gerbilList = new ArrayList<Gerbil>();
        gerbilList.add(new Gerbil(1));
        gerbilList.add(new Gerbil(2));
        gerbilList.add(new Gerbil(3));
        gerbilList.add(new Gerbil(4));
        gerbilList.add(new Gerbil(5));

        getGerbils(gerbilList);
    }

    private static void getGerbils(List<Gerbil> gerbilList) {
        for (int index = 0; index < gerbilList.size(); index++) {
           gerbilList.get(index).hop();
        }
    }

}
class Gerbil{
    int gerbilNumber;

    Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }

    void hop(){
        System.out.println("Gerbil number : "+gerbilNumber);
    }
}