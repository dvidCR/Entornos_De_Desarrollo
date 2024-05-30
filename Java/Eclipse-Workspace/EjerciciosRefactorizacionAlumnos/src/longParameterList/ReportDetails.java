package longParameterList;

import java.util.Date;

/**
 * @param ReportDetails
 * Le da valores a los atributos mediante los parametros del metodo.
 * 
 * @param getter and setter
 * Son todos los getters y setters de todos los atributos de la clase.
 */

public class ReportDetails {
	private String reportName;
    private String reportType;
    private String author;
    private Date createdDate;
    private Date modifiedDate;
    private int pageCount;
    private String[] sections;
    private boolean isPublished;


    public ReportDetails(String reportName, String reportType, String author, Date createdDate, Date modifiedDate, int pageCount, String[] sections, boolean isPublished) {
        this.reportName = reportName;
        this.reportType = reportType;
        this.author = author;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.pageCount = pageCount;
        this.sections = sections;
        this.isPublished = isPublished;
    }
    
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String[] getSections() {
        return sections;
    }

    public void setSections(String[] sections) {
        this.sections = sections;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean isPublished) {
        this.isPublished = isPublished;
    }
    
}
