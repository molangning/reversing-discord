package p045cj;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0003H ¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H ¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038 X \u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m14357d2 = {"Lcj/q1;", "Array", "", "", "requiredCapacity", "", "b", "(I)V", "a", "()Ljava/lang/Object;", "d", "()I", ViewProps.POSITION, "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.q1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2632q1<Array> {
    /* renamed from: c */
    public static /* synthetic */ void m32829c(AbstractC2632q1 abstractC2632q1, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i2 & 1) != 0) {
            i = abstractC2632q1.mo32765d() + 1;
        }
        abstractC2632q1.mo32766b(i);
    }

    /* renamed from: a */
    public abstract Array mo32767a();

    /* renamed from: b */
    public abstract void mo32766b(int i);

    /* renamed from: d */
    public abstract int mo32765d();
}
