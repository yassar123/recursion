static long  Sum(long  n) 
{
  if(n==0)
  {
    return 0;
  }
  else
  {
    return n%10 + Sum(n/10);
  }
}
