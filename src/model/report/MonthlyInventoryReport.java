package model.report;

import java.util.Date;
import java.util.List;

import model.Report;

public class MonthlyInventoryReport extends Report {
    public MonthlyInventoryReport(int report_id, Date report_date, List<String> data) {
        super(report_id, report_date, data);
    }

    @Override
    public void generateReport() {
        // Logic to generate monthly inventory report
        System.out.println("Generating monthly inventory report with data: " + getData());
    }

}
