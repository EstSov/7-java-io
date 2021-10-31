package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.*;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String ReadNormally(InputStream inputStream, Charset charset) throws IOException {

        if (inputStream == null || charset == null) {
            throw new IllegalArgumentException();
        }

        BufferedReader read_norm = new BufferedReader(new InputStreamReader(inputStream, charset));

        String result = "";
        int temp = read_norm.read();


        while (temp != -1) {
            result += (char) temp;
            temp = read_norm.read();
        }

        return result;
    }
}
