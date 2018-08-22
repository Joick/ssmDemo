package com.simpledemo.utility;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;

/**
 * redis工具类
 */
public final class RedisUtil {
    private final String address = "127.0.0.1";
    private final int port = 6379;
    private final String password = "admin123";
    private final int timeOut = 10000;
    private final int maxTotal = 1024;
    private final int maxIdle = 200;
    private final int maxWait = 10000;
    private final boolean testOnBorrow = true;
    private static JedisPool jedisPool = null;
    private static Jedis jedis = null;

    public RedisUtil() {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(maxTotal);
            config.setMaxIdle(maxIdle);
            config.setMaxWaitMillis(maxWait);
            config.setTestOnBorrow(testOnBorrow);

            jedisPool = new JedisPool(config, address, port, timeOut, password);

            jedis = new Jedis(address, port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getJedis() {
        if (jedisPool != null) {
            jedis = jedisPool.getResource();
        }
    }

    public static void del(String key) {
        jedis.del(key);
    }

    /**
     * 获取String类型缓存
     *
     * @param key
     * @param data
     */
    public static void stringSet(String key, String data) {
        jedis.set(key, key);
    }

    /**
     * 设置String类型缓存
     *
     * @param key
     * @return
     */
    public static String stringGet(String key) {
        return jedis.get(key);
    }

    /**
     * 设置多个key & value
     *
     * @param keysNDatas
     */
    public static void stringMultiSet(String... keysNDatas) {
        jedis.mset(keysNDatas);
    }

    /**
     * 缓存值+num
     *
     * @param key
     * @param num
     */
    public static void stringInc(String key, int num) {
        if (num > 1) {
            jedis.incrBy(key, num);
        } else {
            jedis.incr(key);
        }
    }

    /**
     * 拼接string缓存值
     *
     * @param key
     * @param data
     */
    public static void stringAppend(String key, String data) {
        jedis.append(key, data);
    }

    /**
     * 获取Map类型缓存
     *
     * @param key
     * @param fields
     * @return
     */
    public static List<String> mapGet(String key, String... fields) {
        return jedis.hmget(key, fields);
    }

    /**
     * 设置Map类型缓存
     *
     * @param key
     * @param data
     */
    public static void mapSet(String key, Map<String, String> data) {
        jedis.hmset(key, data);
    }

    /**
     * 删除Map数据中指定数据
     *
     * @param key
     * @param itemKeys
     */
    public static void mapDel(String key, String... itemKeys) {
        jedis.hdel(key, itemKeys);
    }

    /**
     * @param key
     * @param data
     */
    public static List<String> listGet(String key, List<Object> data) {
        return jedis.lrange(key, 0, -1);
    }

}
