package in.itcast.testdemo;

import in.itcast.domain.MyFile;
import in.itcast.utils.FileLinkedList;
import in.itcast.utils.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MyFileTest {
    @Test
    public void test() {
        String path = "D:\\Excel全套视频教程";
        List<File> list = FileUtils.getListFiles(path);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void test1() {
        File dir = new File("D:\\学习视频");
        FileLinkedList<File> temp = FileUtils.getAllFileOrFileLinkedList(dir);
        FileUtils.getAllFilesOrFile(temp);
    }

    @Test
    public void test3() {
        Map<String, List> fileList = FileUtils.getFileList(new File("D:\\毕业照片\\"));
        List file = fileList.get("file");
        List files = fileList.get("files");
        List<MyFile> list = new LinkedList<>();
        for (int i = 0; i < files.size(); i++) {
            String o = (String) files.get(i);
            String substring = o.substring(o.lastIndexOf("\\") + 1);
            MyFile myFile1 = new MyFile();
            myFile1.setName(substring);
            myFile1.setType("files");
            myFile1.setFile_url(files.get(i).toString());
            ((LinkedList<MyFile>) list).addLast(myFile1);
        }
        System.out.println("-----------");
        for (int i = 0; i < file.size(); i++) {
            String o = (String) file.get(i);
            String substring = o.substring(o.lastIndexOf("\\") + 1);
            MyFile myFile1 = new MyFile();
            myFile1.setType("file");
            myFile1.setName(substring);
            myFile1.setFile_url(file.get(i).toString());
            ((LinkedList<MyFile>) list).addLast(myFile1);
        }
        System.out.println(list);
    }

    @Test
    public void test4() {
        String fileName = "D:\\毕业照片\\copy_世界上最不能等待的事.mp4";
        String fileType = FileUtils.getFileType(fileName);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < fileType.length(); i++) {
            stringBuffer.append(fileType.charAt(i));
        }
        System.out.println(stringBuffer.toString());
    }

    @Test
    public void test5() {
        String path = "D:\\毕业照片\\copy_世界上最不能等待的事.mp4";
        String s = FileUtils.subFileName(path);
        System.out.println(s);
        String fileType = FileUtils.getSuffix(path);
        System.out.println(fileType);
    }

    @Test
    public void testAll() throws FileNotFoundException {
        String dir = "D:\\学习视频\\vue教程-黑马-205集完整版";
        FileUtils.recursiveTraversalFolder(dir," ","vue教程-黑马-205集完整版 ");
    }
    @Test
    public void testtest(){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < 28; i++) {
            stringBuffer.append("https://www.bilibili.com/video/av44699553/?p="+i+" ");
        }
        System.out.println(stringBuffer.toString().trim());
    }


}
