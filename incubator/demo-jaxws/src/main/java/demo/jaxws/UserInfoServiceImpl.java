package demo.jaxws;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(
        endpointInterface = "demo.jaxws.UserInfoService"
)
public class UserInfoServiceImpl implements UserInfoService{

    @Override
    public UserInfo findOne(String id) {
        return new UserInfo("1001", "user1", 10);
    }

    @Override
    public List<UserInfo> findListByAge(int age) {
        List<UserInfo> list = new ArrayList<>();
        list.add(new UserInfo("1001", "user1", 10) );
        list.add(new UserInfo("1002", "user2", 10));
        return list;
    }
}
