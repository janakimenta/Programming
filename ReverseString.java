//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
//*******************************************************************

 // headers MUST be above the first class
import java.lang.*;
// one class needs to have a main() method
public class ReverseString
{
public static void main(String args[])
{
String strWord = "abce";
System.out.println("strWord  --> " + strWord);
System.out.println(" reverse Word --> " + reverseWord(strWord));
  String strSentence = "Hello World";
System.out.println("strSentence --> " + strSentence);
System.out.println(" reverse Sentence --> " + reverseSentence(strSentence));
}
  
  public static String reverseWord(String word)
{
    if(word == null || word.length() < 1)
{
  return null;
}
char[] strarray = word.toCharArray();
char temp;
int length = word.length() -1;
int i =0;

while(i < length)
{
temp = strarray[i];
strarray[i] = strarray[length];
strarray[length] = temp;
length --;
}    
return new String(strarray);
}
  
  public static String reverseSentence(String sentence)
{
    if(sentence == null || sentence.length() < 1)
{
  return null;
}
String[] strArray = sentence.trim().split("\\s+");
StringBuilder strBuilder = new StringBuilder();
for(int i= strArray.length - 1; i >= 0 ; i--)
    {
      strBuilder.append(strArray[i]);
      strBuilder.append(' ');
      
    }

return  strBuilder.toString().trim();
}
}
