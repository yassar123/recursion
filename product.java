public static int sumOfProductOfDigits(int n1, int n2)
{
    // Your code here
    int sum =0;
    if(n1==0 || n2==0)
    {
        return 0;
    }
    else{
        sum = (n1%10)*(n2%10);

        return sum+sumOfProductOfDigits(n1/10,n2/10);
        
    }
}
