Input File
The input file can contain multiple NFAs but they have to be separated by an empty line.

Each NFA is composed of the following lines:

Set of states separated by commas.
Set of accept states separated by commas.
Input alphabet separated by commas.
The initial state.
The transitions between states separated by hashtags.
Each transition contains the source state followed by the target state followed by the given input alphabet.
Example: S1,S2,1 means S1 goes to S2 given 1.
Set of inputs separated by hashtags.
Each input contains the input alphabet separated by commas _Example: 1,2,0,1,2#1,1,1 will result in passing 1,2,0,1,2 to the DFA and returning either "ACCEPTED" or "REJECTED" and then it will pass 1,1,1 and return "ACCEPTED" or "REJECTED".
Output
The output is printed in the console after the NFA is converted to the DFA and the input is passed to the DFA.
As mentioned before for each input string it prints either "ACCEPTED" or "REJECTED".

The algorithm also checks for problems with the provided NFA, such as an invalid transition, accept state, initial state or input string.
