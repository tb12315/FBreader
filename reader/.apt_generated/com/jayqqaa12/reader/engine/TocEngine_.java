//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.jayqqaa12.reader.engine;

import android.content.Context;
import com.jayqqaa12.abase.core.ADao_;
import com.jayqqaa12.abase.core.listener.OnLoadStatusListener;
import org.androidannotations.api.BackgroundExecutor;
import org.geometerplus.zlibrary.text.model.ZLTextModel;

public final class TocEngine_
    extends TocEngine
{

    private Context context_;

    private TocEngine_(Context context) {
        context_ = context;
        init_();
    }

    public static TocEngine_ getInstance_(Context context) {
        return new TocEngine_(context);
    }

    private void init_() {
        dao = ADao_.getInstance_(context_);
    }

    public void rebind(Context context) {
        context_ = context;
        init_();
    }

    @Override
    public void readToc(final ZLTextModel zlTextModel, final OnLoadStatusListener callback) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    TocEngine_.super.readToc(zlTextModel, callback);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

}
