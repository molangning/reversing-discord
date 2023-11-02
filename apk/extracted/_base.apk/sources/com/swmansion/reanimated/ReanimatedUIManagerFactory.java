package com.swmansion.reanimated;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ReanimatedUIImplementation;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReanimatedUIManagerFactory {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static UIManagerModule create(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        ViewManagerRegistry viewManagerRegistry = new ViewManagerRegistry(list);
        ReanimatedUIManager reanimatedUIManager = new ReanimatedUIManager(reactApplicationContext, list, i);
        ReanimatedUIImplementation reanimatedUIImplementation = new ReanimatedUIImplementation(reactApplicationContext, viewManagerRegistry, reanimatedUIManager.getEventDispatcher(), i);
        Class superclass = ReanimatedUIManager.class.getSuperclass();
        if (superclass == null) {
            Log.e("reanimated", "unable to resolve super class of ReanimatedUIManager");
            return reanimatedUIManager;
        }
        try {
            Field declaredField = superclass.getDeclaredField("mUIImplementation");
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e) {
                e.printStackTrace();
            }
            declaredField.set(reanimatedUIManager, reanimatedUIImplementation);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        return reanimatedUIManager;
    }
}
