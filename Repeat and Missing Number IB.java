public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] arr) throws ArithmeticException
    {
        int xor=0;
        //int axor=0;
        for(int i=0; i<=arr.length; i++)//xor of n natural numbers and all the elements of the array. Missing number is xor once and repeated number is xor 3 times rest all 2 times.
        {
            if(i<arr.length)
            xor^=arr[i];
            if(i>0)
            xor^=i;
        }
        //xor variable has xor of repeated and missing numbers
        int set=1, tmp=xor;
        while(tmp!=0)//find first set bit of xor(tmp)
        {
            if((tmp&set)==set)
            break;
            set<<=1;
        }
        int s=0, us=0;//s is set, us is unset
        
        
        /*to find what elements constitutes xor variable. 
        xor elements of array and natural numbers which have set bit at ith position with s and unset with us. 
        repeated or missing number will be part of either of the group and not both. 
        Suppose repeated number is part of the group which has 0th bit set and missing number part of the group which has 0th bit unset.
        When we xor numbers in array and natural number as groups, then repeated number will appear in 0th bit set group 3 times and missing number 0th bit unset group once
        Finally we will get repeated and missing numbers.*/
        
         for(int i=0; i<=arr.length; i++)
        {
            if(i<arr.length)
            {
                if((arr[i]&set)==set)
                s^=arr[i];
                else
                us^=arr[i];
            }
            if(i>0)
            {
                if((i&set)==set)
                s^=i;
                else
                us^=i;
            }
        }
        //we can't say which is repeated number and which is missing number. So we need to traverse the entire array to find out.
        boolean usFound=false;
        for(int i=0; i<arr.length; i++)
        {
           if(arr[i]==us)
           {usFound=true; break;}
        }
        int res[]= new int[2];
        if(usFound)
        {
            res[0]=us;
            res[1]=s;
        }
        else
        {
            res[0]=s;
            res[1]=us;
        }
        return res;
    }
}
