import java.util.*;

public class test1024 {
    public static void main(String[] args) {
    	int ans;
    	Scanner data = new Scanner(System.in);
    	System.out.print("請輸入整數個數:");
    	int count=data.nextInt();
    	if((count>100)|(count<1))
    	{
    		System.out.print("個數不能超過100或小於1");
    		System.exit(0);
    	}
    	int [] num=new int[count];
    	for(int i=0;i<num.length;i++)
    	{
    		num[i]=(int)(Math.random()*1000+1);
    		System.out.print(num[i]+" ");
    	}
    	if(count%2==0)
    		ans=(num[count/2]+num[count/2-1])/2;
    	else
    		ans=num[count/2];
    	System.out.print("\n"+"中位數="+ans);
    }
}