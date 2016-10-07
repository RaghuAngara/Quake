package auspost.com.au.quake.dataadapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import auspost.com.au.quake.R;
import auspost.com.au.quake.datamodels.EarthQuakeData;

/**
 * Adaptor for RecyclerView
 */
public class EarthQuakeAdapter extends RecyclerView.Adapter<EarthQuakeViewHolder> {

    private final List<EarthQuakeData> earthQuakeDataList;

    public EarthQuakeAdapter(List<EarthQuakeData> earthQuakeDataList) {
        this.earthQuakeDataList = earthQuakeDataList;
    }

    @Override
    public EarthQuakeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.earthquake_recyclerview_row, parent, false);

        return new EarthQuakeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EarthQuakeViewHolder holder, int position) {

        EarthQuakeData eqData = earthQuakeDataList.get(position);

        holder.tvRegion.setText(eqData.getRegion());
        holder.tvLat.setText(eqData.getLat());
        holder.tvLog.setText(eqData.getLon());
        holder.tvMagnitude.setText(eqData.getMagnitude());
        holder.tvDepth.setText(eqData.getDepth());

    }

    @Override
    public int getItemCount() {
        return earthQuakeDataList.size();
    }

}
