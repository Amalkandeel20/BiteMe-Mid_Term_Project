package logic;

import java.util.ArrayList;
import java.util.Map;

/**
 * This class represents the reports associated with a specific branch,
 * including income, quarterly, performance, and order reports. It also holds
 * information about the available years and months for which reports can be
 * generated.
 * 
 * @version 5.0
 * @authors Amal, Adam, Abed, Heba, Bashar, Mohammed
 */
public class BranchReports {
	private Branch branchID;
	/** The list of income reports available to the user. */
	private ArrayList<IncomeReport> incomeReport;

	/** The list of first quarter reports available to the user. */
	private ArrayList<QuarterReport> firstquarterReport;

	/** The list of second quarter reports available to the user. */
	private ArrayList<QuarterReport> secondquarterReport;

	/** The list of performance reports available to the user. */
	private ArrayList<PerformanceReport> performanceReport;

	/** The list of order reports available to the user. */
	private ArrayList<OrderReport> orderReport;

	/** A map of available years and months for report generation. */
	private Map<String, ArrayList<String>> yearMonth;

	/**
	 * Constructs a new BranchReports object with the specified branch ID, income
	 * reports, first quarter reports, second quarter reports, performance reports,
	 * order reports, and a map of available years and months.
	 * 
	 * @param branchID            The branch associated with these reports.
	 * @param incomeReport        The list of income reports available to the user.
	 * @param firstquarterReport  The list of first quarter reports available to the
	 *                            user.
	 * @param secondquarterReport The list of second quarter reports available to
	 *                            the user.
	 * @param performanceReport   The list of performance reports available to the
	 *                            user.
	 * @param orderReport         The list of order reports available to the user.
	 * @param yearMonth           A map of available years and months for report
	 *                            generation.
	 */
	public BranchReports(Branch branchID, ArrayList<IncomeReport> incomeReport,
			ArrayList<QuarterReport> firstquarterReport, ArrayList<QuarterReport> secondquarterReport,
			ArrayList<PerformanceReport> performanceReport, ArrayList<OrderReport> orderReport,
			Map<String, ArrayList<String>> yearMonth) {
		this.branchID = branchID;
		this.incomeReport = incomeReport;
		this.firstquarterReport = firstquarterReport;
		this.secondquarterReport = secondquarterReport;
		this.performanceReport = performanceReport;
		this.orderReport = orderReport;
		this.yearMonth = yearMonth;
	}

	/**
	 * @return the branchID
	 */
	public Branch getBranchID() {
		return branchID;
	}

	/**
	 * @param branchID the branchID to set
	 */
	public void setBranchID(Branch branchID) {
		this.branchID = branchID;
	}

	/**
	 * @return the incomeReport
	 */
	public ArrayList<IncomeReport> getIncomeReport() {
		return incomeReport;
	}

	/**
	 * @param incomeReport the incomeReport to set
	 */
	public void setIncomeReport(ArrayList<IncomeReport> incomeReport) {
		this.incomeReport = incomeReport;
	}

	/**
	 * @return the firstquarterReport
	 */
	public ArrayList<QuarterReport> getFirstquarterReport() {
		return firstquarterReport;
	}

	/**
	 * @param firstquarterReport the firstquarterReport to set
	 */
	public void setFirstquarterReport(ArrayList<QuarterReport> firstquarterReport) {
		this.firstquarterReport = firstquarterReport;
	}

	/**
	 * @return the secondquarterReport
	 */
	public ArrayList<QuarterReport> getSecondquarterReport() {
		return secondquarterReport;
	}

	/**
	 * @param secondquarterReport the secondquarterReport to set
	 */
	public void setSecondquarterReport(ArrayList<QuarterReport> secondquarterReport) {
		this.secondquarterReport = secondquarterReport;
	}

	/**
	 * @return the performanceReport
	 */
	public ArrayList<PerformanceReport> getPerformanceReport() {
		return performanceReport;
	}

	/**
	 * @param performanceReport the performanceReport to set
	 */
	public void setPerformanceReport(ArrayList<PerformanceReport> performanceReport) {
		this.performanceReport = performanceReport;
	}

	/**
	 * @return the orderReport
	 */
	public ArrayList<OrderReport> getOrderReport() {
		return orderReport;
	}

	/**
	 * @param orderReport the orderReport to set
	 */
	public void setOrderReport(ArrayList<OrderReport> orderReport) {
		this.orderReport = orderReport;
	}

	/**
	 * @return the yearMonth
	 */
	public Map<String, ArrayList<String>> getYearMonth() {
		return yearMonth;
	}

	/**
	 * @param yearMonth the yearMonth to set
	 */
	public void setYearMonth(Map<String, ArrayList<String>> yearMonth) {
		this.yearMonth = yearMonth;
	}

}
