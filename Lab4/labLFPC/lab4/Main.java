package labLFPC.lab4;

import java.util.Stack;

/**
  Var 4
 LL1
 G = (Vn, Vt, P, S)
 Vn = {S, A, B, C, D}
 Vt = {a,b,c,d,e}

 P ={
 S -> C
 C -> B | BeC
 B -> abD
 D -> Ad
 A -> Ac | a
 }

Parsing Table
 ===========================================================================
          a           b           c            d          e           $
 ----------------------------------------------------------------------------
 S  | S -> C    |           |           |            |           |           |
 ----------------------------------------------------------------------------
 A  |A ->Ac |a  |           |          |            |           |           |
 ----------------------------------------------------------------------------
 B  | B -> abD  |           |         |             |          |           |
 ----------------------------------------------------------------------------
 C  |C -> B | BeC|         |         |              |          |           |
 ----------------------------------------------------------------------------
 D  | D -> Ad    |          |          |          |          |              |
 ----------------------------------------------------------------------------
 ===============================================================================
 String [][] table=
 {
 {"C",null,null,null,null}
 ,
 {"Ac a",null,null,null,null}
 ,
 {"abD",null,null,null,null}
 ,
 {"B BeD",null,null,null,null}
 ,
 {"Ad",null,null,null,null}
 };
 String [] nonTers={"S", "A", "B", "C", "D"};
 String [] terminals={"a","b","c","d","e","$"};

 ================================================================================
 
 */
public class Main {


    //main
    public static void main(String[] args) {
        // TODO code application logic here

        LL1_Parser parser=new LL1_Parser("abcdeabcccd");    //input
        parser.algorithm();

    }

}
