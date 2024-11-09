package JavaWithDsa;


class ll{
    int data;
    ll next;

    ll(int data){
        this.data=data;
        this.next=null;
    }
}
public class linked_list {
    public static void  display(ll head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void insert(ll after , int val){
        ll ins = new ll(val);
        ll temp = after.next;
        after.next= ins;
        ins.next=temp;
    }
    public static boolean search(ll head , int val){
        while(head!=null){
            if(head.data==val){
                return true;
            }
            head=head.next;
        }
        return false;
    }

    public static  void delete(ll after){
        after.next=after.next.next;
    }

    public static void main(String[] args) {
       ll head = new ll(1);
       ll one = new ll(2);
       ll two= new ll(3);
       ll three= new ll(4);
       head.next=one;
       one.next=two;
       two.next=three;
        display(head);
        System.out.println("after inserting an element");
        insert(two,52);
        display(head);
        System.out.println("searching an element");
        System.out.println( search(head, 52));
        System.out.println("after deleting an element");
        delete(two);
        display(head);
    }
}
