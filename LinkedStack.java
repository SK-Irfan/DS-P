import java.util.*;
class Node{
int data;
Node next;
}
class LinkedList{
Node top;
int size;
void push(int data){
 Node node=new Node();
 node.data=data;
 node.next=top;
 top=node;
size++;
}
 boolean isEmpty(){
   return size==0;
}
void pop(){
if(isEmpty()){
System.out.println("Stack Underflow");
 }
else{
int result=top.data;
top=top.next;
size--;
System.out.println(result);}
}
void display(){
Node n=top;
while(n.next!=null){
System.out.println(n.data);
n=n.next;
}
System.out.println(n.data);
}
}
class LinkedStack{
public static void main(String ar[]){
LinkedList l=new LinkedList();
l.push(100);
l.push(200);
l.push(300);
l.push(400);
l.pop();
l.pop();
l.pop();
l.pop();
l.pop();
l.push(5000);
l.pop();
}}




