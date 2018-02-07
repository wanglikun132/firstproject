package com.lanou.redis;

import redis.clients.jedis.Jedis;

public class Demo1 {
public static void main(String[] args) {
	Jedis j = new  Jedis("127.0.0.1",6379);
	j.auth("123456");
	j.select(0);
	j.set("1", "wanglikun");
	
	
	
	System.out.println("haha");
	System.out.println(j.get("1"));
	
}
}
