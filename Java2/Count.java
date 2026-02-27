public class Count {
  
    public  static void main(String[] args)
{
    int count=0;
    String str="JAVA";
  
  System.out.println("Given String::"+str);
  for(int i=0;i<str.length();i++)
{
    char ch=str.charAt(i);
  if (ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u' ||ch=='A'||ch=='E' ||ch=='I'||ch=='O'||ch=='U'){
   System.out.println("The given alphabet is an the vowels:"+ch);
count++;
}
}
System.out.println("Total vowels:"+count);


}    


}


