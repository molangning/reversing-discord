package hk;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m14357d2 = {"", "", "a", "okio"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: hk.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C7364f {
    /* renamed from: a */
    public static final byte[] m20833a(String commonAsUtf8ToByteArray) {
        int i;
        int i2;
        char charAt;
        C9612q.m13917h(commonAsUtf8ToByteArray, "$this$commonAsUtf8ToByteArray");
        byte[] bArr = new byte[commonAsUtf8ToByteArray.length() * 4];
        int length = commonAsUtf8ToByteArray.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt2 = commonAsUtf8ToByteArray.charAt(i3);
            if (C9612q.m13915j(charAt2, 128) >= 0) {
                int length2 = commonAsUtf8ToByteArray.length();
                int i4 = i3;
                while (i3 < length2) {
                    char charAt3 = commonAsUtf8ToByteArray.charAt(i3);
                    if (C9612q.m13915j(charAt3, 128) < 0) {
                        int i5 = i4 + 1;
                        bArr[i4] = (byte) charAt3;
                        i3++;
                        while (i3 < length2 && C9612q.m13915j(commonAsUtf8ToByteArray.charAt(i3), 128) < 0) {
                            bArr[i5] = (byte) commonAsUtf8ToByteArray.charAt(i3);
                            i3++;
                            i5++;
                        }
                        i4 = i5;
                    } else {
                        if (C9612q.m13915j(charAt3, RecyclerView.ItemAnimator.FLAG_MOVED) < 0) {
                            int i6 = i4 + 1;
                            bArr[i4] = (byte) ((charAt3 >> 6) | 192);
                            i = i6 + 1;
                            bArr[i6] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 <= charAt3 && 57343 >= charAt3) {
                            if (C9612q.m13915j(charAt3, 56319) <= 0 && length2 > (i2 = i3 + 1) && 56320 <= (charAt = commonAsUtf8ToByteArray.charAt(i2)) && 57343 >= charAt) {
                                int charAt4 = ((charAt3 << '\n') + commonAsUtf8ToByteArray.charAt(i2)) - 56613888;
                                int i7 = i4 + 1;
                                bArr[i4] = (byte) ((charAt4 >> 18) | 240);
                                int i8 = i7 + 1;
                                bArr[i7] = (byte) (((charAt4 >> 12) & 63) | 128);
                                int i9 = i8 + 1;
                                bArr[i8] = (byte) (((charAt4 >> 6) & 63) | 128);
                                i = i9 + 1;
                                bArr[i9] = (byte) ((charAt4 & 63) | 128);
                                i3 += 2;
                                i4 = i;
                            } else {
                                i = i4 + 1;
                                bArr[i4] = 63;
                            }
                        } else {
                            int i10 = i4 + 1;
                            bArr[i4] = (byte) ((charAt3 >> '\f') | 224);
                            int i11 = i10 + 1;
                            bArr[i10] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i = i11 + 1;
                            bArr[i11] = (byte) ((charAt3 & '?') | 128);
                        }
                        i3++;
                        i4 = i;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i4);
                C9612q.m13918g(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                return copyOf;
            }
            bArr[i3] = (byte) charAt2;
            i3++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, commonAsUtf8ToByteArray.length());
        C9612q.m13918g(copyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf2;
    }
}