package adapter.demo.passport.adapterv3.adapters;


import adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForTelAdapter extends AbstraceAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}
