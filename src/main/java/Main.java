import java.util.List;

public class Main {
    public static void main(String[] args) {
        String excelFilePath = "C:/Users/pault/OneDrive/Desktop/Tripillar_Internship/example.xlsx";

        ExcelReader reader = new ExcelReader();
        List<Employee> employees = reader.readEmployeesFromExcel(excelFilePath);

        EmployeeDatabase db = new EmployeeDatabase();
        db.saveEmployeesToDatabase(employees);
    }
}
