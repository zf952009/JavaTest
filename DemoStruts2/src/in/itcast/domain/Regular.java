package in.itcast.domain;

import com.opensymphony.xwork2.inject.Factory;

/**
 * 正则表达式实体
 */
public class Regular {
    private Long id;
    private String name;
    private String regular;

    public Regular() {
    }

    @Override
    public String toString() {
        return "Regular{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", regular='" + regular + '\'' +
                '}';
    }

    /**
     * 判断数据数据否为空
     */
    public boolean isNull(){
        if ((name.trim()!=null && id!=null) && regular.trim()!=null){
            return true;
        }
        return false;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }
}
