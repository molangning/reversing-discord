package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import p058d5.C5743a;

@ReactModule(name = NativeSourceCodeSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SourceCodeModule extends NativeSourceCodeSpec {
    public SourceCodeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeSourceCodeSpec
    protected Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("scriptURL", (String) C5743a.m24582d(getReactApplicationContext().getSourceURL(), "No source URL loaded, have you initialised the instance?"));
        return hashMap;
    }
}
