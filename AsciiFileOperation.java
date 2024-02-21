package com.company;

import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public class AsciiFileOperation {

    public static void reverseContent() throws Exception{
        final RandomAccessFile in = new RandomAccessFile("/Users/futaner/AsciiFile/src/com/company/abc.txt", "r");
        final FileOutputStream out = new FileOutputStream("destination.txt");
        for(long p = in.length() - 1; p >= 0; p--) {
            in.seek(p);
            int b = in.read();
            out.write(b);
        }
    }
}

