package p164j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: j$.util.A */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8353A extends C8379a0 {

    /* renamed from: f */
    final /* synthetic */ SortedSet f22409f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8353A(SortedSet sortedSet, Collection collection) {
        super(21, collection);
        this.f22409f = sortedSet;
    }

    @Override // p164j$.util.C8379a0, p164j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f22409f.comparator();
    }
}