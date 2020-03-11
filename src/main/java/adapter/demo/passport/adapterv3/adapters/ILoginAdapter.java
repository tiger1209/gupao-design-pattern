package adapter.demo.passport.adapterv3.adapters;

import com.gupaoedu.vip.pattern.adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
