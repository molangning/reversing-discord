package com.discord.foreground_service.react;

import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import p304qf.AbstractC11883p;
import p304qf.C11889v;

@Metadata(m14358d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, m14357d2 = {"parse", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Companion;", "readableMap", "Lcom/facebook/react/bridge/ReadableMap;", "parseAction", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;", "parseList", "", "readableArray", "Lcom/facebook/react/bridge/ReadableArray;", "parsePriority", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;", "value", "", "foreground_service_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class ForegroudServiceConfigurationParserKt {
    public static final ServiceNotificationConfiguration parse(ServiceNotificationConfiguration.Companion companion, ReadableMap readableMap) {
        ServiceNotificationConfiguration.Action action;
        List m14104i;
        ArrayList arrayList;
        int m14093t;
        C9612q.m13917h(companion, "<this>");
        C9612q.m13917h(readableMap, "readableMap");
        String nonNullString = NativeMapExtensionsKt.getNonNullString(readableMap, "title");
        String string = readableMap.getString("content");
        ServiceNotificationConfiguration.Companion companion2 = ServiceNotificationConfiguration.Companion;
        ServiceNotificationConfiguration.Priority parsePriority = parsePriority(companion2, readableMap.getInt("priority"));
        ReadableMap map = readableMap.getMap("contentAction");
        if (map != null) {
            action = parseAction(companion2, map);
        } else {
            action = null;
        }
        ServiceNotificationConfiguration.Action action2 = action;
        ReadableArray array = readableMap.getArray("auxiliaryActions");
        if (array != null) {
            IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(array);
            m14093t = C9546k.m14093t(sizeRange, 10);
            ArrayList arrayList2 = new ArrayList(m14093t);
            Iterator<Integer> it = sizeRange.iterator();
            while (it.hasNext()) {
                ReadableMap map2 = array.getMap(((AbstractC11883p) it).nextInt());
                C9612q.m13918g(map2, "array.getMap(index)");
                arrayList2.add(parseAction(ServiceNotificationConfiguration.Companion, map2));
            }
            arrayList = arrayList2;
        } else {
            m14104i = C9545j.m14104i();
            arrayList = m14104i;
        }
        return new ServiceNotificationConfiguration(nonNullString, string, parsePriority, action2, arrayList);
    }

    private static final ServiceNotificationConfiguration.Action parseAction(ServiceNotificationConfiguration.Companion companion, ReadableMap readableMap) {
        Map<String, String> m6754h;
        String nonNullString = NativeMapExtensionsKt.getNonNullString(readableMap, "tag");
        String nonNullString2 = NativeMapExtensionsKt.getNonNullString(readableMap, "taskName");
        String stringOrEmpty = NativeMapExtensionsKt.getStringOrEmpty(readableMap, "title");
        ReadableMap map = readableMap.getMap("data");
        if (map == null || (m6754h = NativeMapExtensionsKt.toStringMap(map)) == null) {
            m6754h = C11889v.m6754h();
        }
        return new ServiceNotificationConfiguration.Action(nonNullString, nonNullString2, stringOrEmpty, m6754h);
    }

    public static final List<ServiceNotificationConfiguration> parseList(ServiceNotificationConfiguration.Companion companion, ReadableArray readableArray) {
        int m14093t;
        C9612q.m13917h(companion, "<this>");
        C9612q.m13917h(readableArray, "readableArray");
        IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(readableArray);
        m14093t = C9546k.m14093t(sizeRange, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        Iterator<Integer> it = sizeRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC11883p) it).nextInt();
            ServiceNotificationConfiguration.Companion companion2 = ServiceNotificationConfiguration.Companion;
            ReadableMap map = readableArray.getMap(nextInt);
            C9612q.m13918g(map, "readableArray.getMap(index)");
            arrayList.add(parse(companion2, map));
        }
        return arrayList;
    }

    private static final ServiceNotificationConfiguration.Priority parsePriority(ServiceNotificationConfiguration.Companion companion, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return ServiceNotificationConfiguration.Priority.LOW;
                }
                throw new IllegalArgumentException("Unknown priority: " + i + ".");
            }
            return ServiceNotificationConfiguration.Priority.MEDIUM;
        }
        return ServiceNotificationConfiguration.Priority.HIGH;
    }
}