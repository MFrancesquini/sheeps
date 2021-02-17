package org.academiadecodigo.cachealots;

import java.io.FileReader;

public class HappySheep {

    public static void main(String[] args) {


        Sheep sheep = new Sheep("");
        sheep.createSheeps();
        sheep.printSheeps();
        System.out.println("================================");
        sheep.changeColor();
        sheep.printSheeps();

    }
}
