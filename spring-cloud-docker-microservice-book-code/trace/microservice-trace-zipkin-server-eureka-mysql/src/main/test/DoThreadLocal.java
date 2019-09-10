/**
 * Created by jerry.xu on 2019/3/15.
 */

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jerry.xu
 * @create 2019-03-15
 * @desc
 **/
public class DoThreadLocal {


    public static void main(String[] args) {
        ThreadLocal<String> localName = new ThreadLocal();
        localName.set("ABC");
        String name = localName.get();
        System.out.print(name);


        Thread t = new Thread() {
            @Override
            public void run() {
                localName.set("VEC");
                System.out.print(localName.get());
            }
        };
        Thread t1 = new Thread() {
            @Override
            public void run() {
                localName.set("123");
                System.out.print(localName.get());
            }
        };
        t.start();
        t1.start();
        try

        {
            t1.join();
        } catch (
                InterruptedException e)

        {
            e.printStackTrace();
        }
        System.out.print(name);
    }
}

