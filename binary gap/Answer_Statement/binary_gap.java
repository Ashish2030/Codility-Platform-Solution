class Solution {
    public int solution(int N) {
        String a=Integer.toBinaryString(N);
        int flag=0;
        int max=0;
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='1')
            {
                if(count!=0)
                {
                    if(count>max)
                    {
                        max=count;
                        count=0;
                        flag=4;
                    }
                    else{
                        count=0;
                    }
                }
                else
                {
                    count=0;
                    flag=2;
                }
            }
            else
            {
                if(flag==2||flag==4)
                {
                    count++;
                }
            }


        }
        return max;
    }
}
               


