package pl.zankowski.iextrading4j.client.rest.request.stocks;

import pl.zankowski.iextrading4j.api.stocks.HistoricalPrice;
import pl.zankowski.iextrading4j.client.rest.manager.RestRequest;
import pl.zankowski.iextrading4j.client.rest.manager.RestRequestBuilder;
import pl.zankowski.iextrading4j.client.rest.request.IEXCloudV1RestRequest;

import javax.ws.rs.core.GenericType;
import java.util.List;

public class HistoricalPriceBuilder extends AbstractStocksRequestBuilder<List<HistoricalPrice>, HistoricalPriceBuilder>
        implements IEXCloudV1RestRequest<List<HistoricalPrice>> {

    private HistoricalDateRange dateRange = HistoricalDateRange.ONE_MONTH;

    HistoricalDateRange getDateRange() { return dateRange; }

    public HistoricalPriceBuilder withDateRange(final HistoricalDateRange dateRange) {
        this.dateRange = dateRange;
        return this;
    }

    @Override
    public RestRequest<List<HistoricalPrice>> build() {
        return RestRequestBuilder.<List<HistoricalPrice>>builder()
                .withPath("/stock/{symbol}/chart/{range}")
                .addPathParam("symbol", getSymbol())
                .addPathParam("range", getDateRange().getCode()).get()
                .withResponse(new GenericType<List<HistoricalPrice>>() {
                })
                .build();
    }
}
