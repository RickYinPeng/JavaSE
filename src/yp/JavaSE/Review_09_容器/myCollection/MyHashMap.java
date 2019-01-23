package yp.JavaSE.Review_09_容器.myCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RickYinPeng
 * @ClassName MyHashMap
 * @Description 自定义HashMap
 * @date 2019/1/23/13:23
 */
public class MyHashMap<K,V> implements MyMap<K,V>{
    //数组的默认长度
    private static int defaultLenth = 1 << 4; //16

    /**
     * 扩容标准所使用的 userSize / defaultLenth > 0.75  数组就会扩容
     *
     * 过大：
     * defaultAddSizeFactor过大会造成扩容概率变低，存储小，但是就是存和取得效率降低
     * 比如说扩容因子是 0.9 ：你想啊，如果是 0.9 就会在这个有限的数组中形成大量的链表，
     * 在我们存和取得时候都会进行大量的遍历和判断(逻辑)
     *
     * 过小：
     * 如果过小的话，我们存了一点东西就去扩容了，反而浪费了空间
     */
    private static double defaultAddSizeFactor = 0.75;

    /**
     * 使用volatile关键字，即保证每个线程使用的useSize是最新的
     */
    private volatile int useSize;

    /**
     * 定义HashMap骨架数据结构之一 数组
     */
    private Entry<K,V>[] table = null;

    /**
     * 新的数组，扩容后的数组
     */
    private Entry<K,V>[] newTbale = null;

    /**
     * SPRING 门面模式思想的运用
     */
    public MyHashMap(){
        this(defaultLenth,defaultAddSizeFactor);
    }

    public MyHashMap(int length, double defaultAddSizeFactor) {
        if(length<0){
            throw new IllegalArgumentException("参数不能为负数："+length);
        }
        if(defaultAddSizeFactor <=0 || Double.isNaN(defaultAddSizeFactor)){
            throw new IllegalArgumentException("扩容标准必须是大于0的数字"+defaultAddSizeFactor);
        }

        this.defaultLenth = length;
        this.defaultAddSizeFactor =defaultAddSizeFactor;

        /**
         * 内存当划分连续内存空间 数组初始化完成 16
         * 懒加载思想：
         *      在定义的时候不去给他分配内存空间，只有调用构造创建实例的时候才会分配内存
         */
        table = new Entry[defaultLenth];
    }

    @Override
    public V put(K k,V v) {
        /**
         * 判断是否需要扩容
         */
        if(useSize > defaultLenth*defaultAddSizeFactor){
            /**
             * 扩容方法
             */
            up2Size();
        }

        /**
         * 获取数组位置的方法 找到数组长度范围内的下标
         */
        int index = getIndex(k,table.length);
        Entry<K,V> entry = table[index];
        if(entry ==null) {
            /**
             * Entry：存储在数组和链表当中的数据结果对象
             */
            table[index] = new Entry<K, V>(k, v, null);
            /**
             * 实际使用位置++
             */
            useSize++;
        }
        /**
         * 有冲突
         */
        else if(entry!=null){
            /**
             * 将当前放进来的Entry占用这个位置table[index]
             * 原来在这个next=entry 已经形成了链表
             */
            table[index] = new Entry<>(k,v,entry);
        }
        return table[index].getValue();
    }

    private int getIndex(K k, int length) {
        int m = length-1;

        /**
         * 源码设计一模一样
         */
        int index = hash(k.hashCode()) & m;
        return index;
    }

    /**
     * 自己设计hash算法 强化散列
     * @param hashCode
     * @return
     */
    private int hash(int hashCode){
        hashCode = hashCode ^ ((hashCode >>> 20)^(hashCode >>> 12));
        return hashCode ^ ((hashCode >>> 7)^(hashCode >>> 4));
    }

    /**
     * 扩容方法：乘以2的智能扩容
     */
    private void up2Size() {
        /**
         * 旧数组内容 重新放到心数组里面，新数组长度是原来的旧数组长度的2倍
         * 不浪费服务器资源 0.75
         * 创建一个数组，是原来数组的2倍长度
         */
        newTbale = new Entry[2*defaultLenth];

        /**
         * 将老数组的对象再次散列到新数组
         */
        againHash(newTbale);
    }

    /**
     * 将老数组的对象再次散列到新数组
     * put方法的重写散列
     * @param newTbale 新数组
     */
    private void againHash(Entry<K, V>[] newTbale) {
        List<Entry<K,V>> entryList = new ArrayList<>();
        /**
         * for出来就代表内容全部由遍历到entryList当中
         */
        for(int i = 0;i<table.length;i++){
            if(table[i]==null){
                continue;
            }
            /**
             * 阿里内部  晒代码活动？
             * 将老数组上的对象全部存储到entryList
             * table[i] != null
             */
            foundEntryByNext(table[i],entryList);
        }
        /**
         * entryList里面是否有内容
         */
        if(entryList.size()>0){
            defaultLenth = 2*defaultLenth;
            for(Entry<K,V> entry :entryList){
                /**
                 * 将entry下面挂了链表的引用打断
                 */
                if(entry.next !=null){
                    entry.next = null;
                }
                useSize = 0;
                table = null;
                table = newTbale;
                /**
                 * 方法重用 借力写代码
                 */
                put(entry.getKey(),entry.getValue());
            }
        }
    }

    private void foundEntryByNext(Entry<K, V> kvEntry, List<Entry<K, V>> entryList) {
        entryList.add(kvEntry);
        /**
         * entry下面还挂了entry对象     链表
         */
        if(kvEntry.next!=null){
            /**
             * 精妙递归：将链表所有挂的Node节点都可以遍历尽
             */
            foundEntryByNext(kvEntry.next,entryList);
        }
    }

    @Override
    public V get(K k) {
        /**
         * hashCode(new Person(1234,"Samy")) ---->hash()---->getIndex---->最终索引位置
         */
        int index = getIndex(k,table.length);
        if(table[index]==null){
            throw new NullPointerException();
        }
        /**
         * key存在的情况
         */
        return findValueByEqualKey(k,table[index]);
    }

    private V findValueByEqualKey(K k, Entry<K, V> kvEntry) {
        if(k==kvEntry.getKey() || k.equals(kvEntry.getKey())){
            return kvEntry.getValue();
        }
        /**
         * 是否在下面链表的位置
         */
        return findValueByEqualKey(k,kvEntry.next);
    }

    class Entry<K,V> implements MyMap.Entry<K,V>{

        /**
         * 外界传进封装双列数据key value
         */
        K k;

        V v;

        /**
         * next:压下去的Entry对象
         */
        Entry<K,V> next;

        public Entry(K k, V v, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.next = next;
        }

        @Override
        public K getKey() {
            return this.k;
        }

        @Override
        public V getValue() {
            return this.getValue();
        }
    }
}

interface MyMap<K,V>{
    public V put(K k,V v);

    public V get(K k);

    public interface Entry<K,V>{
        public K getKey();

        public V getValue();
    }
}