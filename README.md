# distributed-id-generator
分布式ID生成器

## 主流的分布式ID生成器的策略

- 实现1：预加载
```
- 预加载

- 并发获取,如采用Disruptor框架提升性能
```
- 实现2：单点生成方式
```
- 固定的一个机器节点来生成一个唯一的ID，做到全局唯一
- 需要对应的业务规则拼接，机器码+时间戳+自增序列

```

## NTP
```
NTP是网络时间协议（Network Time Protocol），它用来同步网络中各个计算机的时间的协议
你的服务器时间会定时去获取，然后进行更新校准

！！如果淡出使用 机器码+时间戳/机器码+UUID 在高并发下可能产生重复问题

```

## 1 fasterxml uuid
- dependency
```
        <!-- https://mvnrepository.com/artifact/com.fasterxml.uuid/java-uuid-generator -->
        <dependency>
            <groupId>com.fasterxml.uuid</groupId>
            <artifactId>java-uuid-generator</artifactId>
            <version>4.0.1</version>
        </dependency>

```

- code
```
    /**
     * 有时间顺序的UUID
     */
    public static String generatorUUID() {
        TimeBasedGenerator timeBasedGenerator = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
        return timeBasedGenerator.generate().toString();
    }

```

## 2 业务ID生成方式

```
使用带业务含义的ID生成策略，比如商品货架表，按城市-区域-uuid,0001-0001-0000000

```
## 3 
