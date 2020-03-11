package adapter.demo.passport.adapterv3.adapters;

import com.gupaoedu.vip.pattern.adapter.demo.passport.ResultMsg;
import com.gupaoedu.vip.pattern.adapter.demo.passport.adapterv3.ILoginStrategy;

/**
 * Created by Tom.
 */
public class LoginForWechatAdapter extends AbstraceAdapter implements ILoginStrategy {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }


    public ResultMsg login(String id) {
        return this.login(id,LoginForWechatAdapter.class);
    }
}
