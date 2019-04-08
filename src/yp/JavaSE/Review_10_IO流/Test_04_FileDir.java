package yp.JavaSE.Review_10_IO流;

import java.io.File;

/**
 * @author RickYinPeng
 * @ClassName Test_04_FileDir
 * @Description
 * @date 2019/1/25/9:39
 */
public class Test_04_FileDir {
    public static void main(String[] args) {
        File src = new File("E:\\IdeaWorpace\\Java_SE");
        //printName(src,0);
        /*countFile(src);
        System.out.println(len);*/
        printName(src,0);


    }

    /**
     * 递归打印子孙级目录和文件名称
     * @param src
     * @param deep
     */
    public static void printName(File src,int deep){

        for(int i = 0;i<deep;i++){
            System.out.print("-");
        }
        System.out.println(src.getName());
        if(null==src || !src.exists()){
            return ;
        }else if(src.isDirectory()){//目录，就是一个文件夹
            for(File s:src.listFiles()){
                printName(s,deep+1);
            }
        }
    }

    /**
     * 统计文件夹里面的大小
     */
    static int len;
    public static void countFile(File src){

        if(null!=src || src.exists()){
            if(src.isFile()){
                len += src.length();
            }else{
                for(File f:src.listFiles()){
                    countFile(f);
                }
            }
        }
    }
}
