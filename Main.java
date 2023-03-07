import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList bubblePile = new ArrayList<Integer>();
        int pileLength = (int)(Math.random() * 20);
        pileLength = 5000;
        System.out.println(pileLength);
        for(int i=0; i<pileLength; i++){
            bubblePile.add((int)(Math.random()*100));
        }
        System.out.println(bubblePile);
        int increment = 0;
        int pileLength2 = pileLength;
        master:
        for(int i=0; i<pileLength2-1; i++) {
            for(int j=0; j<pileLength2-1; j++) {
                int getJ = (int)(bubblePile.get(j+1));
                if(j == pileLength2 - 1) {
                    pileLength2--;
                    j=0;
                }
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
        System.out.println("Final sorted array: " + bubblePile);
    }
}