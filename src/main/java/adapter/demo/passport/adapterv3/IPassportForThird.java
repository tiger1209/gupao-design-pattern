package adapter.demo.passport.adapterv3;

import adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);

}
