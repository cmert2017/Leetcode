//https://leetcode.com/problems/maximum-repeating-substring/
public class MaximumRepeatingSubstring_1668 {
    public static int maxRepeating(String sequence, String word) {
        int count = 0;
        String updatedWord="";
        while (updatedWord.length()<=sequence.length()) {
               updatedWord+=word;
                if(sequence.contains(updatedWord)){
                    count++;
                }else {
                    return count;
                }
        }
        return count;
    }

    public static void main(String[] args) {
        String sequence="aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word ="aaaba";


        System.out.println("maxRepeating(sequence,word) = " + maxRepeating(sequence, word));
    }

}
