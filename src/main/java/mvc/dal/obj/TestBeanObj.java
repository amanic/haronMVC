package mvc.dal.obj;


/**
 * {@link org.springframework.context.support.AbstractApplicationContext}.finishBeanFactoryInitialization:839,
 * 查找到所有的需要初始化的bean，貌似这里还没有加载到lazy-init的bean，
 * {@link org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory}.doCreateBean:543,
 * 这里来初始化bena，初始化完所有的bean之后，
 * {@link org.springframework.web.servlet.FrameworkServlet}.initWebApplicationContext:522,来初始化webapplicationcontext
 * Created by martea on 2018/8/24.
 */
public class TestBeanObj {

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
