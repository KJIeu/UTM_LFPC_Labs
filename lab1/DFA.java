package labLFPC.lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class DFA {
    Scanner in = new Scanner(System.in);

    ArrayList <String> rules = new ArrayList<>();
    private final String vertexes, edges;
    private char num = ' ';

    public DFA(String vertex, String edge){
        this.edges = edge.replaceAll("[^a-z]", "");
        this.vertexes = vertex.replaceAll("[^A-Z]", "");
        setRules();
    }

    public void setRules() {
        System.out.println("when you introduced all rules write 'END' ");
        String rule;
        while (true) {
            rule = in.nextLine();
            if (!rule.equals("END") && !rule.isEmpty())
                //if input string is empty or is equal to "END" than
                //cycle 'll break
                if (vertexes.contains(String.valueOf(rule.charAt(0))) && String.valueOf(rule.charAt(1)).equals("-")
                        && String.valueOf(rule.charAt(2)).equals(">") && edges.contains(String.valueOf(rule.charAt(3)))
                        && !rules.contains(rule))
                //rules must match to pattern
                    //*letter from vertexes*->*letter from edges*(*letter from vertexes* or nothing)
                {
                    if (rule.length() == 4)
                        rules.add(rule);
                    else if (vertexes.contains(String.valueOf(rule.charAt(4))))
                        rules.add(rule);
                        else
                        System.out.println("Why do u bully me?（>﹏<）");
                } else {
                    System.out.println("Why do u bully me?（>﹏<）");
                }
            else break;
        }
        System.out.println("Grammar created");
    }

    public boolean checkWay(String word){
        num = ' ';
        //1st step: we check if last letter of the word is terminal node
        if (!checkLastLetter(word.charAt(word.length()-1))) return false;
        //2nd step: we check i-th letter corresponds to rules
        int i = word.length()-2;
        while(i >= 0){
            //System.out.println("* " + word.charAt(i) + " " + num + " ");
            if (!checkLetterReverse(word.charAt(i))){
                i++;
                if(!checkLetterDirect(word.charAt(i)))
                return false;
            }

            i--;
        }
        return true;
    }

    private boolean checkLastLetter(char letter){
        for (String rule: rules) {
            if (rule.length() == 4 && rule.contains(String.valueOf(letter))){
                num = rule.charAt(0);
                return true;
            }
        }
        return false;
    }

    private boolean checkLetter(char letter) {
        for (int i = rules.size() - 1; i >= 0; i--) {
            if (rules.get(i).length() == 5)
                if (rules.get(i).charAt(4) == num && rules.get(i).contains(String.valueOf(letter))) {
                    num = rules.get(i).charAt(0);
                    return true;
                }
        }
        return false;
    }
    
    private boolean checkLetterDirect(char letter) {
        for (int i = 0; i < rules.size(); i++) {
            if (rules.get(i).length() == 5)
                if (rules.get(i).charAt(4) == num && rules.get(i).contains(String.valueOf(letter))) {
                    //System.out.println("//"+letter + " " + num + " ");
                    num = rules.get(i).charAt(0);
                    return true;
                }
        }
        return false;
    }
}
