package com.hongghe.basicjava.classloader;

import java.io.File;
import java.util.StringTokenizer;

/**
 * 类加载
 *
 * @author hongghe 01/08/2018
 */
public class DoubleParentDemo {


    //ExtClassLoader类中获取路径的代码
    private static File[] getExtDirs() {
        //加载<JAVA_HOME>/lib/ext目录中的类库
        String s = System.getProperty("java.ext.dirs");
        File[] dirs;
        if (s != null) {
            StringTokenizer st =
                    new StringTokenizer(s, File.pathSeparator);
            int count = st.countTokens();
            dirs = new File[count];
            for (int i = 0; i < count; i++) {
                dirs[i] = new File(st.nextToken());
            }
        } else {
            dirs = new File[0];
        }
        return dirs;
    }

}
