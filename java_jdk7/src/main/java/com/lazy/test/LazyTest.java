package com.lazy.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * LazyTest
 * PROJECT_NAME: Test
 * PACKAGE_NAME: com.lazy.test
 * Created by Lazy on 2017/5/25 23:31
 * Version: 0.1
 * Info: @TODO:...
 */
public class LazyTest {
    @Test
    public void testJedisSingle() {

        Jedis jedis = new Jedis("192.168.1.101", 6379);
        jedis.set("name", "bar");
        String name = jedis.get("name");
        System.out.println(name);
        //jedis.close();

    }

}
