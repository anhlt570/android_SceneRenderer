package com.tuananh2.scenerenderer;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }

   private class MyView extends View
    {
        private Paint m_BitmapPaint;
        private Resources m_Resources;
        private MyView(Context context)
        {
            super(context);
            m_BitmapPaint = new Paint();
            m_Resources = getResources();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#ffffff"));
            canvas.drawCircle(100,100,53,paint);

            Bitmap bitmap = BitmapFactory.decodeResource(m_Resources,R.drawable.asphalt8_logo);
            canvas.drawBitmap(bitmap,500,500,m_BitmapPaint);
        }
    }

}
