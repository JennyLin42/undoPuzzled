package cn.util.sensitive;

import java.io.UnsupportedEncodingException;   
  
/** 
 *  
 * ClassName: CharByteConverter <br/>  
 * Function:  半角全角转换工具<br/>  
 * date: 2017年6月19日 下午6:20:17 <br/>  
 * @version 
 */  
public class CharByteConverter {  
  
    /** 
     * 全角转半角 
     *  
     * @param str 
     * @return 
     *  
     * @author mjorcen 
     * @email mjorcen@gmail.com 
     * @dateTime Sep 27, 2014 2:51:50 PM 
     * @version 1 
     */  
    @Deprecated  
    public static final String toSingleByte(String str) {  
        StringBuffer outStrBuf = new StringBuffer("");  
  
        String Tstr = "";  
        byte[] b = null;  
        for (int i = 0; i < str.length(); i++) {  
            Tstr = str.substring(i, i + 1);  
            // 全角空格转换成半角空格  
            if (Tstr.equals("　")) {  
                outStrBuf.append(" ");  
                continue;  
            }  
            try {  
                b = Tstr.getBytes("unicode");  
                // 得到 unicode 字节数据  
                if (b[2] == -1) {  
                    // 表示全角  
                    b[3] = (byte) (b[3] + 32);  
                    b[2] = 0;  
                    outStrBuf.append(new String(b, "unicode"));  
                } else {  
                    outStrBuf.append(Tstr);  
                }  
            } catch (UnsupportedEncodingException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
  
        } // end for.  
        return outStrBuf.toString();  
    }  
  
    /** 
     * 半角转全角 
     *  
     * @param str 
     * @return 
     *  
     * @author mjorcen 
     * @email mjorcen@gmail.com 
     * @dateTime Sep 27, 2014 2:52:06 PM 
     * @version 1 
     */  
    @Deprecated  
    public static final String toDoubleByte(String str) {  
        if(str == null || str == ""){  
            return null;  
        }  
        StringBuffer outStrBuf = new StringBuffer("");  
        String Tstr = "";  
        byte[] b = null;  
        for (int i = 0; i < str.length(); i++) {  
            Tstr = str.substring(i, i + 1);  
            if (Tstr.equals(" ")) {  
                // 半角空格  
                outStrBuf.append(Tstr);  
                continue;  
            }  
            try {  
                b = Tstr.getBytes("unicode");  
                if (b[2] == 0) {  
                    // 半角  
                    b[3] = (byte) (b[3] - 32);  
                    b[2] = -1;  
                    outStrBuf.append(new String(b, "unicode"));  
                } else {  
                    outStrBuf.append(Tstr);  
                }  
                return outStrBuf.toString();  
            } catch (UnsupportedEncodingException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
  
        }  
        return outStrBuf.toString();  
    }  
  
    /** 
     * 半角转全角 
     *  
     * @param str 
     * @return 
     *  
     * @author mjorcen 
     * @email mjorcen@gmail.com 
     * @dateTime Sep 27, 2014 2:52:31 PM 
     * @version 1 
     */  
    public static String ToSBC(String str) {  
        if(str == null || str == ""){  
            return null;  
        }  
        char c[] = str.toCharArray();  
        for (int i = 0; i < c.length; i++) {  
            if (c[i] == ' ') {  
                c[i] = '\u3000';  
            } else if (c[i] < '\177') {  
                c[i] = (char) (c[i] + 65248);  
  
            }  
        }  
        return new String(c);  
    }  
  
    /** 
     * 全角转半角 
     *  
     * @param str 
     * @return 
     *  
     * @author mjorcen 
     * @email mjorcen@gmail.com 
     * @dateTime Sep 27, 2014 2:52:50 PM 
     * @version 1 
     */  
    public static String ToDBC(String str) {  
        char c[] = str.toCharArray();  
        for (int i = 0; i < c.length; i++) {  
            if (c[i] == '\u3000') {  
                c[i] = ' ';  
            } else if (c[i] > '\uFF00' && c[i] < '\uFF5F') {  
                c[i] = (char) (c[i] - 65248);  
  
            }  
        }  
        String returnString = new String(c);  
        return returnString;  
    }  
  
    public static void main(String[] args) {  
        String str = "ｆｕｃｋ８１４乡道阿斯蒂芬１２３／．１２，４１２看２家１快２看了就２；看了２叫看来＋看来家１２考虑就２３；了３接口２了２会２，．水电费苦辣时间的２　　１２５１２３１２３１２１２０９－０２１～！＠＃＄％＾＆＊（）＿";  
        String result = ToDBC(str);  
        System.out.println(result);  
        String newstr=ToSBC(result);  
        System.out.println(newstr);  
       /* String newstr1=ToSBC(null);  
        System.out.println(newstr);  
        String newstr2=ToSBC("");  
        System.out.println(newstr);  */
    }  
  
}  