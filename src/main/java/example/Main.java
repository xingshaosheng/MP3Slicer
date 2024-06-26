package example;

import com.mpatric.mp3agic.*;
import core.MP3Slicer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args){
        splitMp3BySize();
        splitMp3ByTime();
    }

    private static void splitMp3BySize(){
        File file = new File("D:/input.mp3");
        try {
            List<byte[]> fileBytesList = MP3Slicer.split(file,200 * 1024);
            int number = 0;
            for (byte[] fileBytes : fileBytesList){
                String fileName = "D:/output" + ++number + ".mp3";
                File outFile = new File(fileName);
                try(FileOutputStream fos = new FileOutputStream(outFile)){
                    fos.write(fileBytes);
                }
            }
        } catch (InvalidDataException e) {
            e.printStackTrace();
        } catch (UnsupportedTagException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void splitMp3ByTime(){
        File file = new File("D:/input.mp3");
        try {
            byte[] fileBytes = MP3Slicer.split(file,10,20);
            String fileName = "D:/output.mp3";
            File outFile = new File(fileName);
            try(FileOutputStream fos = new FileOutputStream(outFile)){
                fos.write(fileBytes);
            }
        } catch (InvalidDataException e) {
            e.printStackTrace();
        } catch (UnsupportedTagException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
