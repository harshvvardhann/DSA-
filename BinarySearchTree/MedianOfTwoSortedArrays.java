package BinarySearchTree;
class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        int n = n1 + n2;
        int index2 = n/2;
        int index1 = n/2-1;
        int count = 0;
        int ind1el = -1, ind2el = -1;

        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                if(count == index1) ind1el = nums1[i];
                if(count == index2) ind2el = nums1[i];
                count++;
                i++;
            }else{
                if(count == index1) ind1el = nums2[j];
                if(count == index2) ind2el = nums2[j];
                count++;
                j++;
            }
        }

        while(i<n1){
            if(count == index1) ind1el = nums1[i];
            if(count == index2) ind2el = nums1[i];
            count++;
            i++;
        }

        while(j<n2){
            if(count == index1) ind1el = nums2[j];
            if(count == index2) ind2el = nums2[j];
            count++;
            j++;
        }
    if(n%2 == 1){
        return ind2el;
    }

    return (double)(((double)(ind1el+ind2el)) / 2.0); 
    }
}