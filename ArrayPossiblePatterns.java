/*Given a string as input, return the list of all the patterns possible:


'1' : ['A', 'B', 'C'], 
'2' : ['D', 'E'],
'12' : ['X']
'3' : ['P', 'Q']
Example if input is '123', then output should be [ADP, ADQ, AEP, AEQ, BDP, BDQ, BEP, BEQ, CDP, CDQ, CEP, CEQ, XP, XQ]

*/

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class PatternsPossible
{
   
    public static void main(String args[])
    {
        Map<String,char[]> inputList = new HashMap<String,char[]>();
        inputList.put("1",new char[]{'A','B','C'});
        inputList.put("2",new char[]{'D','E'});
        inputList.put("12",new char[]{'X'});
        inputList.put("3",new char[]{'P','Q'});
        PatternsPossible pp = new PatternsPossible();
        for(String s:  pp.printAllPossiblePatterns(inputList,"123"))
        {
           
            System.out.println(s);
        }
        }

    public List<String> printAllPossiblePatterns(Map<String,char[]> a, String str)
    {
        List<String> output = new ArrayList<String>();
        if(str == null || str.length() == 0) { output.add(""); return output; }
        for(int i = 0; i < str.length() ; i++)
        {
            String str1 = str.substring(0,i+1);
           
            if(a.containsKey(str1))
            {
                char b[] = a.get(str1);
                for(int j = 0; j< b.length ; j++)
                {
                    for(String s : printAllPossiblePatterns(a,str.substring(i+1)))
                    {
                        output.add(b[j]+s);
                    }
                }
            }
        }
        return output;
    }
}
