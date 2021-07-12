package compile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CommandUtil  {
    //run()方法用于创建进程并执行命令
    /*
    cmd表示要执行的命令，如javac等
    stdoutFile指定标准输出写到哪个文件中；stderrFile指定标准错误写到哪个文件中~~
     */
    public static int run(String cmd,String stdoutFile,String stderrFile) throws IOException, InterruptedException {
        //使用Runtime()类完成进程的创建，Runtime这个类使用时不需要手动创建新的实例
        //而是使用现成有的实例就可以了，也就是说Runtime的实例只有唯一一个，称为“单例模式”
        //这个Process对象就是用来表示新创建出来的进程~~
        Process process = Runtime.getRuntime().exec(cmd);
        //当新的进程运行后，就需要获取新进程的输出结果
        if (stdoutFile != null){
            InputStream stdoutFrom = process.getInputStream();
            //通过该对象读取当前新进程的标准输出内容
            FileOutputStream stdoutTo = new FileOutputStream(stdoutFile);
            //接下来，从新进程中依次读取每个字节，显示到stdoutTo文件中
            while(true){
                int ch = stdoutFrom.read();
                if (ch == -1){
                    break;
                }
                stdoutTo.write(ch);
            }
            //文件读写完成，关闭输入输出
            stdoutFrom.close();
            stdoutTo.close();
        }

        //针对标准错误重定向
        if (stderrFile != null){
            //getErrorStream得到的是标准错误
            InputStream stderrFrom = process.getErrorStream();
            FileOutputStream stderrTo = new FileOutputStream(stderrFile);
            while (true) {
                int ch = stderrFrom.read();
                if (ch == -1) {
                    break;
                }
                stderrTo.write(ch);
            }
            stderrFrom.close();
            stderrTo.close();
        }
        // 等待新进程结束, 并获取到退出码
        int exitCode = process.waitFor();
        return exitCode;
    }

    public static void main(String[] args) {
        try {
            int ret = CommandUtil.run("javac", "./stdout.txt", "./stderr.txt");
            System.out.println(ret);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
