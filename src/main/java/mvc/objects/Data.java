package mvc.objects;


/**
 * Created by chenhaitao on 2018/5/14.
 */
public class Data<T> {
    private int total; // 总记录数

    private T data; //


    public static <T> Data<T> getInstance() {
        return new Data<T>();
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
