import java.util.*;
class Node{
 int regno;
 String name;
 String branch;
 long ph;
 Node next;
 }
class LinkedList{
int count=0;
 Node head;
  void insert(int regno,String name,String branch,long ph){
        count++;
        Node node=new Node();
        node.regno=regno;
        node.name=name;
        node.ph=ph;
        node.branch=branch;    
        node.next=null;
   if(head==null){
     head=node;
      }
   else{
       Node n=head;
       while(n.next!=null){
            n=n.next;
       }
       n.next=node;
      }
}
void delete(int index){
  count--;
   Node nn=head;
   for(int i=0;i<index-1;i++){
      nn=nn.next;
}
Node k=nn.next;
nn.next=k.next;
k.next=null;
}
void display(){
 Node n4=head;
 while(n4.next!=null){
   System.out.println("regno is-->"+n4.regno);
   System.out.println("name is-->"+n4.name);
   System.out.println("branch is-->"+n4.branch); 
   System.out.println("ph-->"+n4.ph);
   n4=n4.next;
}
   System.out.println("reg is-->"+n4.regno);
   System.out.println("name is-->"+n4.name);
   System.out.println("branch is-->"+n4.branch); 
   System.out.println("ph-->"+n4.ph);
}
}
class Week1{
public static void main(String[] ar){
LinkedList l=new LinkedList();
Scanner sc=new Scanner(System.in);
int t=0;
do{
System.out.println("Enter 1:insertion\n 2:Deletion \n3:Display\n 4:Display no.of students");
int b=sc.nextInt();
switch(b){
case 1://insertion
  System.out.println("Enter no.of students");
  int num=sc.nextInt();
  System.out.println("Enter student details as regno,name,branch,mobile number");
for(int q=0;q<num;q++){
  System.out.println("Enter"+ (q+1)+"student details");	
  l.insert(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());}
  break;
case 2://deletion
  System.out.println("Enter the node  to be deleted");
  int ss=sc.nextInt();
  l.delete(ss-1);
  break;
case 3://Displaying
  System.out.println("Displaying  data......");
  l.display();
  break;
case 4://no.of students
  System.out.println("No.of students are:"+l.count);
   break;
}
t++;
}
while(t<4);
}}
  
  







      

        




 