class Solution {
    public int largestAltitude(int[] gain) {
        int highest=0;
        int current_altitude=0;
        for(int i=0;i<gain.length;i++)
        {
            current_altitude = current_altitude + gain[i];
            if(current_altitude>highest)
            {
                highest=current_altitude;
            }
        }
        return highest;
    }
}