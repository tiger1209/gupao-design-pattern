package adapter.demo.passport.adapterv3.adapters;

import adapter.demo.passport.ResultMsg;
import adapter.demo.passport.adapterv3.ILoginStrategy;

/**
 * Created by Tom.
 */
public class LoginForWechatAdapter extends AbstraceAdapter implements ILoginStrategy {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        System.out.println("登录方式:WeChat,登录 WeChat:"+id);
        return super.loginForRegist(id,null);
    }


    public ResultMsg login(String id) {
        return this.login(id,new LoginForWechatAdapter());
    }
}
