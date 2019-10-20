
package pl.edu.utp.wtie.homeworkweek5.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alpha_2",
    "alpha_3",
    "area",
    "capital",
    "continent",
    "currency_code",
    "currency_name",
    "eqivalent_fips_code",
    "fips",
    "geoname_id",
    "languages",
    "name",
    "neighbours",
    "numeric",
    "phone",
    "population",
    "postal_code_format",
    "postal_code_regex",
    "tld"
})
public class Country {

    @JsonProperty("alpha_2")
    private String alpha2;
    @JsonProperty("alpha_3")
    private String alpha3;
    @JsonProperty("area")
    private String area;
    @JsonProperty("capital")
    private String capital;
    @JsonProperty("continent")
    private String continent;
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("currency_name")
    private String currencyName;
    @JsonProperty("eqivalent_fips_code")
    private String eqivalentFipsCode;
    @JsonProperty("fips")
    private String fips;
    @JsonProperty("geoname_id")
    private String geonameId;
    @JsonProperty("languages")
    private String languages;
    @JsonProperty("name")
    private String name;
    @JsonProperty("neighbours")
    private String neighbours;
    @JsonProperty("numeric")
    private String numeric;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("population")
    private String population;
    @JsonProperty("postal_code_format")
    private String postalCodeFormat;
    @JsonProperty("postal_code_regex")
    private String postalCodeRegex;
    @JsonProperty("tld")
    private String tld;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("alpha_2")
    public String getAlpha2() {
        return alpha2;
    }

    @JsonProperty("alpha_2")
    public void setAlpha2(String alpha2) {
        this.alpha2 = alpha2;
    }

    @JsonProperty("alpha_3")
    public String getAlpha3() {
        return alpha3;
    }

    @JsonProperty("alpha_3")
    public void setAlpha3(String alpha3) {
        this.alpha3 = alpha3;
    }

    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    @JsonProperty("capital")
    public String getCapital() {
        return capital;
    }

    @JsonProperty("capital")
    public void setCapital(String capital) {
        this.capital = capital;
    }

    @JsonProperty("continent")
    public String getContinent() {
        return continent;
    }

    @JsonProperty("continent")
    public void setContinent(String continent) {
        this.continent = continent;
    }

    @JsonProperty("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("currency_name")
    public String getCurrencyName() {
        return currencyName;
    }

    @JsonProperty("currency_name")
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    @JsonProperty("eqivalent_fips_code")
    public String getEqivalentFipsCode() {
        return eqivalentFipsCode;
    }

    @JsonProperty("eqivalent_fips_code")
    public void setEqivalentFipsCode(String eqivalentFipsCode) {
        this.eqivalentFipsCode = eqivalentFipsCode;
    }

    @JsonProperty("fips")
    public String getFips() {
        return fips;
    }

    @JsonProperty("fips")
    public void setFips(String fips) {
        this.fips = fips;
    }

    @JsonProperty("geoname_id")
    public String getGeonameId() {
        return geonameId;
    }

    @JsonProperty("geoname_id")
    public void setGeonameId(String geonameId) {
        this.geonameId = geonameId;
    }

    @JsonProperty("languages")
    public String getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(String languages) {
        this.languages = languages;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("neighbours")
    public String getNeighbours() {
        return neighbours;
    }

    @JsonProperty("neighbours")
    public void setNeighbours(String neighbours) {
        this.neighbours = neighbours;
    }

    @JsonProperty("numeric")
    public String getNumeric() {
        return numeric;
    }

    @JsonProperty("numeric")
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("population")
    public String getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(String population) {
        this.population = population;
    }

    @JsonProperty("postal_code_format")
    public String getPostalCodeFormat() {
        return postalCodeFormat;
    }

    @JsonProperty("postal_code_format")
    public void setPostalCodeFormat(String postalCodeFormat) {
        this.postalCodeFormat = postalCodeFormat;
    }

    @JsonProperty("postal_code_regex")
    public String getPostalCodeRegex() {
        return postalCodeRegex;
    }

    @JsonProperty("postal_code_regex")
    public void setPostalCodeRegex(String postalCodeRegex) {
        this.postalCodeRegex = postalCodeRegex;
    }

    @JsonProperty("tld")
    public String getTld() {
        return tld;
    }

    @JsonProperty("tld")
    public void setTld(String tld) {
        this.tld = tld;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
