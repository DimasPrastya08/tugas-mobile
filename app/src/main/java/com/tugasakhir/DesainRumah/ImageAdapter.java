package com.tugasakhir.DesainRumah;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public int[] imageArray = {
            R.drawable.interior1,R.drawable.interior2,
            R.drawable.interior3,R.drawable.interior4,
            R.drawable.interior5,R.drawable.interior6,
            R.drawable.interior7,R.drawable.interior8,
            R.drawable.interior9,R.drawable.interior10,
            R.drawable.interior11,R.drawable.interior12,
            R.drawable.tamuklasik,R.drawable.tamuminimalis,
            R.drawable.tamumodern,R.drawable.tamumodern2,
            R.drawable.keluargaklasik,R.drawable.keluargaminimalis,
            R.drawable.keluargamodern,R.drawable.keluargamodern2,
            R.drawable.kamarklasik,R.drawable.kamarminimalis,
            R.drawable.kamarmodern,R.drawable.mandiminimalis,
            R.drawable.mandimodern,R.drawable.toiletklasik,
            R.drawable.toiletminimalis,R.drawable.toiletmodern,
            R.drawable.kerjaminimalis,R.drawable.kerjamodern,
            R.drawable.interior13,R.drawable.interior14,
            R.drawable.interior15,R.drawable.interior16,
            R.drawable.eksterior1,R.drawable.eksterior2,
            R.drawable.eksterior3,R.drawable.eksterior4,
            R.drawable.eksterior5,R.drawable.eksterior6,
            R.drawable.interior1,R.drawable.interior2,
            R.drawable.tamuklasik,R.drawable.tamuminimalis,
            R.drawable.tamumodern,R.drawable.tamumodern2,
            R.drawable.keluargaklasik,R.drawable.keluargaminimalis,
            R.drawable.keluargamodern,R.drawable.keluargamodern2,
            R.drawable.kamarklasik,R.drawable.kamarminimalis,
            R.drawable.kamarmodern,R.drawable.mandiminimalis,
            R.drawable.mandimodern,R.drawable.toiletklasik,
            R.drawable.toiletminimalis,R.drawable.toiletmodern,
            R.drawable.kerjaminimalis,R.drawable.kerjamodern
    };

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340,350));

        return imageView;
    }
}
