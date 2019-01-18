package yp.JavaSE.Review_07;

/**
 * @author RickYinPeng
 * @ClassName User
 * @Description
 * @date 2019/1/18/13:07
 */
public class User {

    private int userid;
    private String userName;

    public User(int userid, String userName) {
        this.userid = userid;
        this.userName = userName;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                '}';
    }
}
