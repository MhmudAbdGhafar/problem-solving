public class Main {

    public static void main(String[] args){

        String s = "aabbcc";

        int k = 1;

        int[] ans = getLongestSubString(s, k);

        if(ans[0] == -1){
            return;
        }

        if(ans[1] == 0){
            System.out.println("Not enough unique characters");

            return;
        }

        String longestSubstring = s.substring(ans[0], ans[1]);

        StringBuilder output = new StringBuilder();
        output.append("Longest substring length with k unique characters is: ").
               append(longestSubstring).
               append(" with size: ").
               append(ans[1]);

        System.out.println(output);
    }

    private static int[] getLongestSubString(String s, int k) {

        if(k <= 0 || s.isEmpty()){
            System.out.println("invalid inputs");

            return new int[]{-1, 0};
        }

        int i = 0, j = 0, countDistinct = 0, maxLength = 0;

        // this is array is for keeping track
        // the start index of the choosen substring
        // and the size of the choosen substirng
        int[] ans = new int[2];

        int []freq = new int[26];

        while (i <= j && j < s.length()){
            if(countDistinct < k){
                freq[s.charAt(j) - 'a']++;

                if(freq[s.charAt(j) - 'a'] == 1){
                    countDistinct++;
                }

                j++;
            }
            else {

                if(j - i + 1 > ans[1]){
                    ans[1] = j - i + 1;

                    ans[0] = i;
                }

                freq[s.charAt(i) - 'a']--;

                if(freq[s.charAt(i) - 'a'] == 0){
                    countDistinct--;
                }

                i++;

            }
        }

        if(countDistinct == k){

            if(j - i + 1 > ans[1]){
                ans[1] = j - i + 1;

                ans[0] = i;
            }

        }

        return ans;
    }
}