package model.report;

import java.util.Date;
import java.util.List;

import model.Report;

public class DailySalesReport extends Report{
    public DailySalesReport(int report_id, Date report_date, List<String> data) {
        super(report_id, report_date, data);
    }

    @Override
    public void generateReport() {
        // Logic to generate daily sales report
        System.out.println("Generating daily sales report with data: " + getData());
    }
}
