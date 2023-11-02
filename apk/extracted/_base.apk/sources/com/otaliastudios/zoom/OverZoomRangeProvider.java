package com.otaliastudios.zoom;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, m14357d2 = {"Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "", "inwards", "", "a", "b", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface OverZoomRangeProvider {

    /* renamed from: a */
    public static final C5350b f15163a = C5350b.f15166a;

    /* renamed from: b */
    public static final OverZoomRangeProvider f15164b = new C5349a();

    @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m14357d2 = {"com/otaliastudios/zoom/OverZoomRangeProvider$a", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "", "inwards", "", "a", "c", "F", "DEFAULT_OVERZOOM_FACTOR", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.OverZoomRangeProvider$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5349a implements OverZoomRangeProvider {

        /* renamed from: c */
        private final float f15165c = 0.1f;

        C5349a() {
        }

        @Override // com.otaliastudios.zoom.OverZoomRangeProvider
        /* renamed from: a */
        public float mo25461a(ZoomEngine engine, boolean z) {
            C9612q.m13917h(engine, "engine");
            return this.f15165c * (engine.m25377z() - engine.m25448B());
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0007"}, m14357d2 = {"Lcom/otaliastudios/zoom/OverZoomRangeProvider$b;", "", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "DEFAULT", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "<init>", "()V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.OverZoomRangeProvider$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5350b {

        /* renamed from: a */
        static final /* synthetic */ C5350b f15166a = new C5350b();

        private C5350b() {
        }
    }

    /* renamed from: a */
    float mo25461a(ZoomEngine zoomEngine, boolean z);
}
