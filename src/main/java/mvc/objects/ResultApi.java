package mvc.objects;


import java.io.Serializable;

/**
 * 
 * @author lidong
 *
 * @param <T>
 */
public class ResultApi<T> implements Serializable {

    private static final long serialVersionUID = -6260655681975239861L;

    private String code; // 状态码，这个和前端说了一下为了兼容以前的code还是string

    private String message; // 返回信息

    public Data<T> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data<T> getData() {
        return data;
    }

    public void setData(Data<T> data) {
        this.data = data;
    }

    public static <T> ResultApi<T> successItem(T t){
        ResultApi<T> resultApi = new ResultApi<>();
        resultApi.setCode("0");
        resultApi.setMessage("成功");
        Data<T> data = new Data<>();
        data.setData(t);
        data.setTotal(0);
        resultApi.setData(data);
        return resultApi;

    }
}
