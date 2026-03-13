
public class ArraYQueue {
   private  int size;
   private int rear;
   private int front ;
   private int []queue;
     
public    ArraYQueue( int size){
queue= new int [size];
front=-1;
rear=-1;
this.size=size;
}
    
public boolean isFull(){
return rear==size-1;
}   
public boolean isEmpty(){
return front==-1 || front> rear;
}     
public void enqueue (int value  ){
if(isFull()){
    System.out.println("Queue underflow- cannot insert " +  value );
    return ;
}
if(front==-1) front= 0 ;
queue[++rear]=value;
    System.out.println("enqued : " + value);
  
}    
public  int dequeue(){
if (isEmpty()){
    System.out.println("Queue underflow- nothing to dequeue");
    return -1;
}
int removed = queue[front++];
    System.out.println("dequeued  : " +removed);
return  removed;
}    
public int peek(){
  if(isEmpty()){
    System.out.println("queue is empty -Nothing to peek");
    return -1; 
}
 return queue[front];
}    
public void display(){
   if(isEmpty()){
       System.out.println("queue is empty ");
       return;
   
   }
    System.out.println("queue elements : ");
    for(int i=front;i<=rear ;i++){
        System.out.println(  queue[i] +" " );
    }
    System.out.println();
}    
public static void main(String[] args) {
   ArraYQueue q =new ArraYQueue(5);
   q.enqueue(10);
   q.enqueue(20);
   q.enqueue(30);
   q.enqueue(40);
   q.display();
   q.dequeue();
   q.display();
   System.out.println("front element is  : " + q.peek()  );
    }
    
}
