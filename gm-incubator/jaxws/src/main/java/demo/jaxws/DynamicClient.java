package demo.jaxws;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class DynamicClient {

    public static void main(String[] args) throws MalformedURLException {

        URL wsdl = new URL("http://localhost:8181/jaxws/wsservice/queryUserInfo?wsdl");
        QName serviceName = new QName("http://jaxws.demo/", "UserInfoServiceImplService");
        QName portName = new QName("http://jaxws.demo/", "UserInfoServiceImplPort");
        Service service = Service.create(wsdl, serviceName);

        UserInfoService userInfoService = service.getPort(portName, UserInfoService.class);
        UserInfo userInfo = userInfoService.findOne("");
        System.out.println(userInfo.getUserName());

        List<UserInfo> userInfoList = userInfoService.findListByAge(1);
        for (UserInfo u : userInfoList) {
            System.out.println(u.getUserName());
        }
    }

}
                                                  