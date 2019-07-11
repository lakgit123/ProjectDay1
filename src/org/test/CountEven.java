package org.test;

public class CountEven {
	public static void main(String[] args) {
		int i, n=100, count=0;
		for (i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				count=count+1;
			}
	}
		System.out.println(count);
}
}
