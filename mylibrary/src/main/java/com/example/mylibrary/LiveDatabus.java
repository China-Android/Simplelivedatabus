package com.example.mylibrary;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HL
 * @Date 2023/7/13
 */
public class LiveDatabus
{

    /**
     * 普通事件结合
     */
    private final Map<String, UnPeekLiveData> bus;

    private LiveDatabus()
    {
        bus = new HashMap<>();
    }

    private static class singleHolder
    {
        private static final LiveDatabus SINGLE_BUS = new LiveDatabus();
    }

    public static LiveDatabus getInstance(){
        return singleHolder.SINGLE_BUS;
    }

    public <T> UnPeekLiveData<T> getLiveData(String key) {
        if (!bus.containsKey(key)) {
            bus.put(key, new UnPeekLiveData<T>());
        }
        return bus.get(key);
    }

    public <T> UnPeekLiveData<T> removeLiveData(String key) {
        return bus.remove(key);
    }

}
