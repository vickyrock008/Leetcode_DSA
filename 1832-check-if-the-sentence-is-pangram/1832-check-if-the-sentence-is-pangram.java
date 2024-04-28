class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] res = new boolean[26];
        int index;
        if(sentence.length()<26)
        {
            return false;
        }
        for(int i=0;i<sentence.length();i++)
        {
               index = sentence.charAt(i)-'a';
               res[index] = true;
            
        }
        for(int i=0;i<26;i++)
        {
            if(res[i]==false)
            {
                return false;
            }
        }
        return true;
    }
}