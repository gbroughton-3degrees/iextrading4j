package pl.zankowski.iextrading4j.api.stocks;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HistoricalPrice {
    private static final long serialVersionUID = 6474500411156050200L;
    private final BigDecimal close;
    private final BigDecimal high;
    private final BigDecimal low;
    private final BigDecimal open;
    private final String symbol;
    private final Long volume;
    private final String id;
    private final String key;
    private final String subkey;
    private final LocalDate date;
    private final Long updated;
    private final Long changeOverTime;
    private final Long marketChangeOverTime;
    private final BigDecimal uOpen;
    private final BigDecimal uClose;
    private final BigDecimal uHigh;
    private final BigDecimal uLow;
    private final Long uVolume;
    private final BigDecimal fOpen;
    private final BigDecimal fClose;
    private final BigDecimal fHigh;
    private final BigDecimal fLow;
    private final Long fVolume;
    private final String label;
    private final BigDecimal change;
    private final Long changePercent;

    @JsonCreator
    public HistoricalPrice(
            @JsonProperty("close") final BigDecimal close,
            @JsonProperty("high") final BigDecimal high,
            @JsonProperty("low") final BigDecimal low,
            @JsonProperty("open") final BigDecimal open,
            @JsonProperty("symbol") final String symbol,
            @JsonProperty("volume") final Long volume,
            @JsonProperty("id") final String id,
            @JsonProperty("key") final String key,
            @JsonProperty("subkey") final String subkey,
            @JsonProperty("date") final LocalDate date,
            @JsonProperty("updated") final Long updated,
            @JsonProperty("changeOverTime") final Long changeOverTime,
            @JsonProperty("marketChangeOverTime") final Long marketChangeOverTime,
            @JsonProperty("uOpen") final BigDecimal uOpen,
            @JsonProperty("uClose") final BigDecimal uClose,
            @JsonProperty("uHigh") final BigDecimal uHigh,
            @JsonProperty("uLow") final BigDecimal uLow,
            @JsonProperty("uVolume") final Long uVolume,
            @JsonProperty("fOpen") final BigDecimal fOpen,
            @JsonProperty("fClose") final BigDecimal fClose,
            @JsonProperty("fHigh") final BigDecimal fHigh,
            @JsonProperty("fLow") final BigDecimal fLow,
            @JsonProperty("fVolume") final Long fVolume,
            @JsonProperty("label") final String label,
            @JsonProperty("change") final BigDecimal change,
            @JsonProperty("changePercent") final Long changePercent
    ) {
        this.close = close;
        this.high = high;
        this.low = low;
        this.open = open;
        this.symbol = symbol;
        this.volume = volume;
        this.id = id;
        this.key = key;
        this.subkey = subkey;
        this.date = date;
        this.updated = updated;
        this.changeOverTime = changeOverTime;
        this.marketChangeOverTime = marketChangeOverTime;
        this.uOpen = uOpen;
        this.uClose = uClose;
        this.uHigh = uHigh;
        this.uLow = uLow;
        this.uVolume = uVolume;
        this.fOpen = fOpen;
        this.fClose = fClose;
        this.fHigh = fHigh;
        this.fLow = fLow;
        this.fVolume = fVolume;
        this.label = label;
        this.change = change;
        this.changePercent = changePercent;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public BigDecimal getClose() {
        return close;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public String getSymbol() {
        return symbol;
    }

    public Long getVolume() {
        return volume;
    }

    public String getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getSubkey() {
        return subkey;
    }

    public LocalDate getDate() {
        return date;
    }

    public Long getUpdated() {
        return updated;
    }

    public Long getChangeOverTime() {
        return changeOverTime;
    }

    public Long getMarketChangeOverTime() {
        return marketChangeOverTime;
    }

    public BigDecimal getuOpen() {
        return uOpen;
    }

    public BigDecimal getuClose() {
        return uClose;
    }

    public BigDecimal getuHigh() {
        return uHigh;
    }

    public BigDecimal getuLow() {
        return uLow;
    }

    public Long getuVolume() {
        return uVolume;
    }

    public BigDecimal getfOpen() {
        return fOpen;
    }

    public BigDecimal getfClose() {
        return fClose;
    }

    public BigDecimal getfHigh() {
        return fHigh;
    }

    public BigDecimal getfLow() {
        return fLow;
    }

    public Long getfVolume() {
        return fVolume;
    }

    public String getLabel() {
        return label;
    }

    public BigDecimal getChange() {
        return change;
    }

    public Long getChangePercent() {
        return changePercent;
    }
}
