package s02.srp;

/** Controller: coordinates fetching, parsing, and displaying. */
public class ReportController {
    private final Report model;
    private final ReportView view;

    public ReportController(Report model, ReportView view) {
        this.model = model;
        this.view = view;
    }

    public void generateReport() {
        model.fetchDataFromDatabase();
        model.parseXMLData();
        view.printToConsole(model);
    }

    public static void main(String[] args) {
        Report report = new Report();
        ReportView view = new ReportView();
        ReportController controller = new ReportController(report, view);
        controller.generateReport();
    }
}