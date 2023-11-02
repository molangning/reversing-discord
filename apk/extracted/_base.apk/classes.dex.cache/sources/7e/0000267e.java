package com.facebook.react.turbomodule.core.interfaces;

import java.util.Collection;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface TurboModuleRegistry {
    List<String> getEagerInitModuleNames();

    TurboModule getModule(String str);

    Collection<TurboModule> getModules();

    boolean hasModule(String str);
}