package yp.JavaSE.Review_09_容器.myCollection;
/**
 * 我们自定义的Node节点，在LinkedList中也是使用Node来做自定义节点的，之前的jdk版本是使用Entry来做的
 */
class Node{
   public  Node previous;
   public Node next;
   Object element;

    public Node(Object element) {
        this.element = element;
    }

    public Node(Node previous, Node next, Object element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }
}

/**
 * @author RickYinPeng
 * @ClassName SxtLinkedList
 * @Description 自定义LinkedList
 * @date 2019/1/22/16:17
 */
public class SxtLinkedList {
    private Node first;
    private Node last;
    private int size;

    /**
     * 没加泛型，所以使用Object
     * @param obj 需要添加的元素
     */
    public void add(Object obj){
        Node node = new Node(obj);

        /**
         * 证明是第一次放入
         */
        if(first==null){
            first = node;
            /**
             * 由于目前只有这一个元素，所以last也是它
             */
            last = node;
        }else {
            node.previous = last;
            node.next = null;

            last.next = node;
            last = node;
        }
        size++;
    }

    public Object get(int index){

        if(index<0 || index>size-1){
            throw new RuntimeException("索引数字不合法:"+index);
        }

        Node temp = null;

        if(index<=(size>>1)){ //size>>1 相当于除以2
            temp = first;
            for(int i = 0;i<index;i++){
                temp = temp.next;
            }
        }else{
            temp = last;
            for(int i = size-1;i>index;i--){//size-1 = 4 index = 4
                temp = temp.previous;
            }
        }
        return temp.element;
    }
    public static void main(String[] args) {
        SxtLinkedList sxtLinkedList = new SxtLinkedList();
        sxtLinkedList.add("1");
        sxtLinkedList.add("2");
        sxtLinkedList.add("3");
        sxtLinkedList.add("4");
        sxtLinkedList.add("5");
        System.out.println(sxtLinkedList.get(4));
    }
}
