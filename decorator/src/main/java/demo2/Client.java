package demo2;

import java.io.*;

/**
 * @author wensen
 * @since 14/03/2018
 */
public class Client {
    public static void main(String[] args) {
        //流式输出文件
        //
        try {
            DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(new EncryptOutputStream(new FileOutputStream("abc.txt"))));

            dout.write("abcdxyz".getBytes());
            dout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
