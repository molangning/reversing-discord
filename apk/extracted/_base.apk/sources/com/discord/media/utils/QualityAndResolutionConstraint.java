package com.discord.media.utils;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p406we.C13534c;
import p426xe.InterfaceC13793a;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, m14357d2 = {"Lcom/discord/media/utils/QualityAndResolutionConstraint;", "Lxe/a;", "Ljava/io/File;", "imageFile", "", "isSatisfied", "satisfy", "", "quality", "I", "shouldResize", "Z", "isResolved", "<init>", "(IZ)V", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class QualityAndResolutionConstraint implements InterfaceC13793a {
    private boolean isResolved;
    private final int quality;
    private final boolean shouldResize;

    public QualityAndResolutionConstraint(int i, boolean z) {
        this.quality = i;
        this.shouldResize = z;
    }

    @Override // p426xe.InterfaceC13793a
    public boolean isSatisfied(File imageFile) {
        C9612q.m13917h(imageFile, "imageFile");
        return this.isResolved;
    }

    @Override // p426xe.InterfaceC13793a
    public File satisfy(File imageFile) {
        File m2281k;
        C9612q.m13917h(imageFile, "imageFile");
        if (this.shouldResize) {
            m2281k = C13534c.m2281k(imageFile, C13534c.m2286f(imageFile, C13534c.m2287e(imageFile, 612, 816)), null, this.quality, 4, null);
        } else {
            m2281k = C13534c.m2281k(imageFile, C13534c.m2283i(imageFile), null, this.quality, 4, null);
        }
        this.isResolved = true;
        return m2281k;
    }
}
