import java.util.*;
class Node{
	int hallno;
	String name;
	Node next;
}
class LinkedList{
        int count=0;
	Node head;
	void store(int hallno,String name){
		Node node=new Node();
	    node.hallno=hallno;
	    node.name=name;
	    if(head==null)
	    {
	    	head=node;
	    }
	    else {
	    	Node n=head;
	    	while(n.next!=null) {
	    		n=n.next;
	    	}
	    	n.next=node;
	    }}
	    void grant(int p,int hallno,String name){
                        count++;
			Node node=new Node();
		    node.hallno=hallno;
		    node.name=name;
		    Node n=head;
		    for(int i=0;i<p;i++) {
		    	n=n.next;
		    }
		    node.next=n.next;
		    n.next=node;
		    }
	    void display() {
	    	Node n=head;
	    	while(n.next!=null) {
	    	System.out.println(n.hallno+" "+n.name);
	    		n=n.next;
	    	}
	    	System.out.println(n.hallno+" "+n.name);
	    	
	    }
              void cancel(int index){
                   Node n=head;
                   for(int q=0;q<index-1;q++){
                         n=n.next;
                       } 
                      Node k=n.next;
                       n.next=k.next;
                       k.next=null;
                        count--;} 
    void sort(){
   	
          for(int a=0;a<count;a++){
                 Node n=head; 
               for(int b=0;b<count-a;b++){
                if(n!=head && ((n.name).compareToIgnoreCase(n.next.name))>0){
                   String temp=n.name;
                   int t=n.hallno;
                   n.hallno=n.next.hallno;
                   n.next.hallno=t;
                   n.name=n.next.name;
                   n.next.name=temp;
                 
                }
                    n=n.next;
}   }         
              }           
          
           }
	    class Week2{
	    	public static void main(String ar[]) {
	    		LinkedList l=new LinkedList();
                        Scanner sc=new Scanner(System.in);
                        System.out.println("Enter head and incharge details"); 
                        for(int m=0;m<2;m++){
                         
	    		    l.store(sc.nextInt(),sc.next());}
                 int flag=0;
                  do{
                        System.out.println("1.grant\n2.cancel\n3.display\n4.sort\n5.exit");
                        int dd=sc.nextInt();
                       switch(dd){
                    case 1:
	    		System.out.println("Enter no.of students"); 
                        int z=sc.nextInt();
	    		for(int h=0;h<z;h++) {
	    			l.grant(h,sc.nextInt(),sc.next());
	    		}
                       break;
                    case 2:
                       System.out.println("Node of the student to cancel membershhip");
                        l.cancel(sc.nextInt());
	    		break;
                   case 3:
                         l.display();
                         break;
                  case 4:
                          l.sort();
                        
                          break;
                case 5:
                   System.exit(0);
                   break;
                    default:
                            System.out.println("Enter valid number");

                     }
                      flag++;
                     }
                    while(flag<4);	    
	}
}