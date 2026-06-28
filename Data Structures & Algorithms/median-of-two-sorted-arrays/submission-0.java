class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n=nums1.length;
        int m=nums2.length;
        int[] result=new int[n+m];
        int current_index=0;
        int i=0;
        int j=0;
        int mid=0+(result.length-0)/2;
        while(i<n && j<m){
            if(current_index==mid+1){
                    break;
                }
            else if(nums1[i]<nums2[j]){
                
                result[current_index]=nums1[i];
                i++;
               current_index=current_index+1;
            }
            else{
                result[current_index]=nums2[j];
                j++;
               current_index=current_index+1;

            }
        }

        while(i<n){
            if(current_index==mid+1){
                    break;
                }
             result[current_index]=nums1[i];
                i++;
                current_index=current_index+1;

        }
        while(j<m){
            if(current_index==mid+1){
                    break;
                }
             result[current_index]=nums2[j];
                j++;
               current_index=current_index+1;

        }

        if(result.length%2==0){
           return (result[mid - 1] + result[mid]) / 2.0;
        }
        else{
            return (double) result[mid];
        }
        
    }
}
