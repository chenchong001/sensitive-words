package com.odianyun.util.sensi;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {

    private static SensitiveFilter filter = SensitiveFilter.init("D:\\git\\call-show\\xxpay-master\\sensitive-words\\src\\main\\resources\\sensi_words2.txt");
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\data\\111.txt");
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                String filted = filter.filter(str, '*');
                System.out.println(filted);
            }
            bf.close();
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}