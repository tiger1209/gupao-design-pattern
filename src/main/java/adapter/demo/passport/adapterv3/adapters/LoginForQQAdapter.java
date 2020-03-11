package adapter.demo.passport.adapterv3.adapters;

import com.gupaoedu.vip.pattern.adapter.demo.passport.ResultMsg;
import com.gupaoedu.vip.pattern.adapter.demo.passport.adapterv3.ILoginStrategy;

/**
 * Created by Tom.
 */
public class LoginForQQAdapter extends AbstraceAdapter implements ILoginStrategy {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        if(!support(adapter)){return null;}
        //accesseToken
        //time
        return super.loginForRegist(id,null);

    }

    public ResultMsg login(String id) {
        return this.login(id,LoginForQQAdapter.class);
    }
}
