package net.time4j.p249tz.model;

import java.util.Comparator;

/* renamed from: net.time4j.tz.model.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
enum EnumC10830k implements Comparator<AbstractC10819d> {
    INSTANCE;

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(AbstractC10819d abstractC10819d, AbstractC10819d abstractC10819d2) {
        int compareTo = abstractC10819d.mo10071b(2000).compareTo(abstractC10819d2.mo10071b(2000));
        if (compareTo == 0) {
            return abstractC10819d.m10074f().compareTo(abstractC10819d2.m10074f());
        }
        return compareTo;
    }
}
