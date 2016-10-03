package auspost.com.au.quake.datamodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EarthQuake
{

    @SerializedName("count")
    @Expose
    public String count;

    @SerializedName("earthquakes")
    @Expose
    public EarthQuakeData earthquakes[];

    public EarthQuake() {
        this(null, null);
    }

    public EarthQuake(String count, EarthQuakeData[] earthquakes) {
        this.count = count;
        this.earthquakes = earthquakes;
    }

    public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public EarthQuakeData[] getEarthquakes() {
		return earthquakes;
	}

	public void setEarthquakes(EarthQuakeData[] earthquakes) {
		this.earthquakes = earthquakes;
	}

}
