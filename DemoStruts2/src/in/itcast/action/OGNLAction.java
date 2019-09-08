package in.itcast.action;

import com.opensymphony.xwork2.ActionSupport;


public class OGNLAction extends ActionSupport {
    private String name;
    private Integer age;
    @Override
    public String execute() throws Exception {

        System.out.println("zoufang");
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
