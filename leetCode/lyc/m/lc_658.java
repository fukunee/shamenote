class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<>();
        int n=arr.length;
        if(n==0){
            return list;
        }
        int left=0;
        int right=n;
        while(right-left>1){
            int mid=(left+right)>>>1;
            if(arr[mid]==x){
                left=mid;
                right=mid+1;
            }else if(arr[mid]>x){
                right=mid;
            }else{left=mid;}
        }
        while(k>0){
            if(left<0){
                right++;
            }else if(right>=n){
                left--;
            }
            else{ if(arr[right]-x<x-arr[left]){
                right++;
            }else{left--;}
                 }
            k--;
        }
        
        for(int i=left+1;i<right;i++){
            list.add(arr[i]);
        }
        return list;
    }
}