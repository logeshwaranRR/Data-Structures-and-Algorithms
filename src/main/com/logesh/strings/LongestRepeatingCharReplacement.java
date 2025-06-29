package src.main.com.logesh.strings;

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
       String str = "AABABBA";
        System.out.println(characterReplacement(str,1));
    }
    public static  int characterReplacement(String s, int k) {
        int right=0;
        int left=0;
        int[] freqArr = new int[26];
        int maxFreq=0;
        int maxLength=0;
    while(right<s.length()){
        freqArr[s.charAt(right)-'A']++;
        maxFreq =Math.max(maxFreq,freqArr[s.charAt(right)-'A']);
        while((right-left+1)-maxFreq>k){
            freqArr[s.charAt(left)-'A']--;
            left++;
        }
        maxLength=Math.max(maxLength,right-left+1);
        right++;
    }
    return maxLength;
    }
}
