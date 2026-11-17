package s02.srp;

/** Model: holds the report data and handles fetching/parsing. */
public class Report {
    private String data;

    public String getData() {
        return data;
    }

    public void fetchDataFromDatabase() {
        System.out.println("Fetching data...");
        this.data = "raw data";
    }

    public void parseXMLData() {
        System.out.println("Parsing data as XML...");
        // logic to parse this.data
    }
}