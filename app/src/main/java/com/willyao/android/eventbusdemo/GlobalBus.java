package com.willyao.android.eventbusdemo;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by mitya on 5/5/2017.
 */

public class GlobalBus {
    private static EventBus sBus;
    public static EventBus getBus() {
        if (sBus == null) {
            sBus = EventBus.getDefault();
        }
        return sBus;
    }
}
