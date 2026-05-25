class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> result=new ArrayList<>();

       List<Integer> list = Arrays.stream(nums)
                           .boxed()
                           .collect(Collectors.toList());
        Collections.sort(list);
        for(int x=0;x<n-2;x++){
            if (x > 0 && list.get(x).equals(list.get(x - 1))) {
                continue;
            }
            int target=-(list.get(x));
            int i=x+1;
            int j=n-1;
            while(i<j){
            int sum=list.get(i)+list.get(j);
            if(sum==target){
               
                result.add(new ArrayList<>(List.of(list.get(x),list.get(i),list.get(j))));
                   i++;
                    j--;
                      // after moving pointers still variable may point to duplicate so  skip duplicates
                    while (i < j &&
                           list.get(i).equals(list.get(i - 1))) {
                        i++;
                    }

                    while (i < j &&
                           list.get(j).equals(list.get(j + 1))) {
                        j--;
                    }
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }


        }
        return result;
    }
}
