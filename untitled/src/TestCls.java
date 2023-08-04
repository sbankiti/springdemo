import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCls {

    public static void main(String[] args) {

     int x = 023;

     TestCls tst = new TestCls();

     System.out.println("Reverse number is " + tst.reverse(x));

        System.out.println("Finding duplicates in array");
//     Input array
       int[] numbers = new int[] {1,3,3,3,4,2,2,1};
       int[] outarr = new int[numbers.length / 2];

      outarr = tst.duplicateval(numbers);

      for(int i =0 ; i<outarr.length; i++)
      {
          System.out.println(outarr[i]);
      }

      String str1 = "santhosh";

      StringBuilder strb = new StringBuilder();

      strb.append(str1);
      strb.reverse();

      List<String> lstr = Stream.of( "santhosh","Bankiti","Reddy").collect(Collectors.toList());

        System.out.println(lstr);
        Collections.sort(lstr);

        System.out.println(lstr);

        Set<String> hs = new HashSet<>();

        hs.add("Hello");
        hs.add("what");
        hs.add("doing");

        hs.stream().toArray(int[]::new);

    }

    public int[] duplicateval(int[] arr)
    {

        int[] outarr = new int[arr.length/2];
        Set<Integer> hs = new HashSet<>();

        int indx = 0;

        for(int i = 0; i< arr.length;i++)
        {
            if(hs.contains(arr[i]))
            {
                outarr[indx] = arr[i];
                indx += 1;
                hs.remove(arr[i]);
                continue;
            }

            hs.add(arr[i]);
        }

        return outarr;
    }

    public int reverse(int val)
    {

        int out = 0;
        int rem = 0;
        int num = val;

        if(num < 0)
        {
            val = val * -1;
        }

        while(val >= 1 )
        {
            rem = val % 10;
            out = out * 10 + rem;
            val = val / 10;
        }

        if(num < 0)
        {
            out = out * -1;
        }
        return out;
    }
}
