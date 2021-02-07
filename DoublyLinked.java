import java.util.*;
 class Node {
	 int ID;
	 String branch;
	 int salary;
	 String ph;
	 Node next;
	 Node prev;
 }
 class LinkedList{
	 int count=0;
	 Node head,tail;
	 void insert(int ID,String branch,int salary,String ph){
		 count++;
		 Node node=new Node();
		 node.ID=ID;
		 node.branch=branch;
		 node.salary=salary;
		 node.ph=ph;
		 if(head==null &&tail==null){
			 tail=node;
			 head=node;
		 }
		 else{
	         Node n=head;
		 while(n.next!=null){
			n=n.next;
		 }
		 n.next=node;
		 node.prev=n;
		 tail=n.next;
		 }
	 }
	 void display(){
		 Node n=head;
		 while(n.next!=null){
			 System.out.println(n.ID+" "+n.branch+" "+n.salary+" "+n.ph);
			
			 n=n.next;
		 }
		 System.out.println(n.ID+" "+n.branch+" "+n.salary+" "+n.ph);
	 }
	 void displayr(){
		 Node n=tail;
		 while(n.prev!=null){
			 System.out.println(n.ID+" "+n.branch+" "+n.salary+" "+n.ph);
			 n=n.prev;
		 }
		 System.out.println(n.ID+" "+n.branch+" "+n.salary+" "+n.ph);
	 }
	 void delete(int index){
		 Node n=head;
		 for(int i=0;i<index-1;i++){
			 n=n.next;
		 }
		 Node k=n.next;
		 n.next=k.next;
		 k.next.prev=n;
		 count--;
	 }
	 
	 int noOfemployees(){
		 return count;
	 }
	 void show50k(){
		 Node n=head;
		 while(n.next!=null){
			 if(n.salary>50000){
				 System.out.println(n.ID+" "+n.branch+" "+n.salary+" "+n.ph);	 
			 }
			 n=n.next;
		 }
		 if(n.salary>50000){
				 System.out.println(n.ID+" "+n.branch+" "+n.salary+" "+n.ph);	 
			 }
	 }
	 void getph(int p){
		 Node n=head;
		 while(n.next!=null){
			 if(n.ID==p){
				 System.out.println(n.ph);
			 }
			 n=n.next;
		 }
		 if(n.ID==p){
				 System.out.println(n.ph);
			 }
	 }
	 
 }
 class DoublyLinked{
	 public static void main(String ar[]){
		 LinkedList l=new LinkedList();
		 l.insert(100,"cse",100000,"9390773125");
		 l.insert(200,"IT",100000,"9390773126");
		 l.insert(300,"EEE",40000,"9390773127");
		 l.insert(400,"csse",80000,"9390773128");
		 l.insert(500,"EIE",18000,"9390773129");
		 System.out.println(l.noOfemployees());

		 l.delete(3);
		 System.out.println(l.noOfemployees());
		 l.display();
		 l.displayr();
		 l.show50k();
		 Scanner sc=new Scanner(System.in);
		 int id=sc.nextInt();
		 l.getph(id);
		
 }}