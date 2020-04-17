package gateway;

import java.io.Serializable;
import com.google.gson.JsonObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Entity {

    private long id;
    private double latitude;
    private double longitude;
    private String timezone;
    private RegularDataDict currently;
    private int offset;

    public String toJsonKafka(){
        JsonObject obj = new JsonObject();
        obj.addProperty("entity_id", this.id);
        obj.addProperty("latitude", this.latitude);
        obj.addProperty("longitude", this.longitude);
        obj.addProperty("timezone", this.timezone);
        return obj.toString();
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public RegularDataDict getCurrently() {
        return this.currently;
    }

    public void setCurrently(RegularDataDict currently) {
        this.currently = currently;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "{" +
            " latitude='" + getLatitude() + "'" +
            ", longitude='" + getLongitude() + "'" +
            ", timezone='" + getTimezone() + "'" +
            ", currently='" + getCurrently() + "'" +
            ", offset='" + getOffset() + "'" +
            "}";
    }
    

}