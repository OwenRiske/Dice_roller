package com.company;

public class dice {
    int numSides;
    int highestNum;
    int lowestNum;
    boolean weighted;
    int[] weighting;

    dice(int newNumSides, int newHighestNum){
        highestNum=newHighestNum;
        numSides=newNumSides;
        lowestNum=newNumSides-newHighestNum;
        weighted=false;
    }
    dice(int newNumSides, int newHighestNum, int[] newWeighting){
        highestNum=newHighestNum;
        numSides=newNumSides;
        lowestNum=newNumSides-newHighestNum;
        weighted=true;
        weighting=newWeighting;
    }
    dice (int newHighestNum){
        highestNum=newHighestNum;
        numSides=newHighestNum;
        lowestNum=0;
        weighted=false;
    }
    dice( int newHighestNum, int[] newWeighting){
        highestNum=newHighestNum;
        numSides=newHighestNum;
        lowestNum=0;
        weighted=true;
        weighting=newWeighting;
    }

    void setWeighting(int[] newWeighting){
        if (newWeighting.length==0){
            weighted=false;
        }
        else{
            weighted=true;
        }
        weighting=newWeighting;
    }


}
