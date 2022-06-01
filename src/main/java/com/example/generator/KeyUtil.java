package com.example.generator;

import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;

public class KeyUtil {
    /**
     * 有时间规律的UUID
     */
    public static String generatorUUID() {
        TimeBasedGenerator timeBasedGenerator = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
        return timeBasedGenerator.generate().toString();
    }

    public static void main(String[] args) {
        System.out.println(KeyUtil.generatorUUID());
        System.out.println(KeyUtil.generatorUUID());
    }
}
