package com.facebook.react.uimanager;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.config.ReactFeatureFlags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p150i5.C7384b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class UIManagerModuleConstantsHelper {
    private static final String BUBBLING_EVENTS_KEY = "bubblingEventTypes";
    private static final String DIRECT_EVENTS_KEY = "directEventTypes";

    UIManagerModuleConstantsHelper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> createConstants(ViewManagerResolver viewManagerResolver) {
        Map<String, Object> constants = UIManagerModuleConstants.getConstants();
        constants.put("ViewManagerNames", new ArrayList(viewManagerResolver.getViewManagerNames()));
        constants.put("LazyViewManagersEnabled", Boolean.TRUE);
        return constants;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> createConstantsForViewManager(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap newHashMap = MapBuilder.newHashMap();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            if (ReactFeatureFlags.enableFabricRenderer && ReactFeatureFlags.unstable_useFabricInterop) {
                normalizeEventTypes(exportedCustomBubblingEventTypeConstants);
            }
            recursiveMerge(map3, exportedCustomBubblingEventTypeConstants);
            recursiveMerge(exportedCustomBubblingEventTypeConstants, map);
            newHashMap.put(BUBBLING_EVENTS_KEY, exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            newHashMap.put(BUBBLING_EVENTS_KEY, map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants != null) {
            recursiveMerge(map4, exportedCustomDirectEventTypeConstants);
            recursiveMerge(exportedCustomDirectEventTypeConstants, map2);
            newHashMap.put(DIRECT_EVENTS_KEY, exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            newHashMap.put(DIRECT_EVENTS_KEY, map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            newHashMap.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            newHashMap.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            newHashMap.put("NativeProps", nativeProps);
        }
        return newHashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> getDefaultExportableEventTypes() {
        return MapBuilder.m30469of(BUBBLING_EVENTS_KEY, UIManagerModuleConstants.getBubblingEventTypeConstants(), DIRECT_EVENTS_KEY, UIManagerModuleConstants.getDirectEventTypeConstants());
    }

    static void normalizeEventTypes(Map map) {
        if (map == null) {
            return;
        }
        HashSet<String> hashSet = new HashSet();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (!str.startsWith(ViewProps.TOP)) {
                    hashSet.add(str);
                }
            }
        }
        for (String str2 : hashSet) {
            Object obj2 = map.get(str2);
            map.put(ViewProps.TOP + str2.substring(0, 1).toUpperCase() + str2.substring(1), obj2);
        }
    }

    private static void recursiveMerge(Map map, Map map2) {
        if (map != null && map2 != null && !map2.isEmpty()) {
            for (Object obj : map2.keySet()) {
                Object obj2 = map2.get(obj);
                Object obj3 = map.get(obj);
                if (obj3 != null && (obj2 instanceof Map) && (obj3 instanceof Map)) {
                    recursiveMerge((Map) obj3, (Map) obj2);
                } else {
                    map.put(obj, obj2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> constants = UIManagerModuleConstants.getConstants();
        Map<? extends String, ? extends Object> bubblingEventTypeConstants = UIManagerModuleConstants.getBubblingEventTypeConstants();
        Map<? extends String, ? extends Object> directEventTypeConstants = UIManagerModuleConstants.getDirectEventTypeConstants();
        if (map != null) {
            map.putAll(bubblingEventTypeConstants);
        }
        if (map2 != null) {
            map2.putAll(directEventTypeConstants);
        }
        for (ViewManager viewManager : list) {
            String name = viewManager.getName();
            C7384b.m20802a(0L, "UIManagerModuleConstantsHelper.createConstants").mo20799b("ViewManager", name).mo20799b("Lazy", Boolean.FALSE).mo20798c();
            try {
                Map<String, Object> createConstantsForViewManager = createConstantsForViewManager(viewManager, null, null, map, map2);
                if (!createConstantsForViewManager.isEmpty()) {
                    constants.put(name, createConstantsForViewManager);
                }
            } finally {
                C7384b.m20801b(0L);
            }
        }
        constants.put("genericBubblingEventTypes", bubblingEventTypeConstants);
        constants.put("genericDirectEventTypes", directEventTypeConstants);
        return constants;
    }
}
