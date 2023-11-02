package p110g0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.views.text.TypefaceStyle;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p164j$.util.DesugarTimeZone;

/* renamed from: g0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6509a {

    /* renamed from: U */
    private static SimpleDateFormat f18348U;

    /* renamed from: Y */
    private static final C6514e[] f18352Y;

    /* renamed from: Z */
    private static final C6514e[] f18353Z;

    /* renamed from: a0 */
    private static final C6514e[] f18354a0;

    /* renamed from: b0 */
    private static final C6514e[] f18355b0;

    /* renamed from: c0 */
    private static final C6514e[] f18356c0;

    /* renamed from: d0 */
    private static final C6514e f18357d0;

    /* renamed from: e0 */
    private static final C6514e[] f18358e0;

    /* renamed from: f0 */
    private static final C6514e[] f18359f0;

    /* renamed from: g0 */
    private static final C6514e[] f18360g0;

    /* renamed from: h0 */
    private static final C6514e[] f18361h0;

    /* renamed from: i0 */
    static final C6514e[][] f18362i0;

    /* renamed from: j0 */
    private static final C6514e[] f18363j0;

    /* renamed from: k0 */
    private static final C6514e f18364k0;

    /* renamed from: l0 */
    private static final C6514e f18365l0;

    /* renamed from: m0 */
    private static final HashMap<Integer, C6514e>[] f18366m0;

    /* renamed from: n0 */
    private static final HashMap<String, C6514e>[] f18367n0;

    /* renamed from: o0 */
    private static final HashSet<String> f18368o0;

    /* renamed from: p0 */
    private static final HashMap<Integer, Integer> f18369p0;

    /* renamed from: q0 */
    static final Charset f18370q0;

    /* renamed from: r0 */
    static final byte[] f18371r0;

    /* renamed from: s0 */
    private static final byte[] f18372s0;

    /* renamed from: t0 */
    private static final Pattern f18373t0;

    /* renamed from: u0 */
    private static final Pattern f18374u0;

    /* renamed from: a */
    private String f18380a;

    /* renamed from: b */
    private FileDescriptor f18381b;

    /* renamed from: c */
    private AssetManager.AssetInputStream f18382c;

    /* renamed from: d */
    private int f18383d;

    /* renamed from: e */
    private boolean f18384e;

    /* renamed from: f */
    private final HashMap<String, C6513d>[] f18385f;

    /* renamed from: g */
    private Set<Integer> f18386g;

    /* renamed from: h */
    private ByteOrder f18387h;

    /* renamed from: i */
    private boolean f18388i;

    /* renamed from: j */
    private boolean f18389j;

    /* renamed from: k */
    private boolean f18390k;

    /* renamed from: l */
    private int f18391l;

    /* renamed from: m */
    private int f18392m;

    /* renamed from: n */
    private byte[] f18393n;

    /* renamed from: o */
    private int f18394o;

    /* renamed from: p */
    private int f18395p;

    /* renamed from: q */
    private int f18396q;

    /* renamed from: r */
    private int f18397r;

    /* renamed from: s */
    private int f18398s;

    /* renamed from: t */
    private boolean f18399t;

    /* renamed from: u */
    private boolean f18400u;

    /* renamed from: v */
    private static final boolean f18375v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w */
    private static final List<Integer> f18376w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x */
    private static final List<Integer> f18377x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y */
    public static final int[] f18378y = {8, 8, 8};

    /* renamed from: z */
    public static final int[] f18379z = {4};

    /* renamed from: A */
    public static final int[] f18328A = {8};

    /* renamed from: B */
    static final byte[] f18329B = {-1, -40, -1};

    /* renamed from: C */
    private static final byte[] f18330C = {102, 116, 121, 112};

    /* renamed from: D */
    private static final byte[] f18331D = {109, 105, 102, 49};

    /* renamed from: E */
    private static final byte[] f18332E = {104, 101, 105, 99};

    /* renamed from: F */
    private static final byte[] f18333F = {79, 76, 89, 77, 80, 0};

    /* renamed from: G */
    private static final byte[] f18334G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: H */
    private static final byte[] f18335H = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: I */
    private static final byte[] f18336I = {101, 88, 73, 102};

    /* renamed from: J */
    private static final byte[] f18337J = {73, 72, 68, 82};

    /* renamed from: K */
    private static final byte[] f18338K = {73, 69, 78, 68};

    /* renamed from: L */
    private static final byte[] f18339L = {82, 73, 70, 70};

    /* renamed from: M */
    private static final byte[] f18340M = {87, 69, 66, 80};

    /* renamed from: N */
    private static final byte[] f18341N = {69, 88, 73, 70};

    /* renamed from: O */
    private static final byte[] f18342O = {-99, 1, 42};

    /* renamed from: P */
    private static final byte[] f18343P = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    private static final byte[] f18344Q = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: R */
    private static final byte[] f18345R = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: S */
    private static final byte[] f18346S = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: T */
    private static final byte[] f18347T = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: V */
    static final String[] f18349V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: W */
    static final int[] f18350W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: X */
    static final byte[] f18351X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C6510a extends MediaDataSource {

        /* renamed from: j */
        long f18401j;

        /* renamed from: k */
        final /* synthetic */ C6511b f18402k;

        C6510a(C6511b c6511b) {
            this.f18402k = c6511b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f18401j;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + this.f18402k.available()) {
                        return -1;
                    }
                    this.f18402k.m22490j(j);
                    this.f18401j = j;
                }
                if (i2 > this.f18402k.available()) {
                    i2 = this.f18402k.available();
                }
                int read = this.f18402k.read(bArr, i, i2);
                if (read >= 0) {
                    this.f18401j += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f18401j = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6511b extends InputStream implements DataInput {

        /* renamed from: n */
        private static final ByteOrder f18404n = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: o */
        private static final ByteOrder f18405o = ByteOrder.BIG_ENDIAN;

        /* renamed from: j */
        private DataInputStream f18406j;

        /* renamed from: k */
        private ByteOrder f18407k;

        /* renamed from: l */
        final int f18408l;

        /* renamed from: m */
        int f18409m;

        public C6511b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int m22493a() {
            return this.f18408l;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f18406j.available();
        }

        /* renamed from: h */
        public int m22492h() {
            return this.f18409m;
        }

        /* renamed from: i */
        public long m22491i() {
            return readInt() & 4294967295L;
        }

        /* renamed from: j */
        public void m22490j(long j) {
            int i = this.f18409m;
            if (i > j) {
                this.f18409m = 0;
                this.f18406j.reset();
                this.f18406j.mark(this.f18408l);
            } else {
                j -= i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) == i2) {
                return;
            }
            throw new IOException("Couldn't seek up to the byteCount");
        }

        /* renamed from: m */
        public void m22489m(ByteOrder byteOrder) {
            this.f18407k = byteOrder;
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f18406j.mark(i);
        }

        @Override // java.io.InputStream
        public int read() {
            this.f18409m++;
            return this.f18406j.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f18409m++;
            return this.f18406j.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            int i = this.f18409m + 1;
            this.f18409m = i;
            if (i <= this.f18408l) {
                int read = this.f18406j.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f18409m += 2;
            return this.f18406j.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) {
            int i3 = this.f18409m + i2;
            this.f18409m = i3;
            if (i3 <= this.f18408l) {
                if (this.f18406j.read(bArr, i, i2) != i2) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() {
            int i = this.f18409m + 4;
            this.f18409m = i;
            if (i <= this.f18408l) {
                int read = this.f18406j.read();
                int read2 = this.f18406j.read();
                int read3 = this.f18406j.read();
                int read4 = this.f18406j.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f18407k;
                    if (byteOrder == f18404n) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f18405o) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f18407k);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            int i = this.f18409m + 8;
            this.f18409m = i;
            if (i <= this.f18408l) {
                int read = this.f18406j.read();
                int read2 = this.f18406j.read();
                int read3 = this.f18406j.read();
                int read4 = this.f18406j.read();
                int read5 = this.f18406j.read();
                int read6 = this.f18406j.read();
                int read7 = this.f18406j.read();
                int read8 = this.f18406j.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f18407k;
                    if (byteOrder == f18404n) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f18405o) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    throw new IOException("Invalid byte order: " + this.f18407k);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            int i = this.f18409m + 2;
            this.f18409m = i;
            if (i <= this.f18408l) {
                int read = this.f18406j.read();
                int read2 = this.f18406j.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f18407k;
                    if (byteOrder == f18404n) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f18405o) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f18407k);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f18409m += 2;
            return this.f18406j.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f18409m++;
            return this.f18406j.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            int i = this.f18409m + 2;
            this.f18409m = i;
            if (i <= this.f18408l) {
                int read = this.f18406j.read();
                int read2 = this.f18406j.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f18407k;
                    if (byteOrder == f18404n) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f18405o) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f18407k);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) {
            int min = Math.min(i, this.f18408l - this.f18409m);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f18406j.skipBytes(min - i2);
            }
            this.f18409m += i2;
            return i2;
        }

        C6511b(InputStream inputStream, ByteOrder byteOrder) {
            this.f18407k = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f18406j = dataInputStream;
            int available = dataInputStream.available();
            this.f18408l = available;
            this.f18409m = 0;
            this.f18406j.mark(available);
            this.f18407k = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = this.f18406j.read(bArr, i, i2);
            this.f18409m += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            int length = this.f18409m + bArr.length;
            this.f18409m = length;
            if (length <= this.f18408l) {
                if (this.f18406j.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public C6511b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6512c extends FilterOutputStream {

        /* renamed from: j */
        final OutputStream f18410j;

        /* renamed from: k */
        private ByteOrder f18411k;

        public C6512c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f18410j = outputStream;
            this.f18411k = byteOrder;
        }

        /* renamed from: a */
        public void m22488a(ByteOrder byteOrder) {
            this.f18411k = byteOrder;
        }

        /* renamed from: h */
        public void m22487h(int i) {
            this.f18410j.write(i);
        }

        /* renamed from: i */
        public void m22486i(int i) {
            ByteOrder byteOrder = this.f18411k;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f18410j.write((i >>> 0) & 255);
                this.f18410j.write((i >>> 8) & 255);
                this.f18410j.write((i >>> 16) & 255);
                this.f18410j.write((i >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f18410j.write((i >>> 24) & 255);
                this.f18410j.write((i >>> 16) & 255);
                this.f18410j.write((i >>> 8) & 255);
                this.f18410j.write((i >>> 0) & 255);
            }
        }

        /* renamed from: j */
        public void m22485j(short s) {
            ByteOrder byteOrder = this.f18411k;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f18410j.write((s >>> 0) & 255);
                this.f18410j.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f18410j.write((s >>> 8) & 255);
                this.f18410j.write((s >>> 0) & 255);
            }
        }

        /* renamed from: m */
        public void m22484m(long j) {
            m22486i((int) j);
        }

        /* renamed from: o */
        public void m22483o(int i) {
            m22485j((short) i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f18410j.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.f18410j.write(bArr, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6513d {

        /* renamed from: a */
        public final int f18412a;

        /* renamed from: b */
        public final int f18413b;

        /* renamed from: c */
        public final long f18414c;

        /* renamed from: d */
        public final byte[] f18415d;

        C6513d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        /* renamed from: a */
        public static C6513d m22482a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new C6513d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C6509a.f18370q0);
            return new C6513d(1, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C6513d m22481b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C6509a.f18350W[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new C6513d(12, dArr.length, wrap.array());
        }

        /* renamed from: c */
        public static C6513d m22480c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C6509a.f18350W[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new C6513d(9, iArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C6513d m22479d(C6516g[] c6516gArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C6509a.f18350W[10] * c6516gArr.length]);
            wrap.order(byteOrder);
            for (C6516g c6516g : c6516gArr) {
                wrap.putInt((int) c6516g.f18420a);
                wrap.putInt((int) c6516g.f18421b);
            }
            return new C6513d(10, c6516gArr.length, wrap.array());
        }

        /* renamed from: e */
        public static C6513d m22478e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C6509a.f18370q0);
            return new C6513d(2, bytes.length, bytes);
        }

        /* renamed from: f */
        public static C6513d m22477f(long j, ByteOrder byteOrder) {
            return m22476g(new long[]{j}, byteOrder);
        }

        /* renamed from: g */
        public static C6513d m22476g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C6509a.f18350W[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C6513d(4, jArr.length, wrap.array());
        }

        /* renamed from: h */
        public static C6513d m22475h(C6516g c6516g, ByteOrder byteOrder) {
            return m22474i(new C6516g[]{c6516g}, byteOrder);
        }

        /* renamed from: i */
        public static C6513d m22474i(C6516g[] c6516gArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C6509a.f18350W[5] * c6516gArr.length]);
            wrap.order(byteOrder);
            for (C6516g c6516g : c6516gArr) {
                wrap.putInt((int) c6516g.f18420a);
                wrap.putInt((int) c6516g.f18421b);
            }
            return new C6513d(5, c6516gArr.length, wrap.array());
        }

        /* renamed from: j */
        public static C6513d m22473j(int i, ByteOrder byteOrder) {
            return m22472k(new int[]{i}, byteOrder);
        }

        /* renamed from: k */
        public static C6513d m22472k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C6509a.f18350W[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C6513d(3, iArr.length, wrap.array());
        }

        /* renamed from: l */
        public double m22471l(ByteOrder byteOrder) {
            Object m22468o = m22468o(byteOrder);
            if (m22468o != null) {
                if (m22468o instanceof String) {
                    return Double.parseDouble((String) m22468o);
                }
                if (m22468o instanceof long[]) {
                    long[] jArr = (long[]) m22468o;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m22468o instanceof int[]) {
                    int[] iArr = (int[]) m22468o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m22468o instanceof double[]) {
                    double[] dArr = (double[]) m22468o;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m22468o instanceof C6516g[]) {
                    C6516g[] c6516gArr = (C6516g[]) m22468o;
                    if (c6516gArr.length == 1) {
                        return c6516gArr[0].m22462a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        /* renamed from: m */
        public int m22470m(ByteOrder byteOrder) {
            Object m22468o = m22468o(byteOrder);
            if (m22468o != null) {
                if (m22468o instanceof String) {
                    return Integer.parseInt((String) m22468o);
                }
                if (m22468o instanceof long[]) {
                    long[] jArr = (long[]) m22468o;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m22468o instanceof int[]) {
                    int[] iArr = (int[]) m22468o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        /* renamed from: n */
        public String m22469n(ByteOrder byteOrder) {
            Object m22468o = m22468o(byteOrder);
            if (m22468o == null) {
                return null;
            }
            if (m22468o instanceof String) {
                return (String) m22468o;
            }
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            if (m22468o instanceof long[]) {
                long[] jArr = (long[]) m22468o;
                while (i < jArr.length) {
                    sb2.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (m22468o instanceof int[]) {
                int[] iArr = (int[]) m22468o;
                while (i < iArr.length) {
                    sb2.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (m22468o instanceof double[]) {
                double[] dArr = (double[]) m22468o;
                while (i < dArr.length) {
                    sb2.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(m22468o instanceof C6516g[])) {
                return null;
            } else {
                C6516g[] c6516gArr = (C6516g[]) m22468o;
                while (i < c6516gArr.length) {
                    sb2.append(c6516gArr[i].f18420a);
                    sb2.append('/');
                    sb2.append(c6516gArr[i].f18421b);
                    i++;
                    if (i != c6516gArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:151:0x0198 */
        /* JADX WARN: Removed duplicated region for block: B:182:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object m22468o(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 448
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p110g0.C6509a.C6513d.m22468o(java.nio.ByteOrder):java.lang.Object");
        }

        /* renamed from: p */
        public int m22467p() {
            return C6509a.f18350W[this.f18412a] * this.f18413b;
        }

        public String toString() {
            return "(" + C6509a.f18349V[this.f18412a] + ", data length:" + this.f18415d.length + ")";
        }

        C6513d(int i, int i2, long j, byte[] bArr) {
            this.f18412a = i;
            this.f18413b = i2;
            this.f18414c = j;
            this.f18415d = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6515f {
        /* renamed from: a */
        static void m22465a(FileDescriptor fileDescriptor) {
            try {
                Os.close(fileDescriptor);
            } catch (ErrnoException unused) {
                Log.e("ExifInterface", "Error closing fd.");
            }
        }

        /* renamed from: b */
        static FileDescriptor m22464b(FileDescriptor fileDescriptor) {
            try {
                return Os.dup(fileDescriptor);
            } catch (ErrnoException e) {
                throw new IOException("Failed to duplicate file descriptor", e);
            }
        }

        /* renamed from: c */
        static void m22463c(FileDescriptor fileDescriptor, int i, int i2) {
            try {
                Os.lseek(fileDescriptor, i, i2);
            } catch (ErrnoException e) {
                throw new IOException("Failed to seek file descriptor", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0.a$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6516g {

        /* renamed from: a */
        public final long f18420a;

        /* renamed from: b */
        public final long f18421b;

        C6516g(double d) {
            this((long) (d * 10000.0d), 10000L);
        }

        /* renamed from: a */
        public double m22462a() {
            return this.f18420a / this.f18421b;
        }

        public String toString() {
            return this.f18420a + "/" + this.f18421b;
        }

        C6516g(long j, long j2) {
            if (j2 == 0) {
                this.f18420a = 0L;
                this.f18421b = 1L;
                return;
            }
            this.f18420a = j;
            this.f18421b = j2;
        }
    }

    static {
        C6514e[] c6514eArr;
        C6514e[] c6514eArr2 = {new C6514e("NewSubfileType", 254, 4), new C6514e("SubfileType", 255, 4), new C6514e("ImageWidth", 256, 3, 4), new C6514e("ImageLength", 257, 3, 4), new C6514e("BitsPerSample", 258, 3), new C6514e("Compression", 259, 3), new C6514e("PhotometricInterpretation", 262, 3), new C6514e("ImageDescription", 270, 2), new C6514e("Make", 271, 2), new C6514e("Model", 272, 2), new C6514e("StripOffsets", 273, 3, 4), new C6514e("Orientation", 274, 3), new C6514e("SamplesPerPixel", 277, 3), new C6514e("RowsPerStrip", 278, 3, 4), new C6514e("StripByteCounts", 279, 3, 4), new C6514e("XResolution", 282, 5), new C6514e("YResolution", 283, 5), new C6514e("PlanarConfiguration", 284, 3), new C6514e("ResolutionUnit", 296, 3), new C6514e("TransferFunction", 301, 3), new C6514e("Software", 305, 2), new C6514e("DateTime", 306, 2), new C6514e("Artist", 315, 2), new C6514e("WhitePoint", 318, 5), new C6514e("PrimaryChromaticities", 319, 5), new C6514e("SubIFDPointer", 330, 4), new C6514e("JPEGInterchangeFormat", 513, 4), new C6514e("JPEGInterchangeFormatLength", 514, 4), new C6514e("YCbCrCoefficients", 529, 5), new C6514e("YCbCrSubSampling", 530, 3), new C6514e("YCbCrPositioning", 531, 3), new C6514e("ReferenceBlackWhite", 532, 5), new C6514e("Copyright", 33432, 2), new C6514e("ExifIFDPointer", 34665, 4), new C6514e("GPSInfoIFDPointer", 34853, 4), new C6514e("SensorTopBorder", 4, 4), new C6514e("SensorLeftBorder", 5, 4), new C6514e("SensorBottomBorder", 6, 4), new C6514e("SensorRightBorder", 7, 4), new C6514e("ISO", 23, 3), new C6514e("JpgFromRaw", 46, 7), new C6514e("Xmp", TypefaceStyle.BOLD, 1)};
        f18352Y = c6514eArr2;
        C6514e[] c6514eArr3 = {new C6514e("ExposureTime", 33434, 5), new C6514e("FNumber", 33437, 5), new C6514e("ExposureProgram", 34850, 3), new C6514e("SpectralSensitivity", 34852, 2), new C6514e("PhotographicSensitivity", 34855, 3), new C6514e("OECF", 34856, 7), new C6514e("SensitivityType", 34864, 3), new C6514e("StandardOutputSensitivity", 34865, 4), new C6514e("RecommendedExposureIndex", 34866, 4), new C6514e("ISOSpeed", 34867, 4), new C6514e("ISOSpeedLatitudeyyy", 34868, 4), new C6514e("ISOSpeedLatitudezzz", 34869, 4), new C6514e("ExifVersion", 36864, 2), new C6514e("DateTimeOriginal", 36867, 2), new C6514e("DateTimeDigitized", 36868, 2), new C6514e("OffsetTime", 36880, 2), new C6514e("OffsetTimeOriginal", 36881, 2), new C6514e("OffsetTimeDigitized", 36882, 2), new C6514e("ComponentsConfiguration", 37121, 7), new C6514e("CompressedBitsPerPixel", 37122, 5), new C6514e("ShutterSpeedValue", 37377, 10), new C6514e("ApertureValue", 37378, 5), new C6514e("BrightnessValue", 37379, 10), new C6514e("ExposureBiasValue", 37380, 10), new C6514e("MaxApertureValue", 37381, 5), new C6514e("SubjectDistance", 37382, 5), new C6514e("MeteringMode", 37383, 3), new C6514e("LightSource", 37384, 3), new C6514e("Flash", 37385, 3), new C6514e("FocalLength", 37386, 5), new C6514e("SubjectArea", 37396, 3), new C6514e("MakerNote", 37500, 7), new C6514e("UserComment", 37510, 7), new C6514e("SubSecTime", 37520, 2), new C6514e("SubSecTimeOriginal", 37521, 2), new C6514e("SubSecTimeDigitized", 37522, 2), new C6514e("FlashpixVersion", 40960, 7), new C6514e("ColorSpace", 40961, 3), new C6514e("PixelXDimension", 40962, 3, 4), new C6514e("PixelYDimension", 40963, 3, 4), new C6514e("RelatedSoundFile", 40964, 2), new C6514e("InteroperabilityIFDPointer", 40965, 4), new C6514e("FlashEnergy", 41483, 5), new C6514e("SpatialFrequencyResponse", 41484, 7), new C6514e("FocalPlaneXResolution", 41486, 5), new C6514e("FocalPlaneYResolution", 41487, 5), new C6514e("FocalPlaneResolutionUnit", 41488, 3), new C6514e("SubjectLocation", 41492, 3), new C6514e("ExposureIndex", 41493, 5), new C6514e("SensingMethod", 41495, 3), new C6514e("FileSource", 41728, 7), new C6514e("SceneType", 41729, 7), new C6514e("CFAPattern", 41730, 7), new C6514e("CustomRendered", 41985, 3), new C6514e("ExposureMode", 41986, 3), new C6514e("WhiteBalance", 41987, 3), new C6514e("DigitalZoomRatio", 41988, 5), new C6514e("FocalLengthIn35mmFilm", 41989, 3), new C6514e("SceneCaptureType", 41990, 3), new C6514e("GainControl", 41991, 3), new C6514e("Contrast", 41992, 3), new C6514e("Saturation", 41993, 3), new C6514e("Sharpness", 41994, 3), new C6514e("DeviceSettingDescription", 41995, 7), new C6514e("SubjectDistanceRange", 41996, 3), new C6514e("ImageUniqueID", 42016, 2), new C6514e("CameraOwnerName", 42032, 2), new C6514e("BodySerialNumber", 42033, 2), new C6514e("LensSpecification", 42034, 5), new C6514e("LensMake", 42035, 2), new C6514e("LensModel", 42036, 2), new C6514e("Gamma", 42240, 5), new C6514e("DNGVersion", 50706, 1), new C6514e("DefaultCropSize", 50720, 3, 4)};
        f18353Z = c6514eArr3;
        C6514e[] c6514eArr4 = {new C6514e("GPSVersionID", 0, 1), new C6514e("GPSLatitudeRef", 1, 2), new C6514e("GPSLatitude", 2, 5), new C6514e("GPSLongitudeRef", 3, 2), new C6514e("GPSLongitude", 4, 5), new C6514e("GPSAltitudeRef", 5, 1), new C6514e("GPSAltitude", 6, 5), new C6514e("GPSTimeStamp", 7, 5), new C6514e("GPSSatellites", 8, 2), new C6514e("GPSStatus", 9, 2), new C6514e("GPSMeasureMode", 10, 2), new C6514e("GPSDOP", 11, 5), new C6514e("GPSSpeedRef", 12, 2), new C6514e("GPSSpeed", 13, 5), new C6514e("GPSTrackRef", 14, 2), new C6514e("GPSTrack", 15, 5), new C6514e("GPSImgDirectionRef", 16, 2), new C6514e("GPSImgDirection", 17, 5), new C6514e("GPSMapDatum", 18, 2), new C6514e("GPSDestLatitudeRef", 19, 2), new C6514e("GPSDestLatitude", 20, 5), new C6514e("GPSDestLongitudeRef", 21, 2), new C6514e("GPSDestLongitude", 22, 5), new C6514e("GPSDestBearingRef", 23, 2), new C6514e("GPSDestBearing", 24, 5), new C6514e("GPSDestDistanceRef", 25, 2), new C6514e("GPSDestDistance", 26, 5), new C6514e("GPSProcessingMethod", 27, 7), new C6514e("GPSAreaInformation", 28, 7), new C6514e("GPSDateStamp", 29, 2), new C6514e("GPSDifferential", 30, 3), new C6514e("GPSHPositioningError", 31, 5)};
        f18354a0 = c6514eArr4;
        C6514e[] c6514eArr5 = {new C6514e("InteroperabilityIndex", 1, 2)};
        f18355b0 = c6514eArr5;
        C6514e[] c6514eArr6 = {new C6514e("NewSubfileType", 254, 4), new C6514e("SubfileType", 255, 4), new C6514e("ThumbnailImageWidth", 256, 3, 4), new C6514e("ThumbnailImageLength", 257, 3, 4), new C6514e("BitsPerSample", 258, 3), new C6514e("Compression", 259, 3), new C6514e("PhotometricInterpretation", 262, 3), new C6514e("ImageDescription", 270, 2), new C6514e("Make", 271, 2), new C6514e("Model", 272, 2), new C6514e("StripOffsets", 273, 3, 4), new C6514e("ThumbnailOrientation", 274, 3), new C6514e("SamplesPerPixel", 277, 3), new C6514e("RowsPerStrip", 278, 3, 4), new C6514e("StripByteCounts", 279, 3, 4), new C6514e("XResolution", 282, 5), new C6514e("YResolution", 283, 5), new C6514e("PlanarConfiguration", 284, 3), new C6514e("ResolutionUnit", 296, 3), new C6514e("TransferFunction", 301, 3), new C6514e("Software", 305, 2), new C6514e("DateTime", 306, 2), new C6514e("Artist", 315, 2), new C6514e("WhitePoint", 318, 5), new C6514e("PrimaryChromaticities", 319, 5), new C6514e("SubIFDPointer", 330, 4), new C6514e("JPEGInterchangeFormat", 513, 4), new C6514e("JPEGInterchangeFormatLength", 514, 4), new C6514e("YCbCrCoefficients", 529, 5), new C6514e("YCbCrSubSampling", 530, 3), new C6514e("YCbCrPositioning", 531, 3), new C6514e("ReferenceBlackWhite", 532, 5), new C6514e("Copyright", 33432, 2), new C6514e("ExifIFDPointer", 34665, 4), new C6514e("GPSInfoIFDPointer", 34853, 4), new C6514e("DNGVersion", 50706, 1), new C6514e("DefaultCropSize", 50720, 3, 4)};
        f18356c0 = c6514eArr6;
        f18357d0 = new C6514e("StripOffsets", 273, 3);
        C6514e[] c6514eArr7 = {new C6514e("ThumbnailImage", 256, 7), new C6514e("CameraSettingsIFDPointer", 8224, 4), new C6514e("ImageProcessingIFDPointer", 8256, 4)};
        f18358e0 = c6514eArr7;
        C6514e[] c6514eArr8 = {new C6514e("PreviewImageStart", 257, 4), new C6514e("PreviewImageLength", 258, 4)};
        f18359f0 = c6514eArr8;
        C6514e[] c6514eArr9 = {new C6514e("AspectFrame", 4371, 3)};
        f18360g0 = c6514eArr9;
        C6514e[] c6514eArr10 = {new C6514e("ColorSpace", 55, 3)};
        f18361h0 = c6514eArr10;
        C6514e[][] c6514eArr11 = {c6514eArr2, c6514eArr3, c6514eArr4, c6514eArr5, c6514eArr6, c6514eArr2, c6514eArr7, c6514eArr8, c6514eArr9, c6514eArr10};
        f18362i0 = c6514eArr11;
        f18363j0 = new C6514e[]{new C6514e("SubIFDPointer", 330, 4), new C6514e("ExifIFDPointer", 34665, 4), new C6514e("GPSInfoIFDPointer", 34853, 4), new C6514e("InteroperabilityIFDPointer", 40965, 4), new C6514e("CameraSettingsIFDPointer", 8224, 1), new C6514e("ImageProcessingIFDPointer", 8256, 1)};
        f18364k0 = new C6514e("JPEGInterchangeFormat", 513, 4);
        f18365l0 = new C6514e("JPEGInterchangeFormatLength", 514, 4);
        f18366m0 = new HashMap[c6514eArr11.length];
        f18367n0 = new HashMap[c6514eArr11.length];
        f18368o0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f18369p0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f18370q0 = forName;
        f18371r0 = "Exif\u0000\u0000".getBytes(forName);
        f18372s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        f18348U = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C6514e[][] c6514eArr12 = f18362i0;
            if (i < c6514eArr12.length) {
                f18366m0[i] = new HashMap<>();
                f18367n0[i] = new HashMap<>();
                for (C6514e c6514e : c6514eArr12[i]) {
                    f18366m0[i].put(Integer.valueOf(c6514e.f18416a), c6514e);
                    f18367n0[i].put(c6514e.f18417b, c6514e);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f18369p0;
                C6514e[] c6514eArr13 = f18363j0;
                hashMap.put(Integer.valueOf(c6514eArr13[0].f18416a), 5);
                hashMap.put(Integer.valueOf(c6514eArr13[1].f18416a), 1);
                hashMap.put(Integer.valueOf(c6514eArr13[2].f18416a), 2);
                hashMap.put(Integer.valueOf(c6514eArr13[3].f18416a), 3);
                hashMap.put(Integer.valueOf(c6514eArr13[4].f18416a), 7);
                hashMap.put(Integer.valueOf(c6514eArr13[5].f18416a), 8);
                f18373t0 = Pattern.compile(".*[1-9].*");
                f18374u0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public C6509a(File file) {
        C6514e[][] c6514eArr = f18362i0;
        this.f18385f = new HashMap[c6514eArr.length];
        this.f18386g = new HashSet(c6514eArr.length);
        this.f18387h = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            m22551A(file.getAbsolutePath());
            return;
        }
        throw new NullPointerException("file cannot be null");
    }

    /* renamed from: A */
    private void m22551A(String str) {
        FileInputStream fileInputStream;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.f18382c = null;
            this.f18380a = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (m22543I(fileInputStream.getFD())) {
                    this.f18381b = fileInputStream.getFD();
                } else {
                    this.f18381b = null;
                }
                m22538N(fileInputStream);
                m22519d(fileInputStream);
                return;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                m22519d(fileInputStream2);
                throw th;
            }
        }
        throw new NullPointerException("filename cannot be null");
    }

    /* renamed from: B */
    private static boolean m22550B(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f18371r0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f18371r0;
            if (i < bArr3.length) {
                if (bArr2[i] != bArr3[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: C */
    private boolean m22549C(byte[] bArr) {
        C6511b c6511b;
        long readInt;
        byte[] bArr2;
        long j;
        C6511b c6511b2 = null;
        try {
            try {
                c6511b = new C6511b(bArr);
                try {
                    readInt = c6511b.readInt();
                    bArr2 = new byte[4];
                    c6511b.read(bArr2);
                } catch (Exception e) {
                    e = e;
                    c6511b2 = c6511b;
                    if (f18375v) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (c6511b2 != null) {
                        c6511b2.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    c6511b2 = c6511b;
                    if (c6511b2 != null) {
                        c6511b2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (!Arrays.equals(bArr2, f18330C)) {
            c6511b.close();
            return false;
        }
        if (readInt == 1) {
            readInt = c6511b.readLong();
            j = 16;
            if (readInt < 16) {
                c6511b.close();
                return false;
            }
        } else {
            j = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j2 = readInt - j;
        if (j2 < 8) {
            c6511b.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z = false;
        boolean z2 = false;
        for (long j3 = 0; j3 < j2 / 4; j3++) {
            if (c6511b.read(bArr3) != 4) {
                c6511b.close();
                return false;
            }
            if (j3 != 1) {
                if (Arrays.equals(bArr3, f18331D)) {
                    z = true;
                } else if (Arrays.equals(bArr3, f18332E)) {
                    z2 = true;
                }
                if (z && z2) {
                    c6511b.close();
                    return true;
                }
            }
        }
        c6511b.close();
        return false;
    }

    /* renamed from: D */
    private static boolean m22548D(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f18329B;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: E */
    private boolean m22547E(byte[] bArr) {
        C6511b c6511b;
        boolean z = false;
        C6511b c6511b2 = null;
        try {
            c6511b = new C6511b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder m22535Q = m22535Q(c6511b);
            this.f18387h = m22535Q;
            c6511b.m22489m(m22535Q);
            short readShort = c6511b.readShort();
            z = (readShort == 20306 || readShort == 21330) ? true : true;
            c6511b.close();
            return z;
        } catch (Exception unused2) {
            c6511b2 = c6511b;
            if (c6511b2 != null) {
                c6511b2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            c6511b2 = c6511b;
            if (c6511b2 != null) {
                c6511b2.close();
            }
            throw th;
        }
    }

    /* renamed from: F */
    private boolean m22546F(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f18335H;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: G */
    private boolean m22545G(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    private boolean m22544H(byte[] bArr) {
        C6511b c6511b;
        boolean z = false;
        C6511b c6511b2 = null;
        try {
            c6511b = new C6511b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder m22535Q = m22535Q(c6511b);
            this.f18387h = m22535Q;
            c6511b.m22489m(m22535Q);
            if (c6511b.readShort() == 85) {
                z = true;
            }
            c6511b.close();
            return z;
        } catch (Exception unused2) {
            c6511b2 = c6511b;
            if (c6511b2 != null) {
                c6511b2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            c6511b2 = c6511b;
            if (c6511b2 != null) {
                c6511b2.close();
            }
            throw th;
        }
    }

    /* renamed from: I */
    private static boolean m22543I(FileDescriptor fileDescriptor) {
        try {
            C6515f.m22463c(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (f18375v) {
                Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            }
            return false;
        }
    }

    /* renamed from: J */
    private boolean m22542J(HashMap hashMap) {
        C6513d c6513d;
        int m22470m;
        C6513d c6513d2 = (C6513d) hashMap.get("BitsPerSample");
        if (c6513d2 != null) {
            int[] iArr = (int[]) c6513d2.m22468o(this.f18387h);
            int[] iArr2 = f18378y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f18383d == 3 && (c6513d = (C6513d) hashMap.get("PhotometricInterpretation")) != null && (((m22470m = c6513d.m22470m(this.f18387h)) == 1 && Arrays.equals(iArr, f18328A)) || (m22470m == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (f18375v) {
            Log.d("ExifInterface", "Unsupported data type value");
            return false;
        }
        return false;
    }

    /* renamed from: K */
    private boolean m22541K() {
        int i = this.f18383d;
        return i == 4 || i == 13 || i == 14;
    }

    /* renamed from: L */
    private boolean m22540L(HashMap hashMap) {
        C6513d c6513d = (C6513d) hashMap.get("ImageLength");
        C6513d c6513d2 = (C6513d) hashMap.get("ImageWidth");
        if (c6513d != null && c6513d2 != null) {
            int m22470m = c6513d.m22470m(this.f18387h);
            int m22470m2 = c6513d2.m22470m(this.f18387h);
            if (m22470m <= 512 && m22470m2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: M */
    private boolean m22539M(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f18339L;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            } else {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f18340M;
                    if (i2 < bArr3.length) {
                        if (bArr[f18339L.length + i2 + 4] != bArr3[i2]) {
                            return false;
                        }
                        i2++;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    /* renamed from: N */
    private void m22538N(InputStream inputStream) {
        boolean z;
        if (inputStream != null) {
            for (int i = 0; i < f18362i0.length; i++) {
                try {
                    try {
                        this.f18385f[i] = new HashMap<>();
                    } catch (IOException e) {
                        boolean z2 = f18375v;
                        if (z2) {
                            Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                        }
                        m22525a();
                        if (!z2) {
                            return;
                        }
                    }
                } finally {
                    m22525a();
                    if (f18375v) {
                        m22536P();
                    }
                }
            }
            if (!this.f18384e) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                this.f18383d = m22506n(bufferedInputStream);
                inputStream = bufferedInputStream;
            }
            C6511b c6511b = new C6511b(inputStream);
            if (!this.f18384e) {
                switch (this.f18383d) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 11:
                        m22502r(c6511b);
                        break;
                    case 4:
                        m22507m(c6511b, 0, 0);
                        m22525a();
                        if (f18375v) {
                            m22536P();
                            return;
                        }
                        return;
                    case 7:
                        m22505o(c6511b);
                        break;
                    case 9:
                        m22503q(c6511b);
                        m22525a();
                        if (f18375v) {
                            m22536P();
                            return;
                        }
                        return;
                    case 10:
                        m22501s(c6511b);
                        m22525a();
                        if (f18375v) {
                            m22536P();
                            return;
                        }
                        return;
                    case 12:
                        m22508l(c6511b);
                        break;
                    case 13:
                        m22504p(c6511b);
                        m22525a();
                        if (f18375v) {
                            m22536P();
                            return;
                        }
                        return;
                    case 14:
                        m22497w(c6511b);
                        m22525a();
                        if (f18375v) {
                            m22536P();
                            return;
                        }
                        return;
                }
            } else {
                m22500t(c6511b);
            }
            c6511b.m22490j(this.f18395p);
            m22524a0(c6511b);
            if (!z) {
                return;
            }
            return;
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }

    /* renamed from: O */
    private void m22537O(C6511b c6511b, int i) {
        ByteOrder m22535Q = m22535Q(c6511b);
        this.f18387h = m22535Q;
        c6511b.m22489m(m22535Q);
        int readUnsignedShort = c6511b.readUnsignedShort();
        int i2 = this.f18383d;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c6511b.readInt();
        if (readInt >= 8 && readInt < i) {
            int i3 = readInt - 8;
            if (i3 > 0 && c6511b.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid first Ifd offset: " + readInt);
    }

    /* renamed from: P */
    private void m22536P() {
        for (int i = 0; i < this.f18385f.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f18385f[i].size());
            for (Map.Entry<String, C6513d> entry : this.f18385f[i].entrySet()) {
                C6513d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m22469n(this.f18387h) + "'");
            }
        }
    }

    /* renamed from: Q */
    private ByteOrder m22535Q(C6511b c6511b) {
        short readShort = c6511b.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (f18375v) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (f18375v) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    /* renamed from: R */
    private void m22534R(byte[] bArr, int i) {
        C6511b c6511b = new C6511b(bArr);
        m22537O(c6511b, bArr.length);
        m22533S(c6511b, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0266  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m22533S(p110g0.C6509a.C6511b r30, int r31) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p110g0.C6509a.m22533S(g0.a$b, int):void");
    }

    /* renamed from: T */
    private void m22532T(String str) {
        for (int i = 0; i < f18362i0.length; i++) {
            this.f18385f[i].remove(str);
        }
    }

    /* renamed from: U */
    private void m22531U(C6511b c6511b, int i) {
        C6513d c6513d = this.f18385f[i].get("ImageLength");
        C6513d c6513d2 = this.f18385f[i].get("ImageWidth");
        if (c6513d == null || c6513d2 == null) {
            C6513d c6513d3 = this.f18385f[i].get("JPEGInterchangeFormat");
            C6513d c6513d4 = this.f18385f[i].get("JPEGInterchangeFormatLength");
            if (c6513d3 != null && c6513d4 != null) {
                int m22470m = c6513d3.m22470m(this.f18387h);
                int m22470m2 = c6513d3.m22470m(this.f18387h);
                c6511b.m22490j(m22470m);
                byte[] bArr = new byte[m22470m2];
                c6511b.read(bArr);
                m22507m(new C6511b(bArr), m22470m, i);
            }
        }
    }

    /* renamed from: W */
    private void m22529W(InputStream inputStream, OutputStream outputStream) {
        C6513d c6513d;
        if (f18375v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C6512c c6512c = new C6512c(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            c6512c.m22487h(-1);
            if (dataInputStream.readByte() == -40) {
                c6512c.m22487h(-40);
                if (m22510j("Xmp") != null && this.f18400u) {
                    c6513d = this.f18385f[0].remove("Xmp");
                } else {
                    c6513d = null;
                }
                c6512c.m22487h(-1);
                c6512c.m22487h(-31);
                m22514f0(c6512c);
                if (c6513d != null) {
                    this.f18385f[0].put("Xmp", c6513d);
                }
                byte[] bArr = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte != -39 && readByte != -38) {
                        if (readByte != -31) {
                            c6512c.m22487h(-1);
                            c6512c.m22487h(readByte);
                            int readUnsignedShort = dataInputStream.readUnsignedShort();
                            c6512c.m22483o(readUnsignedShort);
                            int i = readUnsignedShort - 2;
                            if (i >= 0) {
                                while (i > 0) {
                                    int read = dataInputStream.read(bArr, 0, Math.min(i, (int) RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT));
                                    if (read >= 0) {
                                        c6512c.write(bArr, 0, read);
                                        i -= read;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                            if (readUnsignedShort2 >= 0) {
                                byte[] bArr2 = new byte[6];
                                if (readUnsignedShort2 >= 6) {
                                    if (dataInputStream.read(bArr2) == 6) {
                                        if (Arrays.equals(bArr2, f18371r0)) {
                                            int i2 = readUnsignedShort2 - 6;
                                            if (dataInputStream.skipBytes(i2) != i2) {
                                                throw new IOException("Invalid length");
                                            }
                                        }
                                    } else {
                                        throw new IOException("Invalid exif");
                                    }
                                }
                                c6512c.m22487h(-1);
                                c6512c.m22487h(readByte);
                                c6512c.m22483o(readUnsignedShort2 + 2);
                                if (readUnsignedShort2 >= 6) {
                                    readUnsignedShort2 -= 6;
                                    c6512c.write(bArr2);
                                }
                                while (readUnsignedShort2 > 0) {
                                    int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, (int) RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT));
                                    if (read2 >= 0) {
                                        c6512c.write(bArr, 0, read2);
                                        readUnsignedShort2 -= read2;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        c6512c.m22487h(-1);
                        c6512c.m22487h(readByte);
                        m22515f(dataInputStream, c6512c);
                        return;
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    /* renamed from: X */
    private void m22528X(InputStream inputStream, OutputStream outputStream) {
        if (f18375v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C6512c c6512c = new C6512c(outputStream, byteOrder);
        byte[] bArr = f18335H;
        m22513g(dataInputStream, c6512c, bArr.length);
        int i = this.f18395p;
        if (i == 0) {
            int readInt = dataInputStream.readInt();
            c6512c.m22486i(readInt);
            m22513g(dataInputStream, c6512c, readInt + 4 + 4);
        } else {
            m22513g(dataInputStream, c6512c, ((i - bArr.length) - 4) - 4);
            dataInputStream.skipBytes(dataInputStream.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C6512c c6512c2 = new C6512c(byteArrayOutputStream2, byteOrder);
                m22514f0(c6512c2);
                byte[] byteArray = ((ByteArrayOutputStream) c6512c2.f18410j).toByteArray();
                c6512c.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                c6512c.m22486i((int) crc32.getValue());
                m22519d(byteArrayOutputStream2);
                m22515f(dataInputStream, c6512c);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                m22519d(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: Y */
    private void m22527Y(InputStream inputStream, OutputStream outputStream) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (f18375v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C6511b c6511b = new C6511b(inputStream, byteOrder);
        C6512c c6512c = new C6512c(outputStream, byteOrder);
        byte[] bArr = f18339L;
        m22513g(c6511b, c6512c, bArr.length);
        byte[] bArr2 = f18340M;
        c6511b.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    C6512c c6512c2 = new C6512c(byteArrayOutputStream2, byteOrder);
                    int i7 = this.f18395p;
                    if (i7 != 0) {
                        m22513g(c6511b, c6512c2, ((i7 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                        c6511b.skipBytes(4);
                        c6511b.skipBytes(c6511b.readInt());
                        m22514f0(c6512c2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (c6511b.read(bArr3) == 4) {
                            byte[] bArr4 = f18343P;
                            boolean z = false;
                            if (Arrays.equals(bArr3, bArr4)) {
                                int readInt = c6511b.readInt();
                                if (readInt % 2 == 1) {
                                    i6 = readInt + 1;
                                } else {
                                    i6 = readInt;
                                }
                                byte[] bArr5 = new byte[i6];
                                c6511b.read(bArr5);
                                byte b = (byte) (8 | bArr5[0]);
                                bArr5[0] = b;
                                if (((b >> 1) & 1) == 1) {
                                    z = true;
                                }
                                c6512c2.write(bArr4);
                                c6512c2.m22486i(readInt);
                                c6512c2.write(bArr5);
                                if (z) {
                                    m22512h(c6511b, c6512c2, f18346S, null);
                                    while (true) {
                                        byte[] bArr6 = new byte[4];
                                        inputStream.read(bArr6);
                                        if (!Arrays.equals(bArr6, f18347T)) {
                                            break;
                                        }
                                        m22511i(c6511b, c6512c2, bArr6);
                                    }
                                    m22514f0(c6512c2);
                                } else {
                                    m22512h(c6511b, c6512c2, f18345R, f18344Q);
                                    m22514f0(c6512c2);
                                }
                            } else {
                                byte[] bArr7 = f18345R;
                                if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f18344Q)) {
                                    int readInt2 = c6511b.readInt();
                                    if (readInt2 % 2 == 1) {
                                        i = readInt2 + 1;
                                    } else {
                                        i = readInt2;
                                    }
                                    byte[] bArr8 = new byte[3];
                                    if (Arrays.equals(bArr3, bArr7)) {
                                        c6511b.read(bArr8);
                                        byte[] bArr9 = new byte[3];
                                        if (c6511b.read(bArr9) == 3 && Arrays.equals(f18342O, bArr9)) {
                                            i2 = c6511b.readInt();
                                            i3 = (i2 << 18) >> 18;
                                            i4 = (i2 << 2) >> 18;
                                            i -= 10;
                                            i5 = 0;
                                        } else {
                                            throw new IOException("Encountered error while checking VP8 signature");
                                        }
                                    } else if (Arrays.equals(bArr3, f18344Q)) {
                                        if (c6511b.readByte() == 47) {
                                            i2 = c6511b.readInt();
                                            i5 = i2 & 8;
                                            i -= 5;
                                            i4 = ((i2 << 4) >> 18) + 1;
                                            i3 = ((i2 << 18) >> 18) + 1;
                                        } else {
                                            throw new IOException("Encountered error while checking VP8L signature");
                                        }
                                    } else {
                                        i2 = 0;
                                        i3 = 0;
                                        i4 = 0;
                                        i5 = 0;
                                    }
                                    c6512c2.write(bArr4);
                                    c6512c2.m22486i(10);
                                    byte[] bArr10 = new byte[10];
                                    byte b2 = (byte) (bArr10[0] | 8);
                                    bArr10[0] = b2;
                                    bArr10[0] = (byte) (b2 | (i5 << 4));
                                    int i8 = i3 - 1;
                                    int i9 = i4 - 1;
                                    bArr10[4] = (byte) i8;
                                    bArr10[5] = (byte) (i8 >> 8);
                                    bArr10[6] = (byte) (i8 >> 16);
                                    bArr10[7] = (byte) i9;
                                    bArr10[8] = (byte) (i9 >> 8);
                                    bArr10[9] = (byte) (i9 >> 16);
                                    c6512c2.write(bArr10);
                                    c6512c2.write(bArr3);
                                    c6512c2.m22486i(readInt2);
                                    if (Arrays.equals(bArr3, bArr7)) {
                                        c6512c2.write(bArr8);
                                        c6512c2.write(f18342O);
                                        c6512c2.m22486i(i2);
                                    } else if (Arrays.equals(bArr3, f18344Q)) {
                                        c6512c2.write(47);
                                        c6512c2.m22486i(i2);
                                    }
                                    m22513g(c6511b, c6512c2, i);
                                    m22514f0(c6512c2);
                                }
                            }
                        } else {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                    }
                    m22515f(c6511b, c6512c2);
                    int size = byteArrayOutputStream2.size();
                    byte[] bArr11 = f18340M;
                    c6512c.m22486i(size + bArr11.length);
                    c6512c.write(bArr11);
                    byteArrayOutputStream2.writeTo(c6512c);
                    m22519d(byteArrayOutputStream2);
                } catch (Exception e) {
                    e = e;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    m22519d(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a */
    private void m22525a() {
        String m22510j = m22510j("DateTimeOriginal");
        if (m22510j != null && m22510j("DateTime") == null) {
            this.f18385f[0].put("DateTime", C6513d.m22478e(m22510j));
        }
        if (m22510j("ImageWidth") == null) {
            this.f18385f[0].put("ImageWidth", C6513d.m22477f(0L, this.f18387h));
        }
        if (m22510j("ImageLength") == null) {
            this.f18385f[0].put("ImageLength", C6513d.m22477f(0L, this.f18387h));
        }
        if (m22510j("Orientation") == null) {
            this.f18385f[0].put("Orientation", C6513d.m22477f(0L, this.f18387h));
        }
        if (m22510j("LightSource") == null) {
            this.f18385f[1].put("LightSource", C6513d.m22477f(0L, this.f18387h));
        }
    }

    /* renamed from: a0 */
    private void m22524a0(C6511b c6511b) {
        HashMap<String, C6513d> hashMap = this.f18385f[4];
        C6513d c6513d = hashMap.get("Compression");
        if (c6513d != null) {
            int m22470m = c6513d.m22470m(this.f18387h);
            this.f18394o = m22470m;
            if (m22470m != 1) {
                if (m22470m != 6) {
                    if (m22470m != 7) {
                        return;
                    }
                } else {
                    m22495y(c6511b, hashMap);
                    return;
                }
            }
            if (m22542J(hashMap)) {
                m22494z(c6511b, hashMap);
                return;
            }
            return;
        }
        this.f18394o = 6;
        m22495y(c6511b, hashMap);
    }

    /* renamed from: b */
    private static String m22523b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb2.toString();
    }

    /* renamed from: b0 */
    private static boolean m22522b0(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static void m22521c(FileDescriptor fileDescriptor) {
        C6515f.m22465a(fileDescriptor);
    }

    /* renamed from: c0 */
    private void m22520c0(int i, int i2) {
        if (!this.f18385f[i].isEmpty() && !this.f18385f[i2].isEmpty()) {
            C6513d c6513d = this.f18385f[i].get("ImageLength");
            C6513d c6513d2 = this.f18385f[i].get("ImageWidth");
            C6513d c6513d3 = this.f18385f[i2].get("ImageLength");
            C6513d c6513d4 = this.f18385f[i2].get("ImageWidth");
            if (c6513d != null && c6513d2 != null) {
                if (c6513d3 != null && c6513d4 != null) {
                    int m22470m = c6513d.m22470m(this.f18387h);
                    int m22470m2 = c6513d2.m22470m(this.f18387h);
                    int m22470m3 = c6513d3.m22470m(this.f18387h);
                    int m22470m4 = c6513d4.m22470m(this.f18387h);
                    if (m22470m < m22470m3 && m22470m2 < m22470m4) {
                        HashMap<String, C6513d>[] hashMapArr = this.f18385f;
                        HashMap<String, C6513d> hashMap = hashMapArr[i];
                        hashMapArr[i] = hashMapArr[i2];
                        hashMapArr[i2] = hashMap;
                    }
                } else if (f18375v) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (f18375v) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (f18375v) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* renamed from: d */
    private static void m22519d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d0 */
    private void m22518d0(C6511b c6511b, int i) {
        C6513d m22473j;
        C6513d m22473j2;
        C6513d c6513d = this.f18385f[i].get("DefaultCropSize");
        C6513d c6513d2 = this.f18385f[i].get("SensorTopBorder");
        C6513d c6513d3 = this.f18385f[i].get("SensorLeftBorder");
        C6513d c6513d4 = this.f18385f[i].get("SensorBottomBorder");
        C6513d c6513d5 = this.f18385f[i].get("SensorRightBorder");
        if (c6513d != null) {
            if (c6513d.f18412a == 5) {
                C6516g[] c6516gArr = (C6516g[]) c6513d.m22468o(this.f18387h);
                if (c6516gArr != null && c6516gArr.length == 2) {
                    m22473j = C6513d.m22475h(c6516gArr[0], this.f18387h);
                    m22473j2 = C6513d.m22475h(c6516gArr[1], this.f18387h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c6516gArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) c6513d.m22468o(this.f18387h);
                if (iArr != null && iArr.length == 2) {
                    m22473j = C6513d.m22473j(iArr[0], this.f18387h);
                    m22473j2 = C6513d.m22473j(iArr[1], this.f18387h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            this.f18385f[i].put("ImageWidth", m22473j);
            this.f18385f[i].put("ImageLength", m22473j2);
        } else if (c6513d2 != null && c6513d3 != null && c6513d4 != null && c6513d5 != null) {
            int m22470m = c6513d2.m22470m(this.f18387h);
            int m22470m2 = c6513d4.m22470m(this.f18387h);
            int m22470m3 = c6513d5.m22470m(this.f18387h);
            int m22470m4 = c6513d3.m22470m(this.f18387h);
            if (m22470m2 > m22470m && m22470m3 > m22470m4) {
                C6513d m22473j3 = C6513d.m22473j(m22470m2 - m22470m, this.f18387h);
                C6513d m22473j4 = C6513d.m22473j(m22470m3 - m22470m4, this.f18387h);
                this.f18385f[i].put("ImageLength", m22473j3);
                this.f18385f[i].put("ImageWidth", m22473j4);
            }
        } else {
            m22531U(c6511b, i);
        }
    }

    /* renamed from: e */
    private static long[] m22517e(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: e0 */
    private void m22516e0() {
        m22520c0(0, 5);
        m22520c0(0, 4);
        m22520c0(5, 4);
        C6513d c6513d = this.f18385f[1].get("PixelXDimension");
        C6513d c6513d2 = this.f18385f[1].get("PixelYDimension");
        if (c6513d != null && c6513d2 != null) {
            this.f18385f[0].put("ImageWidth", c6513d);
            this.f18385f[0].put("ImageLength", c6513d2);
        }
        if (this.f18385f[4].isEmpty() && m22540L(this.f18385f[5])) {
            HashMap<String, C6513d>[] hashMapArr = this.f18385f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m22540L(this.f18385f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: f */
    private static int m22515f(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                i += read;
                outputStream.write(bArr, 0, read);
            } else {
                return i;
            }
        }
    }

    /* renamed from: f0 */
    private int m22514f0(C6512c c6512c) {
        short s;
        C6514e[][] c6514eArr = f18362i0;
        int[] iArr = new int[c6514eArr.length];
        int[] iArr2 = new int[c6514eArr.length];
        for (C6514e c6514e : f18363j0) {
            m22532T(c6514e.f18417b);
        }
        m22532T(f18364k0.f18417b);
        m22532T(f18365l0.f18417b);
        for (int i = 0; i < f18362i0.length; i++) {
            for (Object obj : this.f18385f[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f18385f[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f18385f[1].isEmpty()) {
            this.f18385f[0].put(f18363j0[1].f18417b, C6513d.m22477f(0L, this.f18387h));
        }
        if (!this.f18385f[2].isEmpty()) {
            this.f18385f[0].put(f18363j0[2].f18417b, C6513d.m22477f(0L, this.f18387h));
        }
        if (!this.f18385f[3].isEmpty()) {
            this.f18385f[1].put(f18363j0[3].f18417b, C6513d.m22477f(0L, this.f18387h));
        }
        if (this.f18388i) {
            this.f18385f[4].put(f18364k0.f18417b, C6513d.m22477f(0L, this.f18387h));
            this.f18385f[4].put(f18365l0.f18417b, C6513d.m22477f(this.f18392m, this.f18387h));
        }
        for (int i2 = 0; i2 < f18362i0.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C6513d> entry2 : this.f18385f[i2].entrySet()) {
                int m22467p = entry2.getValue().m22467p();
                if (m22467p > 4) {
                    i3 += m22467p;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < f18362i0.length; i5++) {
            if (!this.f18385f[i5].isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f18385f[i5].size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        if (this.f18388i) {
            this.f18385f[4].put(f18364k0.f18417b, C6513d.m22477f(i4, this.f18387h));
            this.f18391l = i4;
            i4 += this.f18392m;
        }
        if (this.f18383d == 4) {
            i4 += 8;
        }
        if (f18375v) {
            for (int i6 = 0; i6 < f18362i0.length; i6++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(this.f18385f[i6].size()), Integer.valueOf(iArr2[i6]), Integer.valueOf(i4)));
            }
        }
        if (!this.f18385f[1].isEmpty()) {
            this.f18385f[0].put(f18363j0[1].f18417b, C6513d.m22477f(iArr[1], this.f18387h));
        }
        if (!this.f18385f[2].isEmpty()) {
            this.f18385f[0].put(f18363j0[2].f18417b, C6513d.m22477f(iArr[2], this.f18387h));
        }
        if (!this.f18385f[3].isEmpty()) {
            this.f18385f[1].put(f18363j0[3].f18417b, C6513d.m22477f(iArr[3], this.f18387h));
        }
        int i7 = this.f18383d;
        if (i7 != 4) {
            if (i7 != 13) {
                if (i7 == 14) {
                    c6512c.write(f18341N);
                    c6512c.m22486i(i4);
                }
            } else {
                c6512c.m22486i(i4);
                c6512c.write(f18336I);
            }
        } else {
            c6512c.m22483o(i4);
            c6512c.write(f18371r0);
        }
        if (this.f18387h == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        c6512c.m22485j(s);
        c6512c.m22488a(this.f18387h);
        c6512c.m22483o(42);
        c6512c.m22484m(8L);
        for (int i8 = 0; i8 < f18362i0.length; i8++) {
            if (!this.f18385f[i8].isEmpty()) {
                c6512c.m22483o(this.f18385f[i8].size());
                int size = iArr[i8] + 2 + (this.f18385f[i8].size() * 12) + 4;
                for (Map.Entry<String, C6513d> entry3 : this.f18385f[i8].entrySet()) {
                    int i9 = f18367n0[i8].get(entry3.getKey()).f18416a;
                    C6513d value = entry3.getValue();
                    int m22467p2 = value.m22467p();
                    c6512c.m22483o(i9);
                    c6512c.m22483o(value.f18412a);
                    c6512c.m22486i(value.f18413b);
                    if (m22467p2 > 4) {
                        c6512c.m22484m(size);
                        size += m22467p2;
                    } else {
                        c6512c.write(value.f18415d);
                        if (m22467p2 < 4) {
                            while (m22467p2 < 4) {
                                c6512c.m22487h(0);
                                m22467p2++;
                            }
                        }
                    }
                }
                if (i8 == 0 && !this.f18385f[4].isEmpty()) {
                    c6512c.m22484m(iArr[4]);
                } else {
                    c6512c.m22484m(0L);
                }
                for (Map.Entry<String, C6513d> entry4 : this.f18385f[i8].entrySet()) {
                    byte[] bArr = entry4.getValue().f18415d;
                    if (bArr.length > 4) {
                        c6512c.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f18388i) {
            c6512c.write(m22498v());
        }
        if (this.f18383d == 14 && i4 % 2 == 1) {
            c6512c.m22487h(0);
        }
        c6512c.m22488a(ByteOrder.BIG_ENDIAN);
        return i4;
    }

    /* renamed from: g */
    private static void m22513g(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int min = Math.min(i, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    /* renamed from: h */
    private void m22512h(C6511b c6511b, C6512c c6512c, byte[] bArr, byte[] bArr2) {
        Charset charset;
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (c6511b.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                sb2.append(new String(bArr, f18370q0));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
            m22511i(c6511b, c6512c, bArr3);
            if (!Arrays.equals(bArr3, bArr)) {
                if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    private void m22511i(C6511b c6511b, C6512c c6512c, byte[] bArr) {
        int readInt = c6511b.readInt();
        c6512c.write(bArr);
        c6512c.m22486i(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        m22513g(c6511b, c6512c, readInt);
    }

    /* renamed from: k */
    private C6513d m22509k(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f18375v) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i = 0; i < f18362i0.length; i++) {
                C6513d c6513d = this.f18385f[i].get(str);
                if (c6513d != null) {
                    return c6513d;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: l */
    private void m22508l(C6511b c6511b) {
        String str;
        String str2;
        String str3;
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C6510a(c6511b));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            if (str != null) {
                this.f18385f[0].put("ImageWidth", C6513d.m22473j(Integer.parseInt(str), this.f18387h));
            }
            if (str2 != null) {
                this.f18385f[0].put("ImageLength", C6513d.m22473j(Integer.parseInt(str2), this.f18387h));
            }
            if (str3 != null) {
                int parseInt = Integer.parseInt(str3);
                if (parseInt != 90) {
                    if (parseInt != 180) {
                        if (parseInt != 270) {
                            i = 1;
                        } else {
                            i = 8;
                        }
                    } else {
                        i = 3;
                    }
                } else {
                    i = 6;
                }
                this.f18385f[0].put("Orientation", C6513d.m22473j(i, this.f18387h));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    c6511b.m22490j(parseInt2);
                    byte[] bArr = new byte[6];
                    if (c6511b.read(bArr) == 6) {
                        int i2 = parseInt2 + 6;
                        int i3 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f18371r0)) {
                            byte[] bArr2 = new byte[i3];
                            if (c6511b.read(bArr2) == i3) {
                                this.f18395p = i2;
                                m22534R(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f18375v) {
                Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a6, code lost:
        r22.m22489m(r21.f18387h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ab, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[FALL_THROUGH] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m22507m(p110g0.C6509a.C6511b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p110g0.C6509a.m22507m(g0.a$b, int, int):void");
    }

    /* renamed from: n */
    private int m22506n(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m22548D(bArr)) {
            return 4;
        }
        if (m22545G(bArr)) {
            return 9;
        }
        if (m22549C(bArr)) {
            return 12;
        }
        if (m22547E(bArr)) {
            return 7;
        }
        if (m22544H(bArr)) {
            return 10;
        }
        if (m22546F(bArr)) {
            return 13;
        }
        if (m22539M(bArr)) {
            return 14;
        }
        return 0;
    }

    /* renamed from: o */
    private void m22505o(C6511b c6511b) {
        int i;
        int i2;
        m22502r(c6511b);
        C6513d c6513d = this.f18385f[1].get("MakerNote");
        if (c6513d != null) {
            C6511b c6511b2 = new C6511b(c6513d.f18415d);
            c6511b2.m22489m(this.f18387h);
            byte[] bArr = f18333F;
            byte[] bArr2 = new byte[bArr.length];
            c6511b2.readFully(bArr2);
            c6511b2.m22490j(0L);
            byte[] bArr3 = f18334G;
            byte[] bArr4 = new byte[bArr3.length];
            c6511b2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c6511b2.m22490j(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c6511b2.m22490j(12L);
            }
            m22533S(c6511b2, 6);
            C6513d c6513d2 = this.f18385f[7].get("PreviewImageStart");
            C6513d c6513d3 = this.f18385f[7].get("PreviewImageLength");
            if (c6513d2 != null && c6513d3 != null) {
                this.f18385f[5].put("JPEGInterchangeFormat", c6513d2);
                this.f18385f[5].put("JPEGInterchangeFormatLength", c6513d3);
            }
            C6513d c6513d4 = this.f18385f[8].get("AspectFrame");
            if (c6513d4 != null) {
                int[] iArr = (int[]) c6513d4.m22468o(this.f18387h);
                if (iArr != null && iArr.length == 4) {
                    int i3 = iArr[2];
                    int i4 = iArr[0];
                    if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                        int i5 = (i3 - i4) + 1;
                        int i6 = (i - i2) + 1;
                        if (i5 < i6) {
                            int i7 = i5 + i6;
                            i6 = i7 - i6;
                            i5 = i7 - i6;
                        }
                        C6513d m22473j = C6513d.m22473j(i5, this.f18387h);
                        C6513d m22473j2 = C6513d.m22473j(i6, this.f18387h);
                        this.f18385f[0].put("ImageWidth", m22473j);
                        this.f18385f[0].put("ImageLength", m22473j2);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    /* renamed from: p */
    private void m22504p(C6511b c6511b) {
        if (f18375v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c6511b);
        }
        c6511b.mark(0);
        c6511b.m22489m(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f18335H;
        c6511b.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = c6511b.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (c6511b.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16 && !Arrays.equals(bArr2, f18337J)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, f18338K)) {
                        if (Arrays.equals(bArr2, f18336I)) {
                            byte[] bArr3 = new byte[readInt];
                            if (c6511b.read(bArr3) == readInt) {
                                int readInt2 = c6511b.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f18395p = i2;
                                    m22534R(bArr3, 0);
                                    m22516e0();
                                    m22524a0(new C6511b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + m22523b(bArr2));
                        }
                        int i3 = readInt + 4;
                        c6511b.skipBytes(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: q */
    private void m22503q(C6511b c6511b) {
        boolean z = f18375v;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c6511b);
        }
        c6511b.mark(0);
        c6511b.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c6511b.read(bArr);
        c6511b.read(bArr2);
        c6511b.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c6511b.m22490j(i);
        c6511b.read(bArr4);
        m22507m(new C6511b(bArr4), i, 5);
        c6511b.m22490j(i3);
        c6511b.m22489m(ByteOrder.BIG_ENDIAN);
        int readInt = c6511b.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = c6511b.readUnsignedShort();
            int readUnsignedShort2 = c6511b.readUnsignedShort();
            if (readUnsignedShort == f18357d0.f18416a) {
                short readShort = c6511b.readShort();
                short readShort2 = c6511b.readShort();
                C6513d m22473j = C6513d.m22473j(readShort, this.f18387h);
                C6513d m22473j2 = C6513d.m22473j(readShort2, this.f18387h);
                this.f18385f[0].put("ImageLength", m22473j);
                this.f18385f[0].put("ImageWidth", m22473j2);
                if (f18375v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c6511b.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: r */
    private void m22502r(C6511b c6511b) {
        C6513d c6513d;
        m22537O(c6511b, c6511b.available());
        m22533S(c6511b, 0);
        m22518d0(c6511b, 0);
        m22518d0(c6511b, 5);
        m22518d0(c6511b, 4);
        m22516e0();
        if (this.f18383d == 8 && (c6513d = this.f18385f[1].get("MakerNote")) != null) {
            C6511b c6511b2 = new C6511b(c6513d.f18415d);
            c6511b2.m22489m(this.f18387h);
            c6511b2.m22490j(6L);
            m22533S(c6511b2, 9);
            C6513d c6513d2 = this.f18385f[9].get("ColorSpace");
            if (c6513d2 != null) {
                this.f18385f[1].put("ColorSpace", c6513d2);
            }
        }
    }

    /* renamed from: s */
    private void m22501s(C6511b c6511b) {
        if (f18375v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c6511b);
        }
        m22502r(c6511b);
        C6513d c6513d = this.f18385f[0].get("JpgFromRaw");
        if (c6513d != null) {
            m22507m(new C6511b(c6513d.f18415d), (int) c6513d.f18414c, 5);
        }
        C6513d c6513d2 = this.f18385f[0].get("ISO");
        C6513d c6513d3 = this.f18385f[1].get("PhotographicSensitivity");
        if (c6513d2 != null && c6513d3 == null) {
            this.f18385f[1].put("PhotographicSensitivity", c6513d2);
        }
    }

    /* renamed from: t */
    private void m22500t(C6511b c6511b) {
        byte[] bArr = f18371r0;
        c6511b.skipBytes(bArr.length);
        byte[] bArr2 = new byte[c6511b.available()];
        c6511b.readFully(bArr2);
        this.f18395p = bArr.length;
        m22534R(bArr2, 0);
    }

    /* renamed from: w */
    private void m22497w(C6511b c6511b) {
        if (f18375v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c6511b);
        }
        c6511b.mark(0);
        c6511b.m22489m(ByteOrder.LITTLE_ENDIAN);
        c6511b.skipBytes(f18339L.length);
        int readInt = c6511b.readInt() + 8;
        int skipBytes = c6511b.skipBytes(f18340M.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (c6511b.read(bArr) == 4) {
                    int readInt2 = c6511b.readInt();
                    int i = skipBytes + 4 + 4;
                    if (Arrays.equals(f18341N, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (c6511b.read(bArr2) == readInt2) {
                            this.f18395p = i;
                            m22534R(bArr2, 0);
                            m22524a0(new C6511b(bArr2));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m22523b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i2 = i + readInt2;
                    if (i2 == readInt) {
                        return;
                    }
                    if (i2 <= readInt) {
                        int skipBytes2 = c6511b.skipBytes(readInt2);
                        if (skipBytes2 == readInt2) {
                            skipBytes = i + skipBytes2;
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: x */
    private static Pair<Integer, Integer> m22496x(String str) {
        int intValue;
        int i;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> m22496x = m22496x(split[0]);
            if (((Integer) m22496x.first).intValue() == 2) {
                return m22496x;
            }
            for (int i2 = 1; i2 < split.length; i2++) {
                Pair<Integer, Integer> m22496x2 = m22496x(split[i2]);
                if (!((Integer) m22496x2.first).equals(m22496x.first) && !((Integer) m22496x2.second).equals(m22496x.first)) {
                    intValue = -1;
                } else {
                    intValue = ((Integer) m22496x.first).intValue();
                }
                if (((Integer) m22496x.second).intValue() != -1 && (((Integer) m22496x2.first).equals(m22496x.second) || ((Integer) m22496x2.second).equals(m22496x.second))) {
                    i = ((Integer) m22496x.second).intValue();
                } else {
                    i = -1;
                }
                if (intValue == -1 && i == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    m22496x = new Pair<>(Integer.valueOf(i), -1);
                } else if (i == -1) {
                    m22496x = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return m22496x;
        } else if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        } else {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    if (valueOf.longValue() >= 0 && valueOf.longValue() <= 65535) {
                        return new Pair<>(3, 4);
                    }
                    if (valueOf.longValue() < 0) {
                        return new Pair<>(9, -1);
                    }
                    return new Pair<>(4, -1);
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused3) {
                return new Pair<>(2, -1);
            }
        }
    }

    /* renamed from: y */
    private void m22495y(C6511b c6511b, HashMap hashMap) {
        C6513d c6513d = (C6513d) hashMap.get("JPEGInterchangeFormat");
        C6513d c6513d2 = (C6513d) hashMap.get("JPEGInterchangeFormatLength");
        if (c6513d != null && c6513d2 != null) {
            int m22470m = c6513d.m22470m(this.f18387h);
            int m22470m2 = c6513d2.m22470m(this.f18387h);
            if (this.f18383d == 7) {
                m22470m += this.f18396q;
            }
            int min = Math.min(m22470m2, c6511b.m22493a() - m22470m);
            if (m22470m > 0 && min > 0) {
                this.f18388i = true;
                if (this.f18380a == null && this.f18382c == null && this.f18381b == null) {
                    byte[] bArr = new byte[min];
                    c6511b.skip(m22470m);
                    c6511b.read(bArr);
                    this.f18393n = bArr;
                }
                this.f18391l = m22470m;
                this.f18392m = min;
            }
            if (f18375v) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m22470m + ", length: " + min);
            }
        }
    }

    /* renamed from: z */
    private void m22494z(C6511b c6511b, HashMap hashMap) {
        C6513d c6513d = (C6513d) hashMap.get("StripOffsets");
        C6513d c6513d2 = (C6513d) hashMap.get("StripByteCounts");
        if (c6513d != null && c6513d2 != null) {
            long[] m22517e = m22517e(c6513d.m22468o(this.f18387h));
            long[] m22517e2 = m22517e(c6513d2.m22468o(this.f18387h));
            if (m22517e != null && m22517e.length != 0) {
                if (m22517e2 != null && m22517e2.length != 0) {
                    if (m22517e.length != m22517e2.length) {
                        Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                        return;
                    }
                    long j = 0;
                    for (long j2 : m22517e2) {
                        j += j2;
                    }
                    int i = (int) j;
                    byte[] bArr = new byte[i];
                    this.f18390k = true;
                    this.f18389j = true;
                    this.f18388i = true;
                    int i2 = 0;
                    int i3 = 0;
                    for (int i4 = 0; i4 < m22517e.length; i4++) {
                        int i5 = (int) m22517e[i4];
                        int i6 = (int) m22517e2[i4];
                        if (i4 < m22517e.length - 1 && i5 + i6 != m22517e[i4 + 1]) {
                            this.f18390k = false;
                        }
                        int i7 = i5 - i2;
                        if (i7 < 0) {
                            Log.d("ExifInterface", "Invalid strip offset value");
                            return;
                        }
                        long j3 = i7;
                        if (c6511b.skip(j3) != j3) {
                            Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                            return;
                        }
                        int i8 = i2 + i7;
                        byte[] bArr2 = new byte[i6];
                        if (c6511b.read(bArr2) != i6) {
                            Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                            return;
                        }
                        i2 = i8 + i6;
                        System.arraycopy(bArr2, 0, bArr, i3, i6);
                        i3 += i6;
                    }
                    this.f18393n = bArr;
                    if (this.f18390k) {
                        this.f18391l = (int) m22517e[0];
                        this.f18392m = i;
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
        }
    }

    /* renamed from: V */
    public void m22530V() {
        FileOutputStream fileOutputStream;
        File createTempFile;
        FileInputStream fileInputStream;
        Throwable th2;
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream2;
        Exception exc;
        if (m22541K()) {
            if (this.f18381b == null && this.f18380a == null) {
                throw new IOException("ExifInterface does not support saving attributes for the current input.");
            }
            this.f18399t = true;
            this.f18393n = m22499u();
            BufferedInputStream bufferedInputStream = null;
            try {
                createTempFile = File.createTempFile("temp", "tmp");
                if (this.f18380a != null) {
                    fileInputStream = new FileInputStream(this.f18380a);
                } else {
                    FileDescriptor fileDescriptor = this.f18381b;
                    if (fileDescriptor != null) {
                        C6515f.m22463c(fileDescriptor, 0, OsConstants.SEEK_SET);
                        fileInputStream = new FileInputStream(this.f18381b);
                    } else {
                        fileInputStream = null;
                    }
                }
                try {
                    fileOutputStream = new FileOutputStream(createTempFile);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
            try {
                m22515f(fileInputStream, fileOutputStream);
                m22519d(fileInputStream);
                m22519d(fileOutputStream);
                try {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(createTempFile);
                        if (this.f18380a != null) {
                            fileOutputStream2 = new FileOutputStream(this.f18380a);
                        } else {
                            FileDescriptor fileDescriptor2 = this.f18381b;
                            if (fileDescriptor2 != null) {
                                C6515f.m22463c(fileDescriptor2, 0, OsConstants.SEEK_SET);
                                fileOutputStream2 = new FileOutputStream(this.f18381b);
                            } else {
                                fileOutputStream2 = null;
                            }
                        }
                        try {
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream2);
                            try {
                                bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                            } catch (Exception e3) {
                                bufferedOutputStream = null;
                                bufferedInputStream = bufferedInputStream2;
                                exc = e3;
                            } catch (Throwable th5) {
                                th2 = th5;
                                bufferedOutputStream = null;
                            }
                            try {
                                int i = this.f18383d;
                                if (i == 4) {
                                    m22529W(bufferedInputStream2, bufferedOutputStream);
                                } else if (i == 13) {
                                    m22528X(bufferedInputStream2, bufferedOutputStream);
                                } else if (i == 14) {
                                    m22527Y(bufferedInputStream2, bufferedOutputStream);
                                }
                                m22519d(bufferedInputStream2);
                                m22519d(bufferedOutputStream);
                                createTempFile.delete();
                                this.f18393n = null;
                            } catch (Exception e4) {
                                exc = e4;
                                bufferedInputStream = bufferedInputStream2;
                                try {
                                    m22519d(bufferedInputStream);
                                    m22519d(bufferedOutputStream);
                                    FileInputStream fileInputStream3 = new FileInputStream(createTempFile);
                                    if (this.f18380a == null) {
                                        FileDescriptor fileDescriptor3 = this.f18381b;
                                        if (fileDescriptor3 != null) {
                                            try {
                                                C6515f.m22463c(fileDescriptor3, 0, OsConstants.SEEK_SET);
                                                fileOutputStream2 = new FileOutputStream(this.f18381b);
                                            } catch (Exception e5) {
                                                throw new IOException("Failed to save new file. Original file may be corrupted since error occurred while trying to restore it.", e5);
                                            }
                                        }
                                    } else {
                                        fileOutputStream2 = new FileOutputStream(this.f18380a);
                                    }
                                    m22515f(fileInputStream3, fileOutputStream2);
                                    m22519d(fileInputStream3);
                                    m22519d(fileOutputStream2);
                                    throw new IOException("Failed to save new file", exc);
                                } catch (Throwable th6) {
                                    th2 = th6;
                                    m22519d(bufferedInputStream);
                                    m22519d(bufferedOutputStream);
                                    createTempFile.delete();
                                    throw th2;
                                }
                            } catch (Throwable th7) {
                                th2 = th7;
                                bufferedInputStream = bufferedInputStream2;
                                m22519d(bufferedInputStream);
                                m22519d(bufferedOutputStream);
                                createTempFile.delete();
                                throw th2;
                            }
                        } catch (Exception e6) {
                            exc = e6;
                            bufferedOutputStream = null;
                        }
                    } catch (Throwable th8) {
                        th2 = th8;
                        bufferedOutputStream = null;
                    }
                } catch (Exception e7) {
                    fileOutputStream2 = null;
                    exc = e7;
                    bufferedOutputStream = null;
                }
            } catch (Exception e8) {
                e = e8;
                bufferedInputStream = fileInputStream;
                try {
                    throw new IOException("Failed to copy original file to temp file", e);
                } catch (Throwable th9) {
                    th = th9;
                    m22519d(bufferedInputStream);
                    m22519d(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th10) {
                th = th10;
                bufferedInputStream = fileInputStream;
                m22519d(bufferedInputStream);
                m22519d(fileOutputStream);
                throw th;
            }
        } else {
            throw new IOException("ExifInterface only supports saving attributes on JPEG, PNG, or WebP formats.");
        }
    }

    /* renamed from: Z */
    public void m22526Z(String str, String str2) {
        C6514e c6514e;
        int i;
        String str3;
        int i2;
        String str4;
        String str5;
        Matcher matcher;
        String str6 = str;
        String str7 = str2;
        if (str6 != null) {
            String str8 = "ExifInterface";
            if ("ISOSpeedRatings".equals(str6)) {
                if (f18375v) {
                    Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str6 = "PhotographicSensitivity";
            }
            int i3 = 2;
            int i4 = 1;
            if (str7 != null && f18368o0.contains(str6)) {
                if (str6.equals("GPSTimeStamp")) {
                    if (!f18374u0.matcher(str7).find()) {
                        Log.w("ExifInterface", "Invalid value for " + str6 + " : " + str7);
                        return;
                    }
                    str7 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                } else {
                    try {
                        str7 = new C6516g(Double.parseDouble(str2)).toString();
                    } catch (NumberFormatException unused) {
                        Log.w("ExifInterface", "Invalid value for " + str6 + " : " + str7);
                        return;
                    }
                }
            }
            int i5 = 0;
            int i6 = 0;
            while (i6 < f18362i0.length) {
                if ((i6 != 4 || this.f18388i) && (c6514e = f18367n0[i6].get(str6)) != null) {
                    if (str7 == null) {
                        this.f18385f[i6].remove(str6);
                    } else {
                        Pair<Integer, Integer> m22496x = m22496x(str7);
                        int i7 = -1;
                        if (c6514e.f18418c != ((Integer) m22496x.first).intValue() && c6514e.f18418c != ((Integer) m22496x.second).intValue()) {
                            int i8 = c6514e.f18419d;
                            if (i8 != -1 && (i8 == ((Integer) m22496x.first).intValue() || c6514e.f18419d == ((Integer) m22496x.second).intValue())) {
                                i = c6514e.f18419d;
                            } else {
                                int i9 = c6514e.f18418c;
                                if (i9 != i4 && i9 != 7 && i9 != i3) {
                                    if (f18375v) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Given tag (");
                                        sb2.append(str6);
                                        sb2.append(") value didn't match with one of expected formats: ");
                                        String[] strArr = f18349V;
                                        sb2.append(strArr[c6514e.f18418c]);
                                        String str9 = "";
                                        if (c6514e.f18419d == -1) {
                                            str5 = "";
                                        } else {
                                            str5 = ", " + strArr[c6514e.f18419d];
                                        }
                                        sb2.append(str5);
                                        sb2.append(" (guess: ");
                                        sb2.append(strArr[((Integer) m22496x.first).intValue()]);
                                        if (((Integer) m22496x.second).intValue() != -1) {
                                            str9 = ", " + strArr[((Integer) m22496x.second).intValue()];
                                        }
                                        sb2.append(str9);
                                        sb2.append(")");
                                        Log.d(str8, sb2.toString());
                                    }
                                } else {
                                    i = i9;
                                }
                            }
                        } else {
                            i = c6514e.f18418c;
                        }
                        switch (i) {
                            case 1:
                                str3 = str8;
                                i2 = i4;
                                this.f18385f[i6].put(str6, C6513d.m22482a(str7));
                                str8 = str3;
                                break;
                            case 2:
                            case 7:
                                str3 = str8;
                                i2 = i4;
                                this.f18385f[i6].put(str6, C6513d.m22478e(str7));
                                str8 = str3;
                                break;
                            case 3:
                                str3 = str8;
                                i2 = i4;
                                String[] split = str7.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i10 = 0; i10 < split.length; i10++) {
                                    iArr[i10] = Integer.parseInt(split[i10]);
                                }
                                this.f18385f[i6].put(str6, C6513d.m22472k(iArr, this.f18387h));
                                str8 = str3;
                                break;
                            case 4:
                                str3 = str8;
                                i2 = i4;
                                String[] split2 = str7.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i11 = 0; i11 < split2.length; i11++) {
                                    jArr[i11] = Long.parseLong(split2[i11]);
                                }
                                this.f18385f[i6].put(str6, C6513d.m22476g(jArr, this.f18387h));
                                str8 = str3;
                                break;
                            case 5:
                                str3 = str8;
                                String[] split3 = str7.split(",", -1);
                                C6516g[] c6516gArr = new C6516g[split3.length];
                                int i12 = 0;
                                while (i12 < split3.length) {
                                    String[] split4 = split3[i12].split("/", i7);
                                    c6516gArr[i12] = new C6516g((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                    i12++;
                                    i7 = -1;
                                }
                                i2 = 1;
                                this.f18385f[i6].put(str6, C6513d.m22474i(c6516gArr, this.f18387h));
                                str8 = str3;
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                str3 = str8;
                                i2 = i4;
                                if (f18375v) {
                                    str8 = str3;
                                    Log.d(str8, "Data format isn't one of expected formats: " + i);
                                    break;
                                }
                                str8 = str3;
                                break;
                            case 9:
                                str4 = str8;
                                String[] split5 = str7.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i13 = 0; i13 < split5.length; i13++) {
                                    iArr2[i13] = Integer.parseInt(split5[i13]);
                                }
                                this.f18385f[i6].put(str6, C6513d.m22480c(iArr2, this.f18387h));
                                str8 = str4;
                                i2 = 1;
                                break;
                            case 10:
                                String[] split6 = str7.split(",", -1);
                                C6516g[] c6516gArr2 = new C6516g[split6.length];
                                int i14 = i5;
                                while (i14 < split6.length) {
                                    String[] split7 = split6[i14].split("/", -1);
                                    c6516gArr2[i14] = new C6516g((long) Double.parseDouble(split7[i5]), (long) Double.parseDouble(split7[i4]));
                                    i14++;
                                    str8 = str8;
                                    i4 = 1;
                                    i5 = 0;
                                }
                                str4 = str8;
                                this.f18385f[i6].put(str6, C6513d.m22479d(c6516gArr2, this.f18387h));
                                str8 = str4;
                                i2 = 1;
                                break;
                            case 12:
                                String[] split8 = str7.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i15 = i5; i15 < split8.length; i15++) {
                                    dArr[i15] = Double.parseDouble(split8[i15]);
                                }
                                this.f18385f[i6].put(str6, C6513d.m22481b(dArr, this.f18387h));
                                break;
                        }
                        i6++;
                        i4 = i2;
                        i3 = 2;
                        i5 = 0;
                    }
                }
                i2 = i4;
                i6++;
                i4 = i2;
                i3 = 2;
                i5 = 0;
            }
            return;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: j */
    public String m22510j(String str) {
        if (str != null) {
            C6513d m22509k = m22509k(str);
            if (m22509k != null) {
                if (!f18368o0.contains(str)) {
                    return m22509k.m22469n(this.f18387h);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i = m22509k.f18412a;
                    if (i != 5 && i != 10) {
                        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + m22509k.f18412a);
                        return null;
                    }
                    C6516g[] c6516gArr = (C6516g[]) m22509k.m22468o(this.f18387h);
                    if (c6516gArr != null && c6516gArr.length == 3) {
                        C6516g c6516g = c6516gArr[0];
                        C6516g c6516g2 = c6516gArr[1];
                        C6516g c6516g3 = c6516gArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) c6516g.f18420a) / ((float) c6516g.f18421b))), Integer.valueOf((int) (((float) c6516g2.f18420a) / ((float) c6516g2.f18421b))), Integer.valueOf((int) (((float) c6516g3.f18420a) / ((float) c6516g3.f18421b))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c6516gArr));
                    return null;
                }
                try {
                    return Double.toString(m22509k.m22471l(this.f18387h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: u */
    public byte[] m22499u() {
        int i = this.f18394o;
        if (i != 6 && i != 7) {
            return null;
        }
        return m22498v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e A[Catch: Exception -> 0x0097, all -> 0x00b4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b4, blocks: (B:35:0x005e, B:38:0x0074, B:40:0x0080, B:45:0x008b, B:46:0x0090, B:47:0x0091, B:48:0x0096, B:51:0x0099, B:52:0x009e, B:57:0x00a6), top: B:68:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099 A[Catch: Exception -> 0x0097, all -> 0x00b4, TryCatch #1 {all -> 0x00b4, blocks: (B:35:0x005e, B:38:0x0074, B:40:0x0080, B:45:0x008b, B:46:0x0090, B:47:0x0091, B:48:0x0096, B:51:0x0099, B:52:0x009e, B:57:0x00a6), top: B:68:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] m22498v() {
        /*
            Method dump skipped, instructions count: 191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p110g0.C6509a.m22498v():byte[]");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6514e {

        /* renamed from: a */
        public final int f18416a;

        /* renamed from: b */
        public final String f18417b;

        /* renamed from: c */
        public final int f18418c;

        /* renamed from: d */
        public final int f18419d;

        C6514e(String str, int i, int i2) {
            this.f18417b = str;
            this.f18416a = i;
            this.f18418c = i2;
            this.f18419d = -1;
        }

        /* renamed from: a */
        boolean m22466a(int i) {
            int i2;
            int i3 = this.f18418c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f18419d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            if ((i3 == 12 || i2 == 12) && i == 11) {
                return true;
            }
            return false;
        }

        C6514e(String str, int i, int i2, int i3) {
            this.f18417b = str;
            this.f18416a = i;
            this.f18418c = i2;
            this.f18419d = i3;
        }
    }

    public C6509a(String str) {
        C6514e[][] c6514eArr = f18362i0;
        this.f18385f = new HashMap[c6514eArr.length];
        this.f18386g = new HashSet(c6514eArr.length);
        this.f18387h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            m22551A(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public C6509a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public C6509a(InputStream inputStream, int i) {
        C6514e[][] c6514eArr = f18362i0;
        this.f18385f = new HashMap[c6514eArr.length];
        this.f18386g = new HashSet(c6514eArr.length);
        this.f18387h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f18380a = null;
            if (i == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                if (!m22550B(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f18384e = true;
                this.f18382c = null;
                this.f18381b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f18382c = (AssetManager.AssetInputStream) inputStream;
                this.f18381b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m22543I(fileInputStream.getFD())) {
                        this.f18382c = null;
                        this.f18381b = fileInputStream.getFD();
                    }
                }
                this.f18382c = null;
                this.f18381b = null;
            }
            m22538N(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
