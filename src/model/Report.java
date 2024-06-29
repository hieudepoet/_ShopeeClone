package model;

import java.util.Date;
import java.util.List;

public abstract class Report {
    private int report_id;
    private Date report_date;
    private List<String> data;

    public Report(int report_id, Date report_date, List<String> data) {
        this.report_id = report_id;
        this.report_date = report_date;
        this.data = data;
    }

    public int getReportId() {
        return report_id;
    }

    public void setReportId(int report_id) {
        this.report_id = report_id;
    }

    public Date getReportDate() {
        return report_date;
    }

    public void setReportDate(Date report_date) {
        this.report_date = report_date;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public abstract void generateReport();
}
