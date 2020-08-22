import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/* Problem Statement-
𝐂𝐡𝐞𝐜𝐤 𝐢𝐟 𝟐 𝐞𝐥𝐞𝐦𝐞𝐧𝐭𝐬 𝐚,𝐛 𝐬𝐮𝐜𝐡 𝐭𝐡𝐚𝐭 𝐚-𝐛=𝐤 𝐩𝐫𝐞𝐬𝐞𝐧𝐭 𝐢𝐧 𝐚𝐧 𝐚𝐫𝐫𝐚𝐲. 
𝐚-𝐛=𝐤 𝐬𝐨, 𝐚=𝐛+𝐤 𝐚𝐧𝐝 𝐛=𝐚-𝐤. 𝐒𝐨 𝐜𝐡𝐞𝐜𝐤 𝐢𝐟 𝐞𝐢𝐭𝐡𝐞𝐫 𝐚 𝐨𝐫 𝐛 𝐢𝐬 𝐚𝐥𝐫𝐞𝐚𝐝𝐲 𝐩𝐫𝐞𝐬𝐞𝐧𝐭 𝐢𝐧 𝐭𝐡𝐞 𝐇𝐚𝐬𝐡𝐒𝐞𝐭, 𝐰𝐡𝐢𝐥𝐞 𝐢𝐧𝐬𝐞𝐫𝐭𝐢𝐧𝐠 𝐞𝐥𝐞𝐦𝐞𝐧𝐭𝐬 𝐢𝐧𝐭𝐨 𝐭𝐡𝐞 𝐇𝐚𝐬𝐡𝐒𝐞𝐭
*/

public class Solution {

    public static void main(String[] args) throws IOException
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t -->0)
        {
            boolean found=false;
            String s[]= br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            String input[]= br.readLine().split(" ");
            int arr[]= new int[input.length];
            for(int i=0; i<input.length; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }
            HashSet<Integer> hs= new HashSet<>();
            for(int i:arr)
            {
                if(hs.contains(k+i) || hs.contains(i-k))
                {
                    System.out.println("true");
                    found=true;
                    break;
                }
                else
                    hs.add(i);
            }
            if(!found)
                System.out.println("false");
        }
    }
}
