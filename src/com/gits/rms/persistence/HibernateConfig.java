
package com.gits.rms.persistence;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

    public static SessionFactory setup(String sDbName, String sUserName, String sPass) {
        Properties prop = new Properties();
        prop.put("hibernate.connection.useUnicode", "true");
        prop.put("hibernate.connection.characterEncoding", "UTF-8");
        prop.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        prop.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/" + sDbName);
        prop.put("hibernate.connection.username", sUserName);
        prop.put("hibernate.connection.password", sPass);
        prop.put("hibernate.connection.provider_class", "org.hibernate.connection.C3P0ConnectionProvider");

        prop.put("hibernate.c3p0.min_size", 5);
        prop.put("hibernate.c3p0.max_size", 30);
        prop.put("hibernate.c3p0.timeout", 1800);
        prop.put("hibernate.c3p0.max_statements", 50);
        prop.put("hibernate.c3p0.idle_test_period", 3000);

        prop.put("hibernate.show_sql", "false");
        prop.put("hibernate.connection.isolation", "2");
        prop.put("hibernate.connection.isolation.level", "Serializable");

        prop.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        prop.put("hibernate.current_session_context_class", "thread");
        prop.put("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");

        Configuration config = new Configuration();
        config.setProperties(prop);
        
        config.addResource("com/rooster/em/vo/Configuration.hbm.xml");
        config.addResource("com/rooster/em/vo/EmployeeStatus.hbm.xml");
        config.addResource("com/rooster/em/vo/Nationality.hbm.xml");
        config.addResource("com/rooster/em/vo/EthnicRace.hbm.xml");
        config.addResource("com/rooster/em/vo/License.hbm.xml");
        config.addResource("com/rooster/em/vo/Education.hbm.xml");
        config.addResource("com/rooster/em/vo/Project.hbm.xml");
        config.addResource("com/rooster/em/vo/Customer.hbm.xml");
        config.addResource("com/rooster/em/vo/ProjectActivity.hbm.xml");
        config.addResource("com/rooster/em/vo/JobTitle.hbm.xml");
        config.addResource("com/rooster/em/vo/Children.hbm.xml");
        config.addResource("com/rooster/em/vo/DirectDebit.hbm.xml");
        config.addResource("com/rooster/em/vo/Document.hbm.xml");
        config.addResource("com/rooster/em/vo/BenefitsType.hbm.xml");
        
        
        
        config.addResource("com/rooster/em/vo/Employees.hbm.xml");
        config.addResource("com/rooster/em/vo/Country.hbm.xml");
        config.addResource("com/rooster/em/vo/Region.hbm.xml");
        config.addResource("com/rooster/em/vo/Location.hbm.xml");
        config.addResource("com/rooster/em/vo/Organization.hbm.xml");
        config.addResource("com/rooster/em/vo/OrganizationType.hbm.xml");
        config.addResource("com/rooster/em/vo/Salary.hbm.xml");
        config.addResource("com/rooster/em/vo/SalaryGrade.hbm.xml");
        config.addResource("com/rooster/em/vo/Signature.hbm.xml");
        config.addResource("com/rooster/em/vo/Client.hbm.xml");
        config.addResource("com/rooster/em/vo/WorkExperience.hbm.xml");
        config.addResource("com/rooster/em/vo/EmployeeReportTo.hbm.xml");
        config.addResource("com/rooster/em/vo/Holiday.hbm.xml");
        config.addResource("com/rooster/em/vo/EmpUSTax.hbm.xml");
        config.addResource("com/rooster/em/vo/EmpPassport.hbm.xml");
        config.addResource("com/rooster/em/vo/Role.hbm.xml");
        config.addResource("com/rooster/em/vo/User.hbm.xml");
        config.addResource("com/rooster/em/vo/Benefits.hbm.xml");
        config.addResource("com/rooster/em/vo/EmpLocationHistory.hbm.xml");
        config.addResource("com/rooster/em/vo/Vendor.hbm.xml");
        config.addResource("com/rooster/em/vo/Message.hbm.xml");
        config.addResource("com/rooster/em/vo/Department.hbm.xml");
        config.addResource("com/rooster/em/vo/Team.hbm.xml");
        config.addResource("com/rooster/em/vo/EmpSpace.hbm.xml");
        config.addResource("com/rooster/em/vo/MailConfiguration.hbm.xml");
        config.addResource("com/rooster/em/vo/Currency.hbm.xml");
        config.addResource("com/rooster/em/vo/ImportantNews.hbm.xml");
        config.addResource("com/rooster/em/vo/Support.hbm.xml");
        config.addResource("com/rooster/em/vo/SaasContract.hbm.xml");
        config.addResource("com/rooster/em/vo/Targets.hbm.xml");
        config.addResource("com/rooster/em/vo/Goal.hbm.xml");
        config.addResource("com/rooster/em/vo/EmpAssets.hbm.xml");
        config.addResource("com/rooster/em/vo/EmployeeShift.hbm.xml");
        config.addResource("com/rooster/em/vo/Assets.hbm.xml");
        
        /* Start of Events Module */
        config.addResource("com/rooster/em/vo/Events.hbm.xml");
        /* End of Events Module */

        /* Start of TimeSheet Module */
        config.addResource("com/rooster/em/vo/TimeSheetApprover.hbm.xml");
        config.addResource("com/rooster/em/vo/TimeSheetAttachment.hbm.xml");
        config.addResource("com/rooster/em/vo/TimeTrack.hbm.xml");
        config.addResource("com/rooster/em/vo/TimesheetCategory.hbm.xml");
        config.addResource("com/rooster/em/vo/TimesheetCategoryEmp.hbm.xml");
        config.addResource("com/rooster/em/vo/TimeSheetCategoryAssign.hbm.xml");
        config.addResource("com/rooster/em/vo/TimeSheetProjectAssign.hbm.xml");
        config.addResource("com/rooster/em/vo/ProjectAssignEmp.hbm.xml");
        config.addResource("com/rooster/em/vo/EmpTargetAndGoal.hbm.xml");
        config.addResource("com/rooster/em/vo/TimesheetNotes.hbm.xml");
        config.addResource("com/rooster/em/vo/TimesheetAssignProjectTarget.hbm.xml");
        config.addResource("com/rooster/em/vo/TimesheetAchievedTarget.hbm.xml");
        config.addResource("com/rooster/em/vo/TargetType.hbm.xml");
        /* End of TimeSheet Module */

        /* Start of Expenses Module */
        config.addResource("com/rooster/em/vo/ExpensesType.hbm.xml");
        config.addResource("com/rooster/em/vo/ExpensesDetails.hbm.xml");
        config.addResource("com/rooster/em/vo/EmployeeExpenses.hbm.xml");
        config.addResource("com/rooster/em/vo/ExpensesApprover.hbm.xml");
        config.addResource("com/rooster/em/vo/ExpensesAccountantApprover.hbm.xml");
        config.addResource("com/rooster/em/vo/ExpensesAttachment.hbm.xml");
        config.addResource("com/rooster/em/vo/ExpenseStatusTracker.hbm.xml");
        /* End of Expenses Module */

        /* Start of Leave Module */
        config.addResource("com/rooster/em/vo/LeaveApprover.hbm.xml");
        config.addResource("com/rooster/em/vo/EmployeeLeaveQuota.hbm.xml");
        config.addResource("com/rooster/em/vo/LeaveType.hbm.xml");
        config.addResource("com/rooster/em/vo/LeaveHistory.hbm.xml");
        config.addResource("com/rooster/em/vo/LeaveReqsApproval.hbm.xml");
        /* End of Leave Module */

        /* Start of Paystub Module */
        config.addResource("com/rooster/em/vo/Deductions.hbm.xml");
        config.addResource("com/rooster/em/vo/PayStub.hbm.xml");
        config.addResource("com/rooster/em/vo/PayStubDeductions.hbm.xml");
        config.addResource("com/rooster/em/vo/PayStubArchive.hbm.xml");
        /* End of Paystub Module */

        /* Start of performance Module */
        config.addResource("com/rooster/em/vo/Category.hbm.xml");
        config.addResource("com/rooster/em/vo/SubCategory.hbm.xml");
        config.addResource("com/rooster/em/vo/Question.hbm.xml");
        config.addResource("com/rooster/em/vo/QuestionBank.hbm.xml");
        config.addResource("com/rooster/em/vo/QuestionBankGeneralInfo.hbm.xml");
        config.addResource("com/rooster/em/vo/QuestionGroupNameIdentification.hbm.xml");
        config.addResource("com/rooster/em/vo/Answer.hbm.xml");
        config.addResource("com/rooster/em/vo/QuestionGeneralInfoGroup.hbm.xml");
        /* End of performance Module */
        
        /*Start of client registration module */
        config.addResource("com/rooster/em/vo/ClientReg.hbm.xml");
        config.addResource("com/rooster/em/vo/EmployeeEEO.hbm.xml");
        return config.buildSessionFactory();

    }
}
