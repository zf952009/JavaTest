package in.itcast.utils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

/**
 * codening:utf-8
 *
 * @author :StringUtils
 * @time :2019.07.07,9:04
 * @file :in.itcast.cn.itcast.utils.StringUtils.jave
 * <p>
 * 字符串工具类
 */
public class StringUtils {

    private static final String UTF8 = "UTF-8";
    private static final String ISO = "ISO-8859-1";
    private static final String UNICODE = "UNICODE";
    private static final String GBK = "GBK";
    private static final String UNKNOWN = "UNKNOWN";
    private static final List<String> LIST = new LinkedList<>();
    static {
        ((LinkedList<String>) LIST).addLast(UTF8);
        ((LinkedList<String>) LIST).addLast(ISO);
        ((LinkedList<String>) LIST).addLast(GBK);
        ((LinkedList<String>) LIST).addLast(UNICODE);
        ((LinkedList<String>) LIST).addLast(UNKNOWN);
    }


    public static String chEncode(String string) {
        return null;
    }

    /**
     * 判断是否为iso
     */
    private static Boolean cheIso(String string) {
        if (string == null) {
            return null;
        }
        return Charset.forName(ISO).newEncoder().canEncode(string);
    }
    private static Boolean chUTF8(String string){
        if (string==null){
            return null;
        }
        return Charset.forName(UTF8).newEncoder().canEncode(string);
    }
    private static Boolean chUNICODE(String string){
        if (string==null){
            return null;
        }
        return Charset.forName(UNICODE).newEncoder().canEncode(string);
    }

    public static String getEncoding(String string) throws UnsupportedEncodingException {
        if (string==null){
            return null;
        }
       for (int i=0;i<LIST.size();i++){
           return isEncoding(string,(String) LIST.get(i));
       }
        return UNKNOWN;
    }
    private static String isEncoding(String string,String encode) throws UnsupportedEncodingException {
        if (string.equals(new String(string.getBytes(encode),encode))){
            return encode;
        }
        return UNICODE;

    }


}
