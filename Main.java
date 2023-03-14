import java.util.*;
public class Main {
    public static void main(String[] args) {
        int pile1Length = (int)(Math.random() * 200);
        ArrayList bubblePile1 = bubbleRand(pile1Length);
        int pile2Length = (int)(Math.random() * 200);
        ArrayList bubblePile2 = bubbleRand(pile1Length);
        System.out.println("1st length is " + bubblePile1);
        System.out.println("2nd length is " + bubblePile2);
        bubbleSort(bubblePile1, pile1Length);
        bubbleSort(bubblePile2, pile2Length);
        System.out.println();
        System.out.println("1st sorted array: " + bubblePile1);
        System.out.println("2nd sorted array: " + bubblePile2);
    }
    static ArrayList bubbleRand(int genLength){
        ArrayList bubbleGen = new ArrayList();
        for(int i=0; i<genLength; i++){
            bubbleGen.add((int)(Math.random()*100));
        }
        return bubbleGen;
    }
    static void bubbleSort(ArrayList<Integer> bubblePile, int pileLength){
        int increment = 0;
        int pileLength2 = bubblePile.size();
        master:
        for(int i=0; i<pileLength2-1; i++) {
            for(int j=0; j<pileLength2-1; j++) {
                int getJ = (int)(bubblePile.get(j+1));
                if((int)(bubblePile.get(j)) > (int)(bubblePile.get(j+1))) {
                    bubblePile.set(j+1,(int)(bubblePile.get(j)));
                    bubblePile.set(j,getJ);
                }
                increment++;
                System.out.println(bubblePile);
                if(increment >= pileLength*pileLength){
                    break master;
                }
            }
        }
    }
}