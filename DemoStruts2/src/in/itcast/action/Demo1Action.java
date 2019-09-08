package in.itcast.action;


/**
 * struts:动态方法调用
 * */
public class Demo1Action {
    public String add(){
        System.out.println("add");
        return "success";
    }
    public String delete(){
        System.out.println("delete");
        return "success";
    }
    public String save(){
        System.out.println("save");
        return "success";
    }
    public String update(){
        System.out.println("update");
        return "success";
    }


}
