package demo.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface UserInfoService {

    @WebMethod
    UserInfo findOne(String id);

    @WebMethod
    List<UserInfo> findListByAge(int age);

}
