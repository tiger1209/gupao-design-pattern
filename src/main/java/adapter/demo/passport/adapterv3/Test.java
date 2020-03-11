package adapter.demo.passport.adapterv3;

import com.gupaoedu.vip.pattern.adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
       /* IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("sdfasdfasfasfas");*/

       ILoginStrategy iLoginStrategy = LoginStrategy.getSyncStrategy("0");
        ResultMsg resultMsg = iLoginStrategy.login("afasdsfdsd");
        System.out.println(resultMsg.getCode());
    }
}
