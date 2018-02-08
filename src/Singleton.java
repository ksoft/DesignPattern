/**
 * 枚举单例
 * @author zhangjianbo
 * @date 2018/2/8
 */
public enum  Singleton {
    INSTANCE;

    private Source source=null;

    //枚举的构造函数只能是private，这里可以省略
    private Singleton(){
        source=new Source("张三","李四");
    }

    public Source getSource(){
        return source;
    }
}

//定义需要单例的对象
class Source{
    private String name;
    private String value;

    public Source(String name,String value){
        this.name=name;
        this.value=value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

//测试类
class Test{
    public static void main(String[] args) {
        Source s1=Singleton.INSTANCE.getSource();
        Source s2=Singleton.INSTANCE.getSource();

        //s1==s2 返回true，说明s1和s2是同一个对象
        System.out.println(s1==s2);
        System.out.println(s1.getName()+"==="+s2.getName());
    }
}
