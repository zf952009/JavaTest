package in.itcast.domain;

import java.util.Arrays;

/**
 * codening:utf-8
 *
 * @author :
 * @time :,
 * @file :.jave
 */
public class MyFile {
    private String name;
    private String type;
    private String file_url;
    private byte[] file_path;

    public MyFile() {
    }

    @Override
    public String toString() {
        return "MyFile{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", file_url='" + file_url + '\'' +
                ", file_path=" + Arrays.toString(file_path) +
                '}';
    }

    public byte[] getFile_path() {
        return file_path;
    }

    public void setFile_path(byte[] file_path) {
        this.file_path = file_path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFile_url() {
        return file_url;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }
}
