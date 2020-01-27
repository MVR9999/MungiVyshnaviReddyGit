import java.util.*;

class test
{
  public Integer[] maxSlidingWindow(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < nums.length; ++i) {
      if (i >= k) 
        pq.remove(nums[i - k]);
      pq.add(nums[i]);
      System.out.println(pq);     

      if (i >= k - 1) 
        res.add(pq.peek());
      System.out.println(res);      
    }
    return res.toArray(new Integer[res.size()]);  
  } 
 	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int [] arr = new int[num];
    for(int i = 0; i < num; i++)
      arr[i] = sc.nextInt();
    
    int k = sc.nextInt();

    test obj = new test();
    Integer [] result = obj.maxSlidingWindow(arr, k);
    System.out.println(Arrays.toString(result)); 
  }
}