package jp.takuji31.databindingexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

import org.threeten.bp.OffsetDateTime;

import java.util.Arrays;

import jp.takuji31.databindingexample.BR;

/**
 * @author Takuji Nishibayashi
 */
public class ViewModel extends BaseObservable {
    @Bindable
    private String firstName = "";

    @Bindable
    private String lastName = "";

    @Bindable
    private OffsetDateTime lastUpdated;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        notifyPropertyChanged(BR.lastUpdated);
    }
}
