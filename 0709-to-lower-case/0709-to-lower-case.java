class Solution {
    public String toLowerCase(String s) {
        String res="";
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                res+=(char)((s.charAt(i)-65)+97);
            }
            else
            {
                res+=s.charAt(i);
            }
        }
        return res;
    }
}