package p271oi;

import cg.InterfaceC2533a;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: oi.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC11127c<T> implements Iterable<T>, InterfaceC2533a {
    private AbstractC11127c() {
    }

    public /* synthetic */ AbstractC11127c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract int mo9100a();

    /* renamed from: e */
    public abstract void mo9099e(int i, T t);

    public abstract T get(int i);

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();
}