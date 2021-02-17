package org.academiadecodigo.cachealots;

public class Sheep {
    public static final int QUANTITY = 100;
    private Sheep[] sheep = new Sheep[100];
    private String color;

    public Sheep(String color){

        this.color = color;
    }

    public Sheep[] createSheeps() {
        for (int i = 0; i < QUANTITY; i++) {

            if (i < (QUANTITY - 1)) {

                sheep[i] = new Sheep("White");
                continue;
            }

            sheep[i] = new Sheep("Black");
        }

        return sheep;
    }

    public void changeColor(){
        for (int i =0; i < QUANTITY; i++){
            sheep[i].setColor("Pink");
        }
    }

    public void printSheeps(){
        for (int i =0; i < QUANTITY; i++){
            System.out.println("Ovelha #" + i + " " + sheep[i].getColor());
            if (sheep[i].color == "White"){
                sheep[i].whiteSpeak();
            } else if (sheep[i].color == "Black"){
                sheep[i].blackSpeak();
            }
        }
    }

    public void blackSpeak(){

        System.out.println("Au, au...");
    }

    public void whiteSpeak(){

        System.out.println("Meeeeeeeh");
    }

    public void setColor(String color){

        this.color = color;
    }

    public String getColor() {

        return color;
    }
}
