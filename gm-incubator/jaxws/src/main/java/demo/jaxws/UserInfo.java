package demo.jaxws;

public class UserInfo {

    private String id;

    public UserInfo() {

    }

    public UserInfo(String id, String userName, Integer age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    private String userName;
    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
