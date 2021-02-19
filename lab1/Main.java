package labLFPC.lab1;

import java.util.Scanner;
/*
var3

vertexes: SRD
Edges: abcdf

S->aS
S->bD
S->fR
D->cD
D->dR
R->bR
R->f
D->d
END

this is right-linear Regular and Context-Free Grammar
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DFA asd = new DFA("SRD", "abcdf");
        String word;
	    System.out.println("when you checked all words write 'END' ");
        while(true){
            word = in.nextLine();
            if (!word.equals("END") && !word.isEmpty())
                if (asd.checkWay(word))
                    System.out.println("Accepted");
                else
                    System.out.println("Refused");
            else return;
        }
    }
}



