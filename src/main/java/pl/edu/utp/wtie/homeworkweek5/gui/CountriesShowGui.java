package pl.edu.utp.wtie.homeworkweek5.gui;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.HeaderRow;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pl.edu.utp.wtie.homeworkweek5.client.CountryController;
import pl.edu.utp.wtie.homeworkweek5.model.Country;

@Route("show-countries")
public class CountriesShowGui extends VerticalLayout {

    private CountryController countryController;

    @Autowired
    public CountriesShowGui(CountryController countryController) {
        this.countryController = countryController;
        Grid<Country> gridCountries = createGridCuntries();
        addFiltering(gridCountries);

        add(gridCountries);
    }

    private Grid<Country> createGridCuntries() {
        Grid<Country> gridCountries = new Grid<>(Country.class);
        gridCountries.setItems(countryController.getCountries());
        gridCountries.removeColumnByKey("additionalProperties");
        gridCountries.removeColumnByKey("alpha2");
        gridCountries.removeColumnByKey("area");
        gridCountries.removeColumnByKey("currencyCode");
        gridCountries.removeColumnByKey("eqivalentFipsCode");
        gridCountries.removeColumnByKey("fips");
        gridCountries.removeColumnByKey("geonameId");
        gridCountries.removeColumnByKey("neighbours");
        gridCountries.removeColumnByKey("numeric");
        gridCountries.removeColumnByKey("postalCodeFormat");
        gridCountries.removeColumnByKey("postalCodeRegex");
        gridCountries.removeColumnByKey("tld");
        gridCountries.setColumns("alpha3", "name", "capital", "continent", "population",
                "currencyName", "languages", "phone");
        gridCountries.getColumns().forEach(countryColumn -> countryColumn.setAutoWidth(true));

        return gridCountries;
    }

    private void addFiltering(Grid<Country> gridCountries) {
        ListDataProvider<Country> dataProvider = new ListDataProvider<>(countryController.getCountries());
        gridCountries.setDataProvider(dataProvider);
        HeaderRow filterRow = gridCountries.prependHeaderRow();

        TextField firstNameField = new TextField();
        firstNameField.addValueChangeListener(event -> dataProvider.addFilter(
                country -> StringUtils.containsIgnoreCase(country.getName(),
                        firstNameField.getValue())));
        firstNameField.setValueChangeMode(ValueChangeMode.EAGER);

        filterRow.join(gridCountries.getColumnByKey("alpha3"),
                gridCountries.getColumnByKey("name"),
                gridCountries.getColumnByKey("capital"),
                gridCountries.getColumnByKey("continent"),
                gridCountries.getColumnByKey("population"),
                gridCountries.getColumnByKey("currencyName"),
                gridCountries.getColumnByKey("languages"),
                gridCountries.getColumnByKey("phone")).
                setComponent(firstNameField);
        firstNameField.setSizeFull();
        firstNameField.setPlaceholder("Filter country name");
    }
}
