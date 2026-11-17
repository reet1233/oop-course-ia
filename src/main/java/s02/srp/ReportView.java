package s02.srp;

/** View: formats and displays the Report. */
public class ReportView {
    public void printToConsole(Report report) {
        System.out.println("--- REPORT ---");
        System.out.println(report.getData());
        System.out.println("--- END ---");
    }
}