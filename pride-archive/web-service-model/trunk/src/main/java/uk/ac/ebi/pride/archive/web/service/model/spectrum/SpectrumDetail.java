package uk.ac.ebi.pride.archive.web.service.model.spectrum;

import java.io.Serializable;
import java.util.List;

/**
 * @author Jose A. Dianes
 * @since 0.2.6
 */
public class SpectrumDetail implements Serializable {

    private String spectrumId;
    private double mzStart;
    private double mzStop;
    private List<SpectrumPeak> peaks;

    public String getSpectrumId() {
        return spectrumId;
    }

    public void setSpectrumId(String spectrumId) {
        this.spectrumId = spectrumId;
    }

    public double getMzStart() {
        return mzStart;
    }

    public void setMzStart(double mzStart) {
        this.mzStart = mzStart;
    }

    public double getMzStop() {
        return mzStop;
    }

    public void setMzStop(double mzStop) {
        this.mzStop = mzStop;
    }

    public List<SpectrumPeak> getPeaks() {
        return peaks;
    }

    public void setPeaks(List<SpectrumPeak> peaks) {
        this.peaks = peaks;
    }
}
