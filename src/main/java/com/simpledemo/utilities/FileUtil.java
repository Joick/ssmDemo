package com.simpledemo.utilities;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author Administrator
 */
public final class FileUtil {

    /**
     * 写入文件
     *
     * @param path 文件路径
     * @param data 写入数据
     * @return
     */
    public static boolean writeFile(String path, byte[] data) throws Exception {

        Boolean result = true;

        try {
            File file = new File(path);

            if (file.exists() == false) {
                file.getParentFile().mkdir();
            }

            FileOutputStream stream = new FileOutputStream(file);

            stream.write(data);

            stream.close();

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

            result = false;
        }

        return result;
    }
}
