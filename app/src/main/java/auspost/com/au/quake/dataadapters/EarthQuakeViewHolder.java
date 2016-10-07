package auspost.com.au.quake.dataadapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import auspost.com.au.quake.R;

/**
 * Viewholder for each view within RecyclerView
 */
public class EarthQuakeViewHolder extends RecyclerView.ViewHolder {

    final TextView tvRegion;
    final TextView tvLat;
    final TextView tvLog;
    final TextView tvMagnitude;
    final TextView tvDepth;

    EarthQuakeViewHolder(View itemView) {
        super(itemView);
        tvRegion = (TextView) itemView.findViewById(R.id.txtRegion);
        tvLat = (TextView) itemView.findViewById(R.id.txtLat);
        tvLog = (TextView) itemView.findViewById(R.id.txtLog);
        tvMagnitude = (TextView) itemView.findViewById(R.id.txtMagnitude);
        tvDepth = (TextView) itemView.findViewById(R.id.txtDepth);

    }
}
