package cn.xiao.factory;


import java.util.Optional;
import java.util.function.Consumer;

/**
 * @author xiao
 */
public interface OpenAIExecutor<T> {

    Optional<T> execute();

    OpenAIExecutor<T> successHook(Consumer<T> consumer);

    OpenAIExecutor<T> errorHook(Consumer<? super Throwable> consumer);

}
