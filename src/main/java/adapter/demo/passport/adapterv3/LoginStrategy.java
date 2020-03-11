package adapter.demo.passport.adapterv3;


import adapter.demo.passport.adapterv3.adapters.LoginForQQAdapter;
import adapter.demo.passport.adapterv3.adapters.LoginForWechatAdapter;

import java.util.HashMap;
import java.util.Map;

public class LoginStrategy {
    private static Map<String,ILoginStrategy> LOGIN_STRATEGY_MAP = new HashMap<String, ILoginStrategy>();
    static {
        LOGIN_STRATEGY_MAP.put(LoginTypeKey.QQ,new LoginForQQAdapter());
        LOGIN_STRATEGY_MAP.put(LoginTypeKey.WECAHT,new LoginForWechatAdapter());
    }


    private LoginStrategy(){}

    public static ILoginStrategy getSyncStrategy(String key){
        ILoginStrategy syncStrategy = LOGIN_STRATEGY_MAP.get(key);
        return syncStrategy == null ? null : syncStrategy;
    }

    private interface LoginTypeKey{
        String QQ = "0";
        String WECAHT = "1";
    }
}
