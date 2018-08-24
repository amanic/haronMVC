package mvc.dal.obj;

/**
 * 功能与{@link mvc.dal.obj.TestBeanObj},测试作用，这里是lazy-init,
 * 但是结果并非我想的那样（只有在用到的时候才回去加载并且初始化），而是在启动项目的时候便已经加载初始化好了。
 * Created by martea on 2018/8/25.
 */
public class TestBeanObjLazy {
    private String string;

    private Integer integer;

    private Object object;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
