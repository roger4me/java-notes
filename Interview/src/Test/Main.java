/**
 * @program JavaBooks
 * @description: 牛客
 * @author: mf
 * @create: 2020/07/24 22:24
 */

package Test;


public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

    }


}


/**
 * nk没有Pair的包
 * 自己提前写一个，方便使用
 */
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}