package cn.xiao.factory;



public interface Post<T> {
    public OpenAIExecutor<T> post() ;
}
