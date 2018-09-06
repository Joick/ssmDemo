package com.simpledemo.utility;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;

/**
 * redis工具类
 */
public class RedisUtil {
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

    private final void getJedis() {
        if (jedisPool != null) {
            jedis = jedisPool.getResource();
        }
    }

    /**
     * 删除key & value
     *
     * @param key
     */
    public final void del(String key) {
        jedis.del(key);
    }

    /**
     * 设置缓存过期时间
     *
     * @param key
     * @param seconds
     */
    public final void setTimeOut(String key, int seconds) {
        jedis.expire(key, seconds);
    }

    /**
     * 插叙是否有缓存值
     *
     * @param key
     * @return
     */
    public final boolean stringHasValue(String key) {
        return jedis.get(key) != null;
    }

    /**
     * 获取String类型缓存
     *
     * @param key
     * @param data
     */
    public final void stringSet(String key, String data) {
        jedis.set(key, data);
    }

    /**
     * 设置String类型缓存
     *
     * @param key
     * @return
     */
    public final String stringGet(String key) {
        return jedis.get(key);
    }

    /**
     * 设置多个key & value
     *
     * @param keysNDatas
     */
    public final void stringMultiSet(String... keysNDatas) {
        jedis.mset(keysNDatas);
    }

    /**
     * 缓存值+num
     *
     * @param key
     * @param num
     */
    public final void stringInc(String key, int num) {
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
    public final void stringAppend(String key, String data) {
        jedis.append(key, data);
    }

    /**
     * 获取Map类型缓存
     *
     * @param key
     * @param fields
     * @return
     */
    public final List<String> mapGet(String key, String... fields) {
        return jedis.hmget(key, fields);
    }

    /**
     * 设置Map类型缓存
     *
     * @param key
     * @param data
     */
    public final void mapSet(String key, Map<String, String> data) {
        jedis.hmset(key, data);
    }

    /**
     * 删除Map数据中指定数据
     *
     * @param key
     * @param itemKeys
     */
    public final void mapDel(String key, String... itemKeys) {
        jedis.hdel(key, itemKeys);
    }

    /**
     * 获取list类型缓存数据
     *
     * @param key
     * @param data
     */
    public final List<String> listGet(String key, List<Object> data) {
        return jedis.lrange(key, 0, -1);
    }

}
