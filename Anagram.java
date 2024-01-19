import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1="School Master";
        String str2="The Classroom";

        //Remove all the white spaces
        str1=str1.replace(" ", "");
        str2=str2.replace(" ", "");

        //Convert every word in lower case
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        //Convert the characters to character array
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        //Sort the elements of the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //Compare the elements
        if(Arrays.equals(arr1, arr2))
        {
            System.out.println("It is an Anagram");
        }
        else
        {
            System.out.println("Not an Anagram");
        }
    }
}
