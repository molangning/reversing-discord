package com.facebook.react.common.mapbuffer;

import com.facebook.jni.HybridData;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.uimanager.ViewProps;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import p077e5.InterfaceC6107a;
import p355ti.C12785a;
import pf.C11563g0;

@InterfaceC6107a
@Metadata(m14358d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002CDB\u0011\b\u0013\u0012\u0006\u0010?\u001a\u000203¢\u0006\u0004\b@\u0010AB\u0011\b\u0012\u0012\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b@\u0010BJ\t\u0010\u0003\u001a\u00020\u0002H\u0082 J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0002J \u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\u0013\u0010/\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u00100\u001a\u00020\u0019H\u0016J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020#01H\u0096\u0002R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010<\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006E"}, m14357d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "Ljava/nio/ByteBuffer;", "importByteBuffer", "", "readHeader", "", "intKey", "getBucketIndexForKey", "bucketIndex", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "readDataType", "key", "expected", "getTypedValueOffsetForKey", "bufferPosition", "Lpf/g0;", "readUnsignedShort-BwKQO78", "(I)S", "readUnsignedShort", "", "readDoubleValue", "readIntValue", "", "readBooleanValue", "", "readStringValue", ViewProps.POSITION, "readMapBufferValue", "", "readMapBufferListValue", "getKeyOffsetForBucketIndex", "contains", "getKeyOffset", "offset", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "entryAt", "getType", "getInt", "getDouble", "getString", "getBoolean", "getMapBuffer", "getMapBufferList", "hashCode", "", "other", "equals", "toString", "", "iterator", "Lcom/facebook/jni/HybridData;", "mHybridData", "Lcom/facebook/jni/HybridData;", "buffer", "Ljava/nio/ByteBuffer;", "<set-?>", "count", "I", "getCount", "()I", "getOffsetForDynamicData", "offsetForDynamicData", "hybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "(Ljava/nio/ByteBuffer;)V", "Companion", "MapBufferEntry", "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ReadableMapBuffer implements MapBuffer {
    private static final int ALIGNMENT = 254;
    private static final int BUCKET_SIZE = 12;
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_SIZE = 8;
    private static final int TYPE_OFFSET = 2;
    private static final int VALUE_OFFSET = 4;
    private final ByteBuffer buffer;
    private int count;
    @InterfaceC6107a
    private final HybridData mHybridData;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m14357d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$Companion;", "", "()V", "ALIGNMENT", "", "BUCKET_SIZE", "HEADER_SIZE", "TYPE_OFFSET", "VALUE_OFFSET", "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m14357d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$MapBufferEntry;", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "bucketOffset", "", "(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)V", "booleanValue", "", "getBooleanValue", "()Z", "doubleValue", "", "getDoubleValue", "()D", "intValue", "getIntValue", "()I", "key", "getKey", "mapBufferValue", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "getMapBufferValue", "()Lcom/facebook/react/common/mapbuffer/MapBuffer;", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "type", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "getType", "()Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "assertType", "", "expected", "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class MapBufferEntry implements MapBuffer.Entry {
        private final int bucketOffset;

        public MapBufferEntry(int i) {
            this.bucketOffset = i;
        }

        private final void assertType(MapBuffer.DataType dataType) {
            boolean z;
            MapBuffer.DataType type = getType();
            if (dataType == type) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            throw new IllegalStateException(("Expected " + dataType + " for key: " + getKey() + " found " + type + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public boolean getBooleanValue() {
            assertType(MapBuffer.DataType.BOOL);
            return ReadableMapBuffer.this.readBooleanValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public double getDoubleValue() {
            assertType(MapBuffer.DataType.DOUBLE);
            return ReadableMapBuffer.this.readDoubleValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getIntValue() {
            assertType(MapBuffer.DataType.INT);
            return ReadableMapBuffer.this.readIntValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getKey() {
            return ReadableMapBuffer.this.m42125readUnsignedShortBwKQO78(this.bucketOffset) & 65535;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public MapBuffer getMapBufferValue() {
            assertType(MapBuffer.DataType.MAP);
            return ReadableMapBuffer.this.readMapBufferValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public String getStringValue() {
            assertType(MapBuffer.DataType.STRING);
            return ReadableMapBuffer.this.readStringValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public MapBuffer.DataType getType() {
            return MapBuffer.DataType.values()[ReadableMapBuffer.this.m42125readUnsignedShortBwKQO78(this.bucketOffset + 2) & 65535];
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 7, 1}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapBuffer.DataType.values().length];
            try {
                iArr[MapBuffer.DataType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapBuffer.DataType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MapBuffer.DataType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MapBuffer.DataType.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MapBuffer.DataType.MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MapBufferSoLoader.staticInit();
    }

    @InterfaceC6107a
    private ReadableMapBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
        this.buffer = importByteBuffer();
        readHeader();
    }

    private final int getBucketIndexForKey(int i) {
        boolean z;
        IntRange kEY_RANGE$ReactAndroid_release = MapBuffer.Companion.getKEY_RANGE$ReactAndroid_release();
        int m13890a = kEY_RANGE$ReactAndroid_release.m13890a();
        int i2 = 0;
        if (i <= kEY_RANGE$ReactAndroid_release.m13889e() && m13890a <= i) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return -1;
        }
        short m7634b = C11563g0.m7634b((short) i);
        int count = getCount() - 1;
        while (i2 <= count) {
            int i3 = (i2 + count) >>> 1;
            int m42125readUnsignedShortBwKQO78 = m42125readUnsignedShortBwKQO78(getKeyOffsetForBucketIndex(i3)) & 65535;
            int i4 = 65535 & m7634b;
            if (C9612q.m13915j(m42125readUnsignedShortBwKQO78, i4) < 0) {
                i2 = i3 + 1;
            } else if (C9612q.m13915j(m42125readUnsignedShortBwKQO78, i4) > 0) {
                count = i3 - 1;
            } else {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getKeyOffsetForBucketIndex(int i) {
        return (i * 12) + 8;
    }

    private final int getOffsetForDynamicData() {
        return getKeyOffsetForBucketIndex(getCount());
    }

    private final int getTypedValueOffsetForKey(int i, MapBuffer.DataType dataType) {
        boolean z;
        int bucketIndexForKey = getBucketIndexForKey(i);
        boolean z2 = true;
        if (bucketIndexForKey != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MapBuffer.DataType readDataType = readDataType(bucketIndexForKey);
            if (readDataType != dataType) {
                z2 = false;
            }
            if (z2) {
                return getKeyOffsetForBucketIndex(bucketIndexForKey) + 4;
            }
            throw new IllegalStateException(("Expected " + dataType + " for key: " + i + ", found " + readDataType + " instead.").toString());
        }
        throw new IllegalArgumentException(("Key not found: " + i).toString());
    }

    private final native ByteBuffer importByteBuffer();

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean readBooleanValue(int i) {
        return readIntValue(i) == 1;
    }

    private final MapBuffer.DataType readDataType(int i) {
        return MapBuffer.DataType.values()[m42125readUnsignedShortBwKQO78(getKeyOffsetForBucketIndex(i) + 2) & 65535];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double readDoubleValue(int i) {
        return this.buffer.getDouble(i);
    }

    private final void readHeader() {
        if (this.buffer.getShort() != ALIGNMENT) {
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.count = m42125readUnsignedShortBwKQO78(this.buffer.position()) & 65535;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int readIntValue(int i) {
        return this.buffer.getInt(i);
    }

    private final List<ReadableMapBuffer> readMapBufferListValue(int i) {
        ArrayList arrayList = new ArrayList();
        int offsetForDynamicData = getOffsetForDynamicData() + this.buffer.getInt(i);
        int i2 = this.buffer.getInt(offsetForDynamicData);
        int i3 = offsetForDynamicData + 4;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = this.buffer.getInt(i3 + i4);
            byte[] bArr = new byte[i5];
            int i6 = i4 + 4;
            this.buffer.position(i3 + i6);
            this.buffer.get(bArr, 0, i5);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            C9612q.m13918g(wrap, "wrap(newMapBuffer)");
            arrayList.add(new ReadableMapBuffer(wrap));
            i4 = i6 + i5;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMapBuffer readMapBufferValue(int i) {
        int offsetForDynamicData = getOffsetForDynamicData() + this.buffer.getInt(i);
        int i2 = this.buffer.getInt(offsetForDynamicData);
        byte[] bArr = new byte[i2];
        this.buffer.position(offsetForDynamicData + 4);
        this.buffer.get(bArr, 0, i2);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        C9612q.m13918g(wrap, "wrap(newBuffer)");
        return new ReadableMapBuffer(wrap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String readStringValue(int i) {
        int offsetForDynamicData = getOffsetForDynamicData() + this.buffer.getInt(i);
        int i2 = this.buffer.getInt(offsetForDynamicData);
        byte[] bArr = new byte[i2];
        this.buffer.position(offsetForDynamicData + 4);
        this.buffer.get(bArr, 0, i2);
        return new String(bArr, C12785a.f33142b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: readUnsignedShort-BwKQO78  reason: not valid java name */
    public final short m42125readUnsignedShortBwKQO78(int i) {
        return C11563g0.m7634b(this.buffer.getShort(i));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean contains(int i) {
        return getBucketIndexForKey(i) != -1;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public MapBuffer.Entry entryAt(int i) {
        return new MapBufferEntry(getKeyOffsetForBucketIndex(i));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) obj).buffer;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return C9612q.m13922c(byteBuffer, byteBuffer2);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean getBoolean(int i) {
        return readBooleanValue(getTypedValueOffsetForKey(i, MapBuffer.DataType.BOOL));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getCount() {
        return this.count;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public double getDouble(int i) {
        return readDoubleValue(getTypedValueOffsetForKey(i, MapBuffer.DataType.DOUBLE));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getInt(int i) {
        return readIntValue(getTypedValueOffsetForKey(i, MapBuffer.DataType.INT));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getKeyOffset(int i) {
        return getBucketIndexForKey(i);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public List<ReadableMapBuffer> getMapBufferList(int i) {
        return readMapBufferListValue(getTypedValueOffsetForKey(i, MapBuffer.DataType.MAP));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public String getString(int i) {
        return readStringValue(getTypedValueOffsetForKey(i, MapBuffer.DataType.STRING));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public MapBuffer.DataType getType(int i) {
        boolean z;
        int bucketIndexForKey = getBucketIndexForKey(i);
        if (bucketIndexForKey != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return readDataType(bucketIndexForKey);
        }
        throw new IllegalArgumentException(("Key not found: " + i).toString());
    }

    public int hashCode() {
        this.buffer.rewind();
        return this.buffer.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<MapBuffer.Entry> iterator() {
        return new ReadableMapBuffer$iterator$1(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        Iterator<MapBuffer.Entry> it = iterator();
        while (it.hasNext()) {
            MapBuffer.Entry next = it.next();
            sb2.append(next.getKey());
            sb2.append('=');
            int i = WhenMappings.$EnumSwitchMapping$0[next.getType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                sb2.append(next.getMapBufferValue().toString());
                            }
                        } else {
                            sb2.append(next.getStringValue());
                        }
                    } else {
                        sb2.append(next.getDoubleValue());
                    }
                } else {
                    sb2.append(next.getIntValue());
                }
            } else {
                sb2.append(next.getBooleanValue());
            }
            sb2.append(',');
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "builder.toString()");
        return sb3;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public ReadableMapBuffer getMapBuffer(int i) {
        return readMapBufferValue(getTypedValueOffsetForKey(i, MapBuffer.DataType.MAP));
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer) {
        this.mHybridData = null;
        this.buffer = byteBuffer;
        readHeader();
    }
}
