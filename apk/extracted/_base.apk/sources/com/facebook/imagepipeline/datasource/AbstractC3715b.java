package com.facebook.imagepipeline.datasource;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.AbstractC3574b;
import com.facebook.datasource.DataSource;
import p380v4.AbstractC13062b;
import p380v4.AbstractC13063c;

/* renamed from: com.facebook.imagepipeline.datasource.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3715b extends AbstractC3574b<CloseableReference<AbstractC13063c>> {
    protected abstract void onNewResultImpl(Bitmap bitmap);

    @Override // com.facebook.datasource.AbstractC3574b
    public void onNewResultImpl(DataSource<CloseableReference<AbstractC13063c>> dataSource) {
        Bitmap bitmap;
        if (!dataSource.mo31712a()) {
            return;
        }
        CloseableReference<AbstractC13063c> mo31018g = dataSource.mo31018g();
        if (mo31018g != null && (mo31018g.m31730D() instanceof AbstractC13062b)) {
            bitmap = ((AbstractC13062b) mo31018g.m31730D()).mo3363o();
        } else {
            bitmap = null;
        }
        try {
            onNewResultImpl(bitmap);
        } finally {
            CloseableReference.m31715v(mo31018g);
        }
    }
}
