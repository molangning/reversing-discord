package com.discord.chat.presentation.textutils;

import gg.C6759j;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"Lcom/discord/chat/presentation/textutils/NumericUtils;", "", "()V", "letters", "", "", "romanNumeralMap", "Ljava/util/TreeMap;", "", "toLetter", "number", "toRomanNumeral", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class NumericUtils {
    public static final NumericUtils INSTANCE = new NumericUtils();
    private static final List<String> letters;
    private static final TreeMap<Long, String> romanNumeralMap;

    static {
        List m13682z0;
        boolean z;
        m13682z0 = C9654p.m13682z0("abcdefghijklmnopqrstuvwxyz", new String[]{""}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m13682z0) {
            if (((String) obj).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(obj);
            }
        }
        letters = arrayList;
        TreeMap<Long, String> treeMap = new TreeMap<>();
        romanNumeralMap = treeMap;
        treeMap.put(1000L, "m");
        treeMap.put(900L, "cm");
        treeMap.put(500L, "d");
        treeMap.put(400L, "cm");
        treeMap.put(100L, "c");
        treeMap.put(90L, "xc");
        treeMap.put(50L, "l");
        treeMap.put(40L, "xl");
        treeMap.put(10L, "x");
        treeMap.put(9L, "ix");
        treeMap.put(5L, "v");
        treeMap.put(4L, "iv");
        treeMap.put(1L, "i");
    }

    private NumericUtils() {
    }

    public final String toLetter(long j) {
        boolean z;
        long m21929d;
        if (j >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j <= 26) {
                return letters.get(((int) j) - 1);
            }
            long j2 = 26;
            long j3 = j / j2;
            m21929d = C6759j.m21929d(j % j2, 1L);
            return toLetter(j3) + toLetter(m21929d);
        }
        throw new IllegalArgumentException(("Number must be at least 1. Provided: " + j).toString());
    }

    public final String toRomanNumeral(long j) {
        boolean z;
        if (j >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TreeMap<Long, String> treeMap = romanNumeralMap;
            Long floorKey = treeMap.floorKey(Long.valueOf(j));
            C9612q.m13920e(floorKey);
            long longValue = floorKey.longValue();
            if (j == longValue) {
                String str = treeMap.get(Long.valueOf(j));
                C9612q.m13920e(str);
                C9612q.m13918g(str, "{\n            romanNumeralMap[number]!!\n        }");
                return str;
            }
            String str2 = treeMap.get(Long.valueOf(longValue));
            String romanNumeral = toRomanNumeral(j - longValue);
            return ((Object) str2) + romanNumeral;
        }
        throw new IllegalArgumentException(("Number must be at least 1. Provided: " + j).toString());
    }
}