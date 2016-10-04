package auspost.com.au.quake.dataadapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import auspost.com.au.quake.R;

/**
 * Created by raghunandanangara on 4/10/2016.
 */

public class EarthQuakeViewHolder extends RecyclerView.ViewHolder {

    TextView tvRegion;
    TextView tvLat;
    TextView tvLog;
    TextView tvMagnitude;
    TextView tvDepth;

    EarthQuakeViewHolder(View itemView)
    {
        super(itemView);
        tvRegion = (TextView) itemView.findViewById(R.id.txtRegion);
        tvLat = (TextView) itemView.findViewById(R.id.txtLat);
        tvLog = (TextView) itemView.findViewById(R.id.txtLog);
        tvMagnitude = (TextView) itemView.findViewById(R.id.txtMagnitude);
        tvDepth = (TextView) itemView.findViewById(R.id.txtDepth);

    }
}
