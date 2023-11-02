package com.facebook.react.modules.core;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface PermissionAwareActivity {
    int checkPermission(String str, int i, int i2);

    int checkSelfPermission(String str);

    void requestPermissions(String[] strArr, int i, PermissionListener permissionListener);

    boolean shouldShowRequestPermissionRationale(String str);
}