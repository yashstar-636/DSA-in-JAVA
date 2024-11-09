package JavaWithDsa;

//
//In Queue
//        enqueue means adding
//        dequeue means remove
//        peek means getting front element from the queue
public class Queue {
    static int data,size,rear=-1;
    static int arr [];
         Queue(int size){
            this.size=size;
             arr=new int[size];
        }
        public static boolean isEmpty(){
             return rear==-1;
        }
        public static int enqueue(int val){  //o(1) time complexity
             if(rear==size-1){
                 System.out.println("full queue");
                 return -1;
             }
             else{
                 rear++;
                 arr[rear]=val;
                 return 1;
             }
        }
        public static int remove(){   //o(n)  time complexity
             if (isEmpty()){
                 System.out.println("empty queue");
                 return -1;
             }
             else{
                 int front = arr[0];
                 for (int i =0 ; i<rear;i++){
                     arr[i]=arr[i+1];
                 }
                 rear--;
                 return front;
             }
        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            else{
                return  arr[0];
            }
        }


    public static void main(String[] args) {
         Queue obj =new Queue(6);
         enqueue(1);
         enqueue(2);
         enqueue(3);
         while(!isEmpty()){
             System.out.println(peek());
             remove();
         }
    }
}
