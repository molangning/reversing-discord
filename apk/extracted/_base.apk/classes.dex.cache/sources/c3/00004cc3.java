package p338s8;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import p299q9.C11810i;
import p461z8.AbstractC14121e;
import p461z8.C14107a;

/* renamed from: s8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12435b extends AbstractC14121e<C14107a.InterfaceC14111d.C14114c> {

    /* renamed from: k */
    private static final C14107a.C14117g<C11810i> f32372k;

    /* renamed from: l */
    private static final C14107a.AbstractC14108a<C11810i, C14107a.InterfaceC14111d.C14114c> f32373l;

    /* renamed from: m */
    private static final C14107a<C14107a.InterfaceC14111d.C14114c> f32374m;

    static {
        C14107a.C14117g<C11810i> c14117g = new C14107a.C14117g<>();
        f32372k = c14117g;
        C12436c c12436c = new C12436c();
        f32373l = c12436c;
        f32374m = new C14107a<>("SmsRetriever.API", c12436c, c14117g);
    }

    public AbstractC12435b(Context context) {
        super(context, f32374m, C14107a.InterfaceC14111d.f36303i, AbstractC14121e.C14122a.f36316c);
    }

    /* renamed from: C */
    public abstract Task<Void> mo5281C();
}