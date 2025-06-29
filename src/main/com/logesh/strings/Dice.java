package src.main.com.logesh.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Dice object.
 */
public class Dice {

    /**
     * The main method to test the functionality of the Dice class.
     *
     * @param args command line arguments (not used in this case)
     */
    public static void main(String[] args) {
        diceCombinations("",4);
        System.out.println(diceCombinationsRetrunArray("",4));
        System.out.println(diceCombinationsRetrunArray("",4).size());
        System.out.println(diceCombinationsCount("",4));
        diceFace("",4,8);
        System.out.println(diceFaceRetrunArray("",4,8));
        System.out.println(diceFaceRetrunArray("",4,8).size());
        System.out.println(diceFaceCount("",4,8));
    }

    /**
     * Prints all possible combinations of dice rolls that sum up to the target.
     *
     * @param processed the current combination of dice rolls
     * @param target the remaining sum to reach
     */
    static void diceCombinations(String processed,int target){
        if(target==0){
            System.out.println(processed);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            diceCombinations(processed+i,target-i);
        }
    }

    /**
     * Returns all possible combinations of dice rolls that sum up to the target.
     *
     * @param processed the current combination of dice rolls
     * @param target the remaining sum to reach
     * @return a list of all possible combinations
     */
    static List<String> diceCombinationsRetrunArray(String processed, int target){
        if(target==0){
            List<String> answer = new ArrayList<                                String>();
            answer.add(processed);
            return answer;
        }
        List<String> finalResult= new ArrayList<String>();
        for(int i=1;i<=6 && i<=target;i++){
           finalResult.addAll(diceCombinationsRetrunArray(processed+i,target-i));
        }
        return finalResult;
    }

    /**
     * Returns the count of all possible combinations of dice rolls that sum up to the target.
     *
     * @param processed the current combination of dice rolls
     * @param target the remaining sum to reach
     * @return the count of all possible combinations
     */
    static int diceCombinationsCount(String processed, int target){
        if(target==0){
            return 1;
        }
        int count = 0;
        for(int i=1;i<=6 && i<=target;i++){
            count=count+diceCombinationsCount(processed+i,target-i);
        }
        return count;
    }

    /**
     * Prints all possible combinations of dice rolls with a specified number of faces that sum up to the target.
     *
     * @param processed the current combination of dice rolls
     * @param target the remaining sum to reach
     * @param face the number of faces on the dice
     */
    static void diceFace(String processed,int target,int face){
        if(target==0){
            System.out.println(processed);
            return;
        }
        for(int i=1;i<=face && i<=target;i++){
            diceFace(processed+i,target-i,face);
        }
    }

    /**
     * Returns all possible combinations of dice rolls with a specified number of faces that sum up to the target.
     *
     * @param processed the current combination of dice rolls
     * @param target the remaining sum to reach
     * @param face the number of faces on the dice
     * @return a list of all possible combinations
     */
    static List<String> diceFaceRetrunArray(String processed, int target,int face){
        if(target==0){
            List<String> answer = new ArrayList<String>();
            answer.add(processed);
            return answer;
        }
        List<String> finalResult= new ArrayList<String>();
        for(int i=1;i<=face && i<=target;i++){
            finalResult.addAll(diceFaceRetrunArray(processed+i,target-i,face));
        }
        return finalResult;
    }

    /**
     * Returns the count of all possible combinations of dice rolls with a specified number of faces that sum up to the target.
     *
     * @param processed the current combination of dice rolls
     * @param target the remaining sum to reach
     * @param face the number of faces on the dice
     * @return the count of all possible combinations
     */
    static int diceFaceCount(String processed, int target,int face){
        if(target==0){
            return 1;
        }
        int count = 0;
        for(int i=1;i<=face && i<=target;i++){
            count=count+diceFaceCount(processed+i,target-i,face);
        }
        return count;
    }

}
