package longParameterList;

import java.util.Date;

/*
 * Dada una clase ReportGenerator con un método generateReport que toma una larga lista de parámetros 
 * para generar un informe, debes refactorizar el código para reducir la cantidad de parámetros pasados al método. 
 * En lugar de utilizar una lista extensa de parámetros, encapsula estos datos en una clase ReportDetails. 
 * Esto ayudará a mejorar la encapsulación y la manejabilidad del código.
 */

public class ReportGenerator {
	
	public void generateReport(ReportDetails reportDetails) {
        // Access the details from reportDetails
        String reportName = reportDetails.getReportName();
        String reportType = reportDetails.getReportType();
        String author = reportDetails.getAuthor();
        Date createdDate = reportDetails.getCreatedDate();
        Date modifiedDate = reportDetails.getModifiedDate();
        int pageCount = reportDetails.getPageCount();
        String[] sections = reportDetails.getSections();
        boolean isPublished = reportDetails.isPublished();

        // Report generation logic
    }
	
}
