class Solution {
    public int largestAltitude(int[] a) {        int haltitude=0;
            int caltitude=0;
        for(int i=0;i<a.length;i++){
            caltitude=caltitude+a[i];
        
        if(haltitude<caltitude){
            haltitude=caltitude;
        }
        }
        return haltitude; 
    }
}