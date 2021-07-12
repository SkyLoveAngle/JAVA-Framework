package compile;

//编译运行结果,这块的字段是需要最终反馈给用户的显示在界面上的信息~~~
public class Answer {
    //表示运行结果是否正确：0表示编译运行都正常；1表示编译出错；2表示运行出错
    private int errno;
    //若代码编译运行出错，是什么原因？
    //error1:reason包含了编译错误的信息；error2:reason包含了异常的调用栈信息
    private String reason;
    //程序的标准输出
    private String stdout;
    //程序的标准错误
    private String stderr;


    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStdout() {
        return stdout;
    }

    public void setStdout(String stdout) {
        this.stdout = stdout;
    }

    public String getStderr() {
        return stderr;
    }

    public void setStderr(String stderr) {
        this.stderr = stderr;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "errno=" + errno +
                ", reason='" + reason + '\'' +
                ", stdout='" + stdout + '\'' +
                ", stderr='" + stderr + '\'' +
                '}';
    }
}
