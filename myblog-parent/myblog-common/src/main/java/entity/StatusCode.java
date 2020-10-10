package entity;

/**
 * @Auther: lfyuan
 * @Date: 2020/10/10/10:12
 * @Description: 返回码
 */
public class StatusCode {
    public static final int OK = 20000;//成功
    public static final int ERROR = 20001;//失败
    public static final int LOGINERROR = 20002;//用户名或密码错误
    public static final int ACCESSERROR = 20003;//权限不足
    public static final int REMOTEERROR = 20004;//远程调用失败
    public static final int REPERROR = 20005;//重复操作
    public static final int NOTFOUNDERROR = 20006;//没有对应的抢购数据

    public static int getOK() {
        return OK;
    }

    public static int getERROR() {
        return ERROR;
    }

    public static int getLOGINERROR() {
        return LOGINERROR;
    }

    public static int getACCESSERROR() {
        return ACCESSERROR;
    }

    public static int getREMOTEERROR() {
        return REMOTEERROR;
    }

    public static int getREPERROR() {
        return REPERROR;
    }

    public static int getNOTFOUNDERROR() {
        return NOTFOUNDERROR;
    }
}

