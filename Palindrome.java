import java.util.*;
class Palindrome{
static Scanner sc=new Scanner(System.in);
static char stck[],d;
static int top=-1;
static void push(char x){
stck[++top]=x;
}
static char pop(){
return stck[top--];
}
static boolean isPalindrome(String c){
  for(int i=0;i<c.length()/2;i++){
    push(c.charAt(i));
  }
 if(c.length()%2==0){
    for(int i=c.length()/2;i<c.length();i++){
     d=pop();
    System.out.println(d);
   System.out.println(i);	
     if(d!=c.charAt(i)){
         return false;
}}}
else{
for(int i=c.length()/2+1;i<c.length();i++){
   d=pop();
   System.out.println(d);
   if(d!=c.charAt(i)){
      return false;
}
}}
return true;
}
public static void main(String ar[]){
System.out.println("Enter string");
String a=sc.next();
stck=new char[a.length()];
System.out.println(isPalindrome(a));
}}
