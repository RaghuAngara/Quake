package auspost.com.au.quake.datamodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EarthQuakeData{

    @SerializedName("src")
    @Expose
	String src;

    @SerializedName("eqid")
    @Expose
	String eqid;

    @SerializedName("timedate")
    @Expose
	String timedate;

    @SerializedName("lat")
    @Expose
	String lat;

    @SerializedName("lon")
    @Expose
	String lon;

    @SerializedName("magnitude")
    @Expose
	String magnitude;

    @SerializedName("depth")
    @Expose
	String depth;

    @SerializedName("region")
    @Expose
	String region;

    public EarthQuakeData() {
        this(null, null, null, null, null, null, null, null);
    }

    public EarthQuakeData(String src, String eqid, String timedate, String lat, String lon, String magnitude, String depth, String region) {
        this.src = src;
        this.eqid = eqid;
        this.timedate = timedate;
        this.lat = lat;
        this.lon = lon;
        this.magnitude = magnitude;
        this.depth = depth;
        this.region = region;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getEqid() {
        return eqid;
    }

    public void setEqid(String eqid) {
        this.eqid = eqid;
    }

    public String getTimedate() {
        return timedate;
    }

    public void setTimedate(String timedate) {
        this.timedate = timedate;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}

