package model.report;

import java.util.Date;
import java.util.List;

import model.Report;

public class UserActivityReport extends Report{
    public UserActivityReport(int report_id, Date report_date, List<String> data) {
        super(report_id, report_date, data);
    }

    @Override
    public void generateReport() {
        // Logic to generate user activity report
        System.out.println("Generating user activity report with data: " + getData());
    }
    
}
