package uk.ac.ebi.pride.archive.web.service.model.spectrum;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @author Jose A. Dianes
 * @since 0.2.6
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpectrumPeak implements Serializable {

    private double mz;
    private double intensity;

    public double getMz() {
        return mz;
    }

    public void setMz(double mz) {
        this.mz = mz;
    }

    public double getIntensity() {
        return intensity;
    }

    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }
}
