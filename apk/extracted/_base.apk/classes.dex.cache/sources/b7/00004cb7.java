package p337s7;

import java.util.Collections;
import java.util.List;
import p212l7.InterfaceC10057a;

/* renamed from: s7.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12423h implements InterfaceC10057a<AbstractC12423h> {

    /* renamed from: a */
    public final String f32311a;

    /* renamed from: b */
    public final List<String> f32312b;

    /* renamed from: c */
    public final boolean f32313c;

    public AbstractC12423h(String str, List<String> list, boolean z) {
        this.f32311a = str;
        this.f32312b = Collections.unmodifiableList(list);
        this.f32313c = z;
    }
}