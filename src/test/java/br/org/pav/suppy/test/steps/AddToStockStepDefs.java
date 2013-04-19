package br.org.pav.suppy.test.steps;

import br.org.pav.suppy.model.SKU;
import br.org.pav.suppy.model.Stock;
import br.org.pav.suppy.repository.Stocks;
import br.org.pav.suppy.test.configuration.TestWebConfiguration;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


@ContextConfiguration(classes = {TestWebConfiguration.class})
@WebAppConfiguration
public class AddToStockStepDefs {

    private String collectionName;

    @Autowired
    private Stocks stocks;

    @Given("^I am a user with id (\\d+)$")
    public void I_am_a_user_with_id(int id) throws Throwable {
        collectionName = String.valueOf(id);
    }

    @When("^I add these skus to my stock:$")
    public void I_add_these_skus_to_my_stock(DataTable table) throws Throwable {
        List<SKU> list = table.asList(SKU.class);
        Stock stock = new Stock();
        stock.setId(collectionName);
        stock.setSKUs(list);
        stocks.store(stock);
    }

    @Then("^it should have (\\d+) item on it$")
    public void it_should_have_item_on_it(int size) throws Throwable {
        Stock stock = stocks.findOne(collectionName);
        assertThat(stock.getSKUs().size(), is(equalTo(size)));
    }

    @After
    public void removeStock() {
        stocks.remove(collectionName);
    }

}
