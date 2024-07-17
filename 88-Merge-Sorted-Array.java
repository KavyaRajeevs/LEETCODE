class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1=(n+m)-1;
        int m2=m-1;
        int n1=n-1;

        while(n1>=0){
            if(m2>=0 && nums2[n1]<nums1[m2]){
                nums1[m1--]=nums1[m2--];   
                   
            }
            else{
                 nums1[m1--]=nums2[n1--]; 
            }
        }
        
        
    }
}