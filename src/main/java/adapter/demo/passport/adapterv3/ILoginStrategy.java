package adapter.demo.passport.adapterv3;

import adapter.demo.passport.ResultMsg;

public interface ILoginStrategy {
    public ResultMsg login(String id);
}