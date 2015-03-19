package uk.ac.ebi.pride.archive.web.service.model.common;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * @author florian@ebi.ac.uk
 */
@ApiModel(value = "SearchEngineScore", description = "Representation of a search engine score")
public class SearchEngineScore {

    @ApiModelProperty(value = "the search engine")
    private String searchEngine;
    @ApiModelProperty(value = "the score from the search engine")
    private String score;

    public SearchEngineScore(String searchEngine, String score) {
        if (searchEngine == null || score == null ) {
            throw new IllegalArgumentException("searchEngine and score are mandatory!");
        }
        this.searchEngine = searchEngine;
        this.score = score;
    }

    public String getSearchEngine() {
        return searchEngine;
    }

    public void setSearchEngine(String searchEngine) {
        this.searchEngine = searchEngine;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SearchEngineScore that = (SearchEngineScore) o;

        if (!score.equals(that.score)) return false;
        if (!searchEngine.equals(that.searchEngine)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = searchEngine.hashCode();
        result = 31 * result + score.hashCode();
        return result;
    }
}
