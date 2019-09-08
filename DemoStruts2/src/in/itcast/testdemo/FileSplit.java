package in.itcast.testdemo;

import in.itcast.domain.SplitConfig;
import in.itcast.utils.FileUtils;
import org.junit.Test;

import java.io.*;
import java.util.Properties;

/**
 * codening:utf-8
 *
 * @author :FileSplit
 * @time :2019.07.07,23:41
 * @file :in.itcast.testdemo.FileSplit.jave
 * 文件切割
 */
public class FileSplit {

    @Test
    public void test() throws IOException {
        File file_src = new File("d:\\毕业照片\\视频\\16.mp4");
        String filen_ame = FileUtils.subFileName(file_src.getName());
        File file_dir = new File("d:\\毕业照片\\视频\\" + filen_ame + "PartFile");
        String s = FileUtils.subFileName(file_dir.getName());
        System.out.println(s);
        FileUtils.fileSplit(file_src, file_dir);
    }

    @Test
    public void test1() throws IOException {
        File path = new File("D:\\毕业照片\\视频\\demo\\1PartFile\\1.properties");
        Properties properties = new Properties();
        properties.load(new FileReader(path));
        String splittype = properties.getProperty("splittype");
        String filename = properties.getProperty("filename");
        String filepath = properties.getProperty("filepath");
        int filecount = Integer.parseInt(properties.getProperty("filecount"));
        int buffer_size = Integer.parseInt(properties.getProperty("buffer_size"));
        SplitConfig splitConfig = new SplitConfig(splittype, filepath, filename, filecount, buffer_size);
        System.out.println(splitConfig);
//        FileUtils.fileMerge(properties,null);
    }

    @Test
    public void test2() throws IOException {
        String split = ".parr";
        String name = "this file name";
        String path = "d:\\毕业照片\\视频\\16PartFile\\16-test.properties";
        Integer count = 12;
        Integer bufferseize = 10244;
        SplitConfig splitConfig = new SplitConfig(split, path, name, count, bufferseize);
        String s = splitConfig.ConfigWriter(new File(path));
        System.out.println(s);
    }

    @Test
    public void test3() throws IOException {
        for (int i = 1; i <= 4; i++) {
            File file_src = new File("d:\\毕业照片\\视频\\demo\\"+i+".rmvb");
            String filen_ame = FileUtils.subFileName(file_src.getName());
            File file_dir = new File("d:\\毕业照片\\视频\\demo\\" + filen_ame + "PartFile");
            FileUtils.fileSplit(file_src, file_dir);
        }
    }


    public void split(File file_src, File file_dir) throws IOException {
        // 功能完整性判断
        // 判断源文件是否存在
        if (!(file_src.exists() && file_src.isFile())) {
            throw new RuntimeException(file_src.getName() + ":::不是正确的文件或文件不存在");
        }

        // 判断碎片文件夹是否存在,如果文件夹不存在就创建碎片文件夹
        if (!file_dir.exists()) {
            file_dir.mkdirs();
        }

        //文件输出流
        FileInputStream fileInputStream = new FileInputStream(file_src);

        //文件输入流
        FileOutputStream fileOutputStream = null;

        byte[] bytes = new byte[FileUtils.BUFFER_SIZE * 20];
        int len = 0;
        int count = 0;
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream = new FileOutputStream(new File(file_dir, (count++) + ".part"));
            fileOutputStream.write(bytes, 0, len);
            fileOutputStream.flush();
            fileOutputStream.close();
        }

        //配置文件信息
        Properties properties = new Properties();
        properties.setProperty("filename", file_src.getName());
        properties.setProperty("filecount", String.valueOf(count));
        properties.setProperty("filepath", file_dir.getAbsolutePath());
        //配置文件输出
        String file_name = FileUtils.subFileName(file_src.getName());
        FileWriter fileWriter = new FileWriter(new File(file_dir, file_name + ".properties"));
        properties.store(fileWriter, "this " + file_src.getName() + "name");
        fileWriter.flush();
        fileWriter.close();
        fileInputStream.close();


    }


}
