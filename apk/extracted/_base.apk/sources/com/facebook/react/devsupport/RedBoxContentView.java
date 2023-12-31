package com.facebook.react.devsupport;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.react.C3893R;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorType;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.util.JSStackTrace;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;
import p058d5.C5743a;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RedBoxContentView extends LinearLayout implements AdapterView.OnItemClickListener {
    private boolean isReporting;
    private DevSupportManager mDevSupportManager;
    private Button mDismissButton;
    private View mLineSeparator;
    private ProgressBar mLoadingIndicator;
    private RedBoxHandler mRedBoxHandler;
    private Button mReloadJsButton;
    private Button mReportButton;
    private View.OnClickListener mReportButtonOnClickListener;
    private RedBoxHandler.ReportCompletedListener mReportCompletedListener;
    private TextView mReportTextView;
    private ListView mStackView;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class OpenStackFrameTask extends AsyncTask<StackFrame, Void, Void> {
        private static final MediaType JSON = MediaType.m8839f("application/json; charset=utf-8");
        private final DevSupportManager mDevSupportManager;

        private OpenStackFrameTask(DevSupportManager devSupportManager) {
            this.mDevSupportManager = devSupportManager;
        }

        private static JSONObject stackFrameToJson(StackFrame stackFrame) {
            return new JSONObject(MapBuilder.m30467of(JSStackTrace.FILE_KEY, stackFrame.getFile(), JSStackTrace.METHOD_NAME_KEY, stackFrame.getMethod(), "lineNumber", Integer.valueOf(stackFrame.getLine()), "column", Integer.valueOf(stackFrame.getColumn())));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(StackFrame... stackFrameArr) {
            try {
                String uri = Uri.parse(this.mDevSupportManager.getSourceUrl()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                OkHttpClient okHttpClient = new OkHttpClient();
                for (StackFrame stackFrame : stackFrameArr) {
                    okHttpClient.mo8811b(new Request.Builder().m8722l(uri).m8726h(RequestBody.create(JSON, stackFrameToJson(stackFrame).toString())).m8732b()).execute();
                }
            } catch (Exception e) {
                C13677a.m1853k(ReactConstants.TAG, "Could not open stack frame", e);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class StackAdapter extends BaseAdapter {
        private static final int VIEW_TYPE_COUNT = 2;
        private static final int VIEW_TYPE_STACKFRAME = 1;
        private static final int VIEW_TYPE_TITLE = 0;
        private final StackFrame[] mStack;
        private final String mTitle;

        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        private static class FrameViewHolder {
            private final TextView mFileView;
            private final TextView mMethodView;

            private FrameViewHolder(View view) {
                this.mMethodView = (TextView) view.findViewById(C3893R.C3895id.rn_frame_method);
                this.mFileView = (TextView) view.findViewById(C3893R.C3895id.rn_frame_file);
            }
        }

        public StackAdapter(String str, StackFrame[] stackFrameArr) {
            this.mTitle = str;
            this.mStack = stackFrameArr;
            C5743a.m24583c(str);
            C5743a.m24583c(stackFrameArr);
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.mStack.length + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return i == 0 ? this.mTitle : this.mStack[i - 1];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2;
            int i3;
            TextView textView;
            if (i == 0) {
                if (view != null) {
                    textView = (TextView) view;
                } else {
                    textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C3893R.layout.redbox_item_title, viewGroup, false);
                }
                String str = this.mTitle;
                if (str == null) {
                    str = "<unknown title>";
                }
                textView.setText(str.replaceAll("\\x1b\\[[0-9;]*m", ""));
                return textView;
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C3893R.layout.redbox_item_frame, viewGroup, false);
                view.setTag(new FrameViewHolder(view));
            }
            StackFrame stackFrame = this.mStack[i - 1];
            FrameViewHolder frameViewHolder = (FrameViewHolder) view.getTag();
            frameViewHolder.mMethodView.setText(stackFrame.getMethod());
            frameViewHolder.mFileView.setText(StackTraceHelper.formatFrameSource(stackFrame));
            TextView textView2 = frameViewHolder.mMethodView;
            if (stackFrame.isCollapsed()) {
                i2 = -5592406;
            } else {
                i2 = -1;
            }
            textView2.setTextColor(i2);
            TextView textView3 = frameViewHolder.mFileView;
            if (stackFrame.isCollapsed()) {
                i3 = -8355712;
            } else {
                i3 = -5000269;
            }
            textView3.setTextColor(i3);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return i > 0;
        }
    }

    public RedBoxContentView(Context context) {
        super(context);
        this.isReporting = false;
        this.mReportCompletedListener = new RedBoxHandler.ReportCompletedListener() { // from class: com.facebook.react.devsupport.RedBoxContentView.1
            @Override // com.facebook.react.devsupport.interfaces.RedBoxHandler.ReportCompletedListener
            public void onReportError(SpannedString spannedString) {
                RedBoxContentView.this.isReporting = false;
                ((Button) C5743a.m24583c(RedBoxContentView.this.mReportButton)).setEnabled(true);
                ((ProgressBar) C5743a.m24583c(RedBoxContentView.this.mLoadingIndicator)).setVisibility(8);
                ((TextView) C5743a.m24583c(RedBoxContentView.this.mReportTextView)).setText(spannedString);
            }

            @Override // com.facebook.react.devsupport.interfaces.RedBoxHandler.ReportCompletedListener
            public void onReportSuccess(SpannedString spannedString) {
                RedBoxContentView.this.isReporting = false;
                ((Button) C5743a.m24583c(RedBoxContentView.this.mReportButton)).setEnabled(true);
                ((ProgressBar) C5743a.m24583c(RedBoxContentView.this.mLoadingIndicator)).setVisibility(8);
                ((TextView) C5743a.m24583c(RedBoxContentView.this.mReportTextView)).setText(spannedString);
            }
        };
        this.mReportButtonOnClickListener = new View.OnClickListener() { // from class: com.facebook.react.devsupport.RedBoxContentView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (RedBoxContentView.this.mRedBoxHandler != null && RedBoxContentView.this.mRedBoxHandler.isReportEnabled() && !RedBoxContentView.this.isReporting) {
                    RedBoxContentView.this.isReporting = true;
                    ((TextView) C5743a.m24583c(RedBoxContentView.this.mReportTextView)).setText("Reporting...");
                    ((TextView) C5743a.m24583c(RedBoxContentView.this.mReportTextView)).setVisibility(0);
                    ((ProgressBar) C5743a.m24583c(RedBoxContentView.this.mLoadingIndicator)).setVisibility(0);
                    ((View) C5743a.m24583c(RedBoxContentView.this.mLineSeparator)).setVisibility(0);
                    ((Button) C5743a.m24583c(RedBoxContentView.this.mReportButton)).setEnabled(false);
                    RedBoxContentView.this.mRedBoxHandler.reportRedbox(view.getContext(), (String) C5743a.m24583c(RedBoxContentView.this.mDevSupportManager.getLastErrorTitle()), (StackFrame[]) C5743a.m24583c(RedBoxContentView.this.mDevSupportManager.getLastErrorStack()), RedBoxContentView.this.mDevSupportManager.getSourceUrl(), (RedBoxHandler.ReportCompletedListener) C5743a.m24583c(RedBoxContentView.this.mReportCompletedListener));
                }
            }
        };
    }

    public void init() {
        LayoutInflater.from(getContext()).inflate(C3893R.layout.redbox_view, this);
        ListView listView = (ListView) findViewById(C3893R.C3895id.rn_redbox_stack);
        this.mStackView = listView;
        listView.setOnItemClickListener(this);
        Button button = (Button) findViewById(C3893R.C3895id.rn_redbox_reload_button);
        this.mReloadJsButton = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.RedBoxContentView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((DevSupportManager) C5743a.m24583c(RedBoxContentView.this.mDevSupportManager)).handleReloadJS();
            }
        });
        Button button2 = (Button) findViewById(C3893R.C3895id.rn_redbox_dismiss_button);
        this.mDismissButton = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.RedBoxContentView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((DevSupportManager) C5743a.m24583c(RedBoxContentView.this.mDevSupportManager)).hideRedboxDialog();
            }
        });
        RedBoxHandler redBoxHandler = this.mRedBoxHandler;
        if (redBoxHandler != null && redBoxHandler.isReportEnabled()) {
            this.mLoadingIndicator = (ProgressBar) findViewById(C3893R.C3895id.rn_redbox_loading_indicator);
            this.mLineSeparator = findViewById(C3893R.C3895id.rn_redbox_line_separator);
            TextView textView = (TextView) findViewById(C3893R.C3895id.rn_redbox_report_label);
            this.mReportTextView = textView;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            this.mReportTextView.setHighlightColor(0);
            Button button3 = (Button) findViewById(C3893R.C3895id.rn_redbox_report_button);
            this.mReportButton = button3;
            button3.setOnClickListener(this.mReportButtonOnClickListener);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new OpenStackFrameTask((DevSupportManager) C5743a.m24583c(this.mDevSupportManager)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (StackFrame) this.mStackView.getAdapter().getItem(i));
    }

    public void refreshContentView() {
        String lastErrorTitle = this.mDevSupportManager.getLastErrorTitle();
        StackFrame[] lastErrorStack = this.mDevSupportManager.getLastErrorStack();
        ErrorType lastErrorType = this.mDevSupportManager.getLastErrorType();
        Pair<String, StackFrame[]> processErrorCustomizers = this.mDevSupportManager.processErrorCustomizers(Pair.create(lastErrorTitle, lastErrorStack));
        setExceptionDetails((String) processErrorCustomizers.first, (StackFrame[]) processErrorCustomizers.second);
        RedBoxHandler redBoxHandler = this.mDevSupportManager.getRedBoxHandler();
        if (redBoxHandler != null) {
            redBoxHandler.handleRedbox(lastErrorTitle, lastErrorStack, lastErrorType);
            resetReporting();
        }
    }

    public void resetReporting() {
        RedBoxHandler redBoxHandler = this.mRedBoxHandler;
        if (redBoxHandler != null && redBoxHandler.isReportEnabled()) {
            this.isReporting = false;
            ((TextView) C5743a.m24583c(this.mReportTextView)).setVisibility(8);
            ((ProgressBar) C5743a.m24583c(this.mLoadingIndicator)).setVisibility(8);
            ((View) C5743a.m24583c(this.mLineSeparator)).setVisibility(8);
            ((Button) C5743a.m24583c(this.mReportButton)).setVisibility(0);
            ((Button) C5743a.m24583c(this.mReportButton)).setEnabled(true);
        }
    }

    public RedBoxContentView setDevSupportManager(DevSupportManager devSupportManager) {
        this.mDevSupportManager = devSupportManager;
        return this;
    }

    public void setExceptionDetails(String str, StackFrame[] stackFrameArr) {
        this.mStackView.setAdapter((ListAdapter) new StackAdapter(str, stackFrameArr));
    }

    public RedBoxContentView setRedBoxHandler(RedBoxHandler redBoxHandler) {
        this.mRedBoxHandler = redBoxHandler;
        return this;
    }
}
