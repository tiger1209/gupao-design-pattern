package adapter.demo.passport.adapterv3;

import com.gupaoedu.vip.pattern.adapter.demo.passport.ResultMsg;

public interface ILoginStrategy {
    public ResultMsg login(String id);
}